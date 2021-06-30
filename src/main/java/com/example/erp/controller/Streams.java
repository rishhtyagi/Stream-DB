package com.example.erp.controller;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stream" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="streamname">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="streamsource">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="window">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="windowsize">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="windowvelocity">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="windowtype">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="properties">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="property" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="name">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="type">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="continous_queries">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="query" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "stream"
})
@XmlRootElement(name = "streams")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
public class Streams {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<Stream> stream;

    /**
     * Gets the value of the stream property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stream property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStream().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Stream }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<Stream> getStream() {
        if (stream == null) {
            stream = new ArrayList<Stream>();
        }
        return this.stream;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="streamname">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="streamsource">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="window">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="windowsize">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="windowvelocity">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="windowtype">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="properties">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="property" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="name">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="type">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="continous_queries">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="query" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "streamname",
        "streamsource",
        "window",
        "properties",
        "continousQueries"
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Stream {

        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
        protected Streamname streamname;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
        protected Streamsource streamsource;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
        protected Window window;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
        protected Properties properties;
        @XmlElement(name = "continous_queries", required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
        protected ContinousQueries continousQueries;

        /**
         * Gets the value of the streamname property.
         * 
         * @return
         *     possible object is
         *     {@link Streamname }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
        public Streamname getStreamname() {
            return streamname;
        }

        /**
         * Sets the value of the streamname property.
         * 
         * @param value
         *     allowed object is
         *     {@link Streamname }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setStreamname(Streamname value) {
            this.streamname = value;
        }

        /**
         * Gets the value of the streamsource property.
         * 
         * @return
         *     possible object is
         *     {@link Streamsource }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
        public Streamsource getStreamsource() {
            return streamsource;
        }

        /**
         * Sets the value of the streamsource property.
         * 
         * @param value
         *     allowed object is
         *     {@link Streamsource }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setStreamsource(Streamsource value) {
            this.streamsource = value;
        }

        /**
         * Gets the value of the window property.
         * 
         * @return
         *     possible object is
         *     {@link Window }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
        public Window getWindow() {
            return window;
        }

        /**
         * Sets the value of the window property.
         * 
         * @param value
         *     allowed object is
         *     {@link Window }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setWindow(Window value) {
            this.window = value;
        }

        /**
         * Gets the value of the properties property.
         * 
         * @return
         *     possible object is
         *     {@link Properties }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
        public Properties getProperties() {
            return properties;
        }

        /**
         * Sets the value of the properties property.
         * 
         * @param value
         *     allowed object is
         *     {@link Properties }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setProperties(Properties value) {
            this.properties = value;
        }

        /**
         * Gets the value of the continousQueries property.
         * 
         * @return
         *     possible object is
         *     {@link ContinousQueries }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
        public ContinousQueries getContinousQueries() {
            return continousQueries;
        }

        /**
         * Sets the value of the continousQueries property.
         * 
         * @param value
         *     allowed object is
         *     {@link ContinousQueries }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setContinousQueries(ContinousQueries value) {
            this.continousQueries = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="query" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "query"
        })
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class ContinousQueries {

            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
            protected List<Query> query;

            /**
             * Gets the value of the query property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the query property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getQuery().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Query }
             * 
             * 
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
            public List<Query> getQuery() {
                if (query == null) {
                    query = new ArrayList<Query>();
                }
                return this.query;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Query {

                @XmlAttribute(name = "value", required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
                protected String value;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
                public void setValue(String value) {
                    this.value = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="property" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="name">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="type">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "property"
        })
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Properties {

            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
            protected List<Property> property;

            /**
             * Gets the value of the property property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the property property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProperty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Property }
             * 
             * 
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
            public List<Property> getProperty() {
                if (property == null) {
                    property = new ArrayList<Property>();
                }
                return this.property;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="name">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="type">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "name",
                "type"
            })
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Property {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
                protected Name name;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
                protected Type type;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Name }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
                public Name getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Name }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
                public void setName(Name value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Type }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
                public Type getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Type }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
                public void setType(Type value) {
                    this.type = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
                public static class Name {

                    @XmlAttribute(name = "value", required = true)
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
                    protected String value;

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
                    public void setValue(String value) {
                        this.value = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
                public static class Type {

                    @XmlAttribute(name = "value", required = true)
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
                    protected String value;

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
                    public void setValue(String value) {
                        this.value = value;
                    }

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Streamname {

            @XmlAttribute(name = "value", required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String value;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setValue(String value) {
                this.value = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Streamsource {

            @XmlAttribute(name = "value", required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String value;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setValue(String value) {
                this.value = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="windowsize">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="windowvelocity">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="windowtype">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "windowsize",
            "windowvelocity",
            "windowtype"
        })
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Window {

            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
            protected Windowsize windowsize;
            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
            protected Windowvelocity windowvelocity;
            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
            protected Windowtype windowtype;

            /**
             * Gets the value of the windowsize property.
             * 
             * @return
             *     possible object is
             *     {@link Windowsize }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
            public Windowsize getWindowsize() {
                return windowsize;
            }

            /**
             * Sets the value of the windowsize property.
             * 
             * @param value
             *     allowed object is
             *     {@link Windowsize }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setWindowsize(Windowsize value) {
                this.windowsize = value;
            }

            /**
             * Gets the value of the windowvelocity property.
             * 
             * @return
             *     possible object is
             *     {@link Windowvelocity }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
            public Windowvelocity getWindowvelocity() {
                return windowvelocity;
            }

            /**
             * Sets the value of the windowvelocity property.
             * 
             * @param value
             *     allowed object is
             *     {@link Windowvelocity }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setWindowvelocity(Windowvelocity value) {
                this.windowvelocity = value;
            }

            /**
             * Gets the value of the windowtype property.
             * 
             * @return
             *     possible object is
             *     {@link Windowtype }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
            public Windowtype getWindowtype() {
                return windowtype;
            }

            /**
             * Sets the value of the windowtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link Windowtype }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setWindowtype(Windowtype value) {
                this.windowtype = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Windowsize {

                @XmlAttribute(name = "value", required = true)
                @XmlSchemaType(name = "unsignedByte")
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
                protected short value;

                /**
                 * Gets the value of the value property.
                 * 
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
                public short getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
                public void setValue(short value) {
                    this.value = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Windowtype {

                @XmlAttribute(name = "value", required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
                protected String value;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
                public void setValue(String value) {
                    this.value = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Windowvelocity {

                @XmlAttribute(name = "value", required = true)
                @XmlSchemaType(name = "unsignedByte")
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
                protected short value;

                /**
                 * Gets the value of the value property.
                 * 
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
                public short getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-04-05T05:21:47+05:30", comments = "JAXB RI v2.2.8-b130911.1802")
                public void setValue(short value) {
                    this.value = value;
                }

            }

        }

    }

}

