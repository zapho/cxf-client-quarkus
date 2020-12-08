
package com.whatever.CommonNameGroupService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour rate complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="rate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="denominator" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="numerator" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rate", propOrder = {
    "denominator",
    "numerator"
})
public class Rate {

    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float denominator;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float numerator;

    /**
     * Obtient la valeur de la propriété denominator.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDenominator() {
        return denominator;
    }

    /**
     * Définit la valeur de la propriété denominator.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDenominator(Float value) {
        this.denominator = value;
    }

    /**
     * Obtient la valeur de la propriété numerator.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNumerator() {
        return numerator;
    }

    /**
     * Définit la valeur de la propriété numerator.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNumerator(Float value) {
        this.numerator = value;
    }

}
