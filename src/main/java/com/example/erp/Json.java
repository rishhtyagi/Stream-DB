package com.example.erp;

public class Json {
        String stream;
        String query;

    public Json(){
        
    }

    public Json(String stream, String query) {
        this.stream = stream;
        this.query = query;
    }

    public String getstream() {
            return stream;
        }

        public void setstream(String stream) {
            this.stream = stream;
        }

        public String getquery() {
            return query;
        }

        public void setquery(String query) {
            this.query = query;
        }
    }

