
package com.vidal.PosologyService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour numberOfDoseRange complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="numberOfDoseRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="max" type="{urn:Vidal}numberOfDose"/>
 *         &lt;element name="min" type="{urn:Vidal}numberOfDose"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "numberOfDoseRange", propOrder = {
    "max",
    "min"
})
public class NumberOfDoseRange {

    @XmlElement(required = true, nillable = true)
    protected NumberOfDose max;
    @XmlElement(required = true, nillable = true)
    protected NumberOfDose min;

    /**
     * Obtient la valeur de la propriété max.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfDose }
     *     
     */
    public NumberOfDose getMax() {
        return max;
    }

    /**
     * Définit la valeur de la propriété max.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfDose }
     *     
     */
    public void setMax(NumberOfDose value) {
        this.max = value;
    }

    /**
     * Obtient la valeur de la propriété min.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfDose }
     *     
     */
    public NumberOfDose getMin() {
        return min;
    }

    /**
     * Définit la valeur de la propriété min.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfDose }
     *     
     */
    public void setMin(NumberOfDose value) {
        this.min = value;
    }

}
