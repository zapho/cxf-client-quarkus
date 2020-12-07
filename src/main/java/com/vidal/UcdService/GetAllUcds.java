
package com.vidal.UcdService;

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
 *         &lt;element name="ucdApiFilter" type="{urn:Vidal}UcdApiFilter"/>
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
    "ucdApiFilter",
    "marketStatuses",
    "pageNumber",
    "pageSize"
})
@XmlRootElement(name = "getAllUcds")
public class GetAllUcds {

    @XmlElement(required = true, nillable = true)
    protected UcdApiFilter ucdApiFilter;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfMarketStatus marketStatuses;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer pageNumber;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer pageSize;

    /**
     * Obtient la valeur de la propriété ucdApiFilter.
     * 
     * @return
     *     possible object is
     *     {@link UcdApiFilter }
     *     
     */
    public UcdApiFilter getUcdApiFilter() {
        return ucdApiFilter;
    }

    /**
     * Définit la valeur de la propriété ucdApiFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link UcdApiFilter }
     *     
     */
    public void setUcdApiFilter(UcdApiFilter value) {
        this.ucdApiFilter = value;
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
