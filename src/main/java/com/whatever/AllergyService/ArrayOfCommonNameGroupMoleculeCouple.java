
package com.whatever.AllergyService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfCommonNameGroupMoleculeCouple complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCommonNameGroupMoleculeCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonNameGroupMoleculeCouple" type="{urn:Vidal}commonNameGroupMoleculeCouple" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCommonNameGroupMoleculeCouple", propOrder = {
    "commonNameGroupMoleculeCouple"
})
public class ArrayOfCommonNameGroupMoleculeCouple {

    @XmlElement(nillable = true)
    protected List<CommonNameGroupMoleculeCouple> commonNameGroupMoleculeCouple;

    /**
     * Gets the value of the commonNameGroupMoleculeCouple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commonNameGroupMoleculeCouple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommonNameGroupMoleculeCouple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommonNameGroupMoleculeCouple }
     * 
     * 
     */
    public List<CommonNameGroupMoleculeCouple> getCommonNameGroupMoleculeCouple() {
        if (commonNameGroupMoleculeCouple == null) {
            commonNameGroupMoleculeCouple = new ArrayList<CommonNameGroupMoleculeCouple>();
        }
        return this.commonNameGroupMoleculeCouple;
    }

}
