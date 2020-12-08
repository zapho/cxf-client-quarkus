
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
 *         &lt;element name="patientFromObjToJsonUsingPathologyCodes" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "patientFromObjToJsonUsingPathologyCodes"
})
@XmlRootElement(name = "patientFromObjToJsonUsingPathologyCodesResponse")
public class PatientFromObjToJsonUsingPathologyCodesResponse {

    @XmlElement(required = true, nillable = true)
    protected String patientFromObjToJsonUsingPathologyCodes;

    /**
     * Obtient la valeur de la propriété patientFromObjToJsonUsingPathologyCodes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientFromObjToJsonUsingPathologyCodes() {
        return patientFromObjToJsonUsingPathologyCodes;
    }

    /**
     * Définit la valeur de la propriété patientFromObjToJsonUsingPathologyCodes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientFromObjToJsonUsingPathologyCodes(String value) {
        this.patientFromObjToJsonUsingPathologyCodes = value;
    }

}
