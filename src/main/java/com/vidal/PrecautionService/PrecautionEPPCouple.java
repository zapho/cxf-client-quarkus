
package com.vidal.PrecautionService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour precautionEPPCouple complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="precautionEPPCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="epp" type="{urn:Vidal}Epp"/>
 *         &lt;element name="precaution" type="{urn:Vidal}precaution"/>
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
@XmlType(name = "precautionEPPCouple", propOrder = {
    "epp",
    "precaution",
    "product"
})
public class PrecautionEPPCouple {

    @XmlElement(required = true, nillable = true)
    protected Epp epp;
    @XmlElement(required = true, nillable = true)
    protected Precaution precaution;
    @XmlElement(required = true, nillable = true)
    protected Product product;

    /**
     * Obtient la valeur de la propriété epp.
     * 
     * @return
     *     possible object is
     *     {@link Epp }
     *     
     */
    public Epp getEpp() {
        return epp;
    }

    /**
     * Définit la valeur de la propriété epp.
     * 
     * @param value
     *     allowed object is
     *     {@link Epp }
     *     
     */
    public void setEpp(Epp value) {
        this.epp = value;
    }

    /**
     * Obtient la valeur de la propriété precaution.
     * 
     * @return
     *     possible object is
     *     {@link Precaution }
     *     
     */
    public Precaution getPrecaution() {
        return precaution;
    }

    /**
     * Définit la valeur de la propriété precaution.
     * 
     * @param value
     *     allowed object is
     *     {@link Precaution }
     *     
     */
    public void setPrecaution(Precaution value) {
        this.precaution = value;
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
