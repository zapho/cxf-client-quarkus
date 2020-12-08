
package com.whatever.SearchDrugService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchResultPackDTO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchResultPackDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activePrinciple" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="companyHolders" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="companyOwner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deliveryRestrictedToHospital" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dispensationPlace" type="{urn:Vidal}DispensationPlace"/>
 *         &lt;element name="drugInSport" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="een" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="genericType" type="{urn:Vidal}GenericType"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="initiallyPrescribedByHospital" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="initiallyPrescribedBySpecialist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="list" type="{urn:Vidal}ListType"/>
 *         &lt;element name="marketStatus" type="{urn:Vidal}MarketStatus"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prescribedByHospital" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="prescribedBySpecialist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pricePerDose" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="productType" type="{urn:Vidal}ProductType"/>
 *         &lt;element name="publicPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="refundingBase" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="refundingRate" type="{urn:Vidal}RefundRate"/>
 *         &lt;element name="refundingRateValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="renewalBySpecialist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="specificMonitoring" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchResultPackDTO", propOrder = {
    "activePrinciple",
    "cip",
    "companyHolders",
    "companyOwner",
    "deliveryRestrictedToHospital",
    "dispensationPlace",
    "drugInSport",
    "een",
    "genericType",
    "id",
    "initiallyPrescribedByHospital",
    "initiallyPrescribedBySpecialist",
    "list",
    "marketStatus",
    "name",
    "prescribedByHospital",
    "prescribedBySpecialist",
    "pricePerDose",
    "productId",
    "productType",
    "publicPrice",
    "refundingBase",
    "refundingRate",
    "refundingRateValue",
    "renewalBySpecialist",
    "specificMonitoring"
})
public class SearchResultPackDTO {

    @XmlElement(required = true, nillable = true)
    protected String activePrinciple;
    @XmlElement(required = true, nillable = true)
    protected String cip;
    @XmlElement(required = true, nillable = true)
    protected String companyHolders;
    @XmlElement(required = true, nillable = true)
    protected String companyOwner;
    protected boolean deliveryRestrictedToHospital;
    @XmlElement(required = true, nillable = true)
    protected DispensationPlace dispensationPlace;
    protected boolean drugInSport;
    @XmlElement(required = true, nillable = true)
    protected String een;
    @XmlElement(required = true, nillable = true)
    protected GenericType genericType;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    protected boolean initiallyPrescribedByHospital;
    protected boolean initiallyPrescribedBySpecialist;
    @XmlElement(required = true, nillable = true)
    protected ListType list;
    @XmlElement(required = true, nillable = true)
    protected MarketStatus marketStatus;
    @XmlElement(required = true, nillable = true)
    protected String name;
    protected boolean prescribedByHospital;
    protected boolean prescribedBySpecialist;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float pricePerDose;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer productId;
    @XmlElement(required = true, nillable = true)
    protected ProductType productType;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float publicPrice;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float refundingBase;
    @XmlElement(required = true, nillable = true)
    protected String refundingRate;
    @XmlElement(required = true, nillable = true)
    protected String refundingRateValue;
    protected boolean renewalBySpecialist;
    protected boolean specificMonitoring;

    /**
     * Obtient la valeur de la propriété activePrinciple.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivePrinciple() {
        return activePrinciple;
    }

    /**
     * Définit la valeur de la propriété activePrinciple.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivePrinciple(String value) {
        this.activePrinciple = value;
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
     * Obtient la valeur de la propriété companyHolders.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyHolders() {
        return companyHolders;
    }

    /**
     * Définit la valeur de la propriété companyHolders.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyHolders(String value) {
        this.companyHolders = value;
    }

    /**
     * Obtient la valeur de la propriété companyOwner.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyOwner() {
        return companyOwner;
    }

    /**
     * Définit la valeur de la propriété companyOwner.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyOwner(String value) {
        this.companyOwner = value;
    }

    /**
     * Obtient la valeur de la propriété deliveryRestrictedToHospital.
     * 
     */
    public boolean isDeliveryRestrictedToHospital() {
        return deliveryRestrictedToHospital;
    }

    /**
     * Définit la valeur de la propriété deliveryRestrictedToHospital.
     * 
     */
    public void setDeliveryRestrictedToHospital(boolean value) {
        this.deliveryRestrictedToHospital = value;
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
     * Obtient la valeur de la propriété een.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEen() {
        return een;
    }

    /**
     * Définit la valeur de la propriété een.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEen(String value) {
        this.een = value;
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
     * Obtient la valeur de la propriété initiallyPrescribedByHospital.
     * 
     */
    public boolean isInitiallyPrescribedByHospital() {
        return initiallyPrescribedByHospital;
    }

    /**
     * Définit la valeur de la propriété initiallyPrescribedByHospital.
     * 
     */
    public void setInitiallyPrescribedByHospital(boolean value) {
        this.initiallyPrescribedByHospital = value;
    }

    /**
     * Obtient la valeur de la propriété initiallyPrescribedBySpecialist.
     * 
     */
    public boolean isInitiallyPrescribedBySpecialist() {
        return initiallyPrescribedBySpecialist;
    }

    /**
     * Définit la valeur de la propriété initiallyPrescribedBySpecialist.
     * 
     */
    public void setInitiallyPrescribedBySpecialist(boolean value) {
        this.initiallyPrescribedBySpecialist = value;
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
     * Obtient la valeur de la propriété prescribedByHospital.
     * 
     */
    public boolean isPrescribedByHospital() {
        return prescribedByHospital;
    }

    /**
     * Définit la valeur de la propriété prescribedByHospital.
     * 
     */
    public void setPrescribedByHospital(boolean value) {
        this.prescribedByHospital = value;
    }

    /**
     * Obtient la valeur de la propriété prescribedBySpecialist.
     * 
     */
    public boolean isPrescribedBySpecialist() {
        return prescribedBySpecialist;
    }

    /**
     * Définit la valeur de la propriété prescribedBySpecialist.
     * 
     */
    public void setPrescribedBySpecialist(boolean value) {
        this.prescribedBySpecialist = value;
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
     * Obtient la valeur de la propriété productType.
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    public ProductType getProductType() {
        return productType;
    }

    /**
     * Définit la valeur de la propriété productType.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public void setProductType(ProductType value) {
        this.productType = value;
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
     * Obtient la valeur de la propriété renewalBySpecialist.
     * 
     */
    public boolean isRenewalBySpecialist() {
        return renewalBySpecialist;
    }

    /**
     * Définit la valeur de la propriété renewalBySpecialist.
     * 
     */
    public void setRenewalBySpecialist(boolean value) {
        this.renewalBySpecialist = value;
    }

    /**
     * Obtient la valeur de la propriété specificMonitoring.
     * 
     */
    public boolean isSpecificMonitoring() {
        return specificMonitoring;
    }

    /**
     * Définit la valeur de la propriété specificMonitoring.
     * 
     */
    public void setSpecificMonitoring(boolean value) {
        this.specificMonitoring = value;
    }

}
