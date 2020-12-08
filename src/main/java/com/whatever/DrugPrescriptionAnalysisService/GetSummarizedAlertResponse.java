
package com.whatever.DrugPrescriptionAnalysisService;

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
 *         &lt;element name="summarizedAlert" type="{http://prescriptionAnalysis.api.vidal.com}ArrayOfDrugSummarizedAlertCouple"/>
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
    "summarizedAlert"
})
@XmlRootElement(name = "getSummarizedAlertResponse")
public class GetSummarizedAlertResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfDrugSummarizedAlertCouple summarizedAlert;

    /**
     * Obtient la valeur de la propriété summarizedAlert.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDrugSummarizedAlertCouple }
     *     
     */
    public ArrayOfDrugSummarizedAlertCouple getSummarizedAlert() {
        return summarizedAlert;
    }

    /**
     * Définit la valeur de la propriété summarizedAlert.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDrugSummarizedAlertCouple }
     *     
     */
    public void setSummarizedAlert(ArrayOfDrugSummarizedAlertCouple value) {
        this.summarizedAlert = value;
    }

}
