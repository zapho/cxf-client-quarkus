
package com.vidal.InteractionService;

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
 *         &lt;element name="interactionCommonNameGroupResult" type="{urn:Vidal}InteractionCommonNameGroupResult"/>
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
    "interactionCommonNameGroupResult"
})
@XmlRootElement(name = "searchInteractionCouplesForCommonNameGroupIdsResponse")
public class SearchInteractionCouplesForCommonNameGroupIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected InteractionCommonNameGroupResult interactionCommonNameGroupResult;

    /**
     * Obtient la valeur de la propriété interactionCommonNameGroupResult.
     * 
     * @return
     *     possible object is
     *     {@link InteractionCommonNameGroupResult }
     *     
     */
    public InteractionCommonNameGroupResult getInteractionCommonNameGroupResult() {
        return interactionCommonNameGroupResult;
    }

    /**
     * Définit la valeur de la propriété interactionCommonNameGroupResult.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractionCommonNameGroupResult }
     *     
     */
    public void setInteractionCommonNameGroupResult(InteractionCommonNameGroupResult value) {
        this.interactionCommonNameGroupResult = value;
    }

}
