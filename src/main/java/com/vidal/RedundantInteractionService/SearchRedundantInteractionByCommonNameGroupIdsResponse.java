
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
 *         &lt;element name="redundantInteractionCommonNameGroupCoupleList" type="{urn:Vidal}ArrayOfRedundantInteractionCommonNameGroupCouple"/>
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
    "redundantInteractionCommonNameGroupCoupleList"
})
@XmlRootElement(name = "searchRedundantInteractionByCommonNameGroupIdsResponse")
public class SearchRedundantInteractionByCommonNameGroupIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfRedundantInteractionCommonNameGroupCouple redundantInteractionCommonNameGroupCoupleList;

    /**
     * Obtient la valeur de la propriété redundantInteractionCommonNameGroupCoupleList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRedundantInteractionCommonNameGroupCouple }
     *     
     */
    public ArrayOfRedundantInteractionCommonNameGroupCouple getRedundantInteractionCommonNameGroupCoupleList() {
        return redundantInteractionCommonNameGroupCoupleList;
    }

    /**
     * Définit la valeur de la propriété redundantInteractionCommonNameGroupCoupleList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRedundantInteractionCommonNameGroupCouple }
     *     
     */
    public void setRedundantInteractionCommonNameGroupCoupleList(ArrayOfRedundantInteractionCommonNameGroupCouple value) {
        this.redundantInteractionCommonNameGroupCoupleList = value;
    }

}
