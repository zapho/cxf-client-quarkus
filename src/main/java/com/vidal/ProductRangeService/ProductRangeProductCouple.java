
package com.vidal.ProductRangeService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour productRangeProductCouple complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="productRangeProductCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="product" type="{urn:Vidal}product"/>
 *         &lt;element name="productRange" type="{urn:Vidal}productRange"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productRangeProductCouple", propOrder = {
    "product",
    "productRange"
})
public class ProductRangeProductCouple {

    @XmlElement(required = true, nillable = true)
    protected Product product;
    @XmlElement(required = true, nillable = true)
    protected ProductRange productRange;

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
     * Obtient la valeur de la propriété productRange.
     * 
     * @return
     *     possible object is
     *     {@link ProductRange }
     *     
     */
    public ProductRange getProductRange() {
        return productRange;
    }

    /**
     * Définit la valeur de la propriété productRange.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductRange }
     *     
     */
    public void setProductRange(ProductRange value) {
        this.productRange = value;
    }

}
