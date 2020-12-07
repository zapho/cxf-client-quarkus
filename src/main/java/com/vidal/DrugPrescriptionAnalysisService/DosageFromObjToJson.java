
package com.vidal.DrugPrescriptionAnalysisService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dose" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="unitId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="intervalMin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="intervalMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="intervalUnitId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dose",
    "unitId",
    "intervalMin",
    "intervalMax",
    "intervalUnitId"
})
@XmlRootElement(name = "dosageFromObjToJson")
public class DosageFromObjToJson {

    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double dose;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer unitId;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer intervalMin;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer intervalMax;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer intervalUnitId;

    /**
     * Obtient la valeur de la propriété dose.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDose() {
        return dose;
    }

    /**
     * Définit la valeur de la propriété dose.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDose(Double value) {
        this.dose = value;
    }

    /**
     * Obtient la valeur de la propriété unitId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnitId() {
        return unitId;
    }

    /**
     * Définit la valeur de la propriété unitId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnitId(Integer value) {
        this.unitId = value;
    }

    /**
     * Obtient la valeur de la propriété intervalMin.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntervalMin() {
        return intervalMin;
    }

    /**
     * Définit la valeur de la propriété intervalMin.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntervalMin(Integer value) {
        this.intervalMin = value;
    }

    /**
     * Obtient la valeur de la propriété intervalMax.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntervalMax() {
        return intervalMax;
    }

    /**
     * Définit la valeur de la propriété intervalMax.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntervalMax(Integer value) {
        this.intervalMax = value;
    }

    /**
     * Obtient la valeur de la propriété intervalUnitId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntervalUnitId() {
        return intervalUnitId;
    }

    /**
     * Définit la valeur de la propriété intervalUnitId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntervalUnitId(Integer value) {
        this.intervalUnitId = value;
    }

}
