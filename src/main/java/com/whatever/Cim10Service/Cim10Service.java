
package com.whatever.Cim10Service;

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
@WebService(name = "cim10Service", targetNamespace = "urn:Vidal")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Cim10Service {


    /**
     * 
     * @param pageNumber
     * @param pageSize
     * @return
     *     returns com.whatever.Cim10Service.PagedResultCim10
     */
    @WebMethod(operationName = "getAllCim10s")
    @WebResult(name = "pagedResultCim10", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "getAllCim10s", targetNamespace = "urn:Vidal", className = "com.whatever.Cim10Service.GetAllCim10S")
    @ResponseWrapper(localName = "getAllCim10sResponse", targetNamespace = "urn:Vidal", className = "com.whatever.Cim10Service.GetAllCim10SResponse")
    public PagedResultCim10 getAllCim10S(
        @WebParam(name = "pageNumber", targetNamespace = "urn:Vidal")
        Integer pageNumber,
        @WebParam(name = "pageSize", targetNamespace = "urn:Vidal")
        Integer pageSize);

    /**
     * 
     * @param cim10Id
     * @return
     *     returns com.whatever.Cim10Service.ArrayOfCim10
     */
    @WebMethod
    @WebResult(name = "cim10List", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "getChildren", targetNamespace = "urn:Vidal", className = "com.whatever.Cim10Service.GetChildren")
    @ResponseWrapper(localName = "getChildrenResponse", targetNamespace = "urn:Vidal", className = "com.whatever.Cim10Service.GetChildrenResponse")
    public ArrayOfCim10 getChildren(
        @WebParam(name = "cim10Id", targetNamespace = "urn:Vidal")
        Integer cim10Id);

    /**
     * 
     * @param indicationGroupId
     * @return
     *     returns com.whatever.Cim10Service.ArrayOfCim10
     */
    @WebMethod(operationName = "getCim10sByGIPMSIFiltered")
    @WebResult(name = "cim10List", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "getCim10sByGIPMSIFiltered", targetNamespace = "urn:Vidal", className = "com.whatever.Cim10Service.GetCim10SByGIPMSIFiltered")
    @ResponseWrapper(localName = "getCim10sByGIPMSIFilteredResponse", targetNamespace = "urn:Vidal", className = "com.whatever.Cim10Service.GetCim10SByGIPMSIFilteredResponse")
    public ArrayOfCim10 getCim10SByGIPMSIFiltered(
        @WebParam(name = "indicationGroupId", targetNamespace = "urn:Vidal")
        Integer indicationGroupId);

    /**
     * 
     * @param cim10Id
     * @return
     *     returns com.whatever.Cim10Service.Cim10
     */
    @WebMethod
    @WebResult(name = "cim10", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "getParent", targetNamespace = "urn:Vidal", className = "com.whatever.Cim10Service.GetParent")
    @ResponseWrapper(localName = "getParentResponse", targetNamespace = "urn:Vidal", className = "com.whatever.Cim10Service.GetParentResponse")
    public Cim10 getParent(
        @WebParam(name = "cim10Id", targetNamespace = "urn:Vidal")
        Integer cim10Id);

    /**
     * 
     * @return
     *     returns com.whatever.Cim10Service.Cim10
     */
    @WebMethod
    @WebResult(name = "cim10", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "getRootNode", targetNamespace = "urn:Vidal", className = "com.whatever.Cim10Service.GetRootNode")
    @ResponseWrapper(localName = "getRootNodeResponse", targetNamespace = "urn:Vidal", className = "com.whatever.Cim10Service.GetRootNodeResponse")
    public Cim10 getRootNode();

    /**
     * 
     * @param aldId
     * @return
     *     returns com.whatever.Cim10Service.ArrayOfCim10
     */
    @WebMethod
    @WebResult(name = "cim10List", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByAldId", targetNamespace = "urn:Vidal", className = "com.whatever.Cim10Service.SearchByAldId")
    @ResponseWrapper(localName = "searchByAldIdResponse", targetNamespace = "urn:Vidal", className = "com.whatever.Cim10Service.SearchByAldIdResponse")
    public ArrayOfCim10 searchByAldId(
        @WebParam(name = "aldId", targetNamespace = "urn:Vidal")
        Integer aldId);

    /**
     * 
     * @param code
     * @return
     *     returns com.whatever.Cim10Service.ArrayOfCim10
     */
    @WebMethod
    @WebResult(name = "cim10List", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByCode", targetNamespace = "urn:Vidal", className = "com.whatever.Cim10Service.SearchByCode")
    @ResponseWrapper(localName = "searchByCodeResponse", targetNamespace = "urn:Vidal", className = "com.whatever.Cim10Service.SearchByCodeResponse")
    public ArrayOfCim10 searchByCode(
        @WebParam(name = "code", targetNamespace = "urn:Vidal")
        String code);

    /**
     * 
     * @param contraIndicationId
     * @return
     *     returns com.whatever.Cim10Service.ArrayOfCim10
     */
    @WebMethod
    @WebResult(name = "cim10List", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByContraIndicationId", targetNamespace = "urn:Vidal", className = "com.whatever.Cim10Service.SearchByContraIndicationId")
    @ResponseWrapper(localName = "searchByContraIndicationIdResponse", targetNamespace = "urn:Vidal", className = "com.whatever.Cim10Service.SearchByContraIndicationIdResponse")
    public ArrayOfCim10 searchByContraIndicationId(
        @WebParam(name = "contraIndicationId", targetNamespace = "urn:Vidal")
        Integer contraIndicationId);

    /**
     * 
     * @param cim10Id
     * @return
     *     returns com.whatever.Cim10Service.Cim10
     */
    @WebMethod
    @WebResult(name = "cim10", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchById", targetNamespace = "urn:Vidal", className = "com.whatever.Cim10Service.SearchById")
    @ResponseWrapper(localName = "searchByIdResponse", targetNamespace = "urn:Vidal", className = "com.whatever.Cim10Service.SearchByIdResponse")
    public Cim10 searchById(
        @WebParam(name = "cim10Id", targetNamespace = "urn:Vidal")
        Integer cim10Id);

    /**
     * 
     * @param indicationGroupId
     * @return
     *     returns com.whatever.Cim10Service.ArrayOfCim10
     */
    @WebMethod
    @WebResult(name = "cim10List", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByIndicationGroupId", targetNamespace = "urn:Vidal", className = "com.whatever.Cim10Service.SearchByIndicationGroupId")
    @ResponseWrapper(localName = "searchByIndicationGroupIdResponse", targetNamespace = "urn:Vidal", className = "com.whatever.Cim10Service.SearchByIndicationGroupIdResponse")
    public ArrayOfCim10 searchByIndicationGroupId(
        @WebParam(name = "indicationGroupId", targetNamespace = "urn:Vidal")
        Integer indicationGroupId);

    /**
     * 
     * @param name
     * @return
     *     returns com.whatever.Cim10Service.ArrayOfCim10
     */
    @WebMethod
    @WebResult(name = "cim10List", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByName", targetNamespace = "urn:Vidal", className = "com.whatever.Cim10Service.SearchByName")
    @ResponseWrapper(localName = "searchByNameResponse", targetNamespace = "urn:Vidal", className = "com.whatever.Cim10Service.SearchByNameResponse")
    public ArrayOfCim10 searchByName(
        @WebParam(name = "name", targetNamespace = "urn:Vidal")
        String name);

}
