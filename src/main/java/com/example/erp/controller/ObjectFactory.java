package com.example.erp.controller;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mypackage package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Streams }
     * 
     */
    public Streams createStreams() {
        return new Streams();
    }

    /**
     * Create an instance of {@link Streams.Stream }
     * 
     */
    public Streams.Stream createStreamsStream() {
        return new Streams.Stream();
    }

    /**
     * Create an instance of {@link Streams.Stream.ContinousQueries }
     * 
     */
    public Streams.Stream.ContinousQueries createStreamsStreamContinousQueries() {
        return new Streams.Stream.ContinousQueries();
    }

    /**
     * Create an instance of {@link Streams.Stream.Properties }
     * 
     */
    public Streams.Stream.Properties createStreamsStreamProperties() {
        return new Streams.Stream.Properties();
    }

    /**
     * Create an instance of {@link Streams.Stream.Properties.Property }
     * 
     */
    public Streams.Stream.Properties.Property createStreamsStreamPropertiesProperty() {
        return new Streams.Stream.Properties.Property();
    }

    /**
     * Create an instance of {@link Streams.Stream.Window }
     * 
     */
    public Streams.Stream.Window createStreamsStreamWindow() {
        return new Streams.Stream.Window();
    }

    /**
     * Create an instance of {@link Streams.Stream.Streamname }
     * 
     */
    public Streams.Stream.Streamname createStreamsStreamStreamname() {
        return new Streams.Stream.Streamname();
    }

    /**
     * Create an instance of {@link Streams.Stream.Streamsource }
     * 
     */
    public Streams.Stream.Streamsource createStreamsStreamStreamsource() {
        return new Streams.Stream.Streamsource();
    }

    /**
     * Create an instance of {@link Streams.Stream.ContinousQueries.Query }
     * 
     */
    public Streams.Stream.ContinousQueries.Query createStreamsStreamContinousQueriesQuery() {
        return new Streams.Stream.ContinousQueries.Query();
    }

    /**
     * Create an instance of {@link Streams.Stream.Properties.Property.Name }
     * 
     */
    public Streams.Stream.Properties.Property.Name createStreamsStreamPropertiesPropertyName() {
        return new Streams.Stream.Properties.Property.Name();
    }

    /**
     * Create an instance of {@link Streams.Stream.Properties.Property.Type }
     * 
     */
    public Streams.Stream.Properties.Property.Type createStreamsStreamPropertiesPropertyType() {
        return new Streams.Stream.Properties.Property.Type();
    }

    /**
     * Create an instance of {@link Streams.Stream.Window.Windowsize }
     * 
     */
    public Streams.Stream.Window.Windowsize createStreamsStreamWindowWindowsize() {
        return new Streams.Stream.Window.Windowsize();
    }

    /**
     * Create an instance of {@link Streams.Stream.Window.Windowvelocity }
     * 
     */
    public Streams.Stream.Window.Windowvelocity createStreamsStreamWindowWindowvelocity() {
        return new Streams.Stream.Window.Windowvelocity();
    }

    /**
     * Create an instance of {@link Streams.Stream.Window.Windowtype }
     * 
     */
    public Streams.Stream.Window.Windowtype createStreamsStreamWindowWindowtype() {
        return new Streams.Stream.Window.Windowtype();
    }

}

