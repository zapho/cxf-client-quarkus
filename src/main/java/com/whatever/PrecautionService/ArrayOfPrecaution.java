
package com.whatever.PrecautionService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfPrecaution complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPrecaution">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="precaution" type="{urn:Vidal}precaution" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPrecaution", propOrder = {
    "precaution"
})
public class ArrayOfPrecaution {

    @XmlElement(nillable = true)
    protected List<Precaution> precaution;

    /**
     * Gets the value of the precaution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the precaution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrecaution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Precaution }
     * 
     * 
     */
    public List<Precaution> getPrecaution() {
        if (precaution == null) {
            precaution = new ArrayList<Precaution>();
        }
        return this.precaution;
    }

}
