
package com.vidal.IndicationService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfIndicationType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfIndicationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IndicationType" type="{urn:Vidal}IndicationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIndicationType", propOrder = {
    "indicationType"
})
public class ArrayOfIndicationType {

    @XmlElement(name = "IndicationType", nillable = true)
    protected List<IndicationType> indicationType;

    /**
     * Gets the value of the indicationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indicationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndicationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndicationType }
     * 
     * 
     */
    public List<IndicationType> getIndicationType() {
        if (indicationType == null) {
            indicationType = new ArrayList<IndicationType>();
        }
        return this.indicationType;
    }

}
