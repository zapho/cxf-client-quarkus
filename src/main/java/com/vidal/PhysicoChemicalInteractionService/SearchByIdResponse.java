
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
 *         &lt;element name="physicoChemicalInteraction" type="{urn:Vidal}physicoChemicalInteraction"/>
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
    "physicoChemicalInteraction"
})
@XmlRootElement(name = "searchByIdResponse")
public class SearchByIdResponse {

    @XmlElement(required = true, nillable = true)
    protected PhysicoChemicalInteraction physicoChemicalInteraction;

    /**
     * Obtient la valeur de la propriété physicoChemicalInteraction.
     * 
     * @return
     *     possible object is
     *     {@link PhysicoChemicalInteraction }
     *     
     */
    public PhysicoChemicalInteraction getPhysicoChemicalInteraction() {
        return physicoChemicalInteraction;
    }

    /**
     * Définit la valeur de la propriété physicoChemicalInteraction.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicoChemicalInteraction }
     *     
     */
    public void setPhysicoChemicalInteraction(PhysicoChemicalInteraction value) {
        this.physicoChemicalInteraction = value;
    }

}
