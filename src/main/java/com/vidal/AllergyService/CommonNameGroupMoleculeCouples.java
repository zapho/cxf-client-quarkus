
package com.vidal.AllergyService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour commonNameGroupMoleculeCouples complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="commonNameGroupMoleculeCouples">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activeExcipientMoleculeAlerts" type="{urn:Vidal}ArrayOfCommonNameGroupMoleculeCouple"/>
 *         &lt;element name="activePrincipleMoleculeAlerts" type="{urn:Vidal}ArrayOfCommonNameGroupMoleculeCouple"/>
 *         &lt;element name="othersExcipientMoleculeAlerts" type="{urn:Vidal}ArrayOfCommonNameGroupMoleculeCouple"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commonNameGroupMoleculeCouples", propOrder = {
    "activeExcipientMoleculeAlerts",
    "activePrincipleMoleculeAlerts",
    "othersExcipientMoleculeAlerts"
})
public class CommonNameGroupMoleculeCouples {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroupMoleculeCouple activeExcipientMoleculeAlerts;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroupMoleculeCouple activePrincipleMoleculeAlerts;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroupMoleculeCouple othersExcipientMoleculeAlerts;

    /**
     * Obtient la valeur de la propriété activeExcipientMoleculeAlerts.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroupMoleculeCouple }
     *     
     */
    public ArrayOfCommonNameGroupMoleculeCouple getActiveExcipientMoleculeAlerts() {
        return activeExcipientMoleculeAlerts;
    }

    /**
     * Définit la valeur de la propriété activeExcipientMoleculeAlerts.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroupMoleculeCouple }
     *     
     */
    public void setActiveExcipientMoleculeAlerts(ArrayOfCommonNameGroupMoleculeCouple value) {
        this.activeExcipientMoleculeAlerts = value;
    }

    /**
     * Obtient la valeur de la propriété activePrincipleMoleculeAlerts.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroupMoleculeCouple }
     *     
     */
    public ArrayOfCommonNameGroupMoleculeCouple getActivePrincipleMoleculeAlerts() {
        return activePrincipleMoleculeAlerts;
    }

    /**
     * Définit la valeur de la propriété activePrincipleMoleculeAlerts.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroupMoleculeCouple }
     *     
     */
    public void setActivePrincipleMoleculeAlerts(ArrayOfCommonNameGroupMoleculeCouple value) {
        this.activePrincipleMoleculeAlerts = value;
    }

    /**
     * Obtient la valeur de la propriété othersExcipientMoleculeAlerts.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroupMoleculeCouple }
     *     
     */
    public ArrayOfCommonNameGroupMoleculeCouple getOthersExcipientMoleculeAlerts() {
        return othersExcipientMoleculeAlerts;
    }

    /**
     * Définit la valeur de la propriété othersExcipientMoleculeAlerts.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroupMoleculeCouple }
     *     
     */
    public void setOthersExcipientMoleculeAlerts(ArrayOfCommonNameGroupMoleculeCouple value) {
        this.othersExcipientMoleculeAlerts = value;
    }

}
