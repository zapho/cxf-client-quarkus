
package com.whatever.UcdService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ratioPosologyUnit complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ratioPosologyUnit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="posologyUnit" type="{urn:Vidal}posologyUnit"/>
 *         &lt;element name="ratioOfPosologyUnitOverDispensingUnit" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ratioPosologyUnit", propOrder = {
    "posologyUnit",
    "ratioOfPosologyUnitOverDispensingUnit"
})
public class RatioPosologyUnit {

    @XmlElement(required = true, nillable = true)
    protected PosologyUnit posologyUnit;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float ratioOfPosologyUnitOverDispensingUnit;

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

}
