
package com.vidal.UcdService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour ucdPosologyUnitsAndItemsConcentrations complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ucdPosologyUnitsAndItemsConcentrations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="code13" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ghs" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ghsEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ghsPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="marketStatus" type="{urn:Vidal}MarketStatus"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="retrocession" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="retrocessionEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="retrocessionPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="ucdItems" type="{urn:Vidal}ArrayOfUcdItem"/>
 *         &lt;element name="ucdPosologyUnits" type="{urn:Vidal}ArrayOfUcdPosologyUnit"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ucdPosologyUnitsAndItemsConcentrations", propOrder = {
    "code",
    "code13",
    "ghs",
    "ghsEffectiveDate",
    "ghsPrice",
    "id",
    "marketStatus",
    "name",
    "retrocession",
    "retrocessionEffectiveDate",
    "retrocessionPrice",
    "ucdItems",
    "ucdPosologyUnits"
})
public class UcdPosologyUnitsAndItemsConcentrations {

    @XmlElement(required = true, nillable = true)
    protected String code;
    @XmlElement(required = true, nillable = true)
    protected String code13;
    protected boolean ghs;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ghsEffectiveDate;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float ghsPrice;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true, nillable = true)
    protected MarketStatus marketStatus;
    @XmlElement(required = true, nillable = true)
    protected String name;
    protected boolean retrocession;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar retrocessionEffectiveDate;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float retrocessionPrice;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfUcdItem ucdItems;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfUcdPosologyUnit ucdPosologyUnits;

    /**
     * Obtient la valeur de la propriété code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Définit la valeur de la propriété code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Obtient la valeur de la propriété code13.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode13() {
        return code13;
    }

    /**
     * Définit la valeur de la propriété code13.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode13(String value) {
        this.code13 = value;
    }

    /**
     * Obtient la valeur de la propriété ghs.
     * 
     */
    public boolean isGhs() {
        return ghs;
    }

    /**
     * Définit la valeur de la propriété ghs.
     * 
     */
    public void setGhs(boolean value) {
        this.ghs = value;
    }

    /**
     * Obtient la valeur de la propriété ghsEffectiveDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGhsEffectiveDate() {
        return ghsEffectiveDate;
    }

    /**
     * Définit la valeur de la propriété ghsEffectiveDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGhsEffectiveDate(XMLGregorianCalendar value) {
        this.ghsEffectiveDate = value;
    }

    /**
     * Obtient la valeur de la propriété ghsPrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getGhsPrice() {
        return ghsPrice;
    }

    /**
     * Définit la valeur de la propriété ghsPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setGhsPrice(Float value) {
        this.ghsPrice = value;
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
     * Obtient la valeur de la propriété marketStatus.
     * 
     * @return
     *     possible object is
     *     {@link MarketStatus }
     *     
     */
    public MarketStatus getMarketStatus() {
        return marketStatus;
    }

    /**
     * Définit la valeur de la propriété marketStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketStatus }
     *     
     */
    public void setMarketStatus(MarketStatus value) {
        this.marketStatus = value;
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
     * Obtient la valeur de la propriété retrocession.
     * 
     */
    public boolean isRetrocession() {
        return retrocession;
    }

    /**
     * Définit la valeur de la propriété retrocession.
     * 
     */
    public void setRetrocession(boolean value) {
        this.retrocession = value;
    }

    /**
     * Obtient la valeur de la propriété retrocessionEffectiveDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRetrocessionEffectiveDate() {
        return retrocessionEffectiveDate;
    }

    /**
     * Définit la valeur de la propriété retrocessionEffectiveDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRetrocessionEffectiveDate(XMLGregorianCalendar value) {
        this.retrocessionEffectiveDate = value;
    }

    /**
     * Obtient la valeur de la propriété retrocessionPrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRetrocessionPrice() {
        return retrocessionPrice;
    }

    /**
     * Définit la valeur de la propriété retrocessionPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRetrocessionPrice(Float value) {
        this.retrocessionPrice = value;
    }

    /**
     * Obtient la valeur de la propriété ucdItems.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUcdItem }
     *     
     */
    public ArrayOfUcdItem getUcdItems() {
        return ucdItems;
    }

    /**
     * Définit la valeur de la propriété ucdItems.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUcdItem }
     *     
     */
    public void setUcdItems(ArrayOfUcdItem value) {
        this.ucdItems = value;
    }

    /**
     * Obtient la valeur de la propriété ucdPosologyUnits.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUcdPosologyUnit }
     *     
     */
    public ArrayOfUcdPosologyUnit getUcdPosologyUnits() {
        return ucdPosologyUnits;
    }

    /**
     * Définit la valeur de la propriété ucdPosologyUnits.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUcdPosologyUnit }
     *     
     */
    public void setUcdPosologyUnits(ArrayOfUcdPosologyUnit value) {
        this.ucdPosologyUnits = value;
    }

}
