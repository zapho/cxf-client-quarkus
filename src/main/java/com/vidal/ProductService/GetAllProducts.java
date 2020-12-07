
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
 *         &lt;element name="productApiFilter" type="{urn:Vidal}ProductApiFilter"/>
 *         &lt;element name="types" type="{urn:Vidal}ArrayOfProductType"/>
 *         &lt;element name="marketStatuses" type="{urn:Vidal}ArrayOfMarketStatus"/>
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
    "productApiFilter",
    "types",
    "marketStatuses",
    "pageNumber",
    "pageSize"
})
@XmlRootElement(name = "getAllProducts")
public class GetAllProducts {

    @XmlElement(required = true, nillable = true)
    protected ProductApiFilter productApiFilter;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfProductType types;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfMarketStatus marketStatuses;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer pageNumber;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer pageSize;

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
