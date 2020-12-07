
package com.vidal.LpprService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour lpprReimbursementCouple complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="lpprReimbursementCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lppr" type="{urn:Vidal}lppr"/>
 *         &lt;element name="lpprRegistration" type="{urn:Vidal}lpprRegistration"/>
 *         &lt;element name="lpprReimbursementScheduleItemList" type="{urn:Vidal}ArrayOfLpprReimbursementScheduleItem"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lpprReimbursementCouple", propOrder = {
    "lppr",
    "lpprRegistration",
    "lpprReimbursementScheduleItemList"
})
public class LpprReimbursementCouple {

    @XmlElement(required = true, nillable = true)
    protected Lppr lppr;
    @XmlElement(required = true, nillable = true)
    protected LpprRegistration lpprRegistration;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfLpprReimbursementScheduleItem lpprReimbursementScheduleItemList;

    /**
     * Obtient la valeur de la propriété lppr.
     * 
     * @return
     *     possible object is
     *     {@link Lppr }
     *     
     */
    public Lppr getLppr() {
        return lppr;
    }

    /**
     * Définit la valeur de la propriété lppr.
     * 
     * @param value
     *     allowed object is
     *     {@link Lppr }
     *     
     */
    public void setLppr(Lppr value) {
        this.lppr = value;
    }

    /**
     * Obtient la valeur de la propriété lpprRegistration.
     * 
     * @return
     *     possible object is
     *     {@link LpprRegistration }
     *     
     */
    public LpprRegistration getLpprRegistration() {
        return lpprRegistration;
    }

    /**
     * Définit la valeur de la propriété lpprRegistration.
     * 
     * @param value
     *     allowed object is
     *     {@link LpprRegistration }
     *     
     */
    public void setLpprRegistration(LpprRegistration value) {
        this.lpprRegistration = value;
    }

    /**
     * Obtient la valeur de la propriété lpprReimbursementScheduleItemList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLpprReimbursementScheduleItem }
     *     
     */
    public ArrayOfLpprReimbursementScheduleItem getLpprReimbursementScheduleItemList() {
        return lpprReimbursementScheduleItemList;
    }

    /**
     * Définit la valeur de la propriété lpprReimbursementScheduleItemList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLpprReimbursementScheduleItem }
     *     
     */
    public void setLpprReimbursementScheduleItemList(ArrayOfLpprReimbursementScheduleItem value) {
        this.lpprReimbursementScheduleItemList = value;
    }

}
