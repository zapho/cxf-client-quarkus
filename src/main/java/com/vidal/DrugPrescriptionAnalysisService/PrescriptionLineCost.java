
package com.vidal.DrugPrescriptionAnalysisService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour prescriptionLineCost complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="prescriptionLineCost">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dose" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="drug" type="{urn:Vidal}summarizedDrug"/>
 *         &lt;element name="dur" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="durUnit" type="{urn:Vidal}DurationType"/>
 *         &lt;element name="posologyFrequency" type="{urn:Vidal}PosologyFrequencyType"/>
 *         &lt;element name="priceRange" type="{urn:Vidal}priceRange"/>
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prescriptionLineCost", propOrder = {
    "dose",
    "drug",
    "dur",
    "durUnit",
    "posologyFrequency",
    "priceRange",
    "unit"
})
public class PrescriptionLineCost {

    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double dose;
    @XmlElement(required = true, nillable = true)
    protected SummarizedDrug drug;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer dur;
    @XmlElement(required = true, nillable = true)
    protected DurationType durUnit;
    @XmlElement(required = true, nillable = true)
    protected PosologyFrequencyType posologyFrequency;
    @XmlElement(required = true, nillable = true)
    protected PriceRange priceRange;
    @XmlElement(required = true, nillable = true)
    protected String unit;

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
     * Obtient la valeur de la propriété drug.
     * 
     * @return
     *     possible object is
     *     {@link SummarizedDrug }
     *     
     */
    public SummarizedDrug getDrug() {
        return drug;
    }

    /**
     * Définit la valeur de la propriété drug.
     * 
     * @param value
     *     allowed object is
     *     {@link SummarizedDrug }
     *     
     */
    public void setDrug(SummarizedDrug value) {
        this.drug = value;
    }

    /**
     * Obtient la valeur de la propriété dur.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDur() {
        return dur;
    }

    /**
     * Définit la valeur de la propriété dur.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDur(Integer value) {
        this.dur = value;
    }

    /**
     * Obtient la valeur de la propriété durUnit.
     * 
     * @return
     *     possible object is
     *     {@link DurationType }
     *     
     */
    public DurationType getDurUnit() {
        return durUnit;
    }

    /**
     * Définit la valeur de la propriété durUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationType }
     *     
     */
    public void setDurUnit(DurationType value) {
        this.durUnit = value;
    }

    /**
     * Obtient la valeur de la propriété posologyFrequency.
     * 
     * @return
     *     possible object is
     *     {@link PosologyFrequencyType }
     *     
     */
    public PosologyFrequencyType getPosologyFrequency() {
        return posologyFrequency;
    }

    /**
     * Définit la valeur de la propriété posologyFrequency.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyFrequencyType }
     *     
     */
    public void setPosologyFrequency(PosologyFrequencyType value) {
        this.posologyFrequency = value;
    }

    /**
     * Obtient la valeur de la propriété priceRange.
     * 
     * @return
     *     possible object is
     *     {@link PriceRange }
     *     
     */
    public PriceRange getPriceRange() {
        return priceRange;
    }

    /**
     * Définit la valeur de la propriété priceRange.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRange }
     *     
     */
    public void setPriceRange(PriceRange value) {
        this.priceRange = value;
    }

    /**
     * Obtient la valeur de la propriété unit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Définit la valeur de la propriété unit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

}
