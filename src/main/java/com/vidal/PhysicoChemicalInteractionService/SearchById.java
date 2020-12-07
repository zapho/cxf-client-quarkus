
package com.vidal.PhysicoChemicalInteractionService;

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
 *         &lt;element name="physicoChemicalInteractionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "physicoChemicalInteractionId"
})
@XmlRootElement(name = "searchById")
public class SearchById {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer physicoChemicalInteractionId;

    /**
     * Obtient la valeur de la propriété physicoChemicalInteractionId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPhysicoChemicalInteractionId() {
        return physicoChemicalInteractionId;
    }

    /**
     * Définit la valeur de la propriété physicoChemicalInteractionId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPhysicoChemicalInteractionId(Integer value) {
        this.physicoChemicalInteractionId = value;
    }

}
