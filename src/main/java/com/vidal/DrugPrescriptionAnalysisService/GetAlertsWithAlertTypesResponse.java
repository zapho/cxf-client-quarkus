
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
 *         &lt;element name="getAlertsWithAlertTypes" type="{urn:Vidal}prescriptionAnalysis"/>
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
    "getAlertsWithAlertTypes"
})
@XmlRootElement(name = "getAlertsWithAlertTypesResponse")
public class GetAlertsWithAlertTypesResponse {

    @XmlElement(required = true, nillable = true)
    protected PrescriptionAnalysis getAlertsWithAlertTypes;

    /**
     * Obtient la valeur de la propriété getAlertsWithAlertTypes.
     * 
     * @return
     *     possible object is
     *     {@link PrescriptionAnalysis }
     *     
     */
    public PrescriptionAnalysis getGetAlertsWithAlertTypes() {
        return getAlertsWithAlertTypes;
    }

    /**
     * Définit la valeur de la propriété getAlertsWithAlertTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link PrescriptionAnalysis }
     *     
     */
    public void setGetAlertsWithAlertTypes(PrescriptionAnalysis value) {
        this.getAlertsWithAlertTypes = value;
    }

}
