
package com.whatever.LpprService;

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
 *         &lt;element name="lpprReimbursementCoupleList" type="{urn:Vidal}ArrayOfLpprReimbursementCouple"/>
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
    "lpprReimbursementCoupleList"
})
@XmlRootElement(name = "getReimbursementScheduleResponse")
public class GetReimbursementScheduleResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfLpprReimbursementCouple lpprReimbursementCoupleList;

    /**
     * Obtient la valeur de la propriété lpprReimbursementCoupleList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLpprReimbursementCouple }
     *     
     */
    public ArrayOfLpprReimbursementCouple getLpprReimbursementCoupleList() {
        return lpprReimbursementCoupleList;
    }

    /**
     * Définit la valeur de la propriété lpprReimbursementCoupleList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLpprReimbursementCouple }
     *     
     */
    public void setLpprReimbursementCoupleList(ArrayOfLpprReimbursementCouple value) {
        this.lpprReimbursementCoupleList = value;
    }

}
