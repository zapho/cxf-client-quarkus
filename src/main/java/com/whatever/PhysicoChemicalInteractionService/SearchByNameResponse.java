
package com.whatever.PhysicoChemicalInteractionService;

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
 *         &lt;element name="physicoChemicalInteractionList" type="{urn:Vidal}ArrayOfPhysicoChemicalInteraction"/>
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
    "physicoChemicalInteractionList"
})
@XmlRootElement(name = "searchByNameResponse")
public class SearchByNameResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfPhysicoChemicalInteraction physicoChemicalInteractionList;

    /**
     * Obtient la valeur de la propriété physicoChemicalInteractionList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhysicoChemicalInteraction }
     *     
     */
    public ArrayOfPhysicoChemicalInteraction getPhysicoChemicalInteractionList() {
        return physicoChemicalInteractionList;
    }

    /**
     * Définit la valeur de la propriété physicoChemicalInteractionList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhysicoChemicalInteraction }
     *     
     */
    public void setPhysicoChemicalInteractionList(ArrayOfPhysicoChemicalInteraction value) {
        this.physicoChemicalInteractionList = value;
    }

}
