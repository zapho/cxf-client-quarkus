
package com.whatever.FoodInteractionService;

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
 *         &lt;element name="foodInteractionList" type="{urn:Vidal}ArrayOfFoodInteraction"/>
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
    "foodInteractionList"
})
@XmlRootElement(name = "searchByNameResponse")
public class SearchByNameResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfFoodInteraction foodInteractionList;

    /**
     * Obtient la valeur de la propriété foodInteractionList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFoodInteraction }
     *     
     */
    public ArrayOfFoodInteraction getFoodInteractionList() {
        return foodInteractionList;
    }

    /**
     * Définit la valeur de la propriété foodInteractionList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFoodInteraction }
     *     
     */
    public void setFoodInteractionList(ArrayOfFoodInteraction value) {
        this.foodInteractionList = value;
    }

}
