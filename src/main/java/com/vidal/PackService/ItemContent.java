
package com.vidal.PackService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour itemContent complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="itemContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contentQuantity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="contentUnit" type="{urn:Vidal}posologyUnit"/>
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
@XmlType(name = "itemContent", propOrder = {
    "contentQuantity",
    "contentUnit",
    "item"
})
public class ItemContent {

    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double contentQuantity;
    @XmlElement(required = true, nillable = true)
    protected PosologyUnit contentUnit;
    @XmlElement(required = true, nillable = true)
    protected Item item;

    /**
     * Obtient la valeur de la propriété contentQuantity.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getContentQuantity() {
        return contentQuantity;
    }

    /**
     * Définit la valeur de la propriété contentQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setContentQuantity(Double value) {
        this.contentQuantity = value;
    }

    /**
     * Obtient la valeur de la propriété contentUnit.
     * 
     * @return
     *     possible object is
     *     {@link PosologyUnit }
     *     
     */
    public PosologyUnit getContentUnit() {
        return contentUnit;
    }

    /**
     * Définit la valeur de la propriété contentUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyUnit }
     *     
     */
    public void setContentUnit(PosologyUnit value) {
        this.contentUnit = value;
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
