
package com.vidal.PackService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour packageReimbursementCouple complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="packageReimbursementCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pack" type="{urn:Vidal}pack"/>
 *         &lt;element name="priceScheduleItemList" type="{urn:Vidal}ArrayOfPackagePriceScheduleItem"/>
 *         &lt;element name="reimbursementScheduleItemList" type="{urn:Vidal}ArrayOfPackageReimbursementScheduleItem"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "packageReimbursementCouple", propOrder = {
    "pack",
    "priceScheduleItemList",
    "reimbursementScheduleItemList"
})
public class PackageReimbursementCouple {

    @XmlElement(required = true, nillable = true)
    protected Pack pack;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPackagePriceScheduleItem priceScheduleItemList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPackageReimbursementScheduleItem reimbursementScheduleItemList;

    /**
     * Obtient la valeur de la propriété pack.
     * 
     * @return
     *     possible object is
     *     {@link Pack }
     *     
     */
    public Pack getPack() {
        return pack;
    }

    /**
     * Définit la valeur de la propriété pack.
     * 
     * @param value
     *     allowed object is
     *     {@link Pack }
     *     
     */
    public void setPack(Pack value) {
        this.pack = value;
    }

    /**
     * Obtient la valeur de la propriété priceScheduleItemList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPackagePriceScheduleItem }
     *     
     */
    public ArrayOfPackagePriceScheduleItem getPriceScheduleItemList() {
        return priceScheduleItemList;
    }

    /**
     * Définit la valeur de la propriété priceScheduleItemList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPackagePriceScheduleItem }
     *     
     */
    public void setPriceScheduleItemList(ArrayOfPackagePriceScheduleItem value) {
        this.priceScheduleItemList = value;
    }

    /**
     * Obtient la valeur de la propriété reimbursementScheduleItemList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPackageReimbursementScheduleItem }
     *     
     */
    public ArrayOfPackageReimbursementScheduleItem getReimbursementScheduleItemList() {
        return reimbursementScheduleItemList;
    }

    /**
     * Définit la valeur de la propriété reimbursementScheduleItemList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPackageReimbursementScheduleItem }
     *     
     */
    public void setReimbursementScheduleItemList(ArrayOfPackageReimbursementScheduleItem value) {
        this.reimbursementScheduleItemList = value;
    }

}
