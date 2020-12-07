
package com.vidal.PosologyService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour durationRange complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="durationRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="max" type="{urn:Vidal}PosologyDuration"/>
 *         &lt;element name="min" type="{urn:Vidal}PosologyDuration"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "durationRange", propOrder = {
    "max",
    "min"
})
public class DurationRange {

    @XmlElement(required = true, nillable = true)
    protected PosologyDuration max;
    @XmlElement(required = true, nillable = true)
    protected PosologyDuration min;

    /**
     * Obtient la valeur de la propriété max.
     * 
     * @return
     *     possible object is
     *     {@link PosologyDuration }
     *     
     */
    public PosologyDuration getMax() {
        return max;
    }

    /**
     * Définit la valeur de la propriété max.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyDuration }
     *     
     */
    public void setMax(PosologyDuration value) {
        this.max = value;
    }

    /**
     * Obtient la valeur de la propriété min.
     * 
     * @return
     *     possible object is
     *     {@link PosologyDuration }
     *     
     */
    public PosologyDuration getMin() {
        return min;
    }

    /**
     * Définit la valeur de la propriété min.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyDuration }
     *     
     */
    public void setMin(PosologyDuration value) {
        this.min = value;
    }

}
