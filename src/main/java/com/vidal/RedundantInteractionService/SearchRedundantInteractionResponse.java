
package com.vidal.RedundantInteractionService;

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
 *         &lt;element name="redundantInteractionCoupleList" type="{urn:Vidal}ArrayOfRedundantInteractionCouple"/>
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
    "redundantInteractionCoupleList"
})
@XmlRootElement(name = "searchRedundantInteractionResponse")
public class SearchRedundantInteractionResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfRedundantInteractionCouple redundantInteractionCoupleList;

    /**
     * Obtient la valeur de la propriété redundantInteractionCoupleList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRedundantInteractionCouple }
     *     
     */
    public ArrayOfRedundantInteractionCouple getRedundantInteractionCoupleList() {
        return redundantInteractionCoupleList;
    }

    /**
     * Définit la valeur de la propriété redundantInteractionCoupleList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRedundantInteractionCouple }
     *     
     */
    public void setRedundantInteractionCoupleList(ArrayOfRedundantInteractionCouple value) {
        this.redundantInteractionCoupleList = value;
    }

}
