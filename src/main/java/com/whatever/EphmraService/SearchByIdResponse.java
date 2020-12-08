
package com.whatever.EphmraService;

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
 *         &lt;element name="ephmra" type="{urn:Vidal}ephmra"/>
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
    "ephmra"
})
@XmlRootElement(name = "searchByIdResponse")
public class SearchByIdResponse {

    @XmlElement(required = true, nillable = true)
    protected Ephmra ephmra;

    /**
     * Obtient la valeur de la propriété ephmra.
     * 
     * @return
     *     possible object is
     *     {@link Ephmra }
     *     
     */
    public Ephmra getEphmra() {
        return ephmra;
    }

    /**
     * Définit la valeur de la propriété ephmra.
     * 
     * @param value
     *     allowed object is
     *     {@link Ephmra }
     *     
     */
    public void setEphmra(Ephmra value) {
        this.ephmra = value;
    }

}
