
package com.vidal.VidalService;

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
 *         &lt;element name="vidalId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "vidalId"
})
@XmlRootElement(name = "getChildren")
public class GetChildren {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer vidalId;

    /**
     * Obtient la valeur de la propriété vidalId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVidalId() {
        return vidalId;
    }

    /**
     * Définit la valeur de la propriété vidalId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVidalId(Integer value) {
        this.vidalId = value;
    }

}
