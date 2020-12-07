
package com.vidal.UcdService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ucdPosologyUnit complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ucdPosologyUnit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dispensingUnit" type="{urn:Vidal}posologyUnit"/>
 *         &lt;element name="posologyUnit" type="{urn:Vidal}posologyUnit"/>
 *         &lt;element name="ratioOfPosologyUnitOverDispensingUnit" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="ucdItemQuantity" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="ucdItemQuantityUnit" type="{urn:Vidal}posologyUnit"/>
 *         &lt;element name="ucdItemVolume" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="ucdItemVolumeUnit" type="{urn:Vidal}posologyUnit"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ucdPosologyUnit", propOrder = {
    "dispensingUnit",
    "posologyUnit",
    "ratioOfPosologyUnitOverDispensingUnit",
    "ucdItemQuantity",
    "ucdItemQuantityUnit",
    "ucdItemVolume",
    "ucdItemVolumeUnit"
})
public class UcdPosologyUnit {

    @XmlElement(required = true, nillable = true)
    protected PosologyUnit dispensingUnit;
    @XmlElement(required = true, nillable = true)
    protected PosologyUnit posologyUnit;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float ratioOfPosologyUnitOverDispensingUnit;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float ucdItemQuantity;
    @XmlElement(required = true, nillable = true)
    protected PosologyUnit ucdItemQuantityUnit;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float ucdItemVolume;
    @XmlElement(required = true, nillable = true)
    protected PosologyUnit ucdItemVolumeUnit;

    /**
     * Obtient la valeur de la propriété dispensingUnit.
     * 
     * @return
     *     possible object is
     *     {@link PosologyUnit }
     *     
     */
    public PosologyUnit getDispensingUnit() {
        return dispensingUnit;
    }

    /**
     * Définit la valeur de la propriété dispensingUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyUnit }
     *     
     */
    public void setDispensingUnit(PosologyUnit value) {
        this.dispensingUnit = value;
    }

    /**
     * Obtient la valeur de la propriété posologyUnit.
     * 
     * @return
     *     possible object is
     *     {@link PosologyUnit }
     *     
     */
    public PosologyUnit getPosologyUnit() {
        return posologyUnit;
    }

    /**
     * Définit la valeur de la propriété posologyUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyUnit }
     *     
     */
    public void setPosologyUnit(PosologyUnit value) {
        this.posologyUnit = value;
    }

    /**
     * Obtient la valeur de la propriété ratioOfPosologyUnitOverDispensingUnit.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRatioOfPosologyUnitOverDispensingUnit() {
        return ratioOfPosologyUnitOverDispensingUnit;
    }

    /**
     * Définit la valeur de la propriété ratioOfPosologyUnitOverDispensingUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRatioOfPosologyUnitOverDispensingUnit(Float value) {
        this.ratioOfPosologyUnitOverDispensingUnit = value;
    }

    /**
     * Obtient la valeur de la propriété ucdItemQuantity.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getUcdItemQuantity() {
        return ucdItemQuantity;
    }

    /**
     * Définit la valeur de la propriété ucdItemQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setUcdItemQuantity(Float value) {
        this.ucdItemQuantity = value;
    }

    /**
     * Obtient la valeur de la propriété ucdItemQuantityUnit.
     * 
     * @return
     *     possible object is
     *     {@link PosologyUnit }
     *     
     */
    public PosologyUnit getUcdItemQuantityUnit() {
        return ucdItemQuantityUnit;
    }

    /**
     * Définit la valeur de la propriété ucdItemQuantityUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyUnit }
     *     
     */
    public void setUcdItemQuantityUnit(PosologyUnit value) {
        this.ucdItemQuantityUnit = value;
    }

    /**
     * Obtient la valeur de la propriété ucdItemVolume.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getUcdItemVolume() {
        return ucdItemVolume;
    }

    /**
     * Définit la valeur de la propriété ucdItemVolume.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setUcdItemVolume(Float value) {
        this.ucdItemVolume = value;
    }

    /**
     * Obtient la valeur de la propriété ucdItemVolumeUnit.
     * 
     * @return
     *     possible object is
     *     {@link PosologyUnit }
     *     
     */
    public PosologyUnit getUcdItemVolumeUnit() {
        return ucdItemVolumeUnit;
    }

    /**
     * Définit la valeur de la propriété ucdItemVolumeUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyUnit }
     *     
     */
    public void setUcdItemVolumeUnit(PosologyUnit value) {
        this.ucdItemVolumeUnit = value;
    }

}
