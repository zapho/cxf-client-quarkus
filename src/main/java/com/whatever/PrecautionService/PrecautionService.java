
package com.whatever.PrecautionService;

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
@WebService(name = "precautionService", targetNamespace = "urn:Vidal")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PrecautionService {


    /**
     * 
     * @param commonNameGroupId
     * @return
     *     returns com.whatever.PrecautionService.CommonNameGroupPrecautionList
     */
    @WebMethod
    @WebResult(name = "precautionList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByCommonNameGroupId", targetNamespace = "urn:Vidal", className = "com.whatever.PrecautionService.SearchByCommonNameGroupId")
    @ResponseWrapper(localName = "searchByCommonNameGroupIdResponse", targetNamespace = "urn:Vidal", className = "com.whatever.PrecautionService.SearchByCommonNameGroupIdResponse")
    public CommonNameGroupPrecautionList searchByCommonNameGroupId(
        @WebParam(name = "commonNameGroupId", targetNamespace = "urn:Vidal")
        Integer commonNameGroupId);

    /**
     * 
     * @param id
     * @return
     *     returns com.whatever.PrecautionService.Precaution
     */
    @WebMethod
    @WebResult(name = "precaution", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchById", targetNamespace = "urn:Vidal", className = "com.whatever.PrecautionService.SearchById")
    @ResponseWrapper(localName = "searchByIdResponse", targetNamespace = "urn:Vidal", className = "com.whatever.PrecautionService.SearchByIdResponse")
    public Precaution searchById(
        @WebParam(name = "id", targetNamespace = "urn:Vidal")
        Integer id);

    /**
     * 
     * @param name
     * @return
     *     returns com.whatever.PrecautionService.ArrayOfPrecaution
     */
    @WebMethod
    @WebResult(name = "precautionList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByName", targetNamespace = "urn:Vidal", className = "com.whatever.PrecautionService.SearchByName")
    @ResponseWrapper(localName = "searchByNameResponse", targetNamespace = "urn:Vidal", className = "com.whatever.PrecautionService.SearchByNameResponse")
    public ArrayOfPrecaution searchByName(
        @WebParam(name = "name", targetNamespace = "urn:Vidal")
        String name);

    /**
     * 
     * @param productId
     * @return
     *     returns com.whatever.PrecautionService.ArrayOfPrecaution
     */
    @WebMethod
    @WebResult(name = "precautionList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByProductId", targetNamespace = "urn:Vidal", className = "com.whatever.PrecautionService.SearchByProductId")
    @ResponseWrapper(localName = "searchByProductIdResponse", targetNamespace = "urn:Vidal", className = "com.whatever.PrecautionService.SearchByProductIdResponse")
    public ArrayOfPrecaution searchByProductId(
        @WebParam(name = "productId", targetNamespace = "urn:Vidal")
        Integer productId);

}
