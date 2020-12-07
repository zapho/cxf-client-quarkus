
package com.vidal.DrugPrescriptionAnalysisService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfAllergyUnknownMoleculeAnalysis complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAllergyUnknownMoleculeAnalysis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allergyUnknownMoleculeAnalysis" type="{urn:Vidal}allergyUnknownMoleculeAnalysis" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAllergyUnknownMoleculeAnalysis", propOrder = {
    "allergyUnknownMoleculeAnalysis"
})
public class ArrayOfAllergyUnknownMoleculeAnalysis {

    @XmlElement(nillable = true)
    protected List<AllergyUnknownMoleculeAnalysis> allergyUnknownMoleculeAnalysis;

    /**
     * Gets the value of the allergyUnknownMoleculeAnalysis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allergyUnknownMoleculeAnalysis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllergyUnknownMoleculeAnalysis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllergyUnknownMoleculeAnalysis }
     * 
     * 
     */
    public List<AllergyUnknownMoleculeAnalysis> getAllergyUnknownMoleculeAnalysis() {
        if (allergyUnknownMoleculeAnalysis == null) {
            allergyUnknownMoleculeAnalysis = new ArrayList<AllergyUnknownMoleculeAnalysis>();
        }
        return this.allergyUnknownMoleculeAnalysis;
    }

}
