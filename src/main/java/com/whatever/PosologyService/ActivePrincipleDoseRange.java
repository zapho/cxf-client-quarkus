
package com.whatever.PosologyService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour activePrincipleDoseRange complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="activePrincipleDoseRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="max" type="{urn:Vidal}activePrincipleDose"/>
 *         &lt;element name="min" type="{urn:Vidal}activePrincipleDose"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "activePrincipleDoseRange", propOrder = {
    "max",
    "min"
})
public class ActivePrincipleDoseRange {

    @XmlElement(required = true, nillable = true)
    protected ActivePrincipleDose max;
    @XmlElement(required = true, nillable = true)
    protected ActivePrincipleDose min;

    /**
     * Obtient la valeur de la propriété max.
     * 
     * @return
     *     possible object is
     *     {@link ActivePrincipleDose }
     *     
     */
    public ActivePrincipleDose getMax() {
        return max;
    }

    /**
     * Définit la valeur de la propriété max.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivePrincipleDose }
     *     
     */
    public void setMax(ActivePrincipleDose value) {
        this.max = value;
    }

    /**
     * Obtient la valeur de la propriété min.
     * 
     * @return
     *     possible object is
     *     {@link ActivePrincipleDose }
     *     
     */
    public ActivePrincipleDose getMin() {
        return min;
    }

    /**
     * Définit la valeur de la propriété min.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivePrincipleDose }
     *     
     */
    public void setMin(ActivePrincipleDose value) {
        this.min = value;
    }

}
