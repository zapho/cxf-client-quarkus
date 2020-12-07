
package com.vidal.RecoService;

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
@WebService(name = "recoService", targetNamespace = "urn:Vidal")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RecoService {


    /**
     * 
     * @param recoId
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "recoUrl", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "getRecoUrl", targetNamespace = "urn:Vidal", className = "com.vidal.RecoService.GetRecoUrl")
    @ResponseWrapper(localName = "getRecoUrlResponse", targetNamespace = "urn:Vidal", className = "com.vidal.RecoService.GetRecoUrlResponse")
    public String getRecoUrl(
        @WebParam(name = "recoId", targetNamespace = "urn:Vidal")
        Integer recoId);

    /**
     * 
     * @return
     *     returns com.vidal.RecoService.ArrayOfRecoDomain
     */
    @WebMethod
    @WebResult(name = "recoDomainList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchAllDomains", targetNamespace = "urn:Vidal", className = "com.vidal.RecoService.SearchAllDomains")
    @ResponseWrapper(localName = "searchAllDomainsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.RecoService.SearchAllDomainsResponse")
    public ArrayOfRecoDomain searchAllDomains();

    /**
     * 
     * @return
     *     returns com.vidal.RecoService.ArrayOfReco
     */
    @WebMethod
    @WebResult(name = "recoList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchAllRecos", targetNamespace = "urn:Vidal", className = "com.vidal.RecoService.SearchAllRecos")
    @ResponseWrapper(localName = "searchAllRecosResponse", targetNamespace = "urn:Vidal", className = "com.vidal.RecoService.SearchAllRecosResponse")
    public ArrayOfReco searchAllRecos();

    /**
     * 
     * @param productIds
     * @return
     *     returns com.vidal.RecoService.ArrayOfReco
     */
    @WebMethod
    @WebResult(name = "recoList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchAllRecosByProductIds", targetNamespace = "urn:Vidal", className = "com.vidal.RecoService.SearchAllRecosByProductIds")
    @ResponseWrapper(localName = "searchAllRecosByProductIdsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.RecoService.SearchAllRecosByProductIdsResponse")
    public ArrayOfReco searchAllRecosByProductIds(
        @WebParam(name = "productIds", targetNamespace = "urn:Vidal")
        ArrayOfInt productIds);

    /**
     * 
     * @param recoDomainIds
     * @return
     *     returns com.vidal.RecoService.ArrayOfReco
     */
    @WebMethod
    @WebResult(name = "recoList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByDomainIds", targetNamespace = "urn:Vidal", className = "com.vidal.RecoService.SearchByDomainIds")
    @ResponseWrapper(localName = "searchByDomainIdsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.RecoService.SearchByDomainIdsResponse")
    public ArrayOfReco searchByDomainIds(
        @WebParam(name = "recoDomainIds", targetNamespace = "urn:Vidal")
        ArrayOfInt recoDomainIds);

    /**
     * 
     * @param recoId
     * @return
     *     returns com.vidal.RecoService.Reco
     */
    @WebMethod
    @WebResult(name = "reco", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchById", targetNamespace = "urn:Vidal", className = "com.vidal.RecoService.SearchById")
    @ResponseWrapper(localName = "searchByIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.RecoService.SearchByIdResponse")
    public Reco searchById(
        @WebParam(name = "recoId", targetNamespace = "urn:Vidal")
        Integer recoId);

    /**
     * 
     * @param indicationGroupIds
     * @return
     *     returns com.vidal.RecoService.ArrayOfReco
     */
    @WebMethod
    @WebResult(name = "recoList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByIndicationGroupIds", targetNamespace = "urn:Vidal", className = "com.vidal.RecoService.SearchByIndicationGroupIds")
    @ResponseWrapper(localName = "searchByIndicationGroupIdsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.RecoService.SearchByIndicationGroupIdsResponse")
    public ArrayOfReco searchByIndicationGroupIds(
        @WebParam(name = "indicationGroupIds", targetNamespace = "urn:Vidal")
        ArrayOfInt indicationGroupIds);

    /**
     * 
     * @param name
     * @return
     *     returns com.vidal.RecoService.ArrayOfReco
     */
    @WebMethod
    @WebResult(name = "recoList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByName", targetNamespace = "urn:Vidal", className = "com.vidal.RecoService.SearchByName")
    @ResponseWrapper(localName = "searchByNameResponse", targetNamespace = "urn:Vidal", className = "com.vidal.RecoService.SearchByNameResponse")
    public ArrayOfReco searchByName(
        @WebParam(name = "name", targetNamespace = "urn:Vidal")
        String name);

    /**
     * 
     * @param recoDomainId
     * @return
     *     returns com.vidal.RecoService.RecoDomain
     */
    @WebMethod
    @WebResult(name = "recoDomain", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchDomainById", targetNamespace = "urn:Vidal", className = "com.vidal.RecoService.SearchDomainById")
    @ResponseWrapper(localName = "searchDomainByIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.RecoService.SearchDomainByIdResponse")
    public RecoDomain searchDomainById(
        @WebParam(name = "recoDomainId", targetNamespace = "urn:Vidal")
        Integer recoDomainId);

    /**
     * 
     * @param name
     * @return
     *     returns com.vidal.RecoService.ArrayOfRecoDomain
     */
    @WebMethod
    @WebResult(name = "recoDomainList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchDomainByName", targetNamespace = "urn:Vidal", className = "com.vidal.RecoService.SearchDomainByName")
    @ResponseWrapper(localName = "searchDomainByNameResponse", targetNamespace = "urn:Vidal", className = "com.vidal.RecoService.SearchDomainByNameResponse")
    public ArrayOfRecoDomain searchDomainByName(
        @WebParam(name = "name", targetNamespace = "urn:Vidal")
        String name);

}
