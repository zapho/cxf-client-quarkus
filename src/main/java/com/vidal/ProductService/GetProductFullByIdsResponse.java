
package com.vidal.ProductService;

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
 *         &lt;element name="productFullList" type="{urn:Vidal}ArrayOfProductFull"/>
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
    "productFullList"
})
@XmlRootElement(name = "getProductFullByIdsResponse")
public class GetProductFullByIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfProductFull productFullList;

    /**
     * Obtient la valeur de la propriété productFullList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductFull }
     *     
     */
    public ArrayOfProductFull getProductFullList() {
        return productFullList;
    }

    /**
     * Définit la valeur de la propriété productFullList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductFull }
     *     
     */
    public void setProductFullList(ArrayOfProductFull value) {
        this.productFullList = value;
    }

}
