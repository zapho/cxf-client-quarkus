
package com.whatever.ContraIndicationService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour contraIndicationCim10Couple complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="contraIndicationCim10Couple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cim10" type="{urn:Vidal}cim10"/>
 *         &lt;element name="contraIndication" type="{urn:Vidal}contraIndication"/>
 *         &lt;element name="product" type="{urn:Vidal}product"/>
 *         &lt;element name="type" type="{urn:Vidal}ContraIndicationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contraIndicationCim10Couple", propOrder = {
    "cim10",
    "contraIndication",
    "product",
    "type"
})
public class ContraIndicationCim10Couple {

    @XmlElement(required = true, nillable = true)
    protected Cim10 cim10;
    @XmlElement(required = true, nillable = true)
    protected ContraIndication contraIndication;
    @XmlElement(required = true, nillable = true)
    protected Product product;
    @XmlElement(required = true, nillable = true)
    protected ContraIndicationType type;

    /**
     * Obtient la valeur de la propriété cim10.
     * 
     * @return
     *     possible object is
     *     {@link Cim10 }
     *     
     */
    public Cim10 getCim10() {
        return cim10;
    }

    /**
     * Définit la valeur de la propriété cim10.
     * 
     * @param value
     *     allowed object is
     *     {@link Cim10 }
     *     
     */
    public void setCim10(Cim10 value) {
        this.cim10 = value;
    }

    /**
     * Obtient la valeur de la propriété contraIndication.
     * 
     * @return
     *     possible object is
     *     {@link ContraIndication }
     *     
     */
    public ContraIndication getContraIndication() {
        return contraIndication;
    }

    /**
     * Définit la valeur de la propriété contraIndication.
     * 
     * @param value
     *     allowed object is
     *     {@link ContraIndication }
     *     
     */
    public void setContraIndication(ContraIndication value) {
        this.contraIndication = value;
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

    /**
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link ContraIndicationType }
     *     
     */
    public ContraIndicationType getType() {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     * 
     * @param value
     *     allowed object is
     *     {@link ContraIndicationType }
     *     
     */
    public void setType(ContraIndicationType value) {
        this.type = value;
    }

}
