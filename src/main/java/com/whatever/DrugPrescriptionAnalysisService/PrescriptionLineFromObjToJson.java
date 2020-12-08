
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
 *         &lt;element name="drugId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="drugType" type="{urn:Vidal}DrugType"/>
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
    "drugType"
})
@XmlRootElement(name = "prescriptionLineFromObjToJson")
public class PrescriptionLineFromObjToJson {

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

}
