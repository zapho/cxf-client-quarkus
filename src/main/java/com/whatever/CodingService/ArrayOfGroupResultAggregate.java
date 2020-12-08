
package com.whatever.CodingService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfGroupResultAggregate complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGroupResultAggregate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GroupResultAggregate" type="{urn:Vidal}GroupResultAggregate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGroupResultAggregate", propOrder = {
    "groupResultAggregate"
})
public class ArrayOfGroupResultAggregate {

    @XmlElement(name = "GroupResultAggregate", nillable = true)
    protected List<GroupResultAggregate> groupResultAggregate;

    /**
     * Gets the value of the groupResultAggregate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupResultAggregate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupResultAggregate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupResultAggregate }
     * 
     * 
     */
    public List<GroupResultAggregate> getGroupResultAggregate() {
        if (groupResultAggregate == null) {
            groupResultAggregate = new ArrayList<GroupResultAggregate>();
        }
        return this.groupResultAggregate;
    }

}
