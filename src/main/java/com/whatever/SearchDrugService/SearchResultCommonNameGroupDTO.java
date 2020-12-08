
package com.whatever.SearchDrugService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchResultCommonNameGroupDTO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchResultCommonNameGroupDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activePrinciple" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="een" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="minPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchResultCommonNameGroupDTO", propOrder = {
    "activePrinciple",
    "een",
    "id",
    "maxPrice",
    "minPrice",
    "name"
})
public class SearchResultCommonNameGroupDTO {

    @XmlElement(required = true, nillable = true)
    protected String activePrinciple;
    @XmlElement(required = true, nillable = true)
    protected String een;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float maxPrice;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float minPrice;
    @XmlElement(required = true, nillable = true)
    protected String name;

    /**
     * Obtient la valeur de la propriété activePrinciple.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivePrinciple() {
        return activePrinciple;
    }

    /**
     * Définit la valeur de la propriété activePrinciple.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivePrinciple(String value) {
        this.activePrinciple = value;
    }

    /**
     * Obtient la valeur de la propriété een.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEen() {
        return een;
    }

    /**
     * Définit la valeur de la propriété een.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEen(String value) {
        this.een = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété maxPrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxPrice() {
        return maxPrice;
    }

    /**
     * Définit la valeur de la propriété maxPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxPrice(Float value) {
        this.maxPrice = value;
    }

    /**
     * Obtient la valeur de la propriété minPrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinPrice() {
        return minPrice;
    }

    /**
     * Définit la valeur de la propriété minPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinPrice(Float value) {
        this.minPrice = value;
    }

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

}
