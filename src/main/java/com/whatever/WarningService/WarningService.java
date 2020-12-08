
package com.whatever.WarningService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.1
 * 
 */
@WebService(name = "warningService", targetNamespace = "urn:Vidal")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WarningService {


    /**
     * 
     * @param commonNameGroupId
     * @return
     *     returns com.whatever.WarningService.CommonNameGroupWarningList
     */
    @WebMethod
    @WebResult(name = "warningList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByCommonNameGroupId", targetNamespace = "urn:Vidal", className = "com.whatever.WarningService.SearchByCommonNameGroupId")
    @ResponseWrapper(localName = "searchByCommonNameGroupIdResponse", targetNamespace = "urn:Vidal", className = "com.whatever.WarningService.SearchByCommonNameGroupIdResponse")
    public CommonNameGroupWarningList searchByCommonNameGroupId(
        @WebParam(name = "commonNameGroupId", targetNamespace = "urn:Vidal")
        Integer commonNameGroupId);

    /**
     * 
     * @param warningId
     * @return
     *     returns com.whatever.WarningService.Warning
     */
    @WebMethod
    @WebResult(name = "warning", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchById", targetNamespace = "urn:Vidal", className = "com.whatever.WarningService.SearchById")
    @ResponseWrapper(localName = "searchByIdResponse", targetNamespace = "urn:Vidal", className = "com.whatever.WarningService.SearchByIdResponse")
    public Warning searchById(
        @WebParam(name = "warningId", targetNamespace = "urn:Vidal")
        Integer warningId);

    /**
     * 
     * @param name
     * @return
     *     returns com.whatever.WarningService.ArrayOfWarning
     */
    @WebMethod
    @WebResult(name = "warningList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByName", targetNamespace = "urn:Vidal", className = "com.whatever.WarningService.SearchByName")
    @ResponseWrapper(localName = "searchByNameResponse", targetNamespace = "urn:Vidal", className = "com.whatever.WarningService.SearchByNameResponse")
    public ArrayOfWarning searchByName(
        @WebParam(name = "name", targetNamespace = "urn:Vidal")
        String name);

    /**
     * 
     * @param productId
     * @return
     *     returns com.whatever.WarningService.ArrayOfWarningCommentCouple
     */
    @WebMethod
    @WebResult(name = "warningCommentCoupleList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByProductId", targetNamespace = "urn:Vidal", className = "com.whatever.WarningService.SearchByProductId")
    @ResponseWrapper(localName = "searchByProductIdResponse", targetNamespace = "urn:Vidal", className = "com.whatever.WarningService.SearchByProductIdResponse")
    public ArrayOfWarningCommentCouple searchByProductId(
        @WebParam(name = "productId", targetNamespace = "urn:Vidal")
        Integer productId);

}
