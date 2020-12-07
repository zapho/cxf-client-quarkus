
package com.vidal.PosologyService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour posologyFrequency complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="posologyFrequency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asNeeded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="secondDuration" type="{urn:Vidal}PosologyDuration"/>
 *         &lt;element name="thirdDuration" type="{urn:Vidal}PosologyDuration"/>
 *         &lt;element name="type" type="{urn:Vidal}PosologyFrequencyType"/>
 *         &lt;element name="typeDetail" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "posologyFrequency", propOrder = {
    "asNeeded",
    "secondDuration",
    "thirdDuration",
    "type",
    "typeDetail",
    "value"
})
public class PosologyFrequency {

    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean asNeeded;
    @XmlElement(required = true, nillable = true)
    protected PosologyDuration secondDuration;
    @XmlElement(required = true, nillable = true)
    protected PosologyDuration thirdDuration;
    @XmlElement(required = true, nillable = true)
    protected PosologyFrequencyType type;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer typeDetail;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer value;

    /**
     * Obtient la valeur de la propriété asNeeded.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAsNeeded() {
        return asNeeded;
    }

    /**
     * Définit la valeur de la propriété asNeeded.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAsNeeded(Boolean value) {
        this.asNeeded = value;
    }

    /**
     * Obtient la valeur de la propriété secondDuration.
     * 
     * @return
     *     possible object is
     *     {@link PosologyDuration }
     *     
     */
    public PosologyDuration getSecondDuration() {
        return secondDuration;
    }

    /**
     * Définit la valeur de la propriété secondDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyDuration }
     *     
     */
    public void setSecondDuration(PosologyDuration value) {
        this.secondDuration = value;
    }

    /**
     * Obtient la valeur de la propriété thirdDuration.
     * 
     * @return
     *     possible object is
     *     {@link PosologyDuration }
     *     
     */
    public PosologyDuration getThirdDuration() {
        return thirdDuration;
    }

    /**
     * Définit la valeur de la propriété thirdDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyDuration }
     *     
     */
    public void setThirdDuration(PosologyDuration value) {
        this.thirdDuration = value;
    }

    /**
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link PosologyFrequencyType }
     *     
     */
    public PosologyFrequencyType getType() {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyFrequencyType }
     *     
     */
    public void setType(PosologyFrequencyType value) {
        this.type = value;
    }

    /**
     * Obtient la valeur de la propriété typeDetail.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTypeDetail() {
        return typeDetail;
    }

    /**
     * Définit la valeur de la propriété typeDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTypeDetail(Integer value) {
        this.typeDetail = value;
    }

    /**
     * Obtient la valeur de la propriété value.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValue(Integer value) {
        this.value = value;
    }

}
