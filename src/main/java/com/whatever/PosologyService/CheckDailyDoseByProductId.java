
package com.whatever.PosologyService;

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
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dose" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="unitId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="frequencyType" type="{urn:Vidal}PosologyFrequencyType"/>
 *         &lt;element name="gender" type="{urn:Vidal}Gender"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="creatinClearance" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hepaticInsufficiency" type="{urn:Vidal}HepaticInsufficiency"/>
 *         &lt;element name="indicationIds" type="{urn:Vidal}ArrayOfInt"/>
 *         &lt;element name="routeIds" type="{urn:Vidal}ArrayOfInt"/>
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
    "productId",
    "dose",
    "unitId",
    "frequencyType",
    "gender",
    "age",
    "weight",
    "height",
    "creatinClearance",
    "hepaticInsufficiency",
    "indicationIds",
    "routeIds"
})
@XmlRootElement(name = "checkDailyDoseByProductId")
public class CheckDailyDoseByProductId {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer productId;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double dose;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer unitId;
    @XmlElement(required = true, nillable = true)
    protected PosologyFrequencyType frequencyType;
    @XmlElement(required = true, nillable = true)
    protected Gender gender;
    protected float age;
    protected float weight;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer height;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer creatinClearance;
    @XmlElement(required = true, nillable = true)
    protected HepaticInsufficiency hepaticInsufficiency;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt indicationIds;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt routeIds;

    /**
     * Obtient la valeur de la propriété productId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * Définit la valeur de la propriété productId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductId(Integer value) {
        this.productId = value;
    }

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
     * Obtient la valeur de la propriété frequencyType.
     * 
     * @return
     *     possible object is
     *     {@link PosologyFrequencyType }
     *     
     */
    public PosologyFrequencyType getFrequencyType() {
        return frequencyType;
    }

    /**
     * Définit la valeur de la propriété frequencyType.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyFrequencyType }
     *     
     */
    public void setFrequencyType(PosologyFrequencyType value) {
        this.frequencyType = value;
    }

    /**
     * Obtient la valeur de la propriété gender.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Définit la valeur de la propriété gender.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

    /**
     * Obtient la valeur de la propriété age.
     * 
     */
    public float getAge() {
        return age;
    }

    /**
     * Définit la valeur de la propriété age.
     * 
     */
    public void setAge(float value) {
        this.age = value;
    }

    /**
     * Obtient la valeur de la propriété weight.
     * 
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Définit la valeur de la propriété weight.
     * 
     */
    public void setWeight(float value) {
        this.weight = value;
    }

    /**
     * Obtient la valeur de la propriété height.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Définit la valeur de la propriété height.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeight(Integer value) {
        this.height = value;
    }

    /**
     * Obtient la valeur de la propriété creatinClearance.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreatinClearance() {
        return creatinClearance;
    }

    /**
     * Définit la valeur de la propriété creatinClearance.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreatinClearance(Integer value) {
        this.creatinClearance = value;
    }

    /**
     * Obtient la valeur de la propriété hepaticInsufficiency.
     * 
     * @return
     *     possible object is
     *     {@link HepaticInsufficiency }
     *     
     */
    public HepaticInsufficiency getHepaticInsufficiency() {
        return hepaticInsufficiency;
    }

    /**
     * Définit la valeur de la propriété hepaticInsufficiency.
     * 
     * @param value
     *     allowed object is
     *     {@link HepaticInsufficiency }
     *     
     */
    public void setHepaticInsufficiency(HepaticInsufficiency value) {
        this.hepaticInsufficiency = value;
    }

    /**
     * Obtient la valeur de la propriété indicationIds.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getIndicationIds() {
        return indicationIds;
    }

    /**
     * Définit la valeur de la propriété indicationIds.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setIndicationIds(ArrayOfInt value) {
        this.indicationIds = value;
    }

    /**
     * Obtient la valeur de la propriété routeIds.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getRouteIds() {
        return routeIds;
    }

    /**
     * Définit la valeur de la propriété routeIds.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setRouteIds(ArrayOfInt value) {
        this.routeIds = value;
    }

}
