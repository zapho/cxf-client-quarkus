
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
 *         &lt;element name="aldId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "aldId"
})
@XmlRootElement(name = "getChildren")
public class GetChildren {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer aldId;

    /**
     * Obtient la valeur de la propriété aldId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAldId() {
        return aldId;
    }

    /**
     * Définit la valeur de la propriété aldId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAldId(Integer value) {
        this.aldId = value;
    }

}
