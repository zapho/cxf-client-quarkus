
package com.whatever.PackService;

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
 *         &lt;element name="cip" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "cip"
})
@XmlRootElement(name = "searchByCip")
public class SearchByCip {

    @XmlElement(required = true, nillable = true)
    protected String cip;

    /**
     * Obtient la valeur de la propriété cip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCip() {
        return cip;
    }

    /**
     * Définit la valeur de la propriété cip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCip(String value) {
        this.cip = value;
    }

}
