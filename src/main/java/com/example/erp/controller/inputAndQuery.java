package com.example.erp.controller;

import java.sql.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.naming.ldap.SortKey;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;
import com.example.erp.controller.Streams;
import com.example.erp.controller.ObjectFactory;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;
import com.example.erp.Json;

@Path("/accounts")
public class inputAndQuery {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/stream_db";

    // Database credentials
    static final String USER = "urg";
    static final String PASS = "Urg@1234";

    static JSONArray resultset_json = new JSONArray();

    static int saveSchema() {
        try {
            File file = new File("/home/urg/IIITB/DM/esdproject/src/main/webapp/export.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Streams.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Streams s = (Streams) jaxbUnmarshaller.unmarshal(file);
            List<Streams.Stream> streams;
            streams = s.getStream();
            int i = -1;
            if (streams.size() > 0) {
                while (++i < streams.size()) {
                    String streamname = streams.get(i).getStreamname().getValue(), p = "";
                    List<Streams.Stream.Properties.Property> properties = streams.get(i).getProperties().getProperty();

                    for (Streams.Stream.Properties.Property prop : properties) {
                        p = p + prop.getName().getValue() + " " + prop.getType().getValue() + ",";
                    }

                    try {
                        Class.forName(JDBC_DRIVER);
                        Connection con = DriverManager.getConnection(DB_URL, USER, PASS);

                        Statement stmt = con.createStatement();

                        final String CREATE_TABLE_SQL = "CREATE TABLE IF NOT EXISTS " + streamname
                                + " (ID INT NOT NULL AUTO_INCREMENT, created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP(), "
                                + p + "PRIMARY KEY (ID))";
                        stmt.executeUpdate(CREATE_TABLE_SQL);
                        con.close();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            } else {
                System.out.println("No Streams Data Found");
                return -1;
            }
        } catch (JAXBException e) {
            e.printStackTrace();
            return -1;
        }

        return 1;
    }

    static Streams.Stream getStreamInfo(String streamName) {
        try {
            File file = new File("/home/urg/IIITB/DM/esdproject/src/main/webapp/export.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Streams.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Streams s = (Streams) jaxbUnmarshaller.unmarshal(file);
            List<Streams.Stream> stream = s.getStream();
            for (Streams.Stream str : stream) {
                if (str.getStreamname().getValue().equals(streamName)) {
                    return str;
                }
            }

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        try {
            return null;
        } catch (java.lang.NullPointerException e) {
            System.out.println("No Stream Found with given name");
            return null;
        }
    }

    @GET
    @Path("/output")
    @Produces(MediaType.APPLICATION_JSON)
    public static Response getOutput(){
        JSONArray json = resultset_json;
        System.out.println("Output" + resultset_json);
        System.out.println("Output2" + json);
        resultset_json = new JSONArray();
        return Response.ok().entity(json.toString()).build();
    }

    @POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.TEXT_PLAIN)
    public static void executeQueries(Json js){

        System.out.println(js.getstream());
        System.out.println(js.getquery());

        int res = saveSchema();

        if (res == 1) {
            System.out.println("Schema Created");
        } else {
            System.out.println("Error in Schema");
        }

        // GET FROM FRONTEND
        String streamName = js.getstream();
        String cont_query = js.getquery();

        Streams.Stream stream = getStreamInfo(streamName);

        int windowSize = stream.getWindow().getWindowsize().getValue();
        int windowVel = stream.getWindow().getWindowvelocity().getValue();
        String source = stream.getStreamsource().getValue();
        String type = stream.getWindow().getWindowtype().getValue();
        if(type.equals("Folding Window")){
            windowVel = windowSize;
        }

        String columns = "";
        List<Streams.Stream.Properties.Property> properties = stream.getProperties().getProperty();
        for (Streams.Stream.Properties.Property prop : properties) {
            columns = columns + prop.getName().getValue() + ",";
        }
        columns = columns.substring(0, columns.length() - 1);
        System.out.println(columns);

        List<Streams.Stream.ContinousQueries.Query> queries = stream.getContinousQueries().getQuery();
        String[] q = new String[queries.size()];
        int j = 0;
        for (Streams.Stream.ContinousQueries.Query query : queries) {
            q[j] = query.getValue();
            j++;
        }

        int count = 0;
        String line = "";
        String splitBy = ",";
        try {
            // parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader(source));
            br.readLine();
            int i = 0;
            try {
                Class.forName(JDBC_DRIVER);
                Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = con.createStatement();

                while (true) {

                    // SEND TO FRONTEND
                    ResultSet[] rs = new ResultSet[q.length];
                    try {
                        for (int k = 0; k < q.length; k++) {
                            rs[k] = stmt.executeQuery(q[k]);
                            System.out.println(rs[k]);

                            if(rs[k].next()){
                            ResultSetMetaData rsmd = rs[k].getMetaData();
                            int numColumns = rsmd.getColumnCount();
                            JSONObject obj = new JSONObject();
                            obj.put("stream_name", streamName);
                            obj.put("query_name", q[k]);
                            for (int c = 1; c <= numColumns; c++) {
                                String column_name = rsmd.getColumnName(c);
                                obj.put(column_name, rs[k].getObject(column_name));
                            }
                            resultset_json.put(obj);
                            System.out.println(resultset_json);}
                        }

                    } catch (java.lang.NullPointerException e) {

                    }

                    final String clear_table = "DELETE FROM " + streamName;
                    stmt.executeUpdate(clear_table);

                    System.out.println("New Window");
                    while ((count < windowSize)) // returns a Boolean value
                    {
                        if (((line = br.readLine()) != null)) {
                            if (count == windowVel - 1) {
                                br.mark(2000);
                            }
                            try {
                                final String INSERT_TABLE_SQL = "INSERT INTO " + streamName + " (" + columns + ")"
                                        + " VALUES (" + line + ")";
                                stmt.executeUpdate(INSERT_TABLE_SQL);
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                        } else {
                            // SEND TO FRONTEND
                            try {
                                for (int k = 0; k < q.length; k++) {
                                    rs[k] = stmt.executeQuery(q[k]);
                                    System.out.println(rs[k]);

                                    if(rs[k].next()){
                                        ResultSetMetaData rsmd = rs[k].getMetaData();
                                        int numColumns = rsmd.getColumnCount();
                                        JSONObject obj = new JSONObject();
                                        obj.put("stream_name", streamName);
                                        obj.put("query_name", q[k]);
                                        for (int c = 1; c <= numColumns; c++) {
                                            String column_name = rsmd.getColumnName(c);
                                            obj.put(column_name, rs[k].getObject(column_name));
                                        }
                                        resultset_json.put(obj);
                                        System.out.println(resultset_json);}
                                }
                            } catch (java.lang.NullPointerException e) {

                            }
                            con.close();
                            System.exit(0);
                        }
                        count++;
                    }
                    count = 0;
                    br.reset();
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

//    public static void main(String[] args) {
//        executeQueries();
//    }
}