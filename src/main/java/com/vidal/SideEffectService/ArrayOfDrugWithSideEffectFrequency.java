
package com.vidal.SideEffectService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfDrugWithSideEffectFrequency complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDrugWithSideEffectFrequency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="drugWithSideEffectFrequency" type="{urn:Vidal}drugWithSideEffectFrequency" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDrugWithSideEffectFrequency", propOrder = {
    "drugWithSideEffectFrequency"
})
public class ArrayOfDrugWithSideEffectFrequency {

    @XmlElement(nillable = true)
    protected List<DrugWithSideEffectFrequency> drugWithSideEffectFrequency;

    /**
     * Gets the value of the drugWithSideEffectFrequency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drugWithSideEffectFrequency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrugWithSideEffectFrequency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DrugWithSideEffectFrequency }
     * 
     * 
     */
    public List<DrugWithSideEffectFrequency> getDrugWithSideEffectFrequency() {
        if (drugWithSideEffectFrequency == null) {
            drugWithSideEffectFrequency = new ArrayList<DrugWithSideEffectFrequency>();
        }
        return this.drugWithSideEffectFrequency;
    }

}
