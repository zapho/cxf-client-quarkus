
package com.whatever.Cim10Service;

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
 *         &lt;element name="cim10Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "cim10Id"
})
@XmlRootElement(name = "getParent")
public class GetParent {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer cim10Id;

    /**
     * Obtient la valeur de la propriété cim10Id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCim10Id() {
        return cim10Id;
    }

    /**
     * Définit la valeur de la propriété cim10Id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCim10Id(Integer value) {
        this.cim10Id = value;
    }

}
