
package com.whatever.InteractionService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour InteractionCommonNameGroupResult complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="InteractionCommonNameGroupResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interactionCommonNameGroupCoupleList" type="{urn:Vidal}ArrayOfInteractionCoupleCommonNameGroup"/>
 *         &lt;element name="noHomogeneousByInteractionsCommonNameGroupList" type="{urn:Vidal}ArrayOfCommonNameGroup"/>
 *         &lt;element name="unkownCommonNameGroupInteractionList" type="{urn:Vidal}ArrayOfCommonNameGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InteractionCommonNameGroupResult", propOrder = {
    "interactionCommonNameGroupCoupleList",
    "noHomogeneousByInteractionsCommonNameGroupList",
    "unkownCommonNameGroupInteractionList"
})
public class InteractionCommonNameGroupResult {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfInteractionCoupleCommonNameGroup interactionCommonNameGroupCoupleList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroup noHomogeneousByInteractionsCommonNameGroupList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroup unkownCommonNameGroupInteractionList;

    /**
     * Obtient la valeur de la propriété interactionCommonNameGroupCoupleList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInteractionCoupleCommonNameGroup }
     *     
     */
    public ArrayOfInteractionCoupleCommonNameGroup getInteractionCommonNameGroupCoupleList() {
        return interactionCommonNameGroupCoupleList;
    }

    /**
     * Définit la valeur de la propriété interactionCommonNameGroupCoupleList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInteractionCoupleCommonNameGroup }
     *     
     */
    public void setInteractionCommonNameGroupCoupleList(ArrayOfInteractionCoupleCommonNameGroup value) {
        this.interactionCommonNameGroupCoupleList = value;
    }

    /**
     * Obtient la valeur de la propriété noHomogeneousByInteractionsCommonNameGroupList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroup }
     *     
     */
    public ArrayOfCommonNameGroup getNoHomogeneousByInteractionsCommonNameGroupList() {
        return noHomogeneousByInteractionsCommonNameGroupList;
    }

    /**
     * Définit la valeur de la propriété noHomogeneousByInteractionsCommonNameGroupList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroup }
     *     
     */
    public void setNoHomogeneousByInteractionsCommonNameGroupList(ArrayOfCommonNameGroup value) {
        this.noHomogeneousByInteractionsCommonNameGroupList = value;
    }

    /**
     * Obtient la valeur de la propriété unkownCommonNameGroupInteractionList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroup }
     *     
     */
    public ArrayOfCommonNameGroup getUnkownCommonNameGroupInteractionList() {
        return unkownCommonNameGroupInteractionList;
    }

    /**
     * Définit la valeur de la propriété unkownCommonNameGroupInteractionList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroup }
     *     
     */
    public void setUnkownCommonNameGroupInteractionList(ArrayOfCommonNameGroup value) {
        this.unkownCommonNameGroupInteractionList = value;
    }

}
