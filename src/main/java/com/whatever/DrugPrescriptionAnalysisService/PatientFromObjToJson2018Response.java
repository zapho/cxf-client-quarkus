
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
 *         &lt;element name="patientFromObjToJson2018" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "patientFromObjToJson2018"
})
@XmlRootElement(name = "patientFromObjToJson2018Response")
public class PatientFromObjToJson2018Response {

    @XmlElement(required = true, nillable = true)
    protected String patientFromObjToJson2018;

    /**
     * Obtient la valeur de la propriété patientFromObjToJson2018.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientFromObjToJson2018() {
        return patientFromObjToJson2018;
    }

    /**
     * Définit la valeur de la propriété patientFromObjToJson2018.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientFromObjToJson2018(String value) {
        this.patientFromObjToJson2018 = value;
    }

}
