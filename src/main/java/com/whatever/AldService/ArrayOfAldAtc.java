
package com.whatever.AldService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfAldAtc complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAldAtc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aldAtc" type="{urn:Vidal}aldAtc" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAldAtc", propOrder = {
    "aldAtc"
})
public class ArrayOfAldAtc {

    @XmlElement(nillable = true)
    protected List<AldAtc> aldAtc;

    /**
     * Gets the value of the aldAtc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aldAtc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAldAtc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AldAtc }
     * 
     * 
     */
    public List<AldAtc> getAldAtc() {
        if (aldAtc == null) {
            aldAtc = new ArrayList<AldAtc>();
        }
        return this.aldAtc;
    }

}
