
package com.xzq.aipcore.test;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UserPortService", targetNamespace = "http://www.xzq.com/userws", wsdlLocation = "http://localhost:8888/topshow/ws/test.wsdl")
public class UserPortService
    extends Service
{

    private final static URL USERPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException USERPORTSERVICE_EXCEPTION;
    private final static QName USERPORTSERVICE_QNAME = new QName("http://www.xzq.com/userws", "UserPortService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8888/topshow/ws/test.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USERPORTSERVICE_WSDL_LOCATION = url;
        USERPORTSERVICE_EXCEPTION = e;
    }

    public UserPortService() {
        super(__getWsdlLocation(), USERPORTSERVICE_QNAME);
    }

    public UserPortService(WebServiceFeature... features) {
        super(__getWsdlLocation(), USERPORTSERVICE_QNAME, features);
    }

    public UserPortService(URL wsdlLocation) {
        super(wsdlLocation, USERPORTSERVICE_QNAME);
    }

    public UserPortService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USERPORTSERVICE_QNAME, features);
    }

    public UserPortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserPortService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UserPort
     */
    @WebEndpoint(name = "UserPortSoap11")
    public UserPort getUserPortSoap11() {
        return super.getPort(new QName("http://www.xzq.com/userws", "UserPortSoap11"), UserPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserPort
     */
    @WebEndpoint(name = "UserPortSoap11")
    public UserPort getUserPortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.xzq.com/userws", "UserPortSoap11"), UserPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USERPORTSERVICE_EXCEPTION!= null) {
            throw USERPORTSERVICE_EXCEPTION;
        }
        return USERPORTSERVICE_WSDL_LOCATION;
    }

}
