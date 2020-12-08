
package com.whatever.DrugPrescriptionAnalysisService;

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
 *         &lt;element name="dose" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="doseUnit" type="{urn:Vidal}DoseUnit"/>
 *         &lt;element name="frequencyType" type="{urn:Vidal}PosologyFrequencyType"/>
 *         &lt;element name="indicationIdList" type="{urn:Vidal}ArrayOfInt"/>
 *         &lt;element name="routeIdList" type="{urn:Vidal}ArrayOfInt"/>
 *         &lt;element name="drugId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="drugType" type="{urn:Vidal}DrugType"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="durationType" type="{urn:Vidal}DurationType"/>
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
    "dose",
    "doseUnit",
    "frequencyType",
    "indicationIdList",
    "routeIdList",
    "drugId",
    "drugType",
    "duration",
    "durationType"
})
@XmlRootElement(name = "prescriptionLineInActivePrincipleDosesFromObjToJson")
public class PrescriptionLineInActivePrincipleDosesFromObjToJson {

    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double dose;
    @XmlElement(required = true, nillable = true)
    protected DoseUnit doseUnit;
    @XmlElement(required = true, nillable = true)
    protected PosologyFrequencyType frequencyType;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt indicationIdList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt routeIdList;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer drugId;
    @XmlElement(required = true, nillable = true)
    protected DrugType drugType;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer duration;
    @XmlElement(required = true, nillable = true)
    protected DurationType durationType;

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
     * Obtient la valeur de la propriété indicationIdList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getIndicationIdList() {
        return indicationIdList;
    }

    /**
     * Définit la valeur de la propriété indicationIdList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setIndicationIdList(ArrayOfInt value) {
        this.indicationIdList = value;
    }

    /**
     * Obtient la valeur de la propriété routeIdList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getRouteIdList() {
        return routeIdList;
    }

    /**
     * Définit la valeur de la propriété routeIdList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setRouteIdList(ArrayOfInt value) {
        this.routeIdList = value;
    }

    /**
     * Obtient la valeur de la propriété drugId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDrugId() {
        return drugId;
    }

    /**
     * Définit la valeur de la propriété drugId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDrugId(Integer value) {
        this.drugId = value;
    }

    /**
     * Obtient la valeur de la propriété drugType.
     * 
     * @return
     *     possible object is
     *     {@link DrugType }
     *     
     */
    public DrugType getDrugType() {
        return drugType;
    }

    /**
     * Définit la valeur de la propriété drugType.
     * 
     * @param value
     *     allowed object is
     *     {@link DrugType }
     *     
     */
    public void setDrugType(DrugType value) {
        this.drugType = value;
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

}
