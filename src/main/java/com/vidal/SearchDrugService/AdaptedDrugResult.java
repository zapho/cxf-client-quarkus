
package com.vidal.SearchDrugService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour adaptedDrugResult complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="adaptedDrugResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activeFacets" type="{urn:Vidal}ArrayOfActiveFacet"/>
 *         &lt;element name="adaptedPacks" type="{urn:Vidal}adaptedPackPagedResult"/>
 *         &lt;element name="adaptedProducts" type="{urn:Vidal}adaptedProductPagedResult"/>
 *         &lt;element name="adaptedUcds" type="{urn:Vidal}adaptedUcdPagedResult"/>
 *         &lt;element name="availableFacets" type="{urn:Vidal}ArrayOfAvailableFacet"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adaptedDrugResult", propOrder = {
    "activeFacets",
    "adaptedPacks",
    "adaptedProducts",
    "adaptedUcds",
    "availableFacets"
})
public class AdaptedDrugResult {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfActiveFacet activeFacets;
    @XmlElement(required = true, nillable = true)
    protected AdaptedPackPagedResult adaptedPacks;
    @XmlElement(required = true, nillable = true)
    protected AdaptedProductPagedResult adaptedProducts;
    @XmlElement(required = true, nillable = true)
    protected AdaptedUcdPagedResult adaptedUcds;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfAvailableFacet availableFacets;

    /**
     * Obtient la valeur de la propriété activeFacets.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfActiveFacet }
     *     
     */
    public ArrayOfActiveFacet getActiveFacets() {
        return activeFacets;
    }

    /**
     * Définit la valeur de la propriété activeFacets.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfActiveFacet }
     *     
     */
    public void setActiveFacets(ArrayOfActiveFacet value) {
        this.activeFacets = value;
    }

    /**
     * Obtient la valeur de la propriété adaptedPacks.
     * 
     * @return
     *     possible object is
     *     {@link AdaptedPackPagedResult }
     *     
     */
    public AdaptedPackPagedResult getAdaptedPacks() {
        return adaptedPacks;
    }

    /**
     * Définit la valeur de la propriété adaptedPacks.
     * 
     * @param value
     *     allowed object is
     *     {@link AdaptedPackPagedResult }
     *     
     */
    public void setAdaptedPacks(AdaptedPackPagedResult value) {
        this.adaptedPacks = value;
    }

    /**
     * Obtient la valeur de la propriété adaptedProducts.
     * 
     * @return
     *     possible object is
     *     {@link AdaptedProductPagedResult }
     *     
     */
    public AdaptedProductPagedResult getAdaptedProducts() {
        return adaptedProducts;
    }

    /**
     * Définit la valeur de la propriété adaptedProducts.
     * 
     * @param value
     *     allowed object is
     *     {@link AdaptedProductPagedResult }
     *     
     */
    public void setAdaptedProducts(AdaptedProductPagedResult value) {
        this.adaptedProducts = value;
    }

    /**
     * Obtient la valeur de la propriété adaptedUcds.
     * 
     * @return
     *     possible object is
     *     {@link AdaptedUcdPagedResult }
     *     
     */
    public AdaptedUcdPagedResult getAdaptedUcds() {
        return adaptedUcds;
    }

    /**
     * Définit la valeur de la propriété adaptedUcds.
     * 
     * @param value
     *     allowed object is
     *     {@link AdaptedUcdPagedResult }
     *     
     */
    public void setAdaptedUcds(AdaptedUcdPagedResult value) {
        this.adaptedUcds = value;
    }

    /**
     * Obtient la valeur de la propriété availableFacets.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAvailableFacet }
     *     
     */
    public ArrayOfAvailableFacet getAvailableFacets() {
        return availableFacets;
    }

    /**
     * Définit la valeur de la propriété availableFacets.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAvailableFacet }
     *     
     */
    public void setAvailableFacets(ArrayOfAvailableFacet value) {
        this.availableFacets = value;
    }

}
