
package com.vidal.ProductService;

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
 *         &lt;element name="prescriptionMode" type="{urn:Vidal}PrescriptionMode"/>
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
    "prescriptionMode"
})
@XmlRootElement(name = "getPrescriptionModeResponse")
public class GetPrescriptionModeResponse {

    @XmlElement(required = true, nillable = true)
    protected PrescriptionMode prescriptionMode;

    /**
     * Obtient la valeur de la propriété prescriptionMode.
     * 
     * @return
     *     possible object is
     *     {@link PrescriptionMode }
     *     
     */
    public PrescriptionMode getPrescriptionMode() {
        return prescriptionMode;
    }

    /**
     * Définit la valeur de la propriété prescriptionMode.
     * 
     * @param value
     *     allowed object is
     *     {@link PrescriptionMode }
     *     
     */
    public void setPrescriptionMode(PrescriptionMode value) {
        this.prescriptionMode = value;
    }

}
