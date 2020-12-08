
package com.whatever.UcdService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour ucd complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ucd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="code13" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ghs" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ghsPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="marketStatus" type="{urn:Vidal}MarketStatus"/>
 *         &lt;element name="maxUcdRangePrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="minUcdRangePrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prescriptionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="retrocession" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="retrocessionPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="safetyAlert" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ssr" type="{urn:Vidal}FourStateBoolean"/>
 *         &lt;element name="ssrEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ucd", propOrder = {
    "code",
    "code13",
    "ghs",
    "ghsPrice",
    "id",
    "marketStatus",
    "maxUcdRangePrice",
    "minUcdRangePrice",
    "name",
    "prescriptionName",
    "retrocession",
    "retrocessionPrice",
    "safetyAlert",
    "ssr",
    "ssrEffectiveDate"
})
public class Ucd {

    @XmlElement(required = true, nillable = true)
    protected String code;
    @XmlElement(required = true, nillable = true)
    protected String code13;
    protected boolean ghs;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float ghsPrice;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true, nillable = true)
    protected MarketStatus marketStatus;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float maxUcdRangePrice;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float minUcdRangePrice;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String prescriptionName;
    protected boolean retrocession;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float retrocessionPrice;
    protected boolean safetyAlert;
    @XmlElement(required = true, nillable = true)
    protected FourStateBoolean ssr;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ssrEffectiveDate;

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
     * Obtient la valeur de la propriété maxUcdRangePrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxUcdRangePrice() {
        return maxUcdRangePrice;
    }

    /**
     * Définit la valeur de la propriété maxUcdRangePrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxUcdRangePrice(Float value) {
        this.maxUcdRangePrice = value;
    }

    /**
     * Obtient la valeur de la propriété minUcdRangePrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinUcdRangePrice() {
        return minUcdRangePrice;
    }

    /**
     * Définit la valeur de la propriété minUcdRangePrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinUcdRangePrice(Float value) {
        this.minUcdRangePrice = value;
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
     * Obtient la valeur de la propriété prescriptionName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrescriptionName() {
        return prescriptionName;
    }

    /**
     * Définit la valeur de la propriété prescriptionName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrescriptionName(String value) {
        this.prescriptionName = value;
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
     * Obtient la valeur de la propriété safetyAlert.
     * 
     */
    public boolean isSafetyAlert() {
        return safetyAlert;
    }

    /**
     * Définit la valeur de la propriété safetyAlert.
     * 
     */
    public void setSafetyAlert(boolean value) {
        this.safetyAlert = value;
    }

    /**
     * Obtient la valeur de la propriété ssr.
     * 
     * @return
     *     possible object is
     *     {@link FourStateBoolean }
     *     
     */
    public FourStateBoolean getSsr() {
        return ssr;
    }

    /**
     * Définit la valeur de la propriété ssr.
     * 
     * @param value
     *     allowed object is
     *     {@link FourStateBoolean }
     *     
     */
    public void setSsr(FourStateBoolean value) {
        this.ssr = value;
    }

    /**
     * Obtient la valeur de la propriété ssrEffectiveDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSsrEffectiveDate() {
        return ssrEffectiveDate;
    }

    /**
     * Définit la valeur de la propriété ssrEffectiveDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSsrEffectiveDate(XMLGregorianCalendar value) {
        this.ssrEffectiveDate = value;
    }

}
