
package com.whatever.SurveillanceService;

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
@WebService(name = "surveillanceService", targetNamespace = "urn:Vidal")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SurveillanceService {


    /**
     * 
     * @param commonNameGroupId
     * @return
     *     returns com.whatever.SurveillanceService.ArrayOfSurveillanceCommentCouple
     */
    @WebMethod
    @WebResult(name = "surveillanceCommentCoupleList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByCommonNameGroupId", targetNamespace = "urn:Vidal", className = "com.whatever.SurveillanceService.SearchByCommonNameGroupId")
    @ResponseWrapper(localName = "searchByCommonNameGroupIdResponse", targetNamespace = "urn:Vidal", className = "com.whatever.SurveillanceService.SearchByCommonNameGroupIdResponse")
    public ArrayOfSurveillanceCommentCouple searchByCommonNameGroupId(
        @WebParam(name = "commonNameGroupId", targetNamespace = "urn:Vidal")
        Integer commonNameGroupId);

    /**
     * 
     * @param productId
     * @return
     *     returns com.whatever.SurveillanceService.ArrayOfSurveillanceCommentCouple
     */
    @WebMethod
    @WebResult(name = "surveillanceCommentCoupleList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByProductId", targetNamespace = "urn:Vidal", className = "com.whatever.SurveillanceService.SearchByProductId")
    @ResponseWrapper(localName = "searchByProductIdResponse", targetNamespace = "urn:Vidal", className = "com.whatever.SurveillanceService.SearchByProductIdResponse")
    public ArrayOfSurveillanceCommentCouple searchByProductId(
        @WebParam(name = "productId", targetNamespace = "urn:Vidal")
        Integer productId);

}
