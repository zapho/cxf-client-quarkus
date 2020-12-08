
package com.whatever.SideEffectService;

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
 *         &lt;element name="productIds" type="{urn:Vidal}ArrayOfInt"/>
 *         &lt;element name="packIds" type="{urn:Vidal}ArrayOfInt"/>
 *         &lt;element name="commonNameGroupIds" type="{urn:Vidal}ArrayOfInt"/>
 *         &lt;element name="ucdIds" type="{urn:Vidal}ArrayOfInt"/>
 *         &lt;element name="sideEffectId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "packIds",
    "commonNameGroupIds",
    "ucdIds",
    "sideEffectId"
})
@XmlRootElement(name = "sortDrugsBySideEffectFrequency")
public class SortDrugsBySideEffectFrequency {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt productIds;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt packIds;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt commonNameGroupIds;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt ucdIds;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer sideEffectId;

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
     * Obtient la valeur de la propriété packIds.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getPackIds() {
        return packIds;
    }

    /**
     * Définit la valeur de la propriété packIds.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setPackIds(ArrayOfInt value) {
        this.packIds = value;
    }

    /**
     * Obtient la valeur de la propriété commonNameGroupIds.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getCommonNameGroupIds() {
        return commonNameGroupIds;
    }

    /**
     * Définit la valeur de la propriété commonNameGroupIds.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setCommonNameGroupIds(ArrayOfInt value) {
        this.commonNameGroupIds = value;
    }

    /**
     * Obtient la valeur de la propriété ucdIds.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getUcdIds() {
        return ucdIds;
    }

    /**
     * Définit la valeur de la propriété ucdIds.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setUcdIds(ArrayOfInt value) {
        this.ucdIds = value;
    }

    /**
     * Obtient la valeur de la propriété sideEffectId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSideEffectId() {
        return sideEffectId;
    }

    /**
     * Définit la valeur de la propriété sideEffectId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSideEffectId(Integer value) {
        this.sideEffectId = value;
    }

}
