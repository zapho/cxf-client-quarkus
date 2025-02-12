
package com.whatever.ContraIndicationService;

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
@WebServiceClient(name = "ContraIndicationService", targetNamespace = "urn:Vidal", wsdlLocation = "file:/D:/dev/SourceRepoAlt/agfa/sdb-connectors/fr/vidal/trunk/src/main/resources/wsdl/ContraIndicationService.wsdl")
public class ContraIndicationService_Service
    extends Service
{

    private final static URL CONTRAINDICATIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException CONTRAINDICATIONSERVICE_EXCEPTION;
    private final static QName CONTRAINDICATIONSERVICE_QNAME = new QName("urn:Vidal", "ContraIndicationService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/dev/SourceRepoAlt/agfa/sdb-connectors/fr/vidal/trunk/src/main/resources/wsdl/ContraIndicationService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONTRAINDICATIONSERVICE_WSDL_LOCATION = url;
        CONTRAINDICATIONSERVICE_EXCEPTION = e;
    }

    public ContraIndicationService_Service() {
        super(__getWsdlLocation(), CONTRAINDICATIONSERVICE_QNAME);
    }

    public ContraIndicationService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ContraIndicationService
     */
    @WebEndpoint(name = "ContraIndicationServiceHttpPort")
    public ContraIndicationService getContraIndicationServiceHttpPort() {
        return super.getPort(new QName("urn:Vidal", "ContraIndicationServiceHttpPort"), ContraIndicationService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ContraIndicationService
     */
    @WebEndpoint(name = "ContraIndicationServiceHttpPort")
    public ContraIndicationService getContraIndicationServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:Vidal", "ContraIndicationServiceHttpPort"), ContraIndicationService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONTRAINDICATIONSERVICE_EXCEPTION!= null) {
            throw CONTRAINDICATIONSERVICE_EXCEPTION;
        }
        return CONTRAINDICATIONSERVICE_WSDL_LOCATION;
    }

}
