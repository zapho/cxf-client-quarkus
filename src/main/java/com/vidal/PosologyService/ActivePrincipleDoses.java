
package com.vidal.PosologyService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ActivePrincipleDoses complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ActivePrincipleDoses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="absoluteDurationRange" type="{urn:Vidal}durationRange"/>
 *         &lt;element name="alerts" type="{urn:Vidal}ArrayOfSimplePosologyAlert"/>
 *         &lt;element name="maxAbsoluteActivePrincipleDose" type="{urn:Vidal}activePrincipleDose"/>
 *         &lt;element name="routes" type="{urn:Vidal}ArrayOfRoute"/>
 *         &lt;element name="usualActivePrincipleDoseRange" type="{urn:Vidal}activePrincipleDoseRange"/>
 *         &lt;element name="usualDurationRange" type="{urn:Vidal}durationRange"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivePrincipleDoses", namespace = "http://posology.api.vidal.com", propOrder = {
    "absoluteDurationRange",
    "alerts",
    "maxAbsoluteActivePrincipleDose",
    "routes",
    "usualActivePrincipleDoseRange",
    "usualDurationRange"
})
public class ActivePrincipleDoses {

    @XmlElement(required = true, nillable = true)
    protected DurationRange absoluteDurationRange;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfSimplePosologyAlert alerts;
    @XmlElement(required = true, nillable = true)
    protected ActivePrincipleDose maxAbsoluteActivePrincipleDose;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfRoute routes;
    @XmlElement(required = true, nillable = true)
    protected ActivePrincipleDoseRange usualActivePrincipleDoseRange;
    @XmlElement(required = true, nillable = true)
    protected DurationRange usualDurationRange;

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
     * Obtient la valeur de la propriété maxAbsoluteActivePrincipleDose.
     * 
     * @return
     *     possible object is
     *     {@link ActivePrincipleDose }
     *     
     */
    public ActivePrincipleDose getMaxAbsoluteActivePrincipleDose() {
        return maxAbsoluteActivePrincipleDose;
    }

    /**
     * Définit la valeur de la propriété maxAbsoluteActivePrincipleDose.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivePrincipleDose }
     *     
     */
    public void setMaxAbsoluteActivePrincipleDose(ActivePrincipleDose value) {
        this.maxAbsoluteActivePrincipleDose = value;
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
     * Obtient la valeur de la propriété usualActivePrincipleDoseRange.
     * 
     * @return
     *     possible object is
     *     {@link ActivePrincipleDoseRange }
     *     
     */
    public ActivePrincipleDoseRange getUsualActivePrincipleDoseRange() {
        return usualActivePrincipleDoseRange;
    }

    /**
     * Définit la valeur de la propriété usualActivePrincipleDoseRange.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivePrincipleDoseRange }
     *     
     */
    public void setUsualActivePrincipleDoseRange(ActivePrincipleDoseRange value) {
        this.usualActivePrincipleDoseRange = value;
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

}
