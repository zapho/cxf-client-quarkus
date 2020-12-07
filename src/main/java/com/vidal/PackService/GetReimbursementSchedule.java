
package com.vidal.PackService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="packIds" type="{urn:Vidal}ArrayOfInt"/>
 *         &lt;element name="reimbursementScheduleFilter" type="{urn:Vidal}ReimbursementScheduleFilter"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "packIds",
    "reimbursementScheduleFilter"
})
@XmlRootElement(name = "getReimbursementSchedule")
public class GetReimbursementSchedule {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt packIds;
    @XmlElement(required = true, nillable = true)
    protected ReimbursementScheduleFilter reimbursementScheduleFilter;

    /**
     * Obtient la valeur de la propriété packIds.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getPackIds() {
        return packIds;
    }

    /**
     * Définit la valeur de la propriété packIds.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setPackIds(ArrayOfInt value) {
        this.packIds = value;
    }

    /**
     * Obtient la valeur de la propriété reimbursementScheduleFilter.
     * 
     * @return
     *     possible object is
     *     {@link ReimbursementScheduleFilter }
     *     
     */
    public ReimbursementScheduleFilter getReimbursementScheduleFilter() {
        return reimbursementScheduleFilter;
    }

    /**
     * Définit la valeur de la propriété reimbursementScheduleFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link ReimbursementScheduleFilter }
     *     
     */
    public void setReimbursementScheduleFilter(ReimbursementScheduleFilter value) {
        this.reimbursementScheduleFilter = value;
    }

}
