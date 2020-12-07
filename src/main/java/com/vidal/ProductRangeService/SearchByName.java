
package com.vidal.ProductRangeService;

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
 *         &lt;element name="productRangeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "productRangeName"
})
@XmlRootElement(name = "searchByName")
public class SearchByName {

    @XmlElement(required = true, nillable = true)
    protected String productRangeName;

    /**
     * Obtient la valeur de la propriété productRangeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductRangeName() {
        return productRangeName;
    }

    /**
     * Définit la valeur de la propriété productRangeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductRangeName(String value) {
        this.productRangeName = value;
    }

}
