
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
 *         &lt;element name="productIndicatorsList" type="{urn:Vidal}ArrayOfProductIndicators"/>
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
    "productIndicatorsList"
})
@XmlRootElement(name = "searchProductIndicatorsByProductIdsResponse")
public class SearchProductIndicatorsByProductIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfProductIndicators productIndicatorsList;

    /**
     * Obtient la valeur de la propriété productIndicatorsList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductIndicators }
     *     
     */
    public ArrayOfProductIndicators getProductIndicatorsList() {
        return productIndicatorsList;
    }

    /**
     * Définit la valeur de la propriété productIndicatorsList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductIndicators }
     *     
     */
    public void setProductIndicatorsList(ArrayOfProductIndicators value) {
        this.productIndicatorsList = value;
    }

}
