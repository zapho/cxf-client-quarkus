
package com.vidal.AllergyService;

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
 *         &lt;element name="productAllergyCoupleList" type="{urn:Vidal}ArrayOfProductAllergyCouple"/>
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
    "productAllergyCoupleList"
})
@XmlRootElement(name = "getAlertsOnAllergiesClassResponse")
public class GetAlertsOnAllergiesClassResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfProductAllergyCouple productAllergyCoupleList;

    /**
     * Obtient la valeur de la propriété productAllergyCoupleList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductAllergyCouple }
     *     
     */
    public ArrayOfProductAllergyCouple getProductAllergyCoupleList() {
        return productAllergyCoupleList;
    }

    /**
     * Définit la valeur de la propriété productAllergyCoupleList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductAllergyCouple }
     *     
     */
    public void setProductAllergyCoupleList(ArrayOfProductAllergyCouple value) {
        this.productAllergyCoupleList = value;
    }

}
