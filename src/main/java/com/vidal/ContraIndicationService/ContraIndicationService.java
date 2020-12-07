
package com.vidal.ContraIndicationService;

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
@WebService(name = "contraIndicationService", targetNamespace = "urn:Vidal")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ContraIndicationService {


    /**
     * 
     * @param cim10Id
     * @return
     *     returns com.vidal.ContraIndicationService.ArrayOfContraIndication
     */
    @WebMethod
    @WebResult(name = "contraIndicationList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByCim10Id", targetNamespace = "urn:Vidal", className = "com.vidal.ContraIndicationService.SearchByCim10Id")
    @ResponseWrapper(localName = "searchByCim10IdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.ContraIndicationService.SearchByCim10IdResponse")
    public ArrayOfContraIndication searchByCim10Id(
        @WebParam(name = "cim10Id", targetNamespace = "urn:Vidal")
        Integer cim10Id);

    /**
     * 
     * @param commonNameGroupId
     * @return
     *     returns com.vidal.ContraIndicationService.CommonNameGroupContraIndicationList
     */
    @WebMethod
    @WebResult(name = "contraIndicationList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByCommonNameGroupId", targetNamespace = "urn:Vidal", className = "com.vidal.ContraIndicationService.SearchByCommonNameGroupId")
    @ResponseWrapper(localName = "searchByCommonNameGroupIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.ContraIndicationService.SearchByCommonNameGroupIdResponse")
    public CommonNameGroupContraIndicationList searchByCommonNameGroupId(
        @WebParam(name = "commonNameGroupId", targetNamespace = "urn:Vidal")
        Integer commonNameGroupId);

    /**
     * 
     * @param contraIndicationId
     * @return
     *     returns com.vidal.ContraIndicationService.ContraIndication
     */
    @WebMethod
    @WebResult(name = "contraIndication", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchById", targetNamespace = "urn:Vidal", className = "com.vidal.ContraIndicationService.SearchById")
    @ResponseWrapper(localName = "searchByIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.ContraIndicationService.SearchByIdResponse")
    public ContraIndication searchById(
        @WebParam(name = "contraIndicationId", targetNamespace = "urn:Vidal")
        Integer contraIndicationId);

    /**
     * 
     * @param name
     * @return
     *     returns com.vidal.ContraIndicationService.ArrayOfContraIndication
     */
    @WebMethod
    @WebResult(name = "contraIndicationList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByName", targetNamespace = "urn:Vidal", className = "com.vidal.ContraIndicationService.SearchByName")
    @ResponseWrapper(localName = "searchByNameResponse", targetNamespace = "urn:Vidal", className = "com.vidal.ContraIndicationService.SearchByNameResponse")
    public ArrayOfContraIndication searchByName(
        @WebParam(name = "name", targetNamespace = "urn:Vidal")
        String name);

    /**
     * 
     * @param productId
     * @return
     *     returns com.vidal.ContraIndicationService.ArrayOfContraIndicationProductCouple
     */
    @WebMethod
    @WebResult(name = "contraIndicationList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByProductId", targetNamespace = "urn:Vidal", className = "com.vidal.ContraIndicationService.SearchByProductId")
    @ResponseWrapper(localName = "searchByProductIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.ContraIndicationService.SearchByProductIdResponse")
    public ArrayOfContraIndicationProductCouple searchByProductId(
        @WebParam(name = "productId", targetNamespace = "urn:Vidal")
        Integer productId);

    /**
     * 
     * @param sfmgId
     * @return
     *     returns com.vidal.ContraIndicationService.ArrayOfContraIndication
     */
    @WebMethod
    @WebResult(name = "contraIndicationList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchBySfmgId", targetNamespace = "urn:Vidal", className = "com.vidal.ContraIndicationService.SearchBySfmgId")
    @ResponseWrapper(localName = "searchBySfmgIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.ContraIndicationService.SearchBySfmgIdResponse")
    public ArrayOfContraIndication searchBySfmgId(
        @WebParam(name = "sfmgId", targetNamespace = "urn:Vidal")
        Integer sfmgId);

}
