
package com.whatever.PrecautionService;

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
@WebServiceClient(name = "PrecautionService", targetNamespace = "urn:Vidal", wsdlLocation = "file:/D:/dev/SourceRepoAlt/agfa/sdb-connectors/fr/vidal/trunk/src/main/resources/wsdl/PrecautionService.wsdl")
public class PrecautionService_Service
    extends Service
{

    private final static URL PRECAUTIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException PRECAUTIONSERVICE_EXCEPTION;
    private final static QName PRECAUTIONSERVICE_QNAME = new QName("urn:Vidal", "PrecautionService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/dev/SourceRepoAlt/agfa/sdb-connectors/fr/vidal/trunk/src/main/resources/wsdl/PrecautionService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRECAUTIONSERVICE_WSDL_LOCATION = url;
        PRECAUTIONSERVICE_EXCEPTION = e;
    }

    public PrecautionService_Service() {
        super(__getWsdlLocation(), PRECAUTIONSERVICE_QNAME);
    }

    public PrecautionService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns PrecautionService
     */
    @WebEndpoint(name = "PrecautionServiceHttpPort")
    public PrecautionService getPrecautionServiceHttpPort() {
        return super.getPort(new QName("urn:Vidal", "PrecautionServiceHttpPort"), PrecautionService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PrecautionService
     */
    @WebEndpoint(name = "PrecautionServiceHttpPort")
    public PrecautionService getPrecautionServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:Vidal", "PrecautionServiceHttpPort"), PrecautionService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRECAUTIONSERVICE_EXCEPTION!= null) {
            throw PRECAUTIONSERVICE_EXCEPTION;
        }
        return PRECAUTIONSERVICE_WSDL_LOCATION;
    }

}
