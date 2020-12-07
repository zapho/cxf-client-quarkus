
package com.vidal.ProductService;

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
@WebServiceClient(name = "ProductService", targetNamespace = "urn:Vidal", wsdlLocation = "file:/D:/dev/SourceRepoAlt/agfa/sdb-connectors/fr/vidal/trunk/src/main/resources/wsdl/ProductService.wsdl")
public class ProductService_Service
    extends Service
{

    private final static URL PRODUCTSERVICE_WSDL_LOCATION;
    private final static WebServiceException PRODUCTSERVICE_EXCEPTION;
    private final static QName PRODUCTSERVICE_QNAME = new QName("urn:Vidal", "ProductService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/dev/SourceRepoAlt/agfa/sdb-connectors/fr/vidal/trunk/src/main/resources/wsdl/ProductService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRODUCTSERVICE_WSDL_LOCATION = url;
        PRODUCTSERVICE_EXCEPTION = e;
    }

    public ProductService_Service() {
        super(__getWsdlLocation(), PRODUCTSERVICE_QNAME);
    }

    public ProductService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ProductService
     */
    @WebEndpoint(name = "ProductServiceHttpPort")
    public ProductService getProductServiceHttpPort() {
        return super.getPort(new QName("urn:Vidal", "ProductServiceHttpPort"), ProductService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProductService
     */
    @WebEndpoint(name = "ProductServiceHttpPort")
    public ProductService getProductServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:Vidal", "ProductServiceHttpPort"), ProductService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRODUCTSERVICE_EXCEPTION!= null) {
            throw PRODUCTSERVICE_EXCEPTION;
        }
        return PRODUCTSERVICE_WSDL_LOCATION;
    }

}
