
package com.vidal.PackService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour packagePriceScheduleItem complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="packagePriceScheduleItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="manufacturerPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="publicPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="reference" type="{urn:Vidal}reference"/>
 *         &lt;element name="refundBase" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="vatRate" type="{urn:Vidal}VatRate"/>
 *         &lt;element name="vatRateValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "packagePriceScheduleItem", propOrder = {
    "endDate",
    "manufacturerPrice",
    "publicPrice",
    "reference",
    "refundBase",
    "startDate",
    "vatRate",
    "vatRateValue"
})
public class PackagePriceScheduleItem {

    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float manufacturerPrice;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float publicPrice;
    @XmlElement(required = true, nillable = true)
    protected Reference reference;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float refundBase;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(required = true, nillable = true)
    protected VatRate vatRate;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float vatRateValue;

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
     * Obtient la valeur de la propriété manufacturerPrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getManufacturerPrice() {
        return manufacturerPrice;
    }

    /**
     * Définit la valeur de la propriété manufacturerPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setManufacturerPrice(Float value) {
        this.manufacturerPrice = value;
    }

    /**
     * Obtient la valeur de la propriété publicPrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPublicPrice() {
        return publicPrice;
    }

    /**
     * Définit la valeur de la propriété publicPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPublicPrice(Float value) {
        this.publicPrice = value;
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
     * Obtient la valeur de la propriété vatRate.
     * 
     * @return
     *     possible object is
     *     {@link VatRate }
     *     
     */
    public VatRate getVatRate() {
        return vatRate;
    }

    /**
     * Définit la valeur de la propriété vatRate.
     * 
     * @param value
     *     allowed object is
     *     {@link VatRate }
     *     
     */
    public void setVatRate(VatRate value) {
        this.vatRate = value;
    }

    /**
     * Obtient la valeur de la propriété vatRateValue.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVatRateValue() {
        return vatRateValue;
    }

    /**
     * Définit la valeur de la propriété vatRateValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVatRateValue(Float value) {
        this.vatRateValue = value;
    }

}
