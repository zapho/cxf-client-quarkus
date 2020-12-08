
package com.whatever.SurveillanceService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="surveillanceCommentCoupleList" type="{urn:Vidal}ArrayOfSurveillanceCommentCouple"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "surveillanceCommentCoupleList"
})
@XmlRootElement(name = "searchByProductIdResponse")
public class SearchByProductIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfSurveillanceCommentCouple surveillanceCommentCoupleList;

    /**
     * Obtient la valeur de la propriété surveillanceCommentCoupleList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSurveillanceCommentCouple }
     *     
     */
    public ArrayOfSurveillanceCommentCouple getSurveillanceCommentCoupleList() {
        return surveillanceCommentCoupleList;
    }

    /**
     * Définit la valeur de la propriété surveillanceCommentCoupleList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSurveillanceCommentCouple }
     *     
     */
    public void setSurveillanceCommentCoupleList(ArrayOfSurveillanceCommentCouple value) {
        this.surveillanceCommentCoupleList = value;
    }

}
