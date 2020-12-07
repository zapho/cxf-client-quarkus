
package com.vidal.SearchDrugService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchResultDrugs complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchResultDrugs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonNameGroups" type="{urn:Vidal}ArrayOfSearchResultCommonNameGroupDTO"/>
 *         &lt;element name="packs" type="{urn:Vidal}ArrayOfSearchResultPackDTO"/>
 *         &lt;element name="products" type="{urn:Vidal}ArrayOfSearchResultProductDTO"/>
 *         &lt;element name="ucds" type="{urn:Vidal}ArrayOfSearchResultUcdDTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchResultDrugs", propOrder = {
    "commonNameGroups",
    "packs",
    "products",
    "ucds"
})
public class SearchResultDrugs {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfSearchResultCommonNameGroupDTO commonNameGroups;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfSearchResultPackDTO packs;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfSearchResultProductDTO products;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfSearchResultUcdDTO ucds;

    /**
     * Obtient la valeur de la propriété commonNameGroups.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchResultCommonNameGroupDTO }
     *     
     */
    public ArrayOfSearchResultCommonNameGroupDTO getCommonNameGroups() {
        return commonNameGroups;
    }

    /**
     * Définit la valeur de la propriété commonNameGroups.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchResultCommonNameGroupDTO }
     *     
     */
    public void setCommonNameGroups(ArrayOfSearchResultCommonNameGroupDTO value) {
        this.commonNameGroups = value;
    }

    /**
     * Obtient la valeur de la propriété packs.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchResultPackDTO }
     *     
     */
    public ArrayOfSearchResultPackDTO getPacks() {
        return packs;
    }

    /**
     * Définit la valeur de la propriété packs.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchResultPackDTO }
     *     
     */
    public void setPacks(ArrayOfSearchResultPackDTO value) {
        this.packs = value;
    }

    /**
     * Obtient la valeur de la propriété products.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchResultProductDTO }
     *     
     */
    public ArrayOfSearchResultProductDTO getProducts() {
        return products;
    }

    /**
     * Définit la valeur de la propriété products.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchResultProductDTO }
     *     
     */
    public void setProducts(ArrayOfSearchResultProductDTO value) {
        this.products = value;
    }

    /**
     * Obtient la valeur de la propriété ucds.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchResultUcdDTO }
     *     
     */
    public ArrayOfSearchResultUcdDTO getUcds() {
        return ucds;
    }

    /**
     * Définit la valeur de la propriété ucds.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchResultUcdDTO }
     *     
     */
    public void setUcds(ArrayOfSearchResultUcdDTO value) {
        this.ucds = value;
    }

}
