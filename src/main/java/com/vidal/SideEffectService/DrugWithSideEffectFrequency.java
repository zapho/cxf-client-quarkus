
package com.vidal.SideEffectService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour drugWithSideEffectFrequency complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="drugWithSideEffectFrequency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="drugType" type="{urn:Vidal}DrugType"/>
 *         &lt;element name="frequency" type="{urn:Vidal}Frequency"/>
 *         &lt;element name="frequencyLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "drugWithSideEffectFrequency", propOrder = {
    "drugType",
    "frequency",
    "frequencyLabel",
    "id",
    "name",
    "rank"
})
public class DrugWithSideEffectFrequency {

    @XmlElement(required = true, nillable = true)
    protected DrugType drugType;
    @XmlElement(required = true, nillable = true)
    protected Frequency frequency;
    @XmlElement(required = true, nillable = true)
    protected String frequencyLabel;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer rank;

    /**
     * Obtient la valeur de la propriété drugType.
     * 
     * @return
     *     possible object is
     *     {@link DrugType }
     *     
     */
    public DrugType getDrugType() {
        return drugType;
    }

    /**
     * Définit la valeur de la propriété drugType.
     * 
     * @param value
     *     allowed object is
     *     {@link DrugType }
     *     
     */
    public void setDrugType(DrugType value) {
        this.drugType = value;
    }

    /**
     * Obtient la valeur de la propriété frequency.
     * 
     * @return
     *     possible object is
     *     {@link Frequency }
     *     
     */
    public Frequency getFrequency() {
        return frequency;
    }

    /**
     * Définit la valeur de la propriété frequency.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency }
     *     
     */
    public void setFrequency(Frequency value) {
        this.frequency = value;
    }

    /**
     * Obtient la valeur de la propriété frequencyLabel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencyLabel() {
        return frequencyLabel;
    }

    /**
     * Définit la valeur de la propriété frequencyLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencyLabel(String value) {
        this.frequencyLabel = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété rank.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * Définit la valeur de la propriété rank.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRank(Integer value) {
        this.rank = value;
    }

}
