
package com.vidal.ProductRangeService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour productRangePackCouple complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="productRangePackCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pack" type="{urn:Vidal}pack"/>
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
@XmlType(name = "productRangePackCouple", propOrder = {
    "pack",
    "productRange"
})
public class ProductRangePackCouple {

    @XmlElement(required = true, nillable = true)
    protected Pack pack;
    @XmlElement(required = true, nillable = true)
    protected ProductRange productRange;

    /**
     * Obtient la valeur de la propriété pack.
     * 
     * @return
     *     possible object is
     *     {@link Pack }
     *     
     */
    public Pack getPack() {
        return pack;
    }

    /**
     * Définit la valeur de la propriété pack.
     * 
     * @param value
     *     allowed object is
     *     {@link Pack }
     *     
     */
    public void setPack(Pack value) {
        this.pack = value;
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
