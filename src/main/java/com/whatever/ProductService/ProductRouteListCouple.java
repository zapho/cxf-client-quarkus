
package com.whatever.ProductService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour productRouteListCouple complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="productRouteListCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="product" type="{urn:Vidal}product"/>
 *         &lt;element name="routeList" type="{urn:Vidal}ArrayOfRoute"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productRouteListCouple", propOrder = {
    "product",
    "routeList"
})
public class ProductRouteListCouple {

    @XmlElement(required = true, nillable = true)
    protected Product product;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfRoute routeList;

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

    /**
     * Obtient la valeur de la propriété routeList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoute }
     *     
     */
    public ArrayOfRoute getRouteList() {
        return routeList;
    }

    /**
     * Définit la valeur de la propriété routeList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoute }
     *     
     */
    public void setRouteList(ArrayOfRoute value) {
        this.routeList = value;
    }

}
