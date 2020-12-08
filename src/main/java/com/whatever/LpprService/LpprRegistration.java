
package com.whatever.LpprService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour lpprRegistration complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="lpprRegistration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lpprExpiryDate" type="{urn:Vidal}lpprExpiryDate"/>
 *         &lt;element name="lpprRegistrationDate" type="{urn:Vidal}lpprRegistrationDate"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lpprRegistration", propOrder = {
    "lpprExpiryDate",
    "lpprRegistrationDate"
})
public class LpprRegistration {

    @XmlElement(required = true, nillable = true)
    protected LpprExpiryDate lpprExpiryDate;
    @XmlElement(required = true, nillable = true)
    protected LpprRegistrationDate lpprRegistrationDate;

    /**
     * Obtient la valeur de la propriété lpprExpiryDate.
     * 
     * @return
     *     possible object is
     *     {@link LpprExpiryDate }
     *     
     */
    public LpprExpiryDate getLpprExpiryDate() {
        return lpprExpiryDate;
    }

    /**
     * Définit la valeur de la propriété lpprExpiryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link LpprExpiryDate }
     *     
     */
    public void setLpprExpiryDate(LpprExpiryDate value) {
        this.lpprExpiryDate = value;
    }

    /**
     * Obtient la valeur de la propriété lpprRegistrationDate.
     * 
     * @return
     *     possible object is
     *     {@link LpprRegistrationDate }
     *     
     */
    public LpprRegistrationDate getLpprRegistrationDate() {
        return lpprRegistrationDate;
    }

    /**
     * Définit la valeur de la propriété lpprRegistrationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link LpprRegistrationDate }
     *     
     */
    public void setLpprRegistrationDate(LpprRegistrationDate value) {
        this.lpprRegistrationDate = value;
    }

}
