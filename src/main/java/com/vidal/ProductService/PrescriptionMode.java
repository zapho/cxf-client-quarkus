
package com.vidal.ProductService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PrescriptionMode complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PrescriptionMode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deliveryRestrictedToHospital" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="durationUnit" type="{urn:Vidal}UnitType"/>
 *         &lt;element name="initiallyPrescribedByHospital" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="initiallyPrescribedBySpecialist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="prescribedByHospital" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="prescribedBySpecialist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="renewalBySpecialist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="specialistCenterList" type="{urn:Vidal}ArrayOfSpecialistCenter"/>
 *         &lt;element name="specialistList" type="{urn:Vidal}ArrayOfSpecialist"/>
 *         &lt;element name="specificMonitoring" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrescriptionMode", propOrder = {
    "deliveryRestrictedToHospital",
    "duration",
    "durationUnit",
    "initiallyPrescribedByHospital",
    "initiallyPrescribedBySpecialist",
    "prescribedByHospital",
    "prescribedBySpecialist",
    "renewalBySpecialist",
    "specialistCenterList",
    "specialistList",
    "specificMonitoring"
})
public class PrescriptionMode {

    protected boolean deliveryRestrictedToHospital;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer duration;
    @XmlElement(required = true, nillable = true)
    protected UnitType durationUnit;
    protected boolean initiallyPrescribedByHospital;
    protected boolean initiallyPrescribedBySpecialist;
    protected boolean prescribedByHospital;
    protected boolean prescribedBySpecialist;
    protected boolean renewalBySpecialist;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfSpecialistCenter specialistCenterList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfSpecialist specialistList;
    protected boolean specificMonitoring;

    /**
     * Obtient la valeur de la propriété deliveryRestrictedToHospital.
     * 
     */
    public boolean isDeliveryRestrictedToHospital() {
        return deliveryRestrictedToHospital;
    }

    /**
     * Définit la valeur de la propriété deliveryRestrictedToHospital.
     * 
     */
    public void setDeliveryRestrictedToHospital(boolean value) {
        this.deliveryRestrictedToHospital = value;
    }

    /**
     * Obtient la valeur de la propriété duration.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Définit la valeur de la propriété duration.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuration(Integer value) {
        this.duration = value;
    }

    /**
     * Obtient la valeur de la propriété durationUnit.
     * 
     * @return
     *     possible object is
     *     {@link UnitType }
     *     
     */
    public UnitType getDurationUnit() {
        return durationUnit;
    }

    /**
     * Définit la valeur de la propriété durationUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitType }
     *     
     */
    public void setDurationUnit(UnitType value) {
        this.durationUnit = value;
    }

    /**
     * Obtient la valeur de la propriété initiallyPrescribedByHospital.
     * 
     */
    public boolean isInitiallyPrescribedByHospital() {
        return initiallyPrescribedByHospital;
    }

    /**
     * Définit la valeur de la propriété initiallyPrescribedByHospital.
     * 
     */
    public void setInitiallyPrescribedByHospital(boolean value) {
        this.initiallyPrescribedByHospital = value;
    }

    /**
     * Obtient la valeur de la propriété initiallyPrescribedBySpecialist.
     * 
     */
    public boolean isInitiallyPrescribedBySpecialist() {
        return initiallyPrescribedBySpecialist;
    }

    /**
     * Définit la valeur de la propriété initiallyPrescribedBySpecialist.
     * 
     */
    public void setInitiallyPrescribedBySpecialist(boolean value) {
        this.initiallyPrescribedBySpecialist = value;
    }

    /**
     * Obtient la valeur de la propriété prescribedByHospital.
     * 
     */
    public boolean isPrescribedByHospital() {
        return prescribedByHospital;
    }

    /**
     * Définit la valeur de la propriété prescribedByHospital.
     * 
     */
    public void setPrescribedByHospital(boolean value) {
        this.prescribedByHospital = value;
    }

    /**
     * Obtient la valeur de la propriété prescribedBySpecialist.
     * 
     */
    public boolean isPrescribedBySpecialist() {
        return prescribedBySpecialist;
    }

    /**
     * Définit la valeur de la propriété prescribedBySpecialist.
     * 
     */
    public void setPrescribedBySpecialist(boolean value) {
        this.prescribedBySpecialist = value;
    }

    /**
     * Obtient la valeur de la propriété renewalBySpecialist.
     * 
     */
    public boolean isRenewalBySpecialist() {
        return renewalBySpecialist;
    }

    /**
     * Définit la valeur de la propriété renewalBySpecialist.
     * 
     */
    public void setRenewalBySpecialist(boolean value) {
        this.renewalBySpecialist = value;
    }

    /**
     * Obtient la valeur de la propriété specialistCenterList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecialistCenter }
     *     
     */
    public ArrayOfSpecialistCenter getSpecialistCenterList() {
        return specialistCenterList;
    }

    /**
     * Définit la valeur de la propriété specialistCenterList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecialistCenter }
     *     
     */
    public void setSpecialistCenterList(ArrayOfSpecialistCenter value) {
        this.specialistCenterList = value;
    }

    /**
     * Obtient la valeur de la propriété specialistList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecialist }
     *     
     */
    public ArrayOfSpecialist getSpecialistList() {
        return specialistList;
    }

    /**
     * Définit la valeur de la propriété specialistList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecialist }
     *     
     */
    public void setSpecialistList(ArrayOfSpecialist value) {
        this.specialistList = value;
    }

    /**
     * Obtient la valeur de la propriété specificMonitoring.
     * 
     */
    public boolean isSpecificMonitoring() {
        return specificMonitoring;
    }

    /**
     * Définit la valeur de la propriété specificMonitoring.
     * 
     */
    public void setSpecificMonitoring(boolean value) {
        this.specificMonitoring = value;
    }

}
