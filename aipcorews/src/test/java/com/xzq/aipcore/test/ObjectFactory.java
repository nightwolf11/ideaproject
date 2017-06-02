
package com.xzq.aipcore.test;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.xzq.aipcore.client.test package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xzq.aipcore.client.test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link Responsehead }
     * 
     */
    public Responsehead createResponsehead() {
        return new Responsehead();
    }

    /**
     * Create an instance of {@link Responsemessage }
     * 
     */
    public Responsemessage createResponsemessage() {
        return new Responsemessage();
    }

    /**
     * Create an instance of {@link GetUserRequest }
     * 
     */
    public GetUserRequest createGetUserRequest() {
        return new GetUserRequest();
    }

    /**
     * Create an instance of {@link Requesthead }
     * 
     */
    public Requesthead createRequesthead() {
        return new Requesthead();
    }

    /**
     * Create an instance of {@link Requestmessage }
     * 
     */
    public Requestmessage createRequestmessage() {
        return new Requestmessage();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

}
