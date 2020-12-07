
package com.vidal.PrecautionService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="productIds" type="{urn:Vidal}ArrayOfInt"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="breastfeeding" type="{urn:Vidal}Breastfeeding"/>
 *         &lt;element name="weeksOfAmenorrhoea" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="creatinClearance" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gender" type="{urn:Vidal}Gender"/>
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
    "productIds",
    "dateOfBirth",
    "weight",
    "breastfeeding",
    "weeksOfAmenorrhoea",
    "creatinClearance",
    "gender"
})
@XmlRootElement(name = "searchPrecautionEPPCoupleByIds")
public class SearchPrecautionEPPCoupleByIds {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt productIds;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer weight;
    @XmlElement(required = true, nillable = true)
    protected Breastfeeding breastfeeding;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer weeksOfAmenorrhoea;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer creatinClearance;
    @XmlElement(required = true, nillable = true)
    protected Gender gender;

    /**
     * Obtient la valeur de la propriété productIds.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getProductIds() {
        return productIds;
    }

    /**
     * Définit la valeur de la propriété productIds.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setProductIds(ArrayOfInt value) {
        this.productIds = value;
    }

    /**
     * Obtient la valeur de la propriété dateOfBirth.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Définit la valeur de la propriété dateOfBirth.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Obtient la valeur de la propriété weight.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * Définit la valeur de la propriété weight.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeight(Integer value) {
        this.weight = value;
    }

    /**
     * Obtient la valeur de la propriété breastfeeding.
     * 
     * @return
     *     possible object is
     *     {@link Breastfeeding }
     *     
     */
    public Breastfeeding getBreastfeeding() {
        return breastfeeding;
    }

    /**
     * Définit la valeur de la propriété breastfeeding.
     * 
     * @param value
     *     allowed object is
     *     {@link Breastfeeding }
     *     
     */
    public void setBreastfeeding(Breastfeeding value) {
        this.breastfeeding = value;
    }

    /**
     * Obtient la valeur de la propriété weeksOfAmenorrhoea.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeeksOfAmenorrhoea() {
        return weeksOfAmenorrhoea;
    }

    /**
     * Définit la valeur de la propriété weeksOfAmenorrhoea.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeeksOfAmenorrhoea(Integer value) {
        this.weeksOfAmenorrhoea = value;
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

}
