
package com.vidal.AllergyService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CommonNameGroupAllergyList complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CommonNameGroupAllergyList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allergies" type="{urn:Vidal}ArrayOfAllergy"/>
 *         &lt;element name="homogeneous" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonNameGroupAllergyList", propOrder = {
    "allergies",
    "homogeneous"
})
public class CommonNameGroupAllergyList {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfAllergy allergies;
    protected boolean homogeneous;

    /**
     * Obtient la valeur de la propriété allergies.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAllergy }
     *     
     */
    public ArrayOfAllergy getAllergies() {
        return allergies;
    }

    /**
     * Définit la valeur de la propriété allergies.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAllergy }
     *     
     */
    public void setAllergies(ArrayOfAllergy value) {
        this.allergies = value;
    }

    /**
     * Obtient la valeur de la propriété homogeneous.
     * 
     */
    public boolean isHomogeneous() {
        return homogeneous;
    }

    /**
     * Définit la valeur de la propriété homogeneous.
     * 
     */
    public void setHomogeneous(boolean value) {
        this.homogeneous = value;
    }

}
