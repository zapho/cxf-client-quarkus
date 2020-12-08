
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
 *         &lt;element name="patient" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prescriptionLineList" type="{urn:Vidal}ArrayOfString"/>
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
    "patient",
    "prescriptionLineList"
})
@XmlRootElement(name = "getAlertsAsHTML")
public class GetAlertsAsHTML {

    @XmlElement(required = true, nillable = true)
    protected String patient;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString prescriptionLineList;

    /**
     * Obtient la valeur de la propriété patient.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatient() {
        return patient;
    }

    /**
     * Définit la valeur de la propriété patient.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatient(String value) {
        this.patient = value;
    }

    /**
     * Obtient la valeur de la propriété prescriptionLineList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getPrescriptionLineList() {
        return prescriptionLineList;
    }

    /**
     * Définit la valeur de la propriété prescriptionLineList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setPrescriptionLineList(ArrayOfString value) {
        this.prescriptionLineList = value;
    }

}
