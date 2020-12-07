
package com.vidal.CispService;

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
 *         &lt;element name="cisp" type="{urn:Vidal}cisp"/>
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
    "cisp"
})
@XmlRootElement(name = "searchByIdResponse")
public class SearchByIdResponse {

    @XmlElement(required = true, nillable = true)
    protected Cisp cisp;

    /**
     * Obtient la valeur de la propriété cisp.
     * 
     * @return
     *     possible object is
     *     {@link Cisp }
     *     
     */
    public Cisp getCisp() {
        return cisp;
    }

    /**
     * Définit la valeur de la propriété cisp.
     * 
     * @param value
     *     allowed object is
     *     {@link Cisp }
     *     
     */
    public void setCisp(Cisp value) {
        this.cisp = value;
    }

}
