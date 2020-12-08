
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
 *         &lt;element name="commonNameGroupAllergyCoupleList" type="{urn:Vidal}ArrayOfCommonNameGroupAllergyCouple"/>
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
    "commonNameGroupAllergyCoupleList"
})
@XmlRootElement(name = "getAlertsOnCommonNameGroupActivePrincipleAllergiesClassResponse")
public class GetAlertsOnCommonNameGroupActivePrincipleAllergiesClassResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroupAllergyCouple commonNameGroupAllergyCoupleList;

    /**
     * Obtient la valeur de la propriété commonNameGroupAllergyCoupleList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroupAllergyCouple }
     *     
     */
    public ArrayOfCommonNameGroupAllergyCouple getCommonNameGroupAllergyCoupleList() {
        return commonNameGroupAllergyCoupleList;
    }

    /**
     * Définit la valeur de la propriété commonNameGroupAllergyCoupleList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroupAllergyCouple }
     *     
     */
    public void setCommonNameGroupAllergyCoupleList(ArrayOfCommonNameGroupAllergyCouple value) {
        this.commonNameGroupAllergyCoupleList = value;
    }

}
