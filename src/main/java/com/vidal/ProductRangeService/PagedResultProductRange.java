
package com.vidal.ProductRangeService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour pagedResultProductRange complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="pagedResultProductRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="result" type="{urn:Vidal}ArrayOfProductRange"/>
 *         &lt;element name="rowCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pagedResultProductRange", propOrder = {
    "pageNumber",
    "pageSize",
    "result",
    "rowCount"
})
public class PagedResultProductRange {

    protected int pageNumber;
    protected int pageSize;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfProductRange result;
    protected int rowCount;

    /**
     * Obtient la valeur de la propriété pageNumber.
     * 
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Définit la valeur de la propriété pageNumber.
     * 
     */
    public void setPageNumber(int value) {
        this.pageNumber = value;
    }

    /**
     * Obtient la valeur de la propriété pageSize.
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Définit la valeur de la propriété pageSize.
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * Obtient la valeur de la propriété result.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductRange }
     *     
     */
    public ArrayOfProductRange getResult() {
        return result;
    }

    /**
     * Définit la valeur de la propriété result.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductRange }
     *     
     */
    public void setResult(ArrayOfProductRange value) {
        this.result = value;
    }

    /**
     * Obtient la valeur de la propriété rowCount.
     * 
     */
    public int getRowCount() {
        return rowCount;
    }

    /**
     * Définit la valeur de la propriété rowCount.
     * 
     */
    public void setRowCount(int value) {
        this.rowCount = value;
    }

}
