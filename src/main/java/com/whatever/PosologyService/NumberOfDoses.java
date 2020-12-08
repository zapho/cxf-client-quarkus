
package com.whatever.PosologyService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour NumberOfDoses complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="NumberOfDoses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="absoluteDurationRange" type="{urn:Vidal}durationRange"/>
 *         &lt;element name="alerts" type="{urn:Vidal}ArrayOfSimplePosologyAlert"/>
 *         &lt;element name="maxAbsoluteNumberOfDose" type="{urn:Vidal}numberOfDose"/>
 *         &lt;element name="routes" type="{urn:Vidal}ArrayOfRoute"/>
 *         &lt;element name="usualDurationRange" type="{urn:Vidal}durationRange"/>
 *         &lt;element name="usualNumberOfDoseRange" type="{urn:Vidal}numberOfDoseRange"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfDoses", namespace = "http://posology.api.vidal.com", propOrder = {
    "absoluteDurationRange",
    "alerts",
    "maxAbsoluteNumberOfDose",
    "routes",
    "usualDurationRange",
    "usualNumberOfDoseRange"
})
public class NumberOfDoses {

    @XmlElement(required = true, nillable = true)
    protected DurationRange absoluteDurationRange;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfSimplePosologyAlert alerts;
    @XmlElement(required = true, nillable = true)
    protected NumberOfDose maxAbsoluteNumberOfDose;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfRoute routes;
    @XmlElement(required = true, nillable = true)
    protected DurationRange usualDurationRange;
    @XmlElement(required = true, nillable = true)
    protected NumberOfDoseRange usualNumberOfDoseRange;

    /**
     * Obtient la valeur de la propriété absoluteDurationRange.
     * 
     * @return
     *     possible object is
     *     {@link DurationRange }
     *     
     */
    public DurationRange getAbsoluteDurationRange() {
        return absoluteDurationRange;
    }

    /**
     * Définit la valeur de la propriété absoluteDurationRange.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationRange }
     *     
     */
    public void setAbsoluteDurationRange(DurationRange value) {
        this.absoluteDurationRange = value;
    }

    /**
     * Obtient la valeur de la propriété alerts.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSimplePosologyAlert }
     *     
     */
    public ArrayOfSimplePosologyAlert getAlerts() {
        return alerts;
    }

    /**
     * Définit la valeur de la propriété alerts.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSimplePosologyAlert }
     *     
     */
    public void setAlerts(ArrayOfSimplePosologyAlert value) {
        this.alerts = value;
    }

    /**
     * Obtient la valeur de la propriété maxAbsoluteNumberOfDose.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfDose }
     *     
     */
    public NumberOfDose getMaxAbsoluteNumberOfDose() {
        return maxAbsoluteNumberOfDose;
    }

    /**
     * Définit la valeur de la propriété maxAbsoluteNumberOfDose.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfDose }
     *     
     */
    public void setMaxAbsoluteNumberOfDose(NumberOfDose value) {
        this.maxAbsoluteNumberOfDose = value;
    }

    /**
     * Obtient la valeur de la propriété routes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoute }
     *     
     */
    public ArrayOfRoute getRoutes() {
        return routes;
    }

    /**
     * Définit la valeur de la propriété routes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoute }
     *     
     */
    public void setRoutes(ArrayOfRoute value) {
        this.routes = value;
    }

    /**
     * Obtient la valeur de la propriété usualDurationRange.
     * 
     * @return
     *     possible object is
     *     {@link DurationRange }
     *     
     */
    public DurationRange getUsualDurationRange() {
        return usualDurationRange;
    }

    /**
     * Définit la valeur de la propriété usualDurationRange.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationRange }
     *     
     */
    public void setUsualDurationRange(DurationRange value) {
        this.usualDurationRange = value;
    }

    /**
     * Obtient la valeur de la propriété usualNumberOfDoseRange.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfDoseRange }
     *     
     */
    public NumberOfDoseRange getUsualNumberOfDoseRange() {
        return usualNumberOfDoseRange;
    }

    /**
     * Définit la valeur de la propriété usualNumberOfDoseRange.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfDoseRange }
     *     
     */
    public void setUsualNumberOfDoseRange(NumberOfDoseRange value) {
        this.usualNumberOfDoseRange = value;
    }

}
