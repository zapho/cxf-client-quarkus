
package com.whatever.SfmgService;

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
@WebService(name = "sfmgService", targetNamespace = "urn:Vidal")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SfmgService {


    /**
     * 
     * @param code
     * @return
     *     returns com.whatever.SfmgService.ArrayOfSfmg
     */
    @WebMethod
    @WebResult(name = "sfmgList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByCode", targetNamespace = "urn:Vidal", className = "com.whatever.SfmgService.SearchByCode")
    @ResponseWrapper(localName = "searchByCodeResponse", targetNamespace = "urn:Vidal", className = "com.whatever.SfmgService.SearchByCodeResponse")
    public ArrayOfSfmg searchByCode(
        @WebParam(name = "code", targetNamespace = "urn:Vidal")
        String code);

    /**
     * 
     * @param sfmgId
     * @return
     *     returns com.whatever.SfmgService.Sfmg
     */
    @WebMethod
    @WebResult(name = "sfmg", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchById", targetNamespace = "urn:Vidal", className = "com.whatever.SfmgService.SearchById")
    @ResponseWrapper(localName = "searchByIdResponse", targetNamespace = "urn:Vidal", className = "com.whatever.SfmgService.SearchByIdResponse")
    public Sfmg searchById(
        @WebParam(name = "sfmgId", targetNamespace = "urn:Vidal")
        Integer sfmgId);

    /**
     * 
     * @param indicationGroupId
     * @return
     *     returns com.whatever.SfmgService.ArrayOfSfmg
     */
    @WebMethod
    @WebResult(name = "sfmgList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByIndicationGroupId", targetNamespace = "urn:Vidal", className = "com.whatever.SfmgService.SearchByIndicationGroupId")
    @ResponseWrapper(localName = "searchByIndicationGroupIdResponse", targetNamespace = "urn:Vidal", className = "com.whatever.SfmgService.SearchByIndicationGroupIdResponse")
    public ArrayOfSfmg searchByIndicationGroupId(
        @WebParam(name = "indicationGroupId", targetNamespace = "urn:Vidal")
        Integer indicationGroupId);

    /**
     * 
     * @param name
     * @return
     *     returns com.whatever.SfmgService.ArrayOfSfmg
     */
    @WebMethod
    @WebResult(name = "sfmgList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByName", targetNamespace = "urn:Vidal", className = "com.whatever.SfmgService.SearchByName")
    @ResponseWrapper(localName = "searchByNameResponse", targetNamespace = "urn:Vidal", className = "com.whatever.SfmgService.SearchByNameResponse")
    public ArrayOfSfmg searchByName(
        @WebParam(name = "name", targetNamespace = "urn:Vidal")
        String name);

}
