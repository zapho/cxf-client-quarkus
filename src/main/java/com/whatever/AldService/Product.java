
package com.whatever.AldService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour product complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="product">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ammType" type="{http://constant.merlin.vidal.com}AmmType"/>
 *         &lt;element name="ammTypeLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="commonNameGroupId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dispensationPlace" type="{urn:Vidal}DispensationPlace"/>
 *         &lt;element name="drugInSport" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="exceptional" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="flavor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="genericType" type="{urn:Vidal}GenericType"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="list" type="{urn:Vidal}ListType"/>
 *         &lt;element name="listValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marketStatus" type="{urn:Vidal}MarketStatus"/>
 *         &lt;element name="maxUcdRangePrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="midwife" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="minUcdRangePrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="offMarketDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="onMarketDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="perVolume" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="perVolumeUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prescriptionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="refundingRate" type="{urn:Vidal}RefundRate"/>
 *         &lt;element name="refundingRateValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="safetyAlert" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="type" type="{urn:Vidal}ProductType"/>
 *         &lt;element name="vigilance" type="{urn:Vidal}Vigilance"/>
 *         &lt;element name="withoutPrescr" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "product", propOrder = {
    "ammType",
    "ammTypeLabel",
    "cis",
    "commonNameGroupId",
    "dispensationPlace",
    "drugInSport",
    "exceptional",
    "flavor",
    "genericType",
    "id",
    "list",
    "listValue",
    "marketStatus",
    "maxUcdRangePrice",
    "midwife",
    "minUcdRangePrice",
    "name",
    "offMarketDate",
    "onMarketDate",
    "perVolume",
    "perVolumeUnit",
    "prescriptionName",
    "refundingRate",
    "refundingRateValue",
    "safetyAlert",
    "type",
    "vigilance",
    "withoutPrescr"
})
public class Product {

    @XmlElement(required = true, nillable = true)
    protected AmmType ammType;
    @XmlElement(required = true, nillable = true)
    protected String ammTypeLabel;
    @XmlElement(required = true, nillable = true)
    protected String cis;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer commonNameGroupId;
    @XmlElement(required = true, nillable = true)
    protected DispensationPlace dispensationPlace;
    protected boolean drugInSport;
    protected boolean exceptional;
    @XmlElement(required = true, nillable = true)
    protected String flavor;
    @XmlElement(required = true, nillable = true)
    protected GenericType genericType;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true, nillable = true)
    protected ListType list;
    @XmlElement(required = true, nillable = true)
    protected String listValue;
    @XmlElement(required = true, nillable = true)
    protected MarketStatus marketStatus;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float maxUcdRangePrice;
    protected boolean midwife;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float minUcdRangePrice;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar offMarketDate;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar onMarketDate;
    @XmlElement(required = true, nillable = true)
    protected String perVolume;
    @XmlElement(required = true, nillable = true)
    protected String perVolumeUnit;
    @XmlElement(required = true, nillable = true)
    protected String prescriptionName;
    @XmlElement(required = true, nillable = true)
    protected String refundingRate;
    @XmlElement(required = true, nillable = true)
    protected String refundingRateValue;
    protected boolean safetyAlert;
    @XmlElement(required = true, nillable = true)
    protected ProductType type;
    @XmlElement(required = true, nillable = true)
    protected Vigilance vigilance;
    protected boolean withoutPrescr;

    /**
     * Obtient la valeur de la propriété ammType.
     * 
     * @return
     *     possible object is
     *     {@link AmmType }
     *     
     */
    public AmmType getAmmType() {
        return ammType;
    }

    /**
     * Définit la valeur de la propriété ammType.
     * 
     * @param value
     *     allowed object is
     *     {@link AmmType }
     *     
     */
    public void setAmmType(AmmType value) {
        this.ammType = value;
    }

    /**
     * Obtient la valeur de la propriété ammTypeLabel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmmTypeLabel() {
        return ammTypeLabel;
    }

    /**
     * Définit la valeur de la propriété ammTypeLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmmTypeLabel(String value) {
        this.ammTypeLabel = value;
    }

    /**
     * Obtient la valeur de la propriété cis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCis() {
        return cis;
    }

    /**
     * Définit la valeur de la propriété cis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCis(String value) {
        this.cis = value;
    }

    /**
     * Obtient la valeur de la propriété commonNameGroupId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCommonNameGroupId() {
        return commonNameGroupId;
    }

    /**
     * Définit la valeur de la propriété commonNameGroupId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCommonNameGroupId(Integer value) {
        this.commonNameGroupId = value;
    }

    /**
     * Obtient la valeur de la propriété dispensationPlace.
     * 
     * @return
     *     possible object is
     *     {@link DispensationPlace }
     *     
     */
    public DispensationPlace getDispensationPlace() {
        return dispensationPlace;
    }

    /**
     * Définit la valeur de la propriété dispensationPlace.
     * 
     * @param value
     *     allowed object is
     *     {@link DispensationPlace }
     *     
     */
    public void setDispensationPlace(DispensationPlace value) {
        this.dispensationPlace = value;
    }

    /**
     * Obtient la valeur de la propriété drugInSport.
     * 
     */
    public boolean isDrugInSport() {
        return drugInSport;
    }

    /**
     * Définit la valeur de la propriété drugInSport.
     * 
     */
    public void setDrugInSport(boolean value) {
        this.drugInSport = value;
    }

    /**
     * Obtient la valeur de la propriété exceptional.
     * 
     */
    public boolean isExceptional() {
        return exceptional;
    }

    /**
     * Définit la valeur de la propriété exceptional.
     * 
     */
    public void setExceptional(boolean value) {
        this.exceptional = value;
    }

    /**
     * Obtient la valeur de la propriété flavor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * Définit la valeur de la propriété flavor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlavor(String value) {
        this.flavor = value;
    }

    /**
     * Obtient la valeur de la propriété genericType.
     * 
     * @return
     *     possible object is
     *     {@link GenericType }
     *     
     */
    public GenericType getGenericType() {
        return genericType;
    }

    /**
     * Définit la valeur de la propriété genericType.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericType }
     *     
     */
    public void setGenericType(GenericType value) {
        this.genericType = value;
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
     * Obtient la valeur de la propriété list.
     * 
     * @return
     *     possible object is
     *     {@link ListType }
     *     
     */
    public ListType getList() {
        return list;
    }

    /**
     * Définit la valeur de la propriété list.
     * 
     * @param value
     *     allowed object is
     *     {@link ListType }
     *     
     */
    public void setList(ListType value) {
        this.list = value;
    }

    /**
     * Obtient la valeur de la propriété listValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListValue() {
        return listValue;
    }

    /**
     * Définit la valeur de la propriété listValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListValue(String value) {
        this.listValue = value;
    }

    /**
     * Obtient la valeur de la propriété marketStatus.
     * 
     * @return
     *     possible object is
     *     {@link MarketStatus }
     *     
     */
    public MarketStatus getMarketStatus() {
        return marketStatus;
    }

    /**
     * Définit la valeur de la propriété marketStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketStatus }
     *     
     */
    public void setMarketStatus(MarketStatus value) {
        this.marketStatus = value;
    }

    /**
     * Obtient la valeur de la propriété maxUcdRangePrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxUcdRangePrice() {
        return maxUcdRangePrice;
    }

    /**
     * Définit la valeur de la propriété maxUcdRangePrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxUcdRangePrice(Float value) {
        this.maxUcdRangePrice = value;
    }

    /**
     * Obtient la valeur de la propriété midwife.
     * 
     */
    public boolean isMidwife() {
        return midwife;
    }

    /**
     * Définit la valeur de la propriété midwife.
     * 
     */
    public void setMidwife(boolean value) {
        this.midwife = value;
    }

    /**
     * Obtient la valeur de la propriété minUcdRangePrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinUcdRangePrice() {
        return minUcdRangePrice;
    }

    /**
     * Définit la valeur de la propriété minUcdRangePrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinUcdRangePrice(Float value) {
        this.minUcdRangePrice = value;
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
     * Obtient la valeur de la propriété offMarketDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOffMarketDate() {
        return offMarketDate;
    }

    /**
     * Définit la valeur de la propriété offMarketDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOffMarketDate(XMLGregorianCalendar value) {
        this.offMarketDate = value;
    }

    /**
     * Obtient la valeur de la propriété onMarketDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOnMarketDate() {
        return onMarketDate;
    }

    /**
     * Définit la valeur de la propriété onMarketDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOnMarketDate(XMLGregorianCalendar value) {
        this.onMarketDate = value;
    }

    /**
     * Obtient la valeur de la propriété perVolume.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerVolume() {
        return perVolume;
    }

    /**
     * Définit la valeur de la propriété perVolume.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerVolume(String value) {
        this.perVolume = value;
    }

    /**
     * Obtient la valeur de la propriété perVolumeUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerVolumeUnit() {
        return perVolumeUnit;
    }

    /**
     * Définit la valeur de la propriété perVolumeUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerVolumeUnit(String value) {
        this.perVolumeUnit = value;
    }

    /**
     * Obtient la valeur de la propriété prescriptionName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrescriptionName() {
        return prescriptionName;
    }

    /**
     * Définit la valeur de la propriété prescriptionName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrescriptionName(String value) {
        this.prescriptionName = value;
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
     * Obtient la valeur de la propriété safetyAlert.
     * 
     */
    public boolean isSafetyAlert() {
        return safetyAlert;
    }

    /**
     * Définit la valeur de la propriété safetyAlert.
     * 
     */
    public void setSafetyAlert(boolean value) {
        this.safetyAlert = value;
    }

    /**
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    public ProductType getType() {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public void setType(ProductType value) {
        this.type = value;
    }

    /**
     * Obtient la valeur de la propriété vigilance.
     * 
     * @return
     *     possible object is
     *     {@link Vigilance }
     *     
     */
    public Vigilance getVigilance() {
        return vigilance;
    }

    /**
     * Définit la valeur de la propriété vigilance.
     * 
     * @param value
     *     allowed object is
     *     {@link Vigilance }
     *     
     */
    public void setVigilance(Vigilance value) {
        this.vigilance = value;
    }

    /**
     * Obtient la valeur de la propriété withoutPrescr.
     * 
     */
    public boolean isWithoutPrescr() {
        return withoutPrescr;
    }

    /**
     * Définit la valeur de la propriété withoutPrescr.
     * 
     */
    public void setWithoutPrescr(boolean value) {
        this.withoutPrescr = value;
    }

}
