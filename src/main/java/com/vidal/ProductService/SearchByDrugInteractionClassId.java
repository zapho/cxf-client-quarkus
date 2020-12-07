
package com.vidal.ProductService;

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
 *         &lt;element name="drugInteractionClassId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "drugInteractionClassId"
})
@XmlRootElement(name = "searchByDrugInteractionClassId")
public class SearchByDrugInteractionClassId {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer drugInteractionClassId;

    /**
     * Obtient la valeur de la propriété drugInteractionClassId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDrugInteractionClassId() {
        return drugInteractionClassId;
    }

    /**
     * Définit la valeur de la propriété drugInteractionClassId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDrugInteractionClassId(Integer value) {
        this.drugInteractionClassId = value;
    }

}
