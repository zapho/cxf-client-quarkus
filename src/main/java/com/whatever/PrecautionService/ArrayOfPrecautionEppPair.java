
package com.whatever.PrecautionService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfPrecautionEppPair complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPrecautionEppPair">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="precautionEppPair" type="{urn:Vidal}precautionEppPair" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPrecautionEppPair", propOrder = {
    "precautionEppPair"
})
public class ArrayOfPrecautionEppPair {

    @XmlElement(nillable = true)
    protected List<PrecautionEppPair> precautionEppPair;

    /**
     * Gets the value of the precautionEppPair property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the precautionEppPair property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrecautionEppPair().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrecautionEppPair }
     * 
     * 
     */
    public List<PrecautionEppPair> getPrecautionEppPair() {
        if (precautionEppPair == null) {
            precautionEppPair = new ArrayList<PrecautionEppPair>();
        }
        return this.precautionEppPair;
    }

}
