
package com.vidal.SearchDrugService;

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
 *         &lt;element name="patient" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prescriptionLine" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="outputDrugType" type="{urn:Vidal}DrugType"/>
 *         &lt;element name="activeFacets" type="{urn:Vidal}ArrayOfString"/>
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
    "patient",
    "prescriptionLine",
    "outputDrugType",
    "activeFacets",
    "pageNumber",
    "pageSize"
})
@XmlRootElement(name = "searchAdaptedDrugsByCommonNameGroup")
public class SearchAdaptedDrugsByCommonNameGroup {

    @XmlElement(required = true, nillable = true)
    protected String patient;
    @XmlElement(required = true, nillable = true)
    protected String prescriptionLine;
    @XmlElement(required = true, nillable = true)
    protected DrugType outputDrugType;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString activeFacets;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer pageNumber;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer pageSize;

    /**
     * Obtient la valeur de la propriété patient.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatient() {
        return patient;
    }

    /**
     * Définit la valeur de la propriété patient.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatient(String value) {
        this.patient = value;
    }

    /**
     * Obtient la valeur de la propriété prescriptionLine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrescriptionLine() {
        return prescriptionLine;
    }

    /**
     * Définit la valeur de la propriété prescriptionLine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrescriptionLine(String value) {
        this.prescriptionLine = value;
    }

    /**
     * Obtient la valeur de la propriété outputDrugType.
     * 
     * @return
     *     possible object is
     *     {@link DrugType }
     *     
     */
    public DrugType getOutputDrugType() {
        return outputDrugType;
    }

    /**
     * Définit la valeur de la propriété outputDrugType.
     * 
     * @param value
     *     allowed object is
     *     {@link DrugType }
     *     
     */
    public void setOutputDrugType(DrugType value) {
        this.outputDrugType = value;
    }

    /**
     * Obtient la valeur de la propriété activeFacets.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getActiveFacets() {
        return activeFacets;
    }

    /**
     * Définit la valeur de la propriété activeFacets.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setActiveFacets(ArrayOfString value) {
        this.activeFacets = value;
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
