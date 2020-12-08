
package com.whatever.PosologyService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour posologyAlert complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="posologyAlert">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activePrincipleDose" type="{urn:Vidal}detailedActivePrincipleDose"/>
 *         &lt;element name="activePrincipleDoseLimit" type="{urn:Vidal}detailedActivePrincipleDose"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="contraIndications" type="{urn:Vidal}ArrayOfContraIndication"/>
 *         &lt;element name="duration" type="{urn:Vidal}PosologyDuration"/>
 *         &lt;element name="durationLimit" type="{urn:Vidal}PosologyDuration"/>
 *         &lt;element name="frequency" type="{urn:Vidal}posologyFrequency"/>
 *         &lt;element name="frequencyLimit" type="{urn:Vidal}posologyFrequency"/>
 *         &lt;element name="gender" type="{urn:Vidal}Gender"/>
 *         &lt;element name="maxAge" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="maxWeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minAge" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="minWeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfDose" type="{urn:Vidal}detailedNumberOfDose"/>
 *         &lt;element name="numberOfDoseLimit" type="{urn:Vidal}detailedNumberOfDose"/>
 *         &lt;element name="posology" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="restrictedGender" type="{urn:Vidal}Gender"/>
 *         &lt;element name="type" type="{urn:Vidal}PosologyAlertType"/>
 *         &lt;element name="warnings" type="{urn:Vidal}ArrayOfWarning"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "posologyAlert", propOrder = {
    "activePrincipleDose",
    "activePrincipleDoseLimit",
    "age",
    "contraIndications",
    "duration",
    "durationLimit",
    "frequency",
    "frequencyLimit",
    "gender",
    "maxAge",
    "maxWeight",
    "minAge",
    "minWeight",
    "numberOfDose",
    "numberOfDoseLimit",
    "posology",
    "restrictedGender",
    "type",
    "warnings",
    "weight"
})
public class PosologyAlert {

    @XmlElement(required = true, nillable = true)
    protected DetailedActivePrincipleDose activePrincipleDose;
    @XmlElement(required = true, nillable = true)
    protected DetailedActivePrincipleDose activePrincipleDoseLimit;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float age;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfContraIndication contraIndications;
    @XmlElement(required = true, nillable = true)
    protected PosologyDuration duration;
    @XmlElement(required = true, nillable = true)
    protected PosologyDuration durationLimit;
    @XmlElement(required = true, nillable = true)
    protected PosologyFrequency frequency;
    @XmlElement(required = true, nillable = true)
    protected PosologyFrequency frequencyLimit;
    @XmlElement(required = true, nillable = true)
    protected Gender gender;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float maxAge;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer maxWeight;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float minAge;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer minWeight;
    @XmlElement(required = true, nillable = true)
    protected DetailedNumberOfDose numberOfDose;
    @XmlElement(required = true, nillable = true)
    protected DetailedNumberOfDose numberOfDoseLimit;
    @XmlElement(required = true, nillable = true)
    protected String posology;
    @XmlElement(required = true, nillable = true)
    protected Gender restrictedGender;
    @XmlElement(required = true, nillable = true)
    protected PosologyAlertType type;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfWarning warnings;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float weight;

    /**
     * Obtient la valeur de la propriété activePrincipleDose.
     * 
     * @return
     *     possible object is
     *     {@link DetailedActivePrincipleDose }
     *     
     */
    public DetailedActivePrincipleDose getActivePrincipleDose() {
        return activePrincipleDose;
    }

    /**
     * Définit la valeur de la propriété activePrincipleDose.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedActivePrincipleDose }
     *     
     */
    public void setActivePrincipleDose(DetailedActivePrincipleDose value) {
        this.activePrincipleDose = value;
    }

    /**
     * Obtient la valeur de la propriété activePrincipleDoseLimit.
     * 
     * @return
     *     possible object is
     *     {@link DetailedActivePrincipleDose }
     *     
     */
    public DetailedActivePrincipleDose getActivePrincipleDoseLimit() {
        return activePrincipleDoseLimit;
    }

    /**
     * Définit la valeur de la propriété activePrincipleDoseLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedActivePrincipleDose }
     *     
     */
    public void setActivePrincipleDoseLimit(DetailedActivePrincipleDose value) {
        this.activePrincipleDoseLimit = value;
    }

    /**
     * Obtient la valeur de la propriété age.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAge() {
        return age;
    }

    /**
     * Définit la valeur de la propriété age.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAge(Float value) {
        this.age = value;
    }

    /**
     * Obtient la valeur de la propriété contraIndications.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContraIndication }
     *     
     */
    public ArrayOfContraIndication getContraIndications() {
        return contraIndications;
    }

    /**
     * Définit la valeur de la propriété contraIndications.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContraIndication }
     *     
     */
    public void setContraIndications(ArrayOfContraIndication value) {
        this.contraIndications = value;
    }

    /**
     * Obtient la valeur de la propriété duration.
     * 
     * @return
     *     possible object is
     *     {@link PosologyDuration }
     *     
     */
    public PosologyDuration getDuration() {
        return duration;
    }

    /**
     * Définit la valeur de la propriété duration.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyDuration }
     *     
     */
    public void setDuration(PosologyDuration value) {
        this.duration = value;
    }

    /**
     * Obtient la valeur de la propriété durationLimit.
     * 
     * @return
     *     possible object is
     *     {@link PosologyDuration }
     *     
     */
    public PosologyDuration getDurationLimit() {
        return durationLimit;
    }

    /**
     * Définit la valeur de la propriété durationLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyDuration }
     *     
     */
    public void setDurationLimit(PosologyDuration value) {
        this.durationLimit = value;
    }

    /**
     * Obtient la valeur de la propriété frequency.
     * 
     * @return
     *     possible object is
     *     {@link PosologyFrequency }
     *     
     */
    public PosologyFrequency getFrequency() {
        return frequency;
    }

    /**
     * Définit la valeur de la propriété frequency.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyFrequency }
     *     
     */
    public void setFrequency(PosologyFrequency value) {
        this.frequency = value;
    }

    /**
     * Obtient la valeur de la propriété frequencyLimit.
     * 
     * @return
     *     possible object is
     *     {@link PosologyFrequency }
     *     
     */
    public PosologyFrequency getFrequencyLimit() {
        return frequencyLimit;
    }

    /**
     * Définit la valeur de la propriété frequencyLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyFrequency }
     *     
     */
    public void setFrequencyLimit(PosologyFrequency value) {
        this.frequencyLimit = value;
    }

    /**
     * Obtient la valeur de la propriété gender.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Définit la valeur de la propriété gender.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

    /**
     * Obtient la valeur de la propriété maxAge.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxAge() {
        return maxAge;
    }

    /**
     * Définit la valeur de la propriété maxAge.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxAge(Float value) {
        this.maxAge = value;
    }

    /**
     * Obtient la valeur de la propriété maxWeight.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxWeight() {
        return maxWeight;
    }

    /**
     * Définit la valeur de la propriété maxWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxWeight(Integer value) {
        this.maxWeight = value;
    }

    /**
     * Obtient la valeur de la propriété minAge.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinAge() {
        return minAge;
    }

    /**
     * Définit la valeur de la propriété minAge.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinAge(Float value) {
        this.minAge = value;
    }

    /**
     * Obtient la valeur de la propriété minWeight.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinWeight() {
        return minWeight;
    }

    /**
     * Définit la valeur de la propriété minWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinWeight(Integer value) {
        this.minWeight = value;
    }

    /**
     * Obtient la valeur de la propriété numberOfDose.
     * 
     * @return
     *     possible object is
     *     {@link DetailedNumberOfDose }
     *     
     */
    public DetailedNumberOfDose getNumberOfDose() {
        return numberOfDose;
    }

    /**
     * Définit la valeur de la propriété numberOfDose.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedNumberOfDose }
     *     
     */
    public void setNumberOfDose(DetailedNumberOfDose value) {
        this.numberOfDose = value;
    }

    /**
     * Obtient la valeur de la propriété numberOfDoseLimit.
     * 
     * @return
     *     possible object is
     *     {@link DetailedNumberOfDose }
     *     
     */
    public DetailedNumberOfDose getNumberOfDoseLimit() {
        return numberOfDoseLimit;
    }

    /**
     * Définit la valeur de la propriété numberOfDoseLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedNumberOfDose }
     *     
     */
    public void setNumberOfDoseLimit(DetailedNumberOfDose value) {
        this.numberOfDoseLimit = value;
    }

    /**
     * Obtient la valeur de la propriété posology.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosology() {
        return posology;
    }

    /**
     * Définit la valeur de la propriété posology.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosology(String value) {
        this.posology = value;
    }

    /**
     * Obtient la valeur de la propriété restrictedGender.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getRestrictedGender() {
        return restrictedGender;
    }

    /**
     * Définit la valeur de la propriété restrictedGender.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setRestrictedGender(Gender value) {
        this.restrictedGender = value;
    }

    /**
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link PosologyAlertType }
     *     
     */
    public PosologyAlertType getType() {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyAlertType }
     *     
     */
    public void setType(PosologyAlertType value) {
        this.type = value;
    }

    /**
     * Obtient la valeur de la propriété warnings.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWarning }
     *     
     */
    public ArrayOfWarning getWarnings() {
        return warnings;
    }

    /**
     * Définit la valeur de la propriété warnings.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWarning }
     *     
     */
    public void setWarnings(ArrayOfWarning value) {
        this.warnings = value;
    }

    /**
     * Obtient la valeur de la propriété weight.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWeight() {
        return weight;
    }

    /**
     * Définit la valeur de la propriété weight.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWeight(Float value) {
        this.weight = value;
    }

}
