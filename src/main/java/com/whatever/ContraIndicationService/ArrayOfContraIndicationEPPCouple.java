
package com.whatever.ContraIndicationService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfContraIndicationEPPCouple complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfContraIndicationEPPCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contraIndicationEPPCouple" type="{urn:Vidal}contraIndicationEPPCouple" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfContraIndicationEPPCouple", propOrder = {
    "contraIndicationEPPCouple"
})
public class ArrayOfContraIndicationEPPCouple {

    @XmlElement(nillable = true)
    protected List<ContraIndicationEPPCouple> contraIndicationEPPCouple;

    /**
     * Gets the value of the contraIndicationEPPCouple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contraIndicationEPPCouple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContraIndicationEPPCouple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContraIndicationEPPCouple }
     * 
     * 
     */
    public List<ContraIndicationEPPCouple> getContraIndicationEPPCouple() {
        if (contraIndicationEPPCouple == null) {
            contraIndicationEPPCouple = new ArrayList<ContraIndicationEPPCouple>();
        }
        return this.contraIndicationEPPCouple;
    }

}
