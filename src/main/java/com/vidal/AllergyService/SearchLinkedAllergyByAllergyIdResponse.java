
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
 *         &lt;element name="allergyList" type="{urn:Vidal}ArrayOfAllergy"/>
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
    "allergyList"
})
@XmlRootElement(name = "searchLinkedAllergyByAllergyIdResponse")
public class SearchLinkedAllergyByAllergyIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfAllergy allergyList;

    /**
     * Obtient la valeur de la propriété allergyList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAllergy }
     *     
     */
    public ArrayOfAllergy getAllergyList() {
        return allergyList;
    }

    /**
     * Définit la valeur de la propriété allergyList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAllergy }
     *     
     */
    public void setAllergyList(ArrayOfAllergy value) {
        this.allergyList = value;
    }

}
