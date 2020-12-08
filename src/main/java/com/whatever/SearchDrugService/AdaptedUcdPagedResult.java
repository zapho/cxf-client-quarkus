
package com.whatever.SearchDrugService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour adaptedUcdPagedResult complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="adaptedUcdPagedResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nextPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="previousPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="result" type="{urn:Vidal}ArrayOfUcd"/>
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
@XmlType(name = "adaptedUcdPagedResult", propOrder = {
    "nextPage",
    "pageNumber",
    "pageSize",
    "previousPage",
    "result",
    "rowCount"
})
public class AdaptedUcdPagedResult {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer nextPage;
    protected int pageNumber;
    protected int pageSize;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer previousPage;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfUcd result;
    protected int rowCount;

    /**
     * Obtient la valeur de la propriété nextPage.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNextPage() {
        return nextPage;
    }

    /**
     * Définit la valeur de la propriété nextPage.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNextPage(Integer value) {
        this.nextPage = value;
    }

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
     * Obtient la valeur de la propriété previousPage.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPreviousPage() {
        return previousPage;
    }

    /**
     * Définit la valeur de la propriété previousPage.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPreviousPage(Integer value) {
        this.previousPage = value;
    }

    /**
     * Obtient la valeur de la propriété result.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUcd }
     *     
     */
    public ArrayOfUcd getResult() {
        return result;
    }

    /**
     * Définit la valeur de la propriété result.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUcd }
     *     
     */
    public void setResult(ArrayOfUcd value) {
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
