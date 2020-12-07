
package com.vidal.UcdService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour productRangeUcdCouple complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="productRangeUcdCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productRange" type="{urn:Vidal}productRange"/>
 *         &lt;element name="ucd" type="{urn:Vidal}ucd"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productRangeUcdCouple", propOrder = {
    "productRange",
    "ucd"
})
public class ProductRangeUcdCouple {

    @XmlElement(required = true, nillable = true)
    protected ProductRange productRange;
    @XmlElement(required = true, nillable = true)
    protected Ucd ucd;

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

    /**
     * Obtient la valeur de la propriété ucd.
     * 
     * @return
     *     possible object is
     *     {@link Ucd }
     *     
     */
    public Ucd getUcd() {
        return ucd;
    }

    /**
     * Définit la valeur de la propriété ucd.
     * 
     * @param value
     *     allowed object is
     *     {@link Ucd }
     *     
     */
    public void setUcd(Ucd value) {
        this.ucd = value;
    }

}
