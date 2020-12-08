
package com.whatever.VidalService;

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
 *         &lt;element name="vidal" type="{urn:Vidal}vidal"/>
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
    "vidal"
})
@XmlRootElement(name = "getRootNodeResponse")
public class GetRootNodeResponse {

    @XmlElement(required = true, nillable = true)
    protected Vidal vidal;

    /**
     * Obtient la valeur de la propriété vidal.
     * 
     * @return
     *     possible object is
     *     {@link Vidal }
     *     
     */
    public Vidal getVidal() {
        return vidal;
    }

    /**
     * Définit la valeur de la propriété vidal.
     * 
     * @param value
     *     allowed object is
     *     {@link Vidal }
     *     
     */
    public void setVidal(Vidal value) {
        this.vidal = value;
    }

}
