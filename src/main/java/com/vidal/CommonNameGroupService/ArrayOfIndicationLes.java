
package com.vidal.CommonNameGroupService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfIndicationLes complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfIndicationLes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indicationLes" type="{urn:Vidal}indicationLes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIndicationLes", propOrder = {
    "indicationLes"
})
public class ArrayOfIndicationLes {

    @XmlElement(nillable = true)
    protected List<IndicationLes> indicationLes;

    /**
     * Gets the value of the indicationLes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indicationLes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndicationLes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndicationLes }
     * 
     * 
     */
    public List<IndicationLes> getIndicationLes() {
        if (indicationLes == null) {
            indicationLes = new ArrayList<IndicationLes>();
        }
        return this.indicationLes;
    }

}
