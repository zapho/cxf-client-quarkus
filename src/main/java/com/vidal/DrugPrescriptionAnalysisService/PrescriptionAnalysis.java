
package com.vidal.DrugPrescriptionAnalysisService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour prescriptionAnalysis complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="prescriptionAnalysis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="patientAnalysis" type="{urn:Vidal}patientAnalysis"/>
 *         &lt;element name="prescriptionLineAnalysisList" type="{urn:Vidal}ArrayOfPrescriptionLineAnalysis"/>
 *         &lt;element name="unknownMoleculeAnalysises" type="{urn:Vidal}ArrayOfAllergyUnknownMoleculeAnalysis"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prescriptionAnalysis", propOrder = {
    "patientAnalysis",
    "prescriptionLineAnalysisList",
    "unknownMoleculeAnalysises"
})
public class PrescriptionAnalysis {

    @XmlElement(required = true, nillable = true)
    protected PatientAnalysis patientAnalysis;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPrescriptionLineAnalysis prescriptionLineAnalysisList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfAllergyUnknownMoleculeAnalysis unknownMoleculeAnalysises;

    /**
     * Obtient la valeur de la propriété patientAnalysis.
     * 
     * @return
     *     possible object is
     *     {@link PatientAnalysis }
     *     
     */
    public PatientAnalysis getPatientAnalysis() {
        return patientAnalysis;
    }

    /**
     * Définit la valeur de la propriété patientAnalysis.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientAnalysis }
     *     
     */
    public void setPatientAnalysis(PatientAnalysis value) {
        this.patientAnalysis = value;
    }

    /**
     * Obtient la valeur de la propriété prescriptionLineAnalysisList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPrescriptionLineAnalysis }
     *     
     */
    public ArrayOfPrescriptionLineAnalysis getPrescriptionLineAnalysisList() {
        return prescriptionLineAnalysisList;
    }

    /**
     * Définit la valeur de la propriété prescriptionLineAnalysisList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrescriptionLineAnalysis }
     *     
     */
    public void setPrescriptionLineAnalysisList(ArrayOfPrescriptionLineAnalysis value) {
        this.prescriptionLineAnalysisList = value;
    }

    /**
     * Obtient la valeur de la propriété unknownMoleculeAnalysises.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAllergyUnknownMoleculeAnalysis }
     *     
     */
    public ArrayOfAllergyUnknownMoleculeAnalysis getUnknownMoleculeAnalysises() {
        return unknownMoleculeAnalysises;
    }

    /**
     * Définit la valeur de la propriété unknownMoleculeAnalysises.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAllergyUnknownMoleculeAnalysis }
     *     
     */
    public void setUnknownMoleculeAnalysises(ArrayOfAllergyUnknownMoleculeAnalysis value) {
        this.unknownMoleculeAnalysises = value;
    }

}
