
package com.whatever.ProductService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour drugsAgg complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="drugsAgg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonNameGroups" type="{urn:Vidal}ArrayOfCommonNameGroup"/>
 *         &lt;element name="packs" type="{urn:Vidal}ArrayOfPack"/>
 *         &lt;element name="products" type="{urn:Vidal}ArrayOfProduct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "drugsAgg", propOrder = {
    "commonNameGroups",
    "packs",
    "products"
})
public class DrugsAgg {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroup commonNameGroups;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPack packs;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfProduct products;

    /**
     * Obtient la valeur de la propriété commonNameGroups.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroup }
     *     
     */
    public ArrayOfCommonNameGroup getCommonNameGroups() {
        return commonNameGroups;
    }

    /**
     * Définit la valeur de la propriété commonNameGroups.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroup }
     *     
     */
    public void setCommonNameGroups(ArrayOfCommonNameGroup value) {
        this.commonNameGroups = value;
    }

    /**
     * Obtient la valeur de la propriété packs.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPack }
     *     
     */
    public ArrayOfPack getPacks() {
        return packs;
    }

    /**
     * Définit la valeur de la propriété packs.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPack }
     *     
     */
    public void setPacks(ArrayOfPack value) {
        this.packs = value;
    }

    /**
     * Obtient la valeur de la propriété products.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProduct }
     *     
     */
    public ArrayOfProduct getProducts() {
        return products;
    }

    /**
     * Définit la valeur de la propriété products.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProduct }
     *     
     */
    public void setProducts(ArrayOfProduct value) {
        this.products = value;
    }

}
