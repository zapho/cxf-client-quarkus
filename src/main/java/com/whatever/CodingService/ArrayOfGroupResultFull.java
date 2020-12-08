
package com.whatever.CodingService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfGroupResultFull complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGroupResultFull">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GroupResultFull" type="{urn:Vidal}GroupResultFull" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGroupResultFull", propOrder = {
    "groupResultFull"
})
public class ArrayOfGroupResultFull {

    @XmlElement(name = "GroupResultFull", nillable = true)
    protected List<GroupResultFull> groupResultFull;

    /**
     * Gets the value of the groupResultFull property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupResultFull property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupResultFull().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupResultFull }
     * 
     * 
     */
    public List<GroupResultFull> getGroupResultFull() {
        if (groupResultFull == null) {
            groupResultFull = new ArrayList<GroupResultFull>();
        }
        return this.groupResultFull;
    }

}
