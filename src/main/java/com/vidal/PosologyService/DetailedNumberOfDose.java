
package com.vidal.PosologyService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour detailedNumberOfDose complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="detailedNumberOfDose">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="frequencyType" type="{urn:Vidal}posologyFrequency"/>
 *         &lt;element name="unit" type="{urn:Vidal}posologyUnit"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detailedNumberOfDose", propOrder = {
    "frequencyType",
    "unit",
    "value"
})
public class DetailedNumberOfDose {

    @XmlElement(required = true, nillable = true)
    protected PosologyFrequency frequencyType;
    @XmlElement(required = true, nillable = true)
    protected PosologyUnit unit;
    protected double value;

    /**
     * Obtient la valeur de la propriété frequencyType.
     * 
     * @return
     *     possible object is
     *     {@link PosologyFrequency }
     *     
     */
    public PosologyFrequency getFrequencyType() {
        return frequencyType;
    }

    /**
     * Définit la valeur de la propriété frequencyType.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyFrequency }
     *     
     */
    public void setFrequencyType(PosologyFrequency value) {
        this.frequencyType = value;
    }

    /**
     * Obtient la valeur de la propriété unit.
     * 
     * @return
     *     possible object is
     *     {@link PosologyUnit }
     *     
     */
    public PosologyUnit getUnit() {
        return unit;
    }

    /**
     * Définit la valeur de la propriété unit.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyUnit }
     *     
     */
    public void setUnit(PosologyUnit value) {
        this.unit = value;
    }

    /**
     * Obtient la valeur de la propriété value.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

}
