
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
 *         &lt;element name="interactionResult" type="{urn:Vidal}InteractionResult"/>
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
    "interactionResult"
})
@XmlRootElement(name = "getInteractionCouplesForOneProductIdResponse")
public class GetInteractionCouplesForOneProductIdResponse {

    @XmlElement(required = true, nillable = true)
    protected InteractionResult interactionResult;

    /**
     * Obtient la valeur de la propriété interactionResult.
     * 
     * @return
     *     possible object is
     *     {@link InteractionResult }
     *     
     */
    public InteractionResult getInteractionResult() {
        return interactionResult;
    }

    /**
     * Définit la valeur de la propriété interactionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractionResult }
     *     
     */
    public void setInteractionResult(InteractionResult value) {
        this.interactionResult = value;
    }

}
