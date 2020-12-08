
package com.whatever.ProductRangeService;

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
 *         &lt;element name="productRangeList" type="{urn:Vidal}ArrayOfProductRange"/>
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
    "productRangeList"
})
@XmlRootElement(name = "searchByIdsResponse")
public class SearchByIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfProductRange productRangeList;

    /**
     * Obtient la valeur de la propriété productRangeList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductRange }
     *     
     */
    public ArrayOfProductRange getProductRangeList() {
        return productRangeList;
    }

    /**
     * Définit la valeur de la propriété productRangeList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductRange }
     *     
     */
    public void setProductRangeList(ArrayOfProductRange value) {
        this.productRangeList = value;
    }

}
