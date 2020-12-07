
package com.vidal.CommonNameGroupService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfRestrictedPrescription complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRestrictedPrescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="restrictedPrescription" type="{urn:Vidal}restrictedPrescription" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRestrictedPrescription", propOrder = {
    "restrictedPrescription"
})
public class ArrayOfRestrictedPrescription {

    @XmlElement(nillable = true)
    protected List<RestrictedPrescription> restrictedPrescription;

    /**
     * Gets the value of the restrictedPrescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restrictedPrescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestrictedPrescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RestrictedPrescription }
     * 
     * 
     */
    public List<RestrictedPrescription> getRestrictedPrescription() {
        if (restrictedPrescription == null) {
            restrictedPrescription = new ArrayList<RestrictedPrescription>();
        }
        return this.restrictedPrescription;
    }

}
