
package com.vidal.ContraIndicationService;

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
 *         &lt;element name="productContraIndicationEppList" type="{http://contraindication.api.vidal.com}ProductContraIndicationEppList"/>
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
    "productContraIndicationEppList"
})
@XmlRootElement(name = "searchByProductsIdsAndEppResponse")
public class SearchByProductsIdsAndEppResponse {

    @XmlElement(required = true, nillable = true)
    protected ProductContraIndicationEppList productContraIndicationEppList;

    /**
     * Obtient la valeur de la propriété productContraIndicationEppList.
     * 
     * @return
     *     possible object is
     *     {@link ProductContraIndicationEppList }
     *     
     */
    public ProductContraIndicationEppList getProductContraIndicationEppList() {
        return productContraIndicationEppList;
    }

    /**
     * Définit la valeur de la propriété productContraIndicationEppList.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductContraIndicationEppList }
     *     
     */
    public void setProductContraIndicationEppList(ProductContraIndicationEppList value) {
        this.productContraIndicationEppList = value;
    }

}
