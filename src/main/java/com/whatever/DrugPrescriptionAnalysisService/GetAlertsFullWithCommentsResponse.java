
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
 *         &lt;element name="getAlertsFullWithComments" type="{urn:Vidal}prescriptionAnalysisFull"/>
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
    "getAlertsFullWithComments"
})
@XmlRootElement(name = "getAlertsFullWithCommentsResponse")
public class GetAlertsFullWithCommentsResponse {

    @XmlElement(required = true, nillable = true)
    protected PrescriptionAnalysisFull getAlertsFullWithComments;

    /**
     * Obtient la valeur de la propriété getAlertsFullWithComments.
     * 
     * @return
     *     possible object is
     *     {@link PrescriptionAnalysisFull }
     *     
     */
    public PrescriptionAnalysisFull getGetAlertsFullWithComments() {
        return getAlertsFullWithComments;
    }

    /**
     * Définit la valeur de la propriété getAlertsFullWithComments.
     * 
     * @param value
     *     allowed object is
     *     {@link PrescriptionAnalysisFull }
     *     
     */
    public void setGetAlertsFullWithComments(PrescriptionAnalysisFull value) {
        this.getAlertsFullWithComments = value;
    }

}
