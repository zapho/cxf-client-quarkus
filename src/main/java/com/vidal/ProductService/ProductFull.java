
package com.vidal.ProductService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour productFull complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="productFull">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="atcClasses" type="{urn:Vidal}ArrayOfAtc"/>
 *         &lt;element name="companyAgg" type="{urn:Vidal}companyAgg"/>
 *         &lt;element name="composition" type="{urn:Vidal}ArrayOfItemCompositionsCouple"/>
 *         &lt;element name="drugs" type="{urn:Vidal}drugsAgg"/>
 *         &lt;element name="galenic" type="{urn:Vidal}galenicAgg"/>
 *         &lt;element name="indications" type="{urn:Vidal}ArrayOfIndication"/>
 *         &lt;element name="indicationsAtu" type="{urn:Vidal}ArrayOfOtherIndication"/>
 *         &lt;element name="indicationsLes" type="{urn:Vidal}ArrayOfIndicationLes"/>
 *         &lt;element name="indicationsNoAMM" type="{urn:Vidal}ArrayOfTypedIndication"/>
 *         &lt;element name="indicators" type="{urn:Vidal}ArrayOfIndicator"/>
 *         &lt;element name="posologyUnits" type="{urn:Vidal}ArrayOfPosologyUnit"/>
 *         &lt;element name="product" type="{urn:Vidal}product"/>
 *         &lt;element name="restrictedPrescriptions" type="{urn:Vidal}restrictedPrescriptions"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productFull", propOrder = {
    "atcClasses",
    "companyAgg",
    "composition",
    "drugs",
    "galenic",
    "indications",
    "indicationsAtu",
    "indicationsLes",
    "indicationsNoAMM",
    "indicators",
    "posologyUnits",
    "product",
    "restrictedPrescriptions"
})
public class ProductFull {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfAtc atcClasses;
    @XmlElement(required = true, nillable = true)
    protected CompanyAgg companyAgg;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfItemCompositionsCouple composition;
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
    protected ArrayOfPosologyUnit posologyUnits;
    @XmlElement(required = true, nillable = true)
    protected Product product;
    @XmlElement(required = true, nillable = true)
    protected RestrictedPrescriptions restrictedPrescriptions;

    /**
     * Obtient la valeur de la propriété atcClasses.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAtc }
     *     
     */
    public ArrayOfAtc getAtcClasses() {
        return atcClasses;
    }

    /**
     * Définit la valeur de la propriété atcClasses.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAtc }
     *     
     */
    public void setAtcClasses(ArrayOfAtc value) {
        this.atcClasses = value;
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
     * Obtient la valeur de la propriété composition.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemCompositionsCouple }
     *     
     */
    public ArrayOfItemCompositionsCouple getComposition() {
        return composition;
    }

    /**
     * Définit la valeur de la propriété composition.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemCompositionsCouple }
     *     
     */
    public void setComposition(ArrayOfItemCompositionsCouple value) {
        this.composition = value;
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
     * Obtient la valeur de la propriété posologyUnits.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPosologyUnit }
     *     
     */
    public ArrayOfPosologyUnit getPosologyUnits() {
        return posologyUnits;
    }

    /**
     * Définit la valeur de la propriété posologyUnits.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPosologyUnit }
     *     
     */
    public void setPosologyUnits(ArrayOfPosologyUnit value) {
        this.posologyUnits = value;
    }

    /**
     * Obtient la valeur de la propriété product.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Définit la valeur de la propriété product.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
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

}
