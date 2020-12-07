
package com.vidal.FoodInteractionService;

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
 *         &lt;element name="foodInteractionCommentCoupleList" type="{urn:Vidal}ArrayOfFoodInteractionCommentCouple"/>
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
    "foodInteractionCommentCoupleList"
})
@XmlRootElement(name = "searchByCommonNameGroupIdResponse")
public class SearchByCommonNameGroupIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfFoodInteractionCommentCouple foodInteractionCommentCoupleList;

    /**
     * Obtient la valeur de la propriété foodInteractionCommentCoupleList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFoodInteractionCommentCouple }
     *     
     */
    public ArrayOfFoodInteractionCommentCouple getFoodInteractionCommentCoupleList() {
        return foodInteractionCommentCoupleList;
    }

    /**
     * Définit la valeur de la propriété foodInteractionCommentCoupleList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFoodInteractionCommentCouple }
     *     
     */
    public void setFoodInteractionCommentCoupleList(ArrayOfFoodInteractionCommentCouple value) {
        this.foodInteractionCommentCoupleList = value;
    }

}
