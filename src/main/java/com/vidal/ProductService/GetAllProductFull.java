
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
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marketStatuses" type="{urn:Vidal}ArrayOfMarketStatus"/>
 *         &lt;element name="productApiFilter" type="{urn:Vidal}ProductApiFilter"/>
 *         &lt;element name="types" type="{urn:Vidal}ArrayOfProductType"/>
 *         &lt;element name="aggregates" type="{urn:Vidal}ArrayOfAggregate"/>
 *         &lt;element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "marketStatuses",
    "productApiFilter",
    "types",
    "aggregates",
    "pageNumber",
    "pageSize"
})
@XmlRootElement(name = "getAllProductFull")
public class GetAllProductFull {

    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfMarketStatus marketStatuses;
    @XmlElement(required = true, nillable = true)
    protected ProductApiFilter productApiFilter;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfProductType types;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfAggregate aggregates;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer pageNumber;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer pageSize;

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

    /**
     * Obtient la valeur de la propriété productApiFilter.
     * 
     * @return
     *     possible object is
     *     {@link ProductApiFilter }
     *     
     */
    public ProductApiFilter getProductApiFilter() {
        return productApiFilter;
    }

    /**
     * Définit la valeur de la propriété productApiFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductApiFilter }
     *     
     */
    public void setProductApiFilter(ProductApiFilter value) {
        this.productApiFilter = value;
    }

    /**
     * Obtient la valeur de la propriété types.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductType }
     *     
     */
    public ArrayOfProductType getTypes() {
        return types;
    }

    /**
     * Définit la valeur de la propriété types.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductType }
     *     
     */
    public void setTypes(ArrayOfProductType value) {
        this.types = value;
    }

    /**
     * Obtient la valeur de la propriété aggregates.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAggregate }
     *     
     */
    public ArrayOfAggregate getAggregates() {
        return aggregates;
    }

    /**
     * Définit la valeur de la propriété aggregates.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAggregate }
     *     
     */
    public void setAggregates(ArrayOfAggregate value) {
        this.aggregates = value;
    }

    /**
     * Obtient la valeur de la propriété pageNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * Définit la valeur de la propriété pageNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
    }

    /**
     * Obtient la valeur de la propriété pageSize.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Définit la valeur de la propriété pageSize.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

}
