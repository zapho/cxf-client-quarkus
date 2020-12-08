
package com.whatever.AtcService;

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
 *         &lt;element name="atc" type="{urn:Vidal}atc"/>
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
    "atc"
})
@XmlRootElement(name = "searchByIdResponse")
public class SearchByIdResponse {

    @XmlElement(required = true, nillable = true)
    protected Atc atc;

    /**
     * Obtient la valeur de la propriété atc.
     * 
     * @return
     *     possible object is
     *     {@link Atc }
     *     
     */
    public Atc getAtc() {
        return atc;
    }

    /**
     * Définit la valeur de la propriété atc.
     * 
     * @param value
     *     allowed object is
     *     {@link Atc }
     *     
     */
    public void setAtc(Atc value) {
        this.atc = value;
    }

}
