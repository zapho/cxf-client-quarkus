
package com.whatever.PackService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour packageReimbursementScheduleItem complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="packageReimbursementScheduleItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actCode" type="{urn:Vidal}ActCode"/>
 *         &lt;element name="actCodeValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="reference" type="{urn:Vidal}reference"/>
 *         &lt;element name="refundingRate" type="{urn:Vidal}RefundRate"/>
 *         &lt;element name="refundingRateValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "packageReimbursementScheduleItem", propOrder = {
    "actCode",
    "actCodeValue",
    "endDate",
    "reference",
    "refundingRate",
    "refundingRateValue",
    "startDate"
})
public class PackageReimbursementScheduleItem {

    @XmlElement(required = true, nillable = true)
    protected ActCode actCode;
    @XmlElement(required = true, nillable = true)
    protected String actCodeValue;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(required = true, nillable = true)
    protected Reference reference;
    @XmlElement(required = true, nillable = true)
    protected String refundingRate;
    @XmlElement(required = true, nillable = true)
    protected String refundingRateValue;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;

    /**
     * Obtient la valeur de la propriété actCode.
     * 
     * @return
     *     possible object is
     *     {@link ActCode }
     *     
     */
    public ActCode getActCode() {
        return actCode;
    }

    /**
     * Définit la valeur de la propriété actCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ActCode }
     *     
     */
    public void setActCode(ActCode value) {
        this.actCode = value;
    }

    /**
     * Obtient la valeur de la propriété actCodeValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActCodeValue() {
        return actCodeValue;
    }

    /**
     * Définit la valeur de la propriété actCodeValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActCodeValue(String value) {
        this.actCodeValue = value;
    }

    /**
     * Obtient la valeur de la propriété endDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Définit la valeur de la propriété endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

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
     * Obtient la valeur de la propriété refundingRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundingRate() {
        return refundingRate;
    }

    /**
     * Définit la valeur de la propriété refundingRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundingRate(String value) {
        this.refundingRate = value;
    }

    /**
     * Obtient la valeur de la propriété refundingRateValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundingRateValue() {
        return refundingRateValue;
    }

    /**
     * Définit la valeur de la propriété refundingRateValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundingRateValue(String value) {
        this.refundingRateValue = value;
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

}
