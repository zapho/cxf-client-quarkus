
package com.whatever.CompositionService;

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
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="substanceTypes" type="{urn:Vidal}ArrayOfSubstanceType"/>
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
    "productId",
    "substanceTypes"
})
@XmlRootElement(name = "searchCompositionsByProduct")
public class SearchCompositionsByProduct {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer productId;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfSubstanceType substanceTypes;

    /**
     * Obtient la valeur de la propriété productId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * Définit la valeur de la propriété productId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductId(Integer value) {
        this.productId = value;
    }

    /**
     * Obtient la valeur de la propriété substanceTypes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubstanceType }
     *     
     */
    public ArrayOfSubstanceType getSubstanceTypes() {
        return substanceTypes;
    }

    /**
     * Définit la valeur de la propriété substanceTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubstanceType }
     *     
     */
    public void setSubstanceTypes(ArrayOfSubstanceType value) {
        this.substanceTypes = value;
    }

}
