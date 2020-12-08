
package com.whatever.CommonNameGroupService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour commonNameGroup complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="commonNameGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxUcdRangePrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="medicaBaseCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="medicaBaseName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="minUcdRangePrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="notHomogeneousByInteractions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="publicName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regulatoryGenericPrescription" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commonNameGroup", propOrder = {
    "id",
    "maxUcdRangePrice",
    "medicaBaseCode",
    "medicaBaseName",
    "minUcdRangePrice",
    "name",
    "notHomogeneousByInteractions",
    "publicName",
    "regulatoryGenericPrescription"
})
public class CommonNameGroup {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float maxUcdRangePrice;
    @XmlElement(required = true, nillable = true)
    protected String medicaBaseCode;
    @XmlElement(required = true, nillable = true)
    protected String medicaBaseName;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float minUcdRangePrice;
    @XmlElement(required = true, nillable = true)
    protected String name;
    protected boolean notHomogeneousByInteractions;
    @XmlElement(required = true, nillable = true)
    protected String publicName;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean regulatoryGenericPrescription;

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
     * Obtient la valeur de la propriété medicaBaseCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicaBaseCode() {
        return medicaBaseCode;
    }

    /**
     * Définit la valeur de la propriété medicaBaseCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicaBaseCode(String value) {
        this.medicaBaseCode = value;
    }

    /**
     * Obtient la valeur de la propriété medicaBaseName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicaBaseName() {
        return medicaBaseName;
    }

    /**
     * Définit la valeur de la propriété medicaBaseName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicaBaseName(String value) {
        this.medicaBaseName = value;
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
     * Obtient la valeur de la propriété notHomogeneousByInteractions.
     * 
     */
    public boolean isNotHomogeneousByInteractions() {
        return notHomogeneousByInteractions;
    }

    /**
     * Définit la valeur de la propriété notHomogeneousByInteractions.
     * 
     */
    public void setNotHomogeneousByInteractions(boolean value) {
        this.notHomogeneousByInteractions = value;
    }

    /**
     * Obtient la valeur de la propriété publicName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicName() {
        return publicName;
    }

    /**
     * Définit la valeur de la propriété publicName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicName(String value) {
        this.publicName = value;
    }

    /**
     * Obtient la valeur de la propriété regulatoryGenericPrescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegulatoryGenericPrescription() {
        return regulatoryGenericPrescription;
    }

    /**
     * Définit la valeur de la propriété regulatoryGenericPrescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegulatoryGenericPrescription(Boolean value) {
        this.regulatoryGenericPrescription = value;
    }

}
