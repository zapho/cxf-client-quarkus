
package com.vidal.PosologyService;

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
 *         &lt;element name="commonNameGroupId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dose" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="doseUnit" type="{urn:Vidal}DoseUnit"/>
 *         &lt;element name="administrationDividedPerTimeUnit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="frequencyType" type="{urn:Vidal}PosologyFrequencyType"/>
 *         &lt;element name="frequencyTypeDetail" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="durationValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="durationType" type="{urn:Vidal}DurationType"/>
 *         &lt;element name="secondDurationValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="secondDurationType" type="{urn:Vidal}DurationType"/>
 *         &lt;element name="thirdDurationValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="thirdDurationType" type="{urn:Vidal}DurationType"/>
 *         &lt;element name="gender" type="{urn:Vidal}Gender"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="creatinClearance" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hepaticInsufficiency" type="{urn:Vidal}HepaticInsufficiency"/>
 *         &lt;element name="indicationIds" type="{urn:Vidal}ArrayOfInt"/>
 *         &lt;element name="routeIds" type="{urn:Vidal}ArrayOfInt"/>
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
    "commonNameGroupId",
    "dose",
    "doseUnit",
    "administrationDividedPerTimeUnit",
    "frequency",
    "frequencyType",
    "frequencyTypeDetail",
    "durationValue",
    "durationType",
    "secondDurationValue",
    "secondDurationType",
    "thirdDurationValue",
    "thirdDurationType",
    "gender",
    "age",
    "weight",
    "height",
    "creatinClearance",
    "hepaticInsufficiency",
    "indicationIds",
    "routeIds"
})
@XmlRootElement(name = "checkActivePrincipleDoseForCommonNameGroupIdIndicationIdsRouteIds")
public class CheckActivePrincipleDoseForCommonNameGroupIdIndicationIdsRouteIds {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer commonNameGroupId;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double dose;
    @XmlElement(required = true, nillable = true)
    protected DoseUnit doseUnit;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean administrationDividedPerTimeUnit;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double frequency;
    @XmlElement(required = true, nillable = true)
    protected PosologyFrequencyType frequencyType;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer frequencyTypeDetail;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer durationValue;
    @XmlElement(required = true, nillable = true)
    protected DurationType durationType;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer secondDurationValue;
    @XmlElement(required = true, nillable = true)
    protected DurationType secondDurationType;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer thirdDurationValue;
    @XmlElement(required = true, nillable = true)
    protected DurationType thirdDurationType;
    @XmlElement(required = true, nillable = true)
    protected Gender gender;
    protected float age;
    protected float weight;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer height;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer creatinClearance;
    @XmlElement(required = true, nillable = true)
    protected HepaticInsufficiency hepaticInsufficiency;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt indicationIds;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt routeIds;

    /**
     * Obtient la valeur de la propriété commonNameGroupId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCommonNameGroupId() {
        return commonNameGroupId;
    }

    /**
     * Définit la valeur de la propriété commonNameGroupId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCommonNameGroupId(Integer value) {
        this.commonNameGroupId = value;
    }

    /**
     * Obtient la valeur de la propriété dose.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDose() {
        return dose;
    }

    /**
     * Définit la valeur de la propriété dose.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDose(Double value) {
        this.dose = value;
    }

    /**
     * Obtient la valeur de la propriété doseUnit.
     * 
     * @return
     *     possible object is
     *     {@link DoseUnit }
     *     
     */
    public DoseUnit getDoseUnit() {
        return doseUnit;
    }

    /**
     * Définit la valeur de la propriété doseUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link DoseUnit }
     *     
     */
    public void setDoseUnit(DoseUnit value) {
        this.doseUnit = value;
    }

    /**
     * Obtient la valeur de la propriété administrationDividedPerTimeUnit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdministrationDividedPerTimeUnit() {
        return administrationDividedPerTimeUnit;
    }

    /**
     * Définit la valeur de la propriété administrationDividedPerTimeUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdministrationDividedPerTimeUnit(Boolean value) {
        this.administrationDividedPerTimeUnit = value;
    }

    /**
     * Obtient la valeur de la propriété frequency.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFrequency() {
        return frequency;
    }

    /**
     * Définit la valeur de la propriété frequency.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFrequency(Double value) {
        this.frequency = value;
    }

    /**
     * Obtient la valeur de la propriété frequencyType.
     * 
     * @return
     *     possible object is
     *     {@link PosologyFrequencyType }
     *     
     */
    public PosologyFrequencyType getFrequencyType() {
        return frequencyType;
    }

    /**
     * Définit la valeur de la propriété frequencyType.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyFrequencyType }
     *     
     */
    public void setFrequencyType(PosologyFrequencyType value) {
        this.frequencyType = value;
    }

    /**
     * Obtient la valeur de la propriété frequencyTypeDetail.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFrequencyTypeDetail() {
        return frequencyTypeDetail;
    }

    /**
     * Définit la valeur de la propriété frequencyTypeDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFrequencyTypeDetail(Integer value) {
        this.frequencyTypeDetail = value;
    }

    /**
     * Obtient la valeur de la propriété durationValue.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDurationValue() {
        return durationValue;
    }

    /**
     * Définit la valeur de la propriété durationValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDurationValue(Integer value) {
        this.durationValue = value;
    }

    /**
     * Obtient la valeur de la propriété durationType.
     * 
     * @return
     *     possible object is
     *     {@link DurationType }
     *     
     */
    public DurationType getDurationType() {
        return durationType;
    }

    /**
     * Définit la valeur de la propriété durationType.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationType }
     *     
     */
    public void setDurationType(DurationType value) {
        this.durationType = value;
    }

    /**
     * Obtient la valeur de la propriété secondDurationValue.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSecondDurationValue() {
        return secondDurationValue;
    }

    /**
     * Définit la valeur de la propriété secondDurationValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSecondDurationValue(Integer value) {
        this.secondDurationValue = value;
    }

    /**
     * Obtient la valeur de la propriété secondDurationType.
     * 
     * @return
     *     possible object is
     *     {@link DurationType }
     *     
     */
    public DurationType getSecondDurationType() {
        return secondDurationType;
    }

    /**
     * Définit la valeur de la propriété secondDurationType.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationType }
     *     
     */
    public void setSecondDurationType(DurationType value) {
        this.secondDurationType = value;
    }

    /**
     * Obtient la valeur de la propriété thirdDurationValue.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThirdDurationValue() {
        return thirdDurationValue;
    }

    /**
     * Définit la valeur de la propriété thirdDurationValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThirdDurationValue(Integer value) {
        this.thirdDurationValue = value;
    }

    /**
     * Obtient la valeur de la propriété thirdDurationType.
     * 
     * @return
     *     possible object is
     *     {@link DurationType }
     *     
     */
    public DurationType getThirdDurationType() {
        return thirdDurationType;
    }

    /**
     * Définit la valeur de la propriété thirdDurationType.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationType }
     *     
     */
    public void setThirdDurationType(DurationType value) {
        this.thirdDurationType = value;
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
     * Obtient la valeur de la propriété age.
     * 
     */
    public float getAge() {
        return age;
    }

    /**
     * Définit la valeur de la propriété age.
     * 
     */
    public void setAge(float value) {
        this.age = value;
    }

    /**
     * Obtient la valeur de la propriété weight.
     * 
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Définit la valeur de la propriété weight.
     * 
     */
    public void setWeight(float value) {
        this.weight = value;
    }

    /**
     * Obtient la valeur de la propriété height.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Définit la valeur de la propriété height.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeight(Integer value) {
        this.height = value;
    }

    /**
     * Obtient la valeur de la propriété creatinClearance.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreatinClearance() {
        return creatinClearance;
    }

    /**
     * Définit la valeur de la propriété creatinClearance.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreatinClearance(Integer value) {
        this.creatinClearance = value;
    }

    /**
     * Obtient la valeur de la propriété hepaticInsufficiency.
     * 
     * @return
     *     possible object is
     *     {@link HepaticInsufficiency }
     *     
     */
    public HepaticInsufficiency getHepaticInsufficiency() {
        return hepaticInsufficiency;
    }

    /**
     * Définit la valeur de la propriété hepaticInsufficiency.
     * 
     * @param value
     *     allowed object is
     *     {@link HepaticInsufficiency }
     *     
     */
    public void setHepaticInsufficiency(HepaticInsufficiency value) {
        this.hepaticInsufficiency = value;
    }

    /**
     * Obtient la valeur de la propriété indicationIds.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getIndicationIds() {
        return indicationIds;
    }

    /**
     * Définit la valeur de la propriété indicationIds.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setIndicationIds(ArrayOfInt value) {
        this.indicationIds = value;
    }

    /**
     * Obtient la valeur de la propriété routeIds.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getRouteIds() {
        return routeIds;
    }

    /**
     * Définit la valeur de la propriété routeIds.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setRouteIds(ArrayOfInt value) {
        this.routeIds = value;
    }

}
