
package com.vidal.AllergyService;

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
@WebServiceClient(name = "AllergyService", targetNamespace = "urn:Vidal", wsdlLocation = "file:/D:/dev/SourceRepoAlt/agfa/sdb-connectors/fr/vidal/trunk/src/main/resources/wsdl/AllergyService.wsdl")
public class AllergyService_Service
    extends Service
{

    private final static URL ALLERGYSERVICE_WSDL_LOCATION;
    private final static WebServiceException ALLERGYSERVICE_EXCEPTION;
    private final static QName ALLERGYSERVICE_QNAME = new QName("urn:Vidal", "AllergyService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/dev/SourceRepoAlt/agfa/sdb-connectors/fr/vidal/trunk/src/main/resources/wsdl/AllergyService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ALLERGYSERVICE_WSDL_LOCATION = url;
        ALLERGYSERVICE_EXCEPTION = e;
    }

    public AllergyService_Service() {
        super(__getWsdlLocation(), ALLERGYSERVICE_QNAME);
    }

    public AllergyService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns AllergyService
     */
    @WebEndpoint(name = "AllergyServiceHttpPort")
    public AllergyService getAllergyServiceHttpPort() {
        return super.getPort(new QName("urn:Vidal", "AllergyServiceHttpPort"), AllergyService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AllergyService
     */
    @WebEndpoint(name = "AllergyServiceHttpPort")
    public AllergyService getAllergyServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:Vidal", "AllergyServiceHttpPort"), AllergyService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ALLERGYSERVICE_EXCEPTION!= null) {
            throw ALLERGYSERVICE_EXCEPTION;
        }
        return ALLERGYSERVICE_WSDL_LOCATION;
    }

}
