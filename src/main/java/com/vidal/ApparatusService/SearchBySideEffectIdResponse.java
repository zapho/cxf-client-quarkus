
package com.vidal.ApparatusService;

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
 *         &lt;element name="apparatus" type="{urn:Vidal}apparatus"/>
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
    "apparatus"
})
@XmlRootElement(name = "searchBySideEffectIdResponse")
public class SearchBySideEffectIdResponse {

    @XmlElement(required = true, nillable = true)
    protected Apparatus apparatus;

    /**
     * Obtient la valeur de la propriété apparatus.
     * 
     * @return
     *     possible object is
     *     {@link Apparatus }
     *     
     */
    public Apparatus getApparatus() {
        return apparatus;
    }

    /**
     * Définit la valeur de la propriété apparatus.
     * 
     * @param value
     *     allowed object is
     *     {@link Apparatus }
     *     
     */
    public void setApparatus(Apparatus value) {
        this.apparatus = value;
    }

}
