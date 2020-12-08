
package com.whatever.AldService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour productAldAtcListCouple complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="productAldAtcListCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aldAtcList" type="{urn:Vidal}ArrayOfAldAtc"/>
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
@XmlType(name = "productAldAtcListCouple", propOrder = {
    "aldAtcList",
    "product"
})
public class ProductAldAtcListCouple {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfAldAtc aldAtcList;
    @XmlElement(required = true, nillable = true)
    protected Product product;

    /**
     * Obtient la valeur de la propriété aldAtcList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAldAtc }
     *     
     */
    public ArrayOfAldAtc getAldAtcList() {
        return aldAtcList;
    }

    /**
     * Définit la valeur de la propriété aldAtcList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAldAtc }
     *     
     */
    public void setAldAtcList(ArrayOfAldAtc value) {
        this.aldAtcList = value;
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
