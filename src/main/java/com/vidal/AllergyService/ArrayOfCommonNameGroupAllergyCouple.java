
package com.vidal.AllergyService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfCommonNameGroupAllergyCouple complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCommonNameGroupAllergyCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonNameGroupAllergyCouple" type="{urn:Vidal}commonNameGroupAllergyCouple" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCommonNameGroupAllergyCouple", propOrder = {
    "commonNameGroupAllergyCouple"
})
public class ArrayOfCommonNameGroupAllergyCouple {

    @XmlElement(nillable = true)
    protected List<CommonNameGroupAllergyCouple> commonNameGroupAllergyCouple;

    /**
     * Gets the value of the commonNameGroupAllergyCouple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commonNameGroupAllergyCouple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommonNameGroupAllergyCouple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommonNameGroupAllergyCouple }
     * 
     * 
     */
    public List<CommonNameGroupAllergyCouple> getCommonNameGroupAllergyCouple() {
        if (commonNameGroupAllergyCouple == null) {
            commonNameGroupAllergyCouple = new ArrayList<CommonNameGroupAllergyCouple>();
        }
        return this.commonNameGroupAllergyCouple;
    }

}
