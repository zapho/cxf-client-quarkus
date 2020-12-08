
package com.whatever.SearchDrugService;

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
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="searchedDrugs" type="{urn:Vidal}ArrayOfDrugType"/>
 *         &lt;element name="productTypes" type="{urn:Vidal}ArrayOfProductType"/>
 *         &lt;element name="marketStatuses" type="{urn:Vidal}ArrayOfMarketStatus"/>
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
    "name",
    "searchedDrugs",
    "productTypes",
    "marketStatuses"
})
@XmlRootElement(name = "searchDrugs")
public class SearchDrugs {

    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfDrugType searchedDrugs;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfProductType productTypes;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfMarketStatus marketStatuses;

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété searchedDrugs.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDrugType }
     *     
     */
    public ArrayOfDrugType getSearchedDrugs() {
        return searchedDrugs;
    }

    /**
     * Définit la valeur de la propriété searchedDrugs.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDrugType }
     *     
     */
    public void setSearchedDrugs(ArrayOfDrugType value) {
        this.searchedDrugs = value;
    }

    /**
     * Obtient la valeur de la propriété productTypes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductType }
     *     
     */
    public ArrayOfProductType getProductTypes() {
        return productTypes;
    }

    /**
     * Définit la valeur de la propriété productTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductType }
     *     
     */
    public void setProductTypes(ArrayOfProductType value) {
        this.productTypes = value;
    }

    /**
     * Obtient la valeur de la propriété marketStatuses.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMarketStatus }
     *     
     */
    public ArrayOfMarketStatus getMarketStatuses() {
        return marketStatuses;
    }

    /**
     * Définit la valeur de la propriété marketStatuses.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMarketStatus }
     *     
     */
    public void setMarketStatuses(ArrayOfMarketStatus value) {
        this.marketStatuses = value;
    }

}
