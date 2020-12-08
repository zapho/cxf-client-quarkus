
package com.whatever.SempService;

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
 *         &lt;element name="semp" type="{urn:Vidal}semp"/>
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
    "semp"
})
@XmlRootElement(name = "getParentResponse")
public class GetParentResponse {

    @XmlElement(required = true, nillable = true)
    protected Semp semp;

    /**
     * Obtient la valeur de la propriété semp.
     * 
     * @return
     *     possible object is
     *     {@link Semp }
     *     
     */
    public Semp getSemp() {
        return semp;
    }

    /**
     * Définit la valeur de la propriété semp.
     * 
     * @param value
     *     allowed object is
     *     {@link Semp }
     *     
     */
    public void setSemp(Semp value) {
        this.semp = value;
    }

}
