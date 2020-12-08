
package com.whatever.LpprService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour lpprReimbursementScheduleItem complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="lpprReimbursementScheduleItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reference" type="{urn:Vidal}reference"/>
 *         &lt;element name="refundBase" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="salePriceLimit" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="transferPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lpprReimbursementScheduleItem", propOrder = {
    "reference",
    "refundBase",
    "salePriceLimit",
    "startDate",
    "transferPrice"
})
public class LpprReimbursementScheduleItem {

    @XmlElement(required = true, nillable = true)
    protected Reference reference;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float refundBase;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float salePriceLimit;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float transferPrice;

    /**
     * Obtient la valeur de la propriété reference.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getReference() {
        return reference;
    }

    /**
     * Définit la valeur de la propriété reference.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setReference(Reference value) {
        this.reference = value;
    }

    /**
     * Obtient la valeur de la propriété refundBase.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRefundBase() {
        return refundBase;
    }

    /**
     * Définit la valeur de la propriété refundBase.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRefundBase(Float value) {
        this.refundBase = value;
    }

    /**
     * Obtient la valeur de la propriété salePriceLimit.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSalePriceLimit() {
        return salePriceLimit;
    }

    /**
     * Définit la valeur de la propriété salePriceLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSalePriceLimit(Float value) {
        this.salePriceLimit = value;
    }

    /**
     * Obtient la valeur de la propriété startDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Définit la valeur de la propriété startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Obtient la valeur de la propriété transferPrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTransferPrice() {
        return transferPrice;
    }

    /**
     * Définit la valeur de la propriété transferPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTransferPrice(Float value) {
        this.transferPrice = value;
    }

}
