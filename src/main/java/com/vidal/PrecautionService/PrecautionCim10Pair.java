
package com.vidal.PrecautionService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour precautionCim10Pair complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="precautionCim10Pair">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cim10" type="{urn:Vidal}cim10"/>
 *         &lt;element name="precaution" type="{urn:Vidal}precaution"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "precautionCim10Pair", propOrder = {
    "cim10",
    "precaution"
})
public class PrecautionCim10Pair {

    @XmlElement(required = true, nillable = true)
    protected Cim10 cim10;
    @XmlElement(required = true, nillable = true)
    protected Precaution precaution;

    /**
     * Obtient la valeur de la propriété cim10.
     * 
     * @return
     *     possible object is
     *     {@link Cim10 }
     *     
     */
    public Cim10 getCim10() {
        return cim10;
    }

    /**
     * Définit la valeur de la propriété cim10.
     * 
     * @param value
     *     allowed object is
     *     {@link Cim10 }
     *     
     */
    public void setCim10(Cim10 value) {
        this.cim10 = value;
    }

    /**
     * Obtient la valeur de la propriété precaution.
     * 
     * @return
     *     possible object is
     *     {@link Precaution }
     *     
     */
    public Precaution getPrecaution() {
        return precaution;
    }

    /**
     * Définit la valeur de la propriété precaution.
     * 
     * @param value
     *     allowed object is
     *     {@link Precaution }
     *     
     */
    public void setPrecaution(Precaution value) {
        this.precaution = value;
    }

}
