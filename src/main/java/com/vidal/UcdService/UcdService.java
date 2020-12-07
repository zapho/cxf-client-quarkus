
package com.vidal.UcdService;

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
@WebService(name = "ucdService", targetNamespace = "urn:Vidal")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UcdService {


    /**
     * 
     * @param pageNumber
     * @param name
     * @param pageSize
     * @param marketStatuses
     * @param aggregates
     * @param ucdApiFilter
     * @return
     *     returns com.vidal.UcdService.PagedResultUcdFull
     */
    @WebMethod
    @WebResult(name = "pagedResultFullUcd", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "getAllUcdFull", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.GetAllUcdFull")
    @ResponseWrapper(localName = "getAllUcdFullResponse", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.GetAllUcdFullResponse")
    public PagedResultUcdFull getAllUcdFull(
        @WebParam(name = "name", targetNamespace = "urn:Vidal")
        String name,
        @WebParam(name = "ucdApiFilter", targetNamespace = "urn:Vidal")
        UcdApiFilter ucdApiFilter,
        @WebParam(name = "marketStatuses", targetNamespace = "urn:Vidal")
        ArrayOfMarketStatus marketStatuses,
        @WebParam(name = "aggregates", targetNamespace = "urn:Vidal")
        ArrayOfAggregate aggregates,
        @WebParam(name = "pageNumber", targetNamespace = "urn:Vidal")
        Integer pageNumber,
        @WebParam(name = "pageSize", targetNamespace = "urn:Vidal")
        Integer pageSize);

    /**
     * 
     * @param ucdIds
     * @param aggregates
     * @return
     *     returns com.vidal.UcdService.ArrayOfUcdFull
     */
    @WebMethod
    @WebResult(name = "ucdFullList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "getAllUcdFullByIds", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.GetAllUcdFullByIds")
    @ResponseWrapper(localName = "getAllUcdFullByIdsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.GetAllUcdFullByIdsResponse")
    public ArrayOfUcdFull getAllUcdFullByIds(
        @WebParam(name = "ucdIds", targetNamespace = "urn:Vidal")
        ArrayOfInt ucdIds,
        @WebParam(name = "aggregates", targetNamespace = "urn:Vidal")
        ArrayOfAggregate aggregates);

    /**
     * 
     * @param pageNumber
     * @param pageSize
     * @param marketStatuses
     * @param ucdApiFilter
     * @return
     *     returns com.vidal.UcdService.PagedResultUcd
     */
    @WebMethod
    @WebResult(name = "pagedResultUcd", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "getAllUcds", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.GetAllUcds")
    @ResponseWrapper(localName = "getAllUcdsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.GetAllUcdsResponse")
    public PagedResultUcd getAllUcds(
        @WebParam(name = "ucdApiFilter", targetNamespace = "urn:Vidal")
        UcdApiFilter ucdApiFilter,
        @WebParam(name = "marketStatuses", targetNamespace = "urn:Vidal")
        ArrayOfMarketStatus marketStatuses,
        @WebParam(name = "pageNumber", targetNamespace = "urn:Vidal")
        Integer pageNumber,
        @WebParam(name = "pageSize", targetNamespace = "urn:Vidal")
        Integer pageSize);

    /**
     * 
     * @param ucdIds
     * @return
     *     returns com.vidal.UcdService.ArrayOfUcdPosologyUnitsAndItemsConcentrations
     */
    @WebMethod
    @WebResult(name = "ucdPosologyUnitsAndItemsConcentrationsList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "getUcdsPosologyUnitsAndItemsConcentrationsByUcdIds", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.GetUcdsPosologyUnitsAndItemsConcentrationsByUcdIds")
    @ResponseWrapper(localName = "getUcdsPosologyUnitsAndItemsConcentrationsByUcdIdsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.GetUcdsPosologyUnitsAndItemsConcentrationsByUcdIdsResponse")
    public ArrayOfUcdPosologyUnitsAndItemsConcentrations getUcdsPosologyUnitsAndItemsConcentrationsByUcdIds(
        @WebParam(name = "ucdIds", targetNamespace = "urn:Vidal")
        ArrayOfInt ucdIds);

    /**
     * 
     * @param ucdId
     * @return
     *     returns com.vidal.UcdService.ArrayOfConvertibleUnit
     */
    @WebMethod
    @WebResult(name = "convertibleUnitList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "getUnits", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.GetUnits")
    @ResponseWrapper(localName = "getUnitsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.GetUnitsResponse")
    public ArrayOfConvertibleUnit getUnits(
        @WebParam(name = "ucdId", targetNamespace = "urn:Vidal")
        Integer ucdId);

    /**
     * 
     * @param codes
     * @return
     *     returns com.vidal.UcdService.ArrayOfUcd
     */
    @WebMethod
    @WebResult(name = "ucdList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByCodes", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.SearchByCodes")
    @ResponseWrapper(localName = "searchByCodesResponse", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.SearchByCodesResponse")
    public ArrayOfUcd searchByCodes(
        @WebParam(name = "codes", targetNamespace = "urn:Vidal")
        ArrayOfString codes);

    /**
     * 
     * @param commonNameGroupId
     * @return
     *     returns com.vidal.UcdService.ArrayOfUcd
     */
    @WebMethod
    @WebResult(name = "ucdList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByCommonNameGroupId", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.SearchByCommonNameGroupId")
    @ResponseWrapper(localName = "searchByCommonNameGroupIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.SearchByCommonNameGroupIdResponse")
    public ArrayOfUcd searchByCommonNameGroupId(
        @WebParam(name = "commonNameGroupId", targetNamespace = "urn:Vidal")
        Integer commonNameGroupId);

    /**
     * 
     * @param companyId
     * @param type
     * @return
     *     returns com.vidal.UcdService.ArrayOfUcd
     */
    @WebMethod
    @WebResult(name = "ucdList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByCompanyIdAndType", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.SearchByCompanyIdAndType")
    @ResponseWrapper(localName = "searchByCompanyIdAndTypeResponse", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.SearchByCompanyIdAndTypeResponse")
    public ArrayOfUcd searchByCompanyIdAndType(
        @WebParam(name = "companyId", targetNamespace = "urn:Vidal")
        Integer companyId,
        @WebParam(name = "type", targetNamespace = "urn:Vidal")
        CompanyType type);

    /**
     * 
     * @param ucdId
     * @return
     *     returns com.vidal.UcdService.Ucd
     */
    @WebMethod
    @WebResult(name = "ucd", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchById", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.SearchById")
    @ResponseWrapper(localName = "searchByIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.SearchByIdResponse")
    public Ucd searchById(
        @WebParam(name = "ucdId", targetNamespace = "urn:Vidal")
        Integer ucdId);

    /**
     * 
     * @param ucdIds
     * @return
     *     returns com.vidal.UcdService.ArrayOfUcd
     */
    @WebMethod
    @WebResult(name = "ucdList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByIds", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.SearchByIds")
    @ResponseWrapper(localName = "searchByIdsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.SearchByIdsResponse")
    public ArrayOfUcd searchByIds(
        @WebParam(name = "ucdIds", targetNamespace = "urn:Vidal")
        ArrayOfInt ucdIds);

    /**
     * 
     * @param indicationLESCode
     * @param pageNumber
     * @param pageSize
     * @return
     *     returns com.vidal.UcdService.PagedResultUcd
     */
    @WebMethod
    @WebResult(name = "pagedResultUcdByIndicationLESCode", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByIndicationLESCode", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.SearchByIndicationLESCode")
    @ResponseWrapper(localName = "searchByIndicationLESCodeResponse", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.SearchByIndicationLESCodeResponse")
    public PagedResultUcd searchByIndicationLESCode(
        @WebParam(name = "indicationLESCode", targetNamespace = "urn:Vidal")
        String indicationLESCode,
        @WebParam(name = "pageNumber", targetNamespace = "urn:Vidal")
        Integer pageNumber,
        @WebParam(name = "pageSize", targetNamespace = "urn:Vidal")
        Integer pageSize);

    /**
     * 
     * @param pageNumber
     * @param pageSize
     * @param operatorType
     * @param indicators
     * @return
     *     returns com.vidal.UcdService.PagedResultUcd
     */
    @WebMethod
    @WebResult(name = "pagedResultUcdByIndicators", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByIndicatorIds", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.SearchByIndicatorIds")
    @ResponseWrapper(localName = "searchByIndicatorIdsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.SearchByIndicatorIdsResponse")
    public PagedResultUcd searchByIndicatorIds(
        @WebParam(name = "indicators", targetNamespace = "urn:Vidal")
        ArrayOfInt indicators,
        @WebParam(name = "operatorType", targetNamespace = "urn:Vidal")
        SetOperatorType operatorType,
        @WebParam(name = "pageNumber", targetNamespace = "urn:Vidal")
        Integer pageNumber,
        @WebParam(name = "pageSize", targetNamespace = "urn:Vidal")
        Integer pageSize);

    /**
     * 
     * @param name
     * @return
     *     returns com.vidal.UcdService.ArrayOfUcd
     */
    @WebMethod
    @WebResult(name = "ucdList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByName", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.SearchByName")
    @ResponseWrapper(localName = "searchByNameResponse", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.SearchByNameResponse")
    public ArrayOfUcd searchByName(
        @WebParam(name = "name", targetNamespace = "urn:Vidal")
        String name);

    /**
     * 
     * @param pageNumber
     * @param name
     * @param pageSize
     * @param marketStatuses
     * @return
     *     returns com.vidal.UcdService.PagedResultUcd
     */
    @WebMethod
    @WebResult(name = "pagedResultUcd", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByNameWithPagedResult", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.SearchByNameWithPagedResult")
    @ResponseWrapper(localName = "searchByNameWithPagedResultResponse", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.SearchByNameWithPagedResultResponse")
    public PagedResultUcd searchByNameWithPagedResult(
        @WebParam(name = "name", targetNamespace = "urn:Vidal")
        String name,
        @WebParam(name = "marketStatuses", targetNamespace = "urn:Vidal")
        ArrayOfMarketStatus marketStatuses,
        @WebParam(name = "pageNumber", targetNamespace = "urn:Vidal")
        Integer pageNumber,
        @WebParam(name = "pageSize", targetNamespace = "urn:Vidal")
        Integer pageSize);

    /**
     * 
     * @param pageNumber
     * @param otherIndicationCode
     * @param pageSize
     * @return
     *     returns com.vidal.UcdService.PagedResultUcd
     */
    @WebMethod
    @WebResult(name = "pagedResultUcdByOtherIndicationCode", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByOtherIndicationCode", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.SearchByOtherIndicationCode")
    @ResponseWrapper(localName = "searchByOtherIndicationCodeResponse", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.SearchByOtherIndicationCodeResponse")
    public PagedResultUcd searchByOtherIndicationCode(
        @WebParam(name = "otherIndicationCode", targetNamespace = "urn:Vidal")
        String otherIndicationCode,
        @WebParam(name = "pageNumber", targetNamespace = "urn:Vidal")
        Integer pageNumber,
        @WebParam(name = "pageSize", targetNamespace = "urn:Vidal")
        Integer pageSize);

    /**
     * 
     * @param packId
     * @return
     *     returns com.vidal.UcdService.Ucd
     */
    @WebMethod
    @WebResult(name = "ucd", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByPackId", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.SearchByPackId")
    @ResponseWrapper(localName = "searchByPackIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.SearchByPackIdResponse")
    public Ucd searchByPackId(
        @WebParam(name = "packId", targetNamespace = "urn:Vidal")
        Integer packId);

    /**
     * 
     * @param productId
     * @return
     *     returns com.vidal.UcdService.ArrayOfUcd
     */
    @WebMethod
    @WebResult(name = "ucdList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByProductId", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.SearchByProductId")
    @ResponseWrapper(localName = "searchByProductIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.SearchByProductIdResponse")
    public ArrayOfUcd searchByProductId(
        @WebParam(name = "productId", targetNamespace = "urn:Vidal")
        Integer productId);

    /**
     * 
     * @param productRangeIds
     * @return
     *     returns com.vidal.UcdService.ArrayOfProductRangeUcdCouple
     */
    @WebMethod
    @WebResult(name = "ProductRangeUcdCoupleList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByProductRangeIds", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.SearchByProductRangeIds")
    @ResponseWrapper(localName = "searchByProductRangeIdsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.SearchByProductRangeIdsResponse")
    public ArrayOfProductRangeUcdCouple searchByProductRangeIds(
        @WebParam(name = "productRangeIds", targetNamespace = "urn:Vidal")
        ArrayOfInt productRangeIds);

    /**
     * 
     * @return
     *     returns com.vidal.UcdService.ArrayOfUcd
     */
    @WebMethod
    @WebResult(name = "ucdList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchNewlyAvailableUcds", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.SearchNewlyAvailableUcds")
    @ResponseWrapper(localName = "searchNewlyAvailableUcdsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.SearchNewlyAvailableUcdsResponse")
    public ArrayOfUcd searchNewlyAvailableUcds();

    /**
     * 
     * @param ucdIds
     * @return
     *     returns com.vidal.UcdService.ArrayOfUcdIndicators
     */
    @WebMethod
    @WebResult(name = "ucdIndicatorsList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchUcdIndicatorsByUcdIds", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.SearchUcdIndicatorsByUcdIds")
    @ResponseWrapper(localName = "searchUcdIndicatorsByUcdIdsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.UcdService.SearchUcdIndicatorsByUcdIdsResponse")
    public ArrayOfUcdIndicators searchUcdIndicatorsByUcdIds(
        @WebParam(name = "ucdIds", targetNamespace = "urn:Vidal")
        ArrayOfInt ucdIds);

}
