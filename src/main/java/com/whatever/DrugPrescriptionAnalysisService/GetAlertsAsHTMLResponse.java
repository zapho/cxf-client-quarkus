
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
 *         &lt;element name="alertsAsHTML" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "alertsAsHTML"
})
@XmlRootElement(name = "getAlertsAsHTMLResponse")
public class GetAlertsAsHTMLResponse {

    @XmlElement(required = true, nillable = true)
    protected String alertsAsHTML;

    /**
     * Obtient la valeur de la propriété alertsAsHTML.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertsAsHTML() {
        return alertsAsHTML;
    }

    /**
     * Définit la valeur de la propriété alertsAsHTML.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertsAsHTML(String value) {
        this.alertsAsHTML = value;
    }

}
