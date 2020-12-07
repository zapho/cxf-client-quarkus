
package com.vidal.IndicationService;

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
 *         &lt;element name="otherIndicationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "otherIndicationId"
})
@XmlRootElement(name = "searchOtherIndicationById")
public class SearchOtherIndicationById {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer otherIndicationId;

    /**
     * Obtient la valeur de la propriété otherIndicationId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOtherIndicationId() {
        return otherIndicationId;
    }

    /**
     * Définit la valeur de la propriété otherIndicationId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOtherIndicationId(Integer value) {
        this.otherIndicationId = value;
    }

}
