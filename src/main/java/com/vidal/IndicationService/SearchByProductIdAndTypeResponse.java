
package com.vidal.IndicationService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productTypedIndication" type="{urn:Vidal}productTypedIndication"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "productTypedIndication"
})
@XmlRootElement(name = "searchByProductIdAndTypeResponse")
public class SearchByProductIdAndTypeResponse {

    @XmlElement(required = true, nillable = true)
    protected ProductTypedIndication productTypedIndication;

    /**
     * Obtient la valeur de la propriété productTypedIndication.
     * 
     * @return
     *     possible object is
     *     {@link ProductTypedIndication }
     *     
     */
    public ProductTypedIndication getProductTypedIndication() {
        return productTypedIndication;
    }

    /**
     * Définit la valeur de la propriété productTypedIndication.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTypedIndication }
     *     
     */
    public void setProductTypedIndication(ProductTypedIndication value) {
        this.productTypedIndication = value;
    }

}
