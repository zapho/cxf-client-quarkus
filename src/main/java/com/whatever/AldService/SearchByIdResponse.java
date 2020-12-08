
package com.whatever.AldService;

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
 *         &lt;element name="ald" type="{urn:Vidal}ald"/>
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
    "ald"
})
@XmlRootElement(name = "searchByIdResponse")
public class SearchByIdResponse {

    @XmlElement(required = true, nillable = true)
    protected Ald ald;

    /**
     * Obtient la valeur de la propriété ald.
     * 
     * @return
     *     possible object is
     *     {@link Ald }
     *     
     */
    public Ald getAld() {
        return ald;
    }

    /**
     * Définit la valeur de la propriété ald.
     * 
     * @param value
     *     allowed object is
     *     {@link Ald }
     *     
     */
    public void setAld(Ald value) {
        this.ald = value;
    }

}
