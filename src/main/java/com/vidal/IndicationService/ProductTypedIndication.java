
package com.vidal.IndicationService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour productTypedIndication complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="productTypedIndication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="product" type="{urn:Vidal}product"/>
 *         &lt;element name="typedIndicationList" type="{urn:Vidal}ArrayOfTypedIndication"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productTypedIndication", propOrder = {
    "product",
    "typedIndicationList"
})
public class ProductTypedIndication {

    @XmlElement(required = true, nillable = true)
    protected Product product;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTypedIndication typedIndicationList;

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
     * Obtient la valeur de la propriété typedIndicationList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTypedIndication }
     *     
     */
    public ArrayOfTypedIndication getTypedIndicationList() {
        return typedIndicationList;
    }

    /**
     * Définit la valeur de la propriété typedIndicationList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTypedIndication }
     *     
     */
    public void setTypedIndicationList(ArrayOfTypedIndication value) {
        this.typedIndicationList = value;
    }

}
