
package com.whatever.CispService;

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
@WebServiceClient(name = "CispService", targetNamespace = "urn:Vidal", wsdlLocation = "file:/D:/dev/SourceRepoAlt/agfa/sdb-connectors/fr/vidal/trunk/src/main/resources/wsdl/CispService.wsdl")
public class CispService_Service
    extends Service
{

    private final static URL CISPSERVICE_WSDL_LOCATION;
    private final static WebServiceException CISPSERVICE_EXCEPTION;
    private final static QName CISPSERVICE_QNAME = new QName("urn:Vidal", "CispService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/dev/SourceRepoAlt/agfa/sdb-connectors/fr/vidal/trunk/src/main/resources/wsdl/CispService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CISPSERVICE_WSDL_LOCATION = url;
        CISPSERVICE_EXCEPTION = e;
    }

    public CispService_Service() {
        super(__getWsdlLocation(), CISPSERVICE_QNAME);
    }

    public CispService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns CispService
     */
    @WebEndpoint(name = "CispServiceHttpPort")
    public CispService getCispServiceHttpPort() {
        return super.getPort(new QName("urn:Vidal", "CispServiceHttpPort"), CispService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CispService
     */
    @WebEndpoint(name = "CispServiceHttpPort")
    public CispService getCispServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:Vidal", "CispServiceHttpPort"), CispService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CISPSERVICE_EXCEPTION!= null) {
            throw CISPSERVICE_EXCEPTION;
        }
        return CISPSERVICE_WSDL_LOCATION;
    }

}
