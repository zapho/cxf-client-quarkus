
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
 *         &lt;element name="commonNameGroupAllergyCouples" type="{urn:Vidal}commonNameGroupAllergyCouples"/>
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
    "commonNameGroupAllergyCouples"
})
@XmlRootElement(name = "searchCommonNameGroupAllergyClassAlertsResponse")
public class SearchCommonNameGroupAllergyClassAlertsResponse {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroupAllergyCouples commonNameGroupAllergyCouples;

    /**
     * Obtient la valeur de la propriété commonNameGroupAllergyCouples.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroupAllergyCouples }
     *     
     */
    public CommonNameGroupAllergyCouples getCommonNameGroupAllergyCouples() {
        return commonNameGroupAllergyCouples;
    }

    /**
     * Définit la valeur de la propriété commonNameGroupAllergyCouples.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroupAllergyCouples }
     *     
     */
    public void setCommonNameGroupAllergyCouples(CommonNameGroupAllergyCouples value) {
        this.commonNameGroupAllergyCouples = value;
    }

}
