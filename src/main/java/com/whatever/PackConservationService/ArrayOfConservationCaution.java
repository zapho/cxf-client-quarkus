
package com.whatever.PackConservationService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfConservationCaution complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfConservationCaution">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conservationCaution" type="{urn:Vidal}conservationCaution" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfConservationCaution", propOrder = {
    "conservationCaution"
})
public class ArrayOfConservationCaution {

    @XmlElement(nillable = true)
    protected List<ConservationCaution> conservationCaution;

    /**
     * Gets the value of the conservationCaution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conservationCaution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConservationCaution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConservationCaution }
     * 
     * 
     */
    public List<ConservationCaution> getConservationCaution() {
        if (conservationCaution == null) {
            conservationCaution = new ArrayList<ConservationCaution>();
        }
        return this.conservationCaution;
    }

}
