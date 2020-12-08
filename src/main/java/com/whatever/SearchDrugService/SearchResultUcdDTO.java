
package com.whatever.SearchDrugService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchResultUcdDTO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchResultUcdDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activePrinciple" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="code13" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deliveryRestrictedToHospital" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dispensationPlace" type="{urn:Vidal}DispensationPlace"/>
 *         &lt;element name="drugInSport" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="een" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="genericType" type="{urn:Vidal}GenericType"/>
 *         &lt;element name="ghs" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ghsPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="initiallyPrescribedByHospital" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="initiallyPrescribedBySpecialist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="list" type="{urn:Vidal}ListType"/>
 *         &lt;element name="marketStatus" type="{urn:Vidal}MarketStatus"/>
 *         &lt;element name="maxPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="minPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prescribedByHospital" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="prescribedBySpecialist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="productType" type="{urn:Vidal}ProductType"/>
 *         &lt;element name="renewalBySpecialist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="retrocession" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="retrocessionPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
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
@XmlType(name = "searchResultUcdDTO", propOrder = {
    "activePrinciple",
    "code13",
    "company",
    "deliveryRestrictedToHospital",
    "dispensationPlace",
    "drugInSport",
    "een",
    "genericType",
    "ghs",
    "ghsPrice",
    "id",
    "initiallyPrescribedByHospital",
    "initiallyPrescribedBySpecialist",
    "list",
    "marketStatus",
    "maxPrice",
    "minPrice",
    "name",
    "prescribedByHospital",
    "prescribedBySpecialist",
    "productType",
    "renewalBySpecialist",
    "retrocession",
    "retrocessionPrice",
    "specificMonitoring"
})
public class SearchResultUcdDTO {

    @XmlElement(required = true, nillable = true)
    protected String activePrinciple;
    @XmlElement(required = true, nillable = true)
    protected String code13;
    @XmlElement(required = true, nillable = true)
    protected String company;
    protected boolean deliveryRestrictedToHospital;
    @XmlElement(required = true, nillable = true)
    protected DispensationPlace dispensationPlace;
    protected boolean drugInSport;
    @XmlElement(required = true, nillable = true)
    protected String een;
    @XmlElement(required = true, nillable = true)
    protected GenericType genericType;
    protected boolean ghs;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float ghsPrice;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    protected boolean initiallyPrescribedByHospital;
    protected boolean initiallyPrescribedBySpecialist;
    @XmlElement(required = true, nillable = true)
    protected ListType list;
    @XmlElement(required = true, nillable = true)
    protected MarketStatus marketStatus;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float maxPrice;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float minPrice;
    @XmlElement(required = true, nillable = true)
    protected String name;
    protected boolean prescribedByHospital;
    protected boolean prescribedBySpecialist;
    @XmlElement(required = true, nillable = true)
    protected ProductType productType;
    protected boolean renewalBySpecialist;
    protected boolean retrocession;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float retrocessionPrice;
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
     * Obtient la valeur de la propriété code13.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode13() {
        return code13;
    }

    /**
     * Définit la valeur de la propriété code13.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode13(String value) {
        this.code13 = value;
    }

    /**
     * Obtient la valeur de la propriété company.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Définit la valeur de la propriété company.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
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
     * Obtient la valeur de la propriété ghs.
     * 
     */
    public boolean isGhs() {
        return ghs;
    }

    /**
     * Définit la valeur de la propriété ghs.
     * 
     */
    public void setGhs(boolean value) {
        this.ghs = value;
    }

    /**
     * Obtient la valeur de la propriété ghsPrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getGhsPrice() {
        return ghsPrice;
    }

    /**
     * Définit la valeur de la propriété ghsPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setGhsPrice(Float value) {
        this.ghsPrice = value;
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
     * Obtient la valeur de la propriété maxPrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxPrice() {
        return maxPrice;
    }

    /**
     * Définit la valeur de la propriété maxPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxPrice(Float value) {
        this.maxPrice = value;
    }

    /**
     * Obtient la valeur de la propriété minPrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinPrice() {
        return minPrice;
    }

    /**
     * Définit la valeur de la propriété minPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinPrice(Float value) {
        this.minPrice = value;
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
     * Obtient la valeur de la propriété retrocession.
     * 
     */
    public boolean isRetrocession() {
        return retrocession;
    }

    /**
     * Définit la valeur de la propriété retrocession.
     * 
     */
    public void setRetrocession(boolean value) {
        this.retrocession = value;
    }

    /**
     * Obtient la valeur de la propriété retrocessionPrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRetrocessionPrice() {
        return retrocessionPrice;
    }

    /**
     * Définit la valeur de la propriété retrocessionPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRetrocessionPrice(Float value) {
        this.retrocessionPrice = value;
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
