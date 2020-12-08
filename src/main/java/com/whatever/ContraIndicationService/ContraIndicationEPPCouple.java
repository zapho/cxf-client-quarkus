
package com.whatever.ContraIndicationService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour contraIndicationEPPCouple complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="contraIndicationEPPCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contraIndication" type="{urn:Vidal}contraIndication"/>
 *         &lt;element name="epp" type="{urn:Vidal}Epp"/>
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
@XmlType(name = "contraIndicationEPPCouple", propOrder = {
    "contraIndication",
    "epp",
    "product",
    "type"
})
public class ContraIndicationEPPCouple {

    @XmlElement(required = true, nillable = true)
    protected ContraIndication contraIndication;
    @XmlElement(required = true, nillable = true)
    protected Epp epp;
    @XmlElement(required = true, nillable = true)
    protected Product product;
    @XmlElement(required = true, nillable = true)
    protected ContraIndicationType type;

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
