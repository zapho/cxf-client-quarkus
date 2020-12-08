
package com.whatever.ProductService;

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
 *         &lt;element name="ProductRangeProductCoupleList" type="{urn:Vidal}ArrayOfProductRangeProductCouple"/>
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
    "productRangeProductCoupleList"
})
@XmlRootElement(name = "searchByProductRangeIdsResponse")
public class SearchByProductRangeIdsResponse {

    @XmlElement(name = "ProductRangeProductCoupleList", required = true, nillable = true)
    protected ArrayOfProductRangeProductCouple productRangeProductCoupleList;

    /**
     * Obtient la valeur de la propriété productRangeProductCoupleList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductRangeProductCouple }
     *     
     */
    public ArrayOfProductRangeProductCouple getProductRangeProductCoupleList() {
        return productRangeProductCoupleList;
    }

    /**
     * Définit la valeur de la propriété productRangeProductCoupleList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductRangeProductCouple }
     *     
     */
    public void setProductRangeProductCoupleList(ArrayOfProductRangeProductCouple value) {
        this.productRangeProductCoupleList = value;
    }

}
