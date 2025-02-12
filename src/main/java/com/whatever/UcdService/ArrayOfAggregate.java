
package com.whatever.UcdService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfAggregate complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAggregate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Aggregate" type="{urn:Vidal}Aggregate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAggregate", propOrder = {
    "aggregate"
})
public class ArrayOfAggregate {

    @XmlElement(name = "Aggregate", nillable = true)
    protected List<Aggregate> aggregate;

    /**
     * Gets the value of the aggregate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aggregate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAggregate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Aggregate }
     * 
     * 
     */
    public List<Aggregate> getAggregate() {
        if (aggregate == null) {
            aggregate = new ArrayList<Aggregate>();
        }
        return this.aggregate;
    }

}
