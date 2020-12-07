
package com.vidal.DrugPrescriptionAnalysisService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DrugSummarizedAlertCouple complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DrugSummarizedAlertCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="summarizedAlert" type="{urn:Vidal}summarizedAlert"/>
 *         &lt;element name="summarizedDrug" type="{urn:Vidal}summarizedDrug"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DrugSummarizedAlertCouple", namespace = "http://prescriptionAnalysis.api.vidal.com", propOrder = {
    "summarizedAlert",
    "summarizedDrug"
})
public class DrugSummarizedAlertCouple {

    @XmlElement(required = true, nillable = true)
    protected SummarizedAlert summarizedAlert;
    @XmlElement(required = true, nillable = true)
    protected SummarizedDrug summarizedDrug;

    /**
     * Obtient la valeur de la propriété summarizedAlert.
     * 
     * @return
     *     possible object is
     *     {@link SummarizedAlert }
     *     
     */
    public SummarizedAlert getSummarizedAlert() {
        return summarizedAlert;
    }

    /**
     * Définit la valeur de la propriété summarizedAlert.
     * 
     * @param value
     *     allowed object is
     *     {@link SummarizedAlert }
     *     
     */
    public void setSummarizedAlert(SummarizedAlert value) {
        this.summarizedAlert = value;
    }

    /**
     * Obtient la valeur de la propriété summarizedDrug.
     * 
     * @return
     *     possible object is
     *     {@link SummarizedDrug }
     *     
     */
    public SummarizedDrug getSummarizedDrug() {
        return summarizedDrug;
    }

    /**
     * Définit la valeur de la propriété summarizedDrug.
     * 
     * @param value
     *     allowed object is
     *     {@link SummarizedDrug }
     *     
     */
    public void setSummarizedDrug(SummarizedDrug value) {
        this.summarizedDrug = value;
    }

}
