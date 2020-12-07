
package com.vidal.AldService;

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
 *         &lt;element name="productAldAtcListCoupleList" type="{urn:Vidal}ArrayOfProductAldAtcListCouple"/>
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
    "productAldAtcListCoupleList"
})
@XmlRootElement(name = "searchByProductIdsResponse")
public class SearchByProductIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfProductAldAtcListCouple productAldAtcListCoupleList;

    /**
     * Obtient la valeur de la propriété productAldAtcListCoupleList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductAldAtcListCouple }
     *     
     */
    public ArrayOfProductAldAtcListCouple getProductAldAtcListCoupleList() {
        return productAldAtcListCoupleList;
    }

    /**
     * Définit la valeur de la propriété productAldAtcListCoupleList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductAldAtcListCouple }
     *     
     */
    public void setProductAldAtcListCoupleList(ArrayOfProductAldAtcListCouple value) {
        this.productAldAtcListCoupleList = value;
    }

}
