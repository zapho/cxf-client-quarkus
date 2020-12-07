
package com.vidal.WarningService;

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
 *         &lt;element name="warningCommentCoupleList" type="{urn:Vidal}ArrayOfWarningCommentCouple"/>
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
    "warningCommentCoupleList"
})
@XmlRootElement(name = "searchByProductIdResponse")
public class SearchByProductIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfWarningCommentCouple warningCommentCoupleList;

    /**
     * Obtient la valeur de la propriété warningCommentCoupleList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWarningCommentCouple }
     *     
     */
    public ArrayOfWarningCommentCouple getWarningCommentCoupleList() {
        return warningCommentCoupleList;
    }

    /**
     * Définit la valeur de la propriété warningCommentCoupleList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWarningCommentCouple }
     *     
     */
    public void setWarningCommentCoupleList(ArrayOfWarningCommentCouple value) {
        this.warningCommentCoupleList = value;
    }

}
