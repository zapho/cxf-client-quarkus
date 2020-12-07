
package com.vidal.DrugPrescriptionAnalysisService;

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
 *         &lt;element name="prescriptionCostAnalysis" type="{urn:Vidal}prescriptionCostAnalysis"/>
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
    "prescriptionCostAnalysis"
})
@XmlRootElement(name = "getPrescriptionCostAnalysisResponse")
public class GetPrescriptionCostAnalysisResponse {

    @XmlElement(required = true, nillable = true)
    protected PrescriptionCostAnalysis prescriptionCostAnalysis;

    /**
     * Obtient la valeur de la propriété prescriptionCostAnalysis.
     * 
     * @return
     *     possible object is
     *     {@link PrescriptionCostAnalysis }
     *     
     */
    public PrescriptionCostAnalysis getPrescriptionCostAnalysis() {
        return prescriptionCostAnalysis;
    }

    /**
     * Définit la valeur de la propriété prescriptionCostAnalysis.
     * 
     * @param value
     *     allowed object is
     *     {@link PrescriptionCostAnalysis }
     *     
     */
    public void setPrescriptionCostAnalysis(PrescriptionCostAnalysis value) {
        this.prescriptionCostAnalysis = value;
    }

}
