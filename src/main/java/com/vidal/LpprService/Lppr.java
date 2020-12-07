
package com.vidal.LpprService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour lppr complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="lppr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actCode" type="{urn:Vidal}ActCode"/>
 *         &lt;element name="actCodeValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ageMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ageMin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="amountDurationUnit" type="{urn:Vidal}posologyUnit"/>
 *         &lt;element name="amountDurationValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="amountMax" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ghsEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="publicComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quantityDurationUnit" type="{urn:Vidal}posologyUnit"/>
 *         &lt;element name="quantityDurationValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="refundBase" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="refundRate" type="{urn:Vidal}RefundRate"/>
 *         &lt;element name="refundRateValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="salePriceLimit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="service" type="{urn:Vidal}LpprServiceType"/>
 *         &lt;element name="weightMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="weightMin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lppr", propOrder = {
    "actCode",
    "actCodeValue",
    "ageMax",
    "ageMin",
    "amountDurationUnit",
    "amountDurationValue",
    "amountMax",
    "code",
    "ghsEffectiveDate",
    "id",
    "maxQuantity",
    "name",
    "publicComment",
    "quantityDurationUnit",
    "quantityDurationValue",
    "refundBase",
    "refundRate",
    "refundRateValue",
    "salePriceLimit",
    "service",
    "weightMax",
    "weightMin"
})
public class Lppr {

    @XmlElement(required = true, nillable = true)
    protected ActCode actCode;
    @XmlElement(required = true, nillable = true)
    protected String actCodeValue;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer ageMax;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer ageMin;
    @XmlElement(required = true, nillable = true)
    protected PosologyUnit amountDurationUnit;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer amountDurationValue;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float amountMax;
    @XmlElement(required = true, nillable = true)
    protected String code;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ghsEffectiveDate;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer maxQuantity;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String publicComment;
    @XmlElement(required = true, nillable = true)
    protected PosologyUnit quantityDurationUnit;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer quantityDurationValue;
    protected double refundBase;
    @XmlElement(required = true, nillable = true)
    protected String refundRate;
    @XmlElement(required = true, nillable = true)
    protected String refundRateValue;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double salePriceLimit;
    @XmlElement(required = true, nillable = true)
    protected LpprServiceType service;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer weightMax;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer weightMin;

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
     * Obtient la valeur de la propriété ageMax.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAgeMax() {
        return ageMax;
    }

    /**
     * Définit la valeur de la propriété ageMax.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAgeMax(Integer value) {
        this.ageMax = value;
    }

    /**
     * Obtient la valeur de la propriété ageMin.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAgeMin() {
        return ageMin;
    }

    /**
     * Définit la valeur de la propriété ageMin.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAgeMin(Integer value) {
        this.ageMin = value;
    }

    /**
     * Obtient la valeur de la propriété amountDurationUnit.
     * 
     * @return
     *     possible object is
     *     {@link PosologyUnit }
     *     
     */
    public PosologyUnit getAmountDurationUnit() {
        return amountDurationUnit;
    }

    /**
     * Définit la valeur de la propriété amountDurationUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyUnit }
     *     
     */
    public void setAmountDurationUnit(PosologyUnit value) {
        this.amountDurationUnit = value;
    }

    /**
     * Obtient la valeur de la propriété amountDurationValue.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAmountDurationValue() {
        return amountDurationValue;
    }

    /**
     * Définit la valeur de la propriété amountDurationValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAmountDurationValue(Integer value) {
        this.amountDurationValue = value;
    }

    /**
     * Obtient la valeur de la propriété amountMax.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAmountMax() {
        return amountMax;
    }

    /**
     * Définit la valeur de la propriété amountMax.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAmountMax(Float value) {
        this.amountMax = value;
    }

    /**
     * Obtient la valeur de la propriété code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Définit la valeur de la propriété code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Obtient la valeur de la propriété ghsEffectiveDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGhsEffectiveDate() {
        return ghsEffectiveDate;
    }

    /**
     * Définit la valeur de la propriété ghsEffectiveDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGhsEffectiveDate(XMLGregorianCalendar value) {
        this.ghsEffectiveDate = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété maxQuantity.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxQuantity() {
        return maxQuantity;
    }

    /**
     * Définit la valeur de la propriété maxQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxQuantity(Integer value) {
        this.maxQuantity = value;
    }

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété publicComment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicComment() {
        return publicComment;
    }

    /**
     * Définit la valeur de la propriété publicComment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicComment(String value) {
        this.publicComment = value;
    }

    /**
     * Obtient la valeur de la propriété quantityDurationUnit.
     * 
     * @return
     *     possible object is
     *     {@link PosologyUnit }
     *     
     */
    public PosologyUnit getQuantityDurationUnit() {
        return quantityDurationUnit;
    }

    /**
     * Définit la valeur de la propriété quantityDurationUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyUnit }
     *     
     */
    public void setQuantityDurationUnit(PosologyUnit value) {
        this.quantityDurationUnit = value;
    }

    /**
     * Obtient la valeur de la propriété quantityDurationValue.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantityDurationValue() {
        return quantityDurationValue;
    }

    /**
     * Définit la valeur de la propriété quantityDurationValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantityDurationValue(Integer value) {
        this.quantityDurationValue = value;
    }

    /**
     * Obtient la valeur de la propriété refundBase.
     * 
     */
    public double getRefundBase() {
        return refundBase;
    }

    /**
     * Définit la valeur de la propriété refundBase.
     * 
     */
    public void setRefundBase(double value) {
        this.refundBase = value;
    }

    /**
     * Obtient la valeur de la propriété refundRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundRate() {
        return refundRate;
    }

    /**
     * Définit la valeur de la propriété refundRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundRate(String value) {
        this.refundRate = value;
    }

    /**
     * Obtient la valeur de la propriété refundRateValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundRateValue() {
        return refundRateValue;
    }

    /**
     * Définit la valeur de la propriété refundRateValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundRateValue(String value) {
        this.refundRateValue = value;
    }

    /**
     * Obtient la valeur de la propriété salePriceLimit.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSalePriceLimit() {
        return salePriceLimit;
    }

    /**
     * Définit la valeur de la propriété salePriceLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSalePriceLimit(Double value) {
        this.salePriceLimit = value;
    }

    /**
     * Obtient la valeur de la propriété service.
     * 
     * @return
     *     possible object is
     *     {@link LpprServiceType }
     *     
     */
    public LpprServiceType getService() {
        return service;
    }

    /**
     * Définit la valeur de la propriété service.
     * 
     * @param value
     *     allowed object is
     *     {@link LpprServiceType }
     *     
     */
    public void setService(LpprServiceType value) {
        this.service = value;
    }

    /**
     * Obtient la valeur de la propriété weightMax.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeightMax() {
        return weightMax;
    }

    /**
     * Définit la valeur de la propriété weightMax.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeightMax(Integer value) {
        this.weightMax = value;
    }

    /**
     * Obtient la valeur de la propriété weightMin.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeightMin() {
        return weightMin;
    }

    /**
     * Définit la valeur de la propriété weightMin.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeightMin(Integer value) {
        this.weightMin = value;
    }

}
