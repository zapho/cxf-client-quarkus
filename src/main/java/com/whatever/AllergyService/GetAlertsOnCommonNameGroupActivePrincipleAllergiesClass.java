
package com.whatever.AllergyService;

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
 *         &lt;element name="commonNameGroupIds" type="{urn:Vidal}ArrayOfInt"/>
 *         &lt;element name="allergyIds" type="{urn:Vidal}ArrayOfInt"/>
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
    "commonNameGroupIds",
    "allergyIds"
})
@XmlRootElement(name = "getAlertsOnCommonNameGroupActivePrincipleAllergiesClass")
public class GetAlertsOnCommonNameGroupActivePrincipleAllergiesClass {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt commonNameGroupIds;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt allergyIds;

    /**
     * Obtient la valeur de la propriété commonNameGroupIds.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getCommonNameGroupIds() {
        return commonNameGroupIds;
    }

    /**
     * Définit la valeur de la propriété commonNameGroupIds.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setCommonNameGroupIds(ArrayOfInt value) {
        this.commonNameGroupIds = value;
    }

    /**
     * Obtient la valeur de la propriété allergyIds.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getAllergyIds() {
        return allergyIds;
    }

    /**
     * Définit la valeur de la propriété allergyIds.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setAllergyIds(ArrayOfInt value) {
        this.allergyIds = value;
    }

}
