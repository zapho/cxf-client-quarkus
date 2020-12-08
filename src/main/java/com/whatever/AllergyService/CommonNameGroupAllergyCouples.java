
package com.whatever.AllergyService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour commonNameGroupAllergyCouples complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="commonNameGroupAllergyCouples">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activeExcipientAllergyAlerts" type="{urn:Vidal}ArrayOfCommonNameGroupAllergyCouple"/>
 *         &lt;element name="activePrincipleAllergyAlerts" type="{urn:Vidal}ArrayOfCommonNameGroupAllergyCouple"/>
 *         &lt;element name="othersExcipientAllergyAlerts" type="{urn:Vidal}ArrayOfCommonNameGroupAllergyCouple"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commonNameGroupAllergyCouples", propOrder = {
    "activeExcipientAllergyAlerts",
    "activePrincipleAllergyAlerts",
    "othersExcipientAllergyAlerts"
})
public class CommonNameGroupAllergyCouples {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroupAllergyCouple activeExcipientAllergyAlerts;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroupAllergyCouple activePrincipleAllergyAlerts;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroupAllergyCouple othersExcipientAllergyAlerts;

    /**
     * Obtient la valeur de la propriété activeExcipientAllergyAlerts.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroupAllergyCouple }
     *     
     */
    public ArrayOfCommonNameGroupAllergyCouple getActiveExcipientAllergyAlerts() {
        return activeExcipientAllergyAlerts;
    }

    /**
     * Définit la valeur de la propriété activeExcipientAllergyAlerts.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroupAllergyCouple }
     *     
     */
    public void setActiveExcipientAllergyAlerts(ArrayOfCommonNameGroupAllergyCouple value) {
        this.activeExcipientAllergyAlerts = value;
    }

    /**
     * Obtient la valeur de la propriété activePrincipleAllergyAlerts.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroupAllergyCouple }
     *     
     */
    public ArrayOfCommonNameGroupAllergyCouple getActivePrincipleAllergyAlerts() {
        return activePrincipleAllergyAlerts;
    }

    /**
     * Définit la valeur de la propriété activePrincipleAllergyAlerts.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroupAllergyCouple }
     *     
     */
    public void setActivePrincipleAllergyAlerts(ArrayOfCommonNameGroupAllergyCouple value) {
        this.activePrincipleAllergyAlerts = value;
    }

    /**
     * Obtient la valeur de la propriété othersExcipientAllergyAlerts.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroupAllergyCouple }
     *     
     */
    public ArrayOfCommonNameGroupAllergyCouple getOthersExcipientAllergyAlerts() {
        return othersExcipientAllergyAlerts;
    }

    /**
     * Définit la valeur de la propriété othersExcipientAllergyAlerts.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroupAllergyCouple }
     *     
     */
    public void setOthersExcipientAllergyAlerts(ArrayOfCommonNameGroupAllergyCouple value) {
        this.othersExcipientAllergyAlerts = value;
    }

}
