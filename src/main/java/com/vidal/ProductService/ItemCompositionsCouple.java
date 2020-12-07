
package com.vidal.ProductService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour itemCompositionsCouple complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="itemCompositionsCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="compositions" type="{urn:Vidal}ArrayOfComposition"/>
 *         &lt;element name="item" type="{urn:Vidal}Item"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemCompositionsCouple", propOrder = {
    "compositions",
    "item"
})
public class ItemCompositionsCouple {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfComposition compositions;
    @XmlElement(required = true, nillable = true)
    protected Item item;

    /**
     * Obtient la valeur de la propriété compositions.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfComposition }
     *     
     */
    public ArrayOfComposition getCompositions() {
        return compositions;
    }

    /**
     * Définit la valeur de la propriété compositions.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfComposition }
     *     
     */
    public void setCompositions(ArrayOfComposition value) {
        this.compositions = value;
    }

    /**
     * Obtient la valeur de la propriété item.
     * 
     * @return
     *     possible object is
     *     {@link Item }
     *     
     */
    public Item getItem() {
        return item;
    }

    /**
     * Définit la valeur de la propriété item.
     * 
     * @param value
     *     allowed object is
     *     {@link Item }
     *     
     */
    public void setItem(Item value) {
        this.item = value;
    }

}
