
package com.vidal.UcdService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour pack complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="pack">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actCode" type="{urn:Vidal}ActCode"/>
 *         &lt;element name="actCodeValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cip13" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="communityAgrement" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dispensationPlace" type="{urn:Vidal}DispensationPlace"/>
 *         &lt;element name="dose" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="doseUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="doseUnitId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="drugInSport" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ean" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="genericType" type="{urn:Vidal}GenericType"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="list" type="{urn:Vidal}ListType"/>
 *         &lt;element name="listValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="manufacturerPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="marketStatus" type="{urn:Vidal}MarketStatus"/>
 *         &lt;element name="maxPrescriptionDuration" type="{urn:Vidal}PrescriptionDuration"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="narcoticPrescription" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="offMarketDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="onFreeAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="onMarketDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="otc" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pharmacistPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="prescriptionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pricePerDose" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="publicPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="refundingBase" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="refundingRate" type="{urn:Vidal}RefundRate"/>
 *         &lt;element name="refundingRateValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="safetyAlert" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="substitutePackageId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tfr" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="type" type="{urn:Vidal}ProductType"/>
 *         &lt;element name="ucdPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="ucdQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="vatRate" type="{urn:Vidal}VatRate"/>
 *         &lt;element name="vatRateValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
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
@XmlType(name = "pack", propOrder = {
    "actCode",
    "actCodeValue",
    "cip",
    "cip13",
    "cis",
    "communityAgrement",
    "dispensationPlace",
    "dose",
    "doseUnit",
    "doseUnitId",
    "drugInSport",
    "ean",
    "genericType",
    "id",
    "list",
    "listValue",
    "manufacturerPrice",
    "marketStatus",
    "maxPrescriptionDuration",
    "name",
    "narcoticPrescription",
    "offMarketDate",
    "onFreeAccess",
    "onMarketDate",
    "otc",
    "pharmacistPrice",
    "prescriptionName",
    "pricePerDose",
    "productId",
    "publicPrice",
    "refundingBase",
    "refundingRate",
    "refundingRateValue",
    "safetyAlert",
    "shortName",
    "substitutePackageId",
    "tfr",
    "type",
    "ucdPrice",
    "ucdQuantity",
    "vatRate",
    "vatRateValue",
    "withoutPrescr"
})
public class Pack {

    @XmlElement(required = true, nillable = true)
    protected ActCode actCode;
    @XmlElement(required = true, nillable = true)
    protected String actCodeValue;
    @XmlElement(required = true, nillable = true)
    protected String cip;
    @XmlElement(required = true, nillable = true)
    protected String cip13;
    @XmlElement(required = true, nillable = true)
    protected String cis;
    protected boolean communityAgrement;
    @XmlElement(required = true, nillable = true)
    protected DispensationPlace dispensationPlace;
    @XmlElement(required = true, nillable = true)
    protected String dose;
    @XmlElement(required = true, nillable = true)
    protected String doseUnit;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer doseUnitId;
    protected boolean drugInSport;
    @XmlElement(required = true, nillable = true)
    protected String ean;
    @XmlElement(required = true, nillable = true)
    protected GenericType genericType;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true, nillable = true)
    protected ListType list;
    @XmlElement(required = true, nillable = true)
    protected String listValue;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float manufacturerPrice;
    @XmlElement(required = true, nillable = true)
    protected MarketStatus marketStatus;
    @XmlElement(required = true, nillable = true)
    protected PrescriptionDuration maxPrescriptionDuration;
    @XmlElement(required = true, nillable = true)
    protected String name;
    protected boolean narcoticPrescription;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar offMarketDate;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean onFreeAccess;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar onMarketDate;
    protected boolean otc;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float pharmacistPrice;
    @XmlElement(required = true, nillable = true)
    protected String prescriptionName;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float pricePerDose;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer productId;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float publicPrice;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float refundingBase;
    @XmlElement(required = true, nillable = true)
    protected String refundingRate;
    @XmlElement(required = true, nillable = true)
    protected String refundingRateValue;
    protected boolean safetyAlert;
    @XmlElement(required = true, nillable = true)
    protected String shortName;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer substitutePackageId;
    protected boolean tfr;
    @XmlElement(required = true, nillable = true)
    protected ProductType type;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float ucdPrice;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer ucdQuantity;
    @XmlElement(required = true, nillable = true)
    protected VatRate vatRate;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float vatRateValue;
    protected boolean withoutPrescr;

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
     * Obtient la valeur de la propriété cip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCip() {
        return cip;
    }

    /**
     * Définit la valeur de la propriété cip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCip(String value) {
        this.cip = value;
    }

    /**
     * Obtient la valeur de la propriété cip13.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCip13() {
        return cip13;
    }

    /**
     * Définit la valeur de la propriété cip13.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCip13(String value) {
        this.cip13 = value;
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
     * Obtient la valeur de la propriété communityAgrement.
     * 
     */
    public boolean isCommunityAgrement() {
        return communityAgrement;
    }

    /**
     * Définit la valeur de la propriété communityAgrement.
     * 
     */
    public void setCommunityAgrement(boolean value) {
        this.communityAgrement = value;
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
     * Obtient la valeur de la propriété dose.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDose() {
        return dose;
    }

    /**
     * Définit la valeur de la propriété dose.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDose(String value) {
        this.dose = value;
    }

    /**
     * Obtient la valeur de la propriété doseUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoseUnit() {
        return doseUnit;
    }

    /**
     * Définit la valeur de la propriété doseUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoseUnit(String value) {
        this.doseUnit = value;
    }

    /**
     * Obtient la valeur de la propriété doseUnitId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDoseUnitId() {
        return doseUnitId;
    }

    /**
     * Définit la valeur de la propriété doseUnitId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDoseUnitId(Integer value) {
        this.doseUnitId = value;
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
     * Obtient la valeur de la propriété ean.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEan() {
        return ean;
    }

    /**
     * Définit la valeur de la propriété ean.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEan(String value) {
        this.ean = value;
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
     * Obtient la valeur de la propriété maxPrescriptionDuration.
     * 
     * @return
     *     possible object is
     *     {@link PrescriptionDuration }
     *     
     */
    public PrescriptionDuration getMaxPrescriptionDuration() {
        return maxPrescriptionDuration;
    }

    /**
     * Définit la valeur de la propriété maxPrescriptionDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link PrescriptionDuration }
     *     
     */
    public void setMaxPrescriptionDuration(PrescriptionDuration value) {
        this.maxPrescriptionDuration = value;
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
     * Obtient la valeur de la propriété narcoticPrescription.
     * 
     */
    public boolean isNarcoticPrescription() {
        return narcoticPrescription;
    }

    /**
     * Définit la valeur de la propriété narcoticPrescription.
     * 
     */
    public void setNarcoticPrescription(boolean value) {
        this.narcoticPrescription = value;
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
     * Obtient la valeur de la propriété onFreeAccess.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnFreeAccess() {
        return onFreeAccess;
    }

    /**
     * Définit la valeur de la propriété onFreeAccess.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnFreeAccess(Boolean value) {
        this.onFreeAccess = value;
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
     * Obtient la valeur de la propriété otc.
     * 
     */
    public boolean isOtc() {
        return otc;
    }

    /**
     * Définit la valeur de la propriété otc.
     * 
     */
    public void setOtc(boolean value) {
        this.otc = value;
    }

    /**
     * Obtient la valeur de la propriété pharmacistPrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPharmacistPrice() {
        return pharmacistPrice;
    }

    /**
     * Définit la valeur de la propriété pharmacistPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPharmacistPrice(Float value) {
        this.pharmacistPrice = value;
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
     * Obtient la valeur de la propriété pricePerDose.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPricePerDose() {
        return pricePerDose;
    }

    /**
     * Définit la valeur de la propriété pricePerDose.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPricePerDose(Float value) {
        this.pricePerDose = value;
    }

    /**
     * Obtient la valeur de la propriété productId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * Définit la valeur de la propriété productId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductId(Integer value) {
        this.productId = value;
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
     * Obtient la valeur de la propriété refundingBase.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRefundingBase() {
        return refundingBase;
    }

    /**
     * Définit la valeur de la propriété refundingBase.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRefundingBase(Float value) {
        this.refundingBase = value;
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
     * Obtient la valeur de la propriété shortName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Définit la valeur de la propriété shortName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Obtient la valeur de la propriété substitutePackageId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubstitutePackageId() {
        return substitutePackageId;
    }

    /**
     * Définit la valeur de la propriété substitutePackageId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubstitutePackageId(Integer value) {
        this.substitutePackageId = value;
    }

    /**
     * Obtient la valeur de la propriété tfr.
     * 
     */
    public boolean isTfr() {
        return tfr;
    }

    /**
     * Définit la valeur de la propriété tfr.
     * 
     */
    public void setTfr(boolean value) {
        this.tfr = value;
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
     * Obtient la valeur de la propriété ucdPrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getUcdPrice() {
        return ucdPrice;
    }

    /**
     * Définit la valeur de la propriété ucdPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setUcdPrice(Float value) {
        this.ucdPrice = value;
    }

    /**
     * Obtient la valeur de la propriété ucdQuantity.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUcdQuantity() {
        return ucdQuantity;
    }

    /**
     * Définit la valeur de la propriété ucdQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUcdQuantity(Integer value) {
        this.ucdQuantity = value;
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
