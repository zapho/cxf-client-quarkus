
package com.whatever.PosologyService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour activePrincipleDose complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="activePrincipleDose">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{urn:Vidal}PosologyFrequencyType"/>
 *         &lt;element name="unit" type="{urn:Vidal}DoseUnit"/>
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
@XmlType(name = "activePrincipleDose", propOrder = {
    "type",
    "unit",
    "value"
})
public class ActivePrincipleDose {

    @XmlElement(required = true, nillable = true)
    protected PosologyFrequencyType type;
    @XmlElement(required = true, nillable = true)
    protected DoseUnit unit;
    protected double value;

    /**
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link PosologyFrequencyType }
     *     
     */
    public PosologyFrequencyType getType() {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyFrequencyType }
     *     
     */
    public void setType(PosologyFrequencyType value) {
        this.type = value;
    }

    /**
     * Obtient la valeur de la propriété unit.
     * 
     * @return
     *     possible object is
     *     {@link DoseUnit }
     *     
     */
    public DoseUnit getUnit() {
        return unit;
    }

    /**
     * Définit la valeur de la propriété unit.
     * 
     * @param value
     *     allowed object is
     *     {@link DoseUnit }
     *     
     */
    public void setUnit(DoseUnit value) {
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
