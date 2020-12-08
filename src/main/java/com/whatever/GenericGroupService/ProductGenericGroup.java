
package com.whatever.GenericGroupService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour productGenericGroup complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="productGenericGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="genericGroup" type="{urn:Vidal}genericGroup"/>
 *         &lt;element name="mainGroup" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="product" type="{urn:Vidal}product"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productGenericGroup", propOrder = {
    "genericGroup",
    "mainGroup",
    "product"
})
public class ProductGenericGroup {

    @XmlElement(required = true, nillable = true)
    protected GenericGroup genericGroup;
    protected boolean mainGroup;
    @XmlElement(required = true, nillable = true)
    protected Product product;

    /**
     * Obtient la valeur de la propriété genericGroup.
     * 
     * @return
     *     possible object is
     *     {@link GenericGroup }
     *     
     */
    public GenericGroup getGenericGroup() {
        return genericGroup;
    }

    /**
     * Définit la valeur de la propriété genericGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericGroup }
     *     
     */
    public void setGenericGroup(GenericGroup value) {
        this.genericGroup = value;
    }

    /**
     * Obtient la valeur de la propriété mainGroup.
     * 
     */
    public boolean isMainGroup() {
        return mainGroup;
    }

    /**
     * Définit la valeur de la propriété mainGroup.
     * 
     */
    public void setMainGroup(boolean value) {
        this.mainGroup = value;
    }

    /**
     * Obtient la valeur de la propriété product.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Définit la valeur de la propriété product.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
    }

}
