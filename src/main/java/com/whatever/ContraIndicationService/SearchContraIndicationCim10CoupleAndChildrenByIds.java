
package com.whatever.ContraIndicationService;

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
 *         &lt;element name="productIds" type="{urn:Vidal}ArrayOfInt"/>
 *         &lt;element name="cim10Ids" type="{urn:Vidal}ArrayOfInt"/>
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
    "productIds",
    "cim10Ids"
})
@XmlRootElement(name = "searchContraIndicationCim10CoupleAndChildrenByIds")
public class SearchContraIndicationCim10CoupleAndChildrenByIds {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt productIds;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt cim10Ids;

    /**
     * Obtient la valeur de la propriété productIds.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getProductIds() {
        return productIds;
    }

    /**
     * Définit la valeur de la propriété productIds.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setProductIds(ArrayOfInt value) {
        this.productIds = value;
    }

    /**
     * Obtient la valeur de la propriété cim10Ids.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getCim10Ids() {
        return cim10Ids;
    }

    /**
     * Définit la valeur de la propriété cim10Ids.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setCim10Ids(ArrayOfInt value) {
        this.cim10Ids = value;
    }

}
