
package com.whatever.PackConservationService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour packageConservation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="packageConservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conservationDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="conservationDurationUnit" type="{urn:Vidal}UnitType"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxTemperature" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minTemperature" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="precautions" type="{urn:Vidal}ArrayOfConservationCaution"/>
 *         &lt;element name="unpacked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "packageConservation", propOrder = {
    "conservationDuration",
    "conservationDurationUnit",
    "id",
    "maxTemperature",
    "minTemperature",
    "precautions",
    "unpacked"
})
public class PackageConservation {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer conservationDuration;
    @XmlElement(required = true, nillable = true)
    protected UnitType conservationDurationUnit;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer maxTemperature;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer minTemperature;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfConservationCaution precautions;
    protected boolean unpacked;

    /**
     * Obtient la valeur de la propriété conservationDuration.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConservationDuration() {
        return conservationDuration;
    }

    /**
     * Définit la valeur de la propriété conservationDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConservationDuration(Integer value) {
        this.conservationDuration = value;
    }

    /**
     * Obtient la valeur de la propriété conservationDurationUnit.
     * 
     * @return
     *     possible object is
     *     {@link UnitType }
     *     
     */
    public UnitType getConservationDurationUnit() {
        return conservationDurationUnit;
    }

    /**
     * Définit la valeur de la propriété conservationDurationUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitType }
     *     
     */
    public void setConservationDurationUnit(UnitType value) {
        this.conservationDurationUnit = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété maxTemperature.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxTemperature() {
        return maxTemperature;
    }

    /**
     * Définit la valeur de la propriété maxTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxTemperature(Integer value) {
        this.maxTemperature = value;
    }

    /**
     * Obtient la valeur de la propriété minTemperature.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinTemperature() {
        return minTemperature;
    }

    /**
     * Définit la valeur de la propriété minTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinTemperature(Integer value) {
        this.minTemperature = value;
    }

    /**
     * Obtient la valeur de la propriété precautions.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConservationCaution }
     *     
     */
    public ArrayOfConservationCaution getPrecautions() {
        return precautions;
    }

    /**
     * Définit la valeur de la propriété precautions.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConservationCaution }
     *     
     */
    public void setPrecautions(ArrayOfConservationCaution value) {
        this.precautions = value;
    }

    /**
     * Obtient la valeur de la propriété unpacked.
     * 
     */
    public boolean isUnpacked() {
        return unpacked;
    }

    /**
     * Définit la valeur de la propriété unpacked.
     * 
     */
    public void setUnpacked(boolean value) {
        this.unpacked = value;
    }

}
