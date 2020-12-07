
package com.vidal.DrugPrescriptionAnalysisService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour patientAnalysis complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="patientAnalysis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alertList" type="{urn:Vidal}ArrayOfAlert"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "patientAnalysis", propOrder = {
    "alertList"
})
public class PatientAnalysis {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfAlert alertList;

    /**
     * Obtient la valeur de la propriété alertList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAlert }
     *     
     */
    public ArrayOfAlert getAlertList() {
        return alertList;
    }

    /**
     * Définit la valeur de la propriété alertList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAlert }
     *     
     */
    public void setAlertList(ArrayOfAlert value) {
        this.alertList = value;
    }

}
