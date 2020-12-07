
package com.vidal.GenericGroupService;

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
 *         &lt;element name="productGenericGroupList" type="{urn:Vidal}ArrayOfProductGenericGroup"/>
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
    "productGenericGroupList"
})
@XmlRootElement(name = "searchByProductIdResponse")
public class SearchByProductIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfProductGenericGroup productGenericGroupList;

    /**
     * Obtient la valeur de la propriété productGenericGroupList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductGenericGroup }
     *     
     */
    public ArrayOfProductGenericGroup getProductGenericGroupList() {
        return productGenericGroupList;
    }

    /**
     * Définit la valeur de la propriété productGenericGroupList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductGenericGroup }
     *     
     */
    public void setProductGenericGroupList(ArrayOfProductGenericGroup value) {
        this.productGenericGroupList = value;
    }

}
