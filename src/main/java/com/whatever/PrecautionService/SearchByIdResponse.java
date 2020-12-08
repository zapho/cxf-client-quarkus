
package com.whatever.PrecautionService;

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
@XmlType(name = "", propOrder = {
    "precaution"
})
@XmlRootElement(name = "searchByIdResponse")
public class SearchByIdResponse {

    @XmlElement(required = true, nillable = true)
    protected Precaution precaution;

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
