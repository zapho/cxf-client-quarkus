
package com.whatever.PosologyService;

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
 *         &lt;element name="numberOfDosesList" type="{http://posology.api.vidal.com}ArrayOfNumberOfDoses"/>
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
    "numberOfDosesList"
})
@XmlRootElement(name = "searchDosesByProductIdResponse")
public class SearchDosesByProductIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfNumberOfDoses numberOfDosesList;

    /**
     * Obtient la valeur de la propriété numberOfDosesList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNumberOfDoses }
     *     
     */
    public ArrayOfNumberOfDoses getNumberOfDosesList() {
        return numberOfDosesList;
    }

    /**
     * Définit la valeur de la propriété numberOfDosesList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNumberOfDoses }
     *     
     */
    public void setNumberOfDosesList(ArrayOfNumberOfDoses value) {
        this.numberOfDosesList = value;
    }

}
