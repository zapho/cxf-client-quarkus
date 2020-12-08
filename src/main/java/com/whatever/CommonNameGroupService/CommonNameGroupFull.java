
package com.whatever.CommonNameGroupService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour commonNameGroupFull complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="commonNameGroupFull">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="atcClasses" type="{urn:Vidal}ArrayOfAtc"/>
 *         &lt;element name="commonNameGroup" type="{urn:Vidal}commonNameGroup"/>
 *         &lt;element name="commonNameGroupCompositions" type="{urn:Vidal}ArrayOfCommonNameGroupComposition"/>
 *         &lt;element name="drugs" type="{urn:Vidal}drugsAgg"/>
 *         &lt;element name="galenic" type="{urn:Vidal}galenicAgg"/>
 *         &lt;element name="indications" type="{urn:Vidal}ArrayOfIndication"/>
 *         &lt;element name="indicationsAtu" type="{urn:Vidal}ArrayOfOtherIndication"/>
 *         &lt;element name="indicationsLes" type="{urn:Vidal}ArrayOfIndicationLes"/>
 *         &lt;element name="indicationsNoAMM" type="{urn:Vidal}ArrayOfTypedIndication"/>
 *         &lt;element name="indicators" type="{urn:Vidal}ArrayOfIndicator"/>
 *         &lt;element name="restrictedPrescriptions" type="{urn:Vidal}restrictedPrescriptions"/>
 *         &lt;element name="units" type="{urn:Vidal}units"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commonNameGroupFull", propOrder = {
    "atcClasses",
    "commonNameGroup",
    "commonNameGroupCompositions",
    "drugs",
    "galenic",
    "indications",
    "indicationsAtu",
    "indicationsLes",
    "indicationsNoAMM",
    "indicators",
    "restrictedPrescriptions",
    "units"
})
public class CommonNameGroupFull {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfAtc atcClasses;
    @XmlElement(required = true, nillable = true)
    protected CommonNameGroup commonNameGroup;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroupComposition commonNameGroupCompositions;
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
    protected Units units;

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
     * Obtient la valeur de la propriété commonNameGroup.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroup }
     *     
     */
    public CommonNameGroup getCommonNameGroup() {
        return commonNameGroup;
    }

    /**
     * Définit la valeur de la propriété commonNameGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroup }
     *     
     */
    public void setCommonNameGroup(CommonNameGroup value) {
        this.commonNameGroup = value;
    }

    /**
     * Obtient la valeur de la propriété commonNameGroupCompositions.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroupComposition }
     *     
     */
    public ArrayOfCommonNameGroupComposition getCommonNameGroupCompositions() {
        return commonNameGroupCompositions;
    }

    /**
     * Définit la valeur de la propriété commonNameGroupCompositions.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroupComposition }
     *     
     */
    public void setCommonNameGroupCompositions(ArrayOfCommonNameGroupComposition value) {
        this.commonNameGroupCompositions = value;
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
     * Obtient la valeur de la propriété units.
     * 
     * @return
     *     possible object is
     *     {@link Units }
     *     
     */
    public Units getUnits() {
        return units;
    }

    /**
     * Définit la valeur de la propriété units.
     * 
     * @param value
     *     allowed object is
     *     {@link Units }
     *     
     */
    public void setUnits(Units value) {
        this.units = value;
    }

}
