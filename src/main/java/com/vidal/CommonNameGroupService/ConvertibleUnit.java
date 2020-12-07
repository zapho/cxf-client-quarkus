
package com.vidal.CommonNameGroupService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour convertibleUnit complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="convertibleUnit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rate" type="{urn:Vidal}rate"/>
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="typeList" type="{urn:Vidal}ArrayOfString"/>
 *         &lt;element name="unit" type="{urn:Vidal}posologyUnit"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "convertibleUnit", propOrder = {
    "rank",
    "rate",
    "reference",
    "typeList",
    "unit"
})
public class ConvertibleUnit {

    protected int rank;
    @XmlElement(required = true, nillable = true)
    protected Rate rate;
    protected boolean reference;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString typeList;
    @XmlElement(required = true, nillable = true)
    protected PosologyUnit unit;

    /**
     * Obtient la valeur de la propriété rank.
     * 
     */
    public int getRank() {
        return rank;
    }

    /**
     * Définit la valeur de la propriété rank.
     * 
     */
    public void setRank(int value) {
        this.rank = value;
    }

    /**
     * Obtient la valeur de la propriété rate.
     * 
     * @return
     *     possible object is
     *     {@link Rate }
     *     
     */
    public Rate getRate() {
        return rate;
    }

    /**
     * Définit la valeur de la propriété rate.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate }
     *     
     */
    public void setRate(Rate value) {
        this.rate = value;
    }

    /**
     * Obtient la valeur de la propriété reference.
     * 
     */
    public boolean isReference() {
        return reference;
    }

    /**
     * Définit la valeur de la propriété reference.
     * 
     */
    public void setReference(boolean value) {
        this.reference = value;
    }

    /**
     * Obtient la valeur de la propriété typeList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getTypeList() {
        return typeList;
    }

    /**
     * Définit la valeur de la propriété typeList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setTypeList(ArrayOfString value) {
        this.typeList = value;
    }

    /**
     * Obtient la valeur de la propriété unit.
     * 
     * @return
     *     possible object is
     *     {@link PosologyUnit }
     *     
     */
    public PosologyUnit getUnit() {
        return unit;
    }

    /**
     * Définit la valeur de la propriété unit.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyUnit }
     *     
     */
    public void setUnit(PosologyUnit value) {
        this.unit = value;
    }

}
