
package com.vidal.SempService;

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
@WebServiceClient(name = "SempService", targetNamespace = "urn:Vidal", wsdlLocation = "file:/D:/dev/SourceRepoAlt/agfa/sdb-connectors/fr/vidal/trunk/src/main/resources/wsdl/SempService.wsdl")
public class SempService_Service
    extends Service
{

    private final static URL SEMPSERVICE_WSDL_LOCATION;
    private final static WebServiceException SEMPSERVICE_EXCEPTION;
    private final static QName SEMPSERVICE_QNAME = new QName("urn:Vidal", "SempService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/dev/SourceRepoAlt/agfa/sdb-connectors/fr/vidal/trunk/src/main/resources/wsdl/SempService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SEMPSERVICE_WSDL_LOCATION = url;
        SEMPSERVICE_EXCEPTION = e;
    }

    public SempService_Service() {
        super(__getWsdlLocation(), SEMPSERVICE_QNAME);
    }

    public SempService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns SempService
     */
    @WebEndpoint(name = "SempServiceHttpPort")
    public SempService getSempServiceHttpPort() {
        return super.getPort(new QName("urn:Vidal", "SempServiceHttpPort"), SempService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SempService
     */
    @WebEndpoint(name = "SempServiceHttpPort")
    public SempService getSempServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:Vidal", "SempServiceHttpPort"), SempService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SEMPSERVICE_EXCEPTION!= null) {
            throw SEMPSERVICE_EXCEPTION;
        }
        return SEMPSERVICE_WSDL_LOCATION;
    }

}
