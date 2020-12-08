
package com.whatever.FoodInteractionService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour foodInteractionCommentCouple complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="foodInteractionCommentCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="foodInteraction" type="{urn:Vidal}foodInteraction"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "foodInteractionCommentCouple", propOrder = {
    "comment",
    "foodInteraction"
})
public class FoodInteractionCommentCouple {

    @XmlElement(required = true, nillable = true)
    protected String comment;
    @XmlElement(required = true, nillable = true)
    protected FoodInteraction foodInteraction;

    /**
     * Obtient la valeur de la propriété comment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Définit la valeur de la propriété comment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Obtient la valeur de la propriété foodInteraction.
     * 
     * @return
     *     possible object is
     *     {@link FoodInteraction }
     *     
     */
    public FoodInteraction getFoodInteraction() {
        return foodInteraction;
    }

    /**
     * Définit la valeur de la propriété foodInteraction.
     * 
     * @param value
     *     allowed object is
     *     {@link FoodInteraction }
     *     
     */
    public void setFoodInteraction(FoodInteraction value) {
        this.foodInteraction = value;
    }

}
