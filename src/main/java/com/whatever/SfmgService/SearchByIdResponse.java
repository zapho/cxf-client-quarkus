
package com.whatever.SfmgService;

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
 *         &lt;element name="sfmg" type="{urn:Vidal}sfmg"/>
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
    "sfmg"
})
@XmlRootElement(name = "searchByIdResponse")
public class SearchByIdResponse {

    @XmlElement(required = true, nillable = true)
    protected Sfmg sfmg;

    /**
     * Obtient la valeur de la propriété sfmg.
     * 
     * @return
     *     possible object is
     *     {@link Sfmg }
     *     
     */
    public Sfmg getSfmg() {
        return sfmg;
    }

    /**
     * Définit la valeur de la propriété sfmg.
     * 
     * @param value
     *     allowed object is
     *     {@link Sfmg }
     *     
     */
    public void setSfmg(Sfmg value) {
        this.sfmg = value;
    }

}
