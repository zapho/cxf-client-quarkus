
package com.whatever.SaumonService;

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
 *         &lt;element name="saumon" type="{urn:Vidal}saumon"/>
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
    "saumon"
})
@XmlRootElement(name = "getParentResponse")
public class GetParentResponse {

    @XmlElement(required = true, nillable = true)
    protected Saumon saumon;

    /**
     * Obtient la valeur de la propriété saumon.
     * 
     * @return
     *     possible object is
     *     {@link Saumon }
     *     
     */
    public Saumon getSaumon() {
        return saumon;
    }

    /**
     * Définit la valeur de la propriété saumon.
     * 
     * @param value
     *     allowed object is
     *     {@link Saumon }
     *     
     */
    public void setSaumon(Saumon value) {
        this.saumon = value;
    }

}
