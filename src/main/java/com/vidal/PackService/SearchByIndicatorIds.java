
package com.vidal.PackService;

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
 *         &lt;element name="indicators" type="{urn:Vidal}ArrayOfInt"/>
 *         &lt;element name="operatorType" type="{urn:Vidal}SetOperatorType"/>
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
    "indicators",
    "operatorType",
    "pageNumber",
    "pageSize"
})
@XmlRootElement(name = "searchByIndicatorIds")
public class SearchByIndicatorIds {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt indicators;
    @XmlElement(required = true, nillable = true)
    protected SetOperatorType operatorType;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer pageNumber;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer pageSize;

    /**
     * Obtient la valeur de la propriété indicators.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getIndicators() {
        return indicators;
    }

    /**
     * Définit la valeur de la propriété indicators.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setIndicators(ArrayOfInt value) {
        this.indicators = value;
    }

    /**
     * Obtient la valeur de la propriété operatorType.
     * 
     * @return
     *     possible object is
     *     {@link SetOperatorType }
     *     
     */
    public SetOperatorType getOperatorType() {
        return operatorType;
    }

    /**
     * Définit la valeur de la propriété operatorType.
     * 
     * @param value
     *     allowed object is
     *     {@link SetOperatorType }
     *     
     */
    public void setOperatorType(SetOperatorType value) {
        this.operatorType = value;
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
