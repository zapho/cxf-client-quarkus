
package com.whatever.LpprService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfLpprReimbursementScheduleItem complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLpprReimbursementScheduleItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lpprReimbursementScheduleItem" type="{urn:Vidal}lpprReimbursementScheduleItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLpprReimbursementScheduleItem", propOrder = {
    "lpprReimbursementScheduleItem"
})
public class ArrayOfLpprReimbursementScheduleItem {

    @XmlElement(nillable = true)
    protected List<LpprReimbursementScheduleItem> lpprReimbursementScheduleItem;

    /**
     * Gets the value of the lpprReimbursementScheduleItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lpprReimbursementScheduleItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLpprReimbursementScheduleItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LpprReimbursementScheduleItem }
     * 
     * 
     */
    public List<LpprReimbursementScheduleItem> getLpprReimbursementScheduleItem() {
        if (lpprReimbursementScheduleItem == null) {
            lpprReimbursementScheduleItem = new ArrayList<LpprReimbursementScheduleItem>();
        }
        return this.lpprReimbursementScheduleItem;
    }

}
