
package com.whatever.ProductService;

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
 *         &lt;element name="safetyAlertStatus" type="{urn:Vidal}SafetyAlertStatus"/>
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
    "safetyAlertStatus"
})
@XmlRootElement(name = "hasCommonNameGroupSafetyAlertResponse")
public class HasCommonNameGroupSafetyAlertResponse {

    @XmlElement(required = true, nillable = true)
    protected SafetyAlertStatus safetyAlertStatus;

    /**
     * Obtient la valeur de la propriété safetyAlertStatus.
     * 
     * @return
     *     possible object is
     *     {@link SafetyAlertStatus }
     *     
     */
    public SafetyAlertStatus getSafetyAlertStatus() {
        return safetyAlertStatus;
    }

    /**
     * Définit la valeur de la propriété safetyAlertStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link SafetyAlertStatus }
     *     
     */
    public void setSafetyAlertStatus(SafetyAlertStatus value) {
        this.safetyAlertStatus = value;
    }

}
