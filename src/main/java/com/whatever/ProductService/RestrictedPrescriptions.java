
package com.whatever.ProductService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour restrictedPrescriptions complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="restrictedPrescriptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prescriptionsRestricted" type="{urn:Vidal}ArrayOfRestrictedPrescription"/>
 *         &lt;element name="specialistCenters" type="{urn:Vidal}ArrayOfSpecialistCenter"/>
 *         &lt;element name="specialists" type="{urn:Vidal}ArrayOfSpecialist"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restrictedPrescriptions", propOrder = {
    "prescriptionsRestricted",
    "specialistCenters",
    "specialists"
})
public class RestrictedPrescriptions {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfRestrictedPrescription prescriptionsRestricted;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfSpecialistCenter specialistCenters;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfSpecialist specialists;

    /**
     * Obtient la valeur de la propriété prescriptionsRestricted.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRestrictedPrescription }
     *     
     */
    public ArrayOfRestrictedPrescription getPrescriptionsRestricted() {
        return prescriptionsRestricted;
    }

    /**
     * Définit la valeur de la propriété prescriptionsRestricted.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRestrictedPrescription }
     *     
     */
    public void setPrescriptionsRestricted(ArrayOfRestrictedPrescription value) {
        this.prescriptionsRestricted = value;
    }

    /**
     * Obtient la valeur de la propriété specialistCenters.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecialistCenter }
     *     
     */
    public ArrayOfSpecialistCenter getSpecialistCenters() {
        return specialistCenters;
    }

    /**
     * Définit la valeur de la propriété specialistCenters.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecialistCenter }
     *     
     */
    public void setSpecialistCenters(ArrayOfSpecialistCenter value) {
        this.specialistCenters = value;
    }

    /**
     * Obtient la valeur de la propriété specialists.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecialist }
     *     
     */
    public ArrayOfSpecialist getSpecialists() {
        return specialists;
    }

    /**
     * Définit la valeur de la propriété specialists.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecialist }
     *     
     */
    public void setSpecialists(ArrayOfSpecialist value) {
        this.specialists = value;
    }

}
