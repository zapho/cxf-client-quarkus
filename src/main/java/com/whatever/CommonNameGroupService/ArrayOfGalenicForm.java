
package com.whatever.CommonNameGroupService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfGalenicForm complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGalenicForm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GalenicForm" type="{urn:Vidal}GalenicForm" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGalenicForm", propOrder = {
    "galenicForm"
})
public class ArrayOfGalenicForm {

    @XmlElement(name = "GalenicForm", nillable = true)
    protected List<GalenicForm> galenicForm;

    /**
     * Gets the value of the galenicForm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the galenicForm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGalenicForm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GalenicForm }
     * 
     * 
     */
    public List<GalenicForm> getGalenicForm() {
        if (galenicForm == null) {
            galenicForm = new ArrayList<GalenicForm>();
        }
        return this.galenicForm;
    }

}
