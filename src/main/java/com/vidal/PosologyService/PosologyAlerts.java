
package com.vidal.PosologyService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PosologyAlerts complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PosologyAlerts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alerts" type="{urn:Vidal}ArrayOfSimplePosologyAlert"/>
 *         &lt;element name="missingParamaterMessage" type="{http://utils.api.vidal.com}ArrayOfMessage"/>
 *         &lt;element name="posologyText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PosologyAlerts", propOrder = {
    "alerts",
    "missingParamaterMessage",
    "posologyText"
})
public class PosologyAlerts {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfSimplePosologyAlert alerts;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfMessage missingParamaterMessage;
    @XmlElement(required = true, nillable = true)
    protected String posologyText;

    /**
     * Obtient la valeur de la propriété alerts.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSimplePosologyAlert }
     *     
     */
    public ArrayOfSimplePosologyAlert getAlerts() {
        return alerts;
    }

    /**
     * Définit la valeur de la propriété alerts.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSimplePosologyAlert }
     *     
     */
    public void setAlerts(ArrayOfSimplePosologyAlert value) {
        this.alerts = value;
    }

    /**
     * Obtient la valeur de la propriété missingParamaterMessage.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMessage }
     *     
     */
    public ArrayOfMessage getMissingParamaterMessage() {
        return missingParamaterMessage;
    }

    /**
     * Définit la valeur de la propriété missingParamaterMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMessage }
     *     
     */
    public void setMissingParamaterMessage(ArrayOfMessage value) {
        this.missingParamaterMessage = value;
    }

    /**
     * Obtient la valeur de la propriété posologyText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosologyText() {
        return posologyText;
    }

    /**
     * Définit la valeur de la propriété posologyText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosologyText(String value) {
        this.posologyText = value;
    }

}
