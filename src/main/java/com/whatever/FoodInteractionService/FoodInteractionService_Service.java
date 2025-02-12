
package com.whatever.FoodInteractionService;

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
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "FoodInteractionService", targetNamespace = "urn:Vidal", wsdlLocation = "file:/D:/dev/SourceRepoAlt/agfa/sdb-connectors/fr/vidal/trunk/src/main/resources/wsdl/FoodInteractionService.wsdl")
public class FoodInteractionService_Service
    extends Service
{

    private final static URL FOODINTERACTIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException FOODINTERACTIONSERVICE_EXCEPTION;
    private final static QName FOODINTERACTIONSERVICE_QNAME = new QName("urn:Vidal", "FoodInteractionService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/dev/SourceRepoAlt/agfa/sdb-connectors/fr/vidal/trunk/src/main/resources/wsdl/FoodInteractionService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FOODINTERACTIONSERVICE_WSDL_LOCATION = url;
        FOODINTERACTIONSERVICE_EXCEPTION = e;
    }

    public FoodInteractionService_Service() {
        super(__getWsdlLocation(), FOODINTERACTIONSERVICE_QNAME);
    }

    public FoodInteractionService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns FoodInteractionService
     */
    @WebEndpoint(name = "FoodInteractionServiceHttpPort")
    public FoodInteractionService getFoodInteractionServiceHttpPort() {
        return super.getPort(new QName("urn:Vidal", "FoodInteractionServiceHttpPort"), FoodInteractionService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FoodInteractionService
     */
    @WebEndpoint(name = "FoodInteractionServiceHttpPort")
    public FoodInteractionService getFoodInteractionServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:Vidal", "FoodInteractionServiceHttpPort"), FoodInteractionService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FOODINTERACTIONSERVICE_EXCEPTION!= null) {
            throw FOODINTERACTIONSERVICE_EXCEPTION;
        }
        return FOODINTERACTIONSERVICE_WSDL_LOCATION;
    }

}
