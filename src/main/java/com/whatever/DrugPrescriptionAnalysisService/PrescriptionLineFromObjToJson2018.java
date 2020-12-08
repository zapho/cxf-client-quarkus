
package com.whatever.DrugPrescriptionAnalysisService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="drugId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="drugType" type="{urn:Vidal}DrugType"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="durationType" type="{urn:Vidal}DurationType"/>
 *         &lt;element name="dosageList" type="{urn:Vidal}ArrayOfString"/>
 *         &lt;element name="ald" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="aldCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="lineStatus" type="{urn:Vidal}LineStatus"/>
 *         &lt;element name="lineGroupId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lineGroupType" type="{urn:Vidal}LineGroupType"/>
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
    "drugId",
    "drugType",
    "duration",
    "durationType",
    "dosageList",
    "ald",
    "aldCode",
    "startDate",
    "endDate",
    "lineStatus",
    "lineGroupId",
    "lineGroupType"
})
@XmlRootElement(name = "prescriptionLineFromObjToJson2018")
public class PrescriptionLineFromObjToJson2018 {

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
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer drugId;
    @XmlElement(required = true, nillable = true)
    protected DrugType drugType;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer duration;
    @XmlElement(required = true, nillable = true)
    protected DurationType durationType;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString dosageList;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean ald;
    @XmlElement(required = true, nillable = true)
    protected String aldCode;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(required = true, nillable = true)
    protected LineStatus lineStatus;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer lineGroupId;
    @XmlElement(required = true, nillable = true)
    protected LineGroupType lineGroupType;

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

    /**
     * Obtient la valeur de la propriété dosageList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getDosageList() {
        return dosageList;
    }

    /**
     * Définit la valeur de la propriété dosageList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setDosageList(ArrayOfString value) {
        this.dosageList = value;
    }

    /**
     * Obtient la valeur de la propriété ald.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAld() {
        return ald;
    }

    /**
     * Définit la valeur de la propriété ald.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAld(Boolean value) {
        this.ald = value;
    }

    /**
     * Obtient la valeur de la propriété aldCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAldCode() {
        return aldCode;
    }

    /**
     * Définit la valeur de la propriété aldCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAldCode(String value) {
        this.aldCode = value;
    }

    /**
     * Obtient la valeur de la propriété startDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Définit la valeur de la propriété startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Obtient la valeur de la propriété endDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Définit la valeur de la propriété endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Obtient la valeur de la propriété lineStatus.
     * 
     * @return
     *     possible object is
     *     {@link LineStatus }
     *     
     */
    public LineStatus getLineStatus() {
        return lineStatus;
    }

    /**
     * Définit la valeur de la propriété lineStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link LineStatus }
     *     
     */
    public void setLineStatus(LineStatus value) {
        this.lineStatus = value;
    }

    /**
     * Obtient la valeur de la propriété lineGroupId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLineGroupId() {
        return lineGroupId;
    }

    /**
     * Définit la valeur de la propriété lineGroupId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLineGroupId(Integer value) {
        this.lineGroupId = value;
    }

    /**
     * Obtient la valeur de la propriété lineGroupType.
     * 
     * @return
     *     possible object is
     *     {@link LineGroupType }
     *     
     */
    public LineGroupType getLineGroupType() {
        return lineGroupType;
    }

    /**
     * Définit la valeur de la propriété lineGroupType.
     * 
     * @param value
     *     allowed object is
     *     {@link LineGroupType }
     *     
     */
    public void setLineGroupType(LineGroupType value) {
        this.lineGroupType = value;
    }

}
