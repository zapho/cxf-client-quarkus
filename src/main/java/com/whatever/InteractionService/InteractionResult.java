
package com.whatever.InteractionService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour InteractionResult complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="InteractionResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interactionCoupleList" type="{urn:Vidal}ArrayOfInteractionCouple"/>
 *         &lt;element name="unkownProductInteractionList" type="{urn:Vidal}ArrayOfProduct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InteractionResult", propOrder = {
    "interactionCoupleList",
    "unkownProductInteractionList"
})
public class InteractionResult {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfInteractionCouple interactionCoupleList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfProduct unkownProductInteractionList;

    /**
     * Obtient la valeur de la propriété interactionCoupleList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInteractionCouple }
     *     
     */
    public ArrayOfInteractionCouple getInteractionCoupleList() {
        return interactionCoupleList;
    }

    /**
     * Définit la valeur de la propriété interactionCoupleList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInteractionCouple }
     *     
     */
    public void setInteractionCoupleList(ArrayOfInteractionCouple value) {
        this.interactionCoupleList = value;
    }

    /**
     * Obtient la valeur de la propriété unkownProductInteractionList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProduct }
     *     
     */
    public ArrayOfProduct getUnkownProductInteractionList() {
        return unkownProductInteractionList;
    }

    /**
     * Définit la valeur de la propriété unkownProductInteractionList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProduct }
     *     
     */
    public void setUnkownProductInteractionList(ArrayOfProduct value) {
        this.unkownProductInteractionList = value;
    }

}
