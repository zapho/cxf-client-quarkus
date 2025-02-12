
package com.whatever.UcdService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ucdDispensingUnit complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ucdDispensingUnit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dispensingUnit" type="{urn:Vidal}posologyUnit"/>
 *         &lt;element name="posologyUnits" type="{urn:Vidal}ArrayOfRatioPosologyUnit"/>
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
@XmlType(name = "ucdDispensingUnit", propOrder = {
    "dispensingUnit",
    "posologyUnits",
    "ucdItemQuantity",
    "ucdItemQuantityUnit",
    "ucdItemVolume",
    "ucdItemVolumeUnit"
})
public class UcdDispensingUnit {

    @XmlElement(required = true, nillable = true)
    protected PosologyUnit dispensingUnit;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfRatioPosologyUnit posologyUnits;
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
     * Obtient la valeur de la propriété posologyUnits.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRatioPosologyUnit }
     *     
     */
    public ArrayOfRatioPosologyUnit getPosologyUnits() {
        return posologyUnits;
    }

    /**
     * Définit la valeur de la propriété posologyUnits.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRatioPosologyUnit }
     *     
     */
    public void setPosologyUnits(ArrayOfRatioPosologyUnit value) {
        this.posologyUnits = value;
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
