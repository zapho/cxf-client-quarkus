
package com.vidal.PosologyService;

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
 *         &lt;element name="commonNameGroupId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gender" type="{urn:Vidal}Gender"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="creatinClearance" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hepaticInsufficiency" type="{urn:Vidal}HepaticInsufficiency"/>
 *         &lt;element name="indicationIds" type="{urn:Vidal}ArrayOfInt"/>
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
    "commonNameGroupId",
    "gender",
    "age",
    "weight",
    "height",
    "creatinClearance",
    "hepaticInsufficiency",
    "indicationIds"
})
@XmlRootElement(name = "searchPosologyRouteByCommonNameGroupId")
public class SearchPosologyRouteByCommonNameGroupId {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer commonNameGroupId;
    @XmlElement(required = true, nillable = true)
    protected Gender gender;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float age;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float weight;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer height;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer creatinClearance;
    @XmlElement(required = true, nillable = true)
    protected HepaticInsufficiency hepaticInsufficiency;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt indicationIds;

    /**
     * Obtient la valeur de la propriété commonNameGroupId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCommonNameGroupId() {
        return commonNameGroupId;
    }

    /**
     * Définit la valeur de la propriété commonNameGroupId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCommonNameGroupId(Integer value) {
        this.commonNameGroupId = value;
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
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAge() {
        return age;
    }

    /**
     * Définit la valeur de la propriété age.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAge(Float value) {
        this.age = value;
    }

    /**
     * Obtient la valeur de la propriété weight.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWeight() {
        return weight;
    }

    /**
     * Définit la valeur de la propriété weight.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWeight(Float value) {
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

}
