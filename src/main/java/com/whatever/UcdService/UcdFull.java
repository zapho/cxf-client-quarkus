
package com.whatever.UcdService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ucdFull complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ucdFull">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="atcs" type="{urn:Vidal}ArrayOfAtc"/>
 *         &lt;element name="companyAgg" type="{urn:Vidal}companyAgg"/>
 *         &lt;element name="convertibleUnits" type="{urn:Vidal}ArrayOfConvertibleUnit"/>
 *         &lt;element name="drugs" type="{urn:Vidal}drugsAgg"/>
 *         &lt;element name="galenic" type="{urn:Vidal}galenicAgg"/>
 *         &lt;element name="indications" type="{urn:Vidal}ArrayOfIndication"/>
 *         &lt;element name="indicationsAtu" type="{urn:Vidal}ArrayOfOtherIndication"/>
 *         &lt;element name="indicationsLes" type="{urn:Vidal}ArrayOfIndicationLes"/>
 *         &lt;element name="indicationsNoAMM" type="{urn:Vidal}ArrayOfTypedIndication"/>
 *         &lt;element name="indicators" type="{urn:Vidal}ArrayOfIndicator"/>
 *         &lt;element name="restrictedPrescriptions" type="{urn:Vidal}restrictedPrescriptions"/>
 *         &lt;element name="ucd" type="{urn:Vidal}ucd"/>
 *         &lt;element name="ucdDispensingUnit" type="{urn:Vidal}ucdDispensingUnit"/>
 *         &lt;element name="ucdItems" type="{urn:Vidal}ArrayOfUcdItem"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ucdFull", propOrder = {
    "atcs",
    "companyAgg",
    "convertibleUnits",
    "drugs",
    "galenic",
    "indications",
    "indicationsAtu",
    "indicationsLes",
    "indicationsNoAMM",
    "indicators",
    "restrictedPrescriptions",
    "ucd",
    "ucdDispensingUnit",
    "ucdItems"
})
public class UcdFull {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfAtc atcs;
    @XmlElement(required = true, nillable = true)
    protected CompanyAgg companyAgg;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfConvertibleUnit convertibleUnits;
    @XmlElement(required = true, nillable = true)
    protected DrugsAgg drugs;
    @XmlElement(required = true, nillable = true)
    protected GalenicAgg galenic;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfIndication indications;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfOtherIndication indicationsAtu;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfIndicationLes indicationsLes;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTypedIndication indicationsNoAMM;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfIndicator indicators;
    @XmlElement(required = true, nillable = true)
    protected RestrictedPrescriptions restrictedPrescriptions;
    @XmlElement(required = true, nillable = true)
    protected Ucd ucd;
    @XmlElement(required = true, nillable = true)
    protected UcdDispensingUnit ucdDispensingUnit;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfUcdItem ucdItems;

    /**
     * Obtient la valeur de la propriété atcs.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAtc }
     *     
     */
    public ArrayOfAtc getAtcs() {
        return atcs;
    }

    /**
     * Définit la valeur de la propriété atcs.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAtc }
     *     
     */
    public void setAtcs(ArrayOfAtc value) {
        this.atcs = value;
    }

    /**
     * Obtient la valeur de la propriété companyAgg.
     * 
     * @return
     *     possible object is
     *     {@link CompanyAgg }
     *     
     */
    public CompanyAgg getCompanyAgg() {
        return companyAgg;
    }

    /**
     * Définit la valeur de la propriété companyAgg.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyAgg }
     *     
     */
    public void setCompanyAgg(CompanyAgg value) {
        this.companyAgg = value;
    }

    /**
     * Obtient la valeur de la propriété convertibleUnits.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConvertibleUnit }
     *     
     */
    public ArrayOfConvertibleUnit getConvertibleUnits() {
        return convertibleUnits;
    }

    /**
     * Définit la valeur de la propriété convertibleUnits.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConvertibleUnit }
     *     
     */
    public void setConvertibleUnits(ArrayOfConvertibleUnit value) {
        this.convertibleUnits = value;
    }

    /**
     * Obtient la valeur de la propriété drugs.
     * 
     * @return
     *     possible object is
     *     {@link DrugsAgg }
     *     
     */
    public DrugsAgg getDrugs() {
        return drugs;
    }

    /**
     * Définit la valeur de la propriété drugs.
     * 
     * @param value
     *     allowed object is
     *     {@link DrugsAgg }
     *     
     */
    public void setDrugs(DrugsAgg value) {
        this.drugs = value;
    }

    /**
     * Obtient la valeur de la propriété galenic.
     * 
     * @return
     *     possible object is
     *     {@link GalenicAgg }
     *     
     */
    public GalenicAgg getGalenic() {
        return galenic;
    }

    /**
     * Définit la valeur de la propriété galenic.
     * 
     * @param value
     *     allowed object is
     *     {@link GalenicAgg }
     *     
     */
    public void setGalenic(GalenicAgg value) {
        this.galenic = value;
    }

    /**
     * Obtient la valeur de la propriété indications.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIndication }
     *     
     */
    public ArrayOfIndication getIndications() {
        return indications;
    }

    /**
     * Définit la valeur de la propriété indications.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIndication }
     *     
     */
    public void setIndications(ArrayOfIndication value) {
        this.indications = value;
    }

    /**
     * Obtient la valeur de la propriété indicationsAtu.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOtherIndication }
     *     
     */
    public ArrayOfOtherIndication getIndicationsAtu() {
        return indicationsAtu;
    }

    /**
     * Définit la valeur de la propriété indicationsAtu.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOtherIndication }
     *     
     */
    public void setIndicationsAtu(ArrayOfOtherIndication value) {
        this.indicationsAtu = value;
    }

    /**
     * Obtient la valeur de la propriété indicationsLes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIndicationLes }
     *     
     */
    public ArrayOfIndicationLes getIndicationsLes() {
        return indicationsLes;
    }

    /**
     * Définit la valeur de la propriété indicationsLes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIndicationLes }
     *     
     */
    public void setIndicationsLes(ArrayOfIndicationLes value) {
        this.indicationsLes = value;
    }

    /**
     * Obtient la valeur de la propriété indicationsNoAMM.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTypedIndication }
     *     
     */
    public ArrayOfTypedIndication getIndicationsNoAMM() {
        return indicationsNoAMM;
    }

    /**
     * Définit la valeur de la propriété indicationsNoAMM.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTypedIndication }
     *     
     */
    public void setIndicationsNoAMM(ArrayOfTypedIndication value) {
        this.indicationsNoAMM = value;
    }

    /**
     * Obtient la valeur de la propriété indicators.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIndicator }
     *     
     */
    public ArrayOfIndicator getIndicators() {
        return indicators;
    }

    /**
     * Définit la valeur de la propriété indicators.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIndicator }
     *     
     */
    public void setIndicators(ArrayOfIndicator value) {
        this.indicators = value;
    }

    /**
     * Obtient la valeur de la propriété restrictedPrescriptions.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedPrescriptions }
     *     
     */
    public RestrictedPrescriptions getRestrictedPrescriptions() {
        return restrictedPrescriptions;
    }

    /**
     * Définit la valeur de la propriété restrictedPrescriptions.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedPrescriptions }
     *     
     */
    public void setRestrictedPrescriptions(RestrictedPrescriptions value) {
        this.restrictedPrescriptions = value;
    }

    /**
     * Obtient la valeur de la propriété ucd.
     * 
     * @return
     *     possible object is
     *     {@link Ucd }
     *     
     */
    public Ucd getUcd() {
        return ucd;
    }

    /**
     * Définit la valeur de la propriété ucd.
     * 
     * @param value
     *     allowed object is
     *     {@link Ucd }
     *     
     */
    public void setUcd(Ucd value) {
        this.ucd = value;
    }

    /**
     * Obtient la valeur de la propriété ucdDispensingUnit.
     * 
     * @return
     *     possible object is
     *     {@link UcdDispensingUnit }
     *     
     */
    public UcdDispensingUnit getUcdDispensingUnit() {
        return ucdDispensingUnit;
    }

    /**
     * Définit la valeur de la propriété ucdDispensingUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link UcdDispensingUnit }
     *     
     */
    public void setUcdDispensingUnit(UcdDispensingUnit value) {
        this.ucdDispensingUnit = value;
    }

    /**
     * Obtient la valeur de la propriété ucdItems.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUcdItem }
     *     
     */
    public ArrayOfUcdItem getUcdItems() {
        return ucdItems;
    }

    /**
     * Définit la valeur de la propriété ucdItems.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUcdItem }
     *     
     */
    public void setUcdItems(ArrayOfUcdItem value) {
        this.ucdItems = value;
    }

}
