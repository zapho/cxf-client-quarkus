
package com.whatever.SearchDrugService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfFacetValue complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFacetValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="facetValue" type="{urn:Vidal}facetValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFacetValue", propOrder = {
    "facetValue"
})
public class ArrayOfFacetValue {

    @XmlElement(nillable = true)
    protected List<FacetValue> facetValue;

    /**
     * Gets the value of the facetValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facetValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacetValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacetValue }
     * 
     * 
     */
    public List<FacetValue> getFacetValue() {
        if (facetValue == null) {
            facetValue = new ArrayList<FacetValue>();
        }
        return this.facetValue;
    }

}
