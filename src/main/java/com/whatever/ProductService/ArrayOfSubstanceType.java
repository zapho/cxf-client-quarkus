
package com.whatever.ProductService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfSubstanceType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSubstanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubstanceType" type="{urn:Vidal}SubstanceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSubstanceType", propOrder = {
    "substanceType"
})
public class ArrayOfSubstanceType {

    @XmlElement(name = "SubstanceType", nillable = true)
    protected List<SubstanceType> substanceType;

    /**
     * Gets the value of the substanceType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the substanceType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubstanceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubstanceType }
     * 
     * 
     */
    public List<SubstanceType> getSubstanceType() {
        if (substanceType == null) {
            substanceType = new ArrayList<SubstanceType>();
        }
        return this.substanceType;
    }

}
