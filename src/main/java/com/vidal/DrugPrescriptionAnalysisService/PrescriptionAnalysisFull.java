
package com.vidal.DrugPrescriptionAnalysisService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour prescriptionAnalysisFull complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="prescriptionAnalysisFull">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="drugSummarizedAlertCouple" type="{http://prescriptionAnalysis.api.vidal.com}ArrayOfDrugSummarizedAlertCouple"/>
 *         &lt;element name="htmlAnalysis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prescriptionAnalysis" type="{urn:Vidal}prescriptionAnalysis"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prescriptionAnalysisFull", propOrder = {
    "drugSummarizedAlertCouple",
    "htmlAnalysis",
    "prescriptionAnalysis"
})
public class PrescriptionAnalysisFull {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfDrugSummarizedAlertCouple drugSummarizedAlertCouple;
    @XmlElement(required = true, nillable = true)
    protected String htmlAnalysis;
    @XmlElement(required = true, nillable = true)
    protected PrescriptionAnalysis prescriptionAnalysis;

    /**
     * Obtient la valeur de la propriété drugSummarizedAlertCouple.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDrugSummarizedAlertCouple }
     *     
     */
    public ArrayOfDrugSummarizedAlertCouple getDrugSummarizedAlertCouple() {
        return drugSummarizedAlertCouple;
    }

    /**
     * Définit la valeur de la propriété drugSummarizedAlertCouple.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDrugSummarizedAlertCouple }
     *     
     */
    public void setDrugSummarizedAlertCouple(ArrayOfDrugSummarizedAlertCouple value) {
        this.drugSummarizedAlertCouple = value;
    }

    /**
     * Obtient la valeur de la propriété htmlAnalysis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtmlAnalysis() {
        return htmlAnalysis;
    }

    /**
     * Définit la valeur de la propriété htmlAnalysis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtmlAnalysis(String value) {
        this.htmlAnalysis = value;
    }

    /**
     * Obtient la valeur de la propriété prescriptionAnalysis.
     * 
     * @return
     *     possible object is
     *     {@link PrescriptionAnalysis }
     *     
     */
    public PrescriptionAnalysis getPrescriptionAnalysis() {
        return prescriptionAnalysis;
    }

    /**
     * Définit la valeur de la propriété prescriptionAnalysis.
     * 
     * @param value
     *     allowed object is
     *     {@link PrescriptionAnalysis }
     *     
     */
    public void setPrescriptionAnalysis(PrescriptionAnalysis value) {
        this.prescriptionAnalysis = value;
    }

}
