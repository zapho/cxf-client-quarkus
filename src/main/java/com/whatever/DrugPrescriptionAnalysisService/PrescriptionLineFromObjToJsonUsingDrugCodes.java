
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
 *         &lt;element name="unitId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="frequencyType" type="{urn:Vidal}PosologyFrequencyType"/>
 *         &lt;element name="indicationIdList" type="{urn:Vidal}ArrayOfInt"/>
 *         &lt;element name="routeIdList" type="{urn:Vidal}ArrayOfInt"/>
 *         &lt;element name="drugCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="drugCodeType" type="{urn:Vidal}DrugCodeType"/>
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
    "unitId",
    "frequencyType",
    "indicationIdList",
    "routeIdList",
    "drugCode",
    "drugCodeType",
    "duration",
    "durationType"
})
@XmlRootElement(name = "prescriptionLineFromObjToJsonUsingDrugCodes")
public class PrescriptionLineFromObjToJsonUsingDrugCodes {

    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double dose;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer unitId;
    @XmlElement(required = true, nillable = true)
    protected PosologyFrequencyType frequencyType;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt indicationIdList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt routeIdList;
    @XmlElement(required = true, nillable = true)
    protected String drugCode;
    @XmlElement(required = true, nillable = true)
    protected DrugCodeType drugCodeType;
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
     * Obtient la valeur de la propriété unitId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnitId() {
        return unitId;
    }

    /**
     * Définit la valeur de la propriété unitId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnitId(Integer value) {
        this.unitId = value;
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
     * Obtient la valeur de la propriété drugCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrugCode() {
        return drugCode;
    }

    /**
     * Définit la valeur de la propriété drugCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrugCode(String value) {
        this.drugCode = value;
    }

    /**
     * Obtient la valeur de la propriété drugCodeType.
     * 
     * @return
     *     possible object is
     *     {@link DrugCodeType }
     *     
     */
    public DrugCodeType getDrugCodeType() {
        return drugCodeType;
    }

    /**
     * Définit la valeur de la propriété drugCodeType.
     * 
     * @param value
     *     allowed object is
     *     {@link DrugCodeType }
     *     
     */
    public void setDrugCodeType(DrugCodeType value) {
        this.drugCodeType = value;
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
