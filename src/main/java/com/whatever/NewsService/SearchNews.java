
package com.whatever.NewsService;

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
 *         &lt;element name="typeIds" type="{urn:Vidal}ArrayOfInt"/>
 *         &lt;element name="subTypeIds" type="{urn:Vidal}ArrayOfInt"/>
 *         &lt;element name="profiles" type="{urn:Vidal}ArrayOfProfile"/>
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "typeIds",
    "subTypeIds",
    "profiles",
    "limit",
    "startDate"
})
@XmlRootElement(name = "searchNews")
public class SearchNews {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt typeIds;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt subTypeIds;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfProfile profiles;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer limit;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;

    /**
     * Obtient la valeur de la propriété typeIds.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getTypeIds() {
        return typeIds;
    }

    /**
     * Définit la valeur de la propriété typeIds.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setTypeIds(ArrayOfInt value) {
        this.typeIds = value;
    }

    /**
     * Obtient la valeur de la propriété subTypeIds.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getSubTypeIds() {
        return subTypeIds;
    }

    /**
     * Définit la valeur de la propriété subTypeIds.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setSubTypeIds(ArrayOfInt value) {
        this.subTypeIds = value;
    }

    /**
     * Obtient la valeur de la propriété profiles.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProfile }
     *     
     */
    public ArrayOfProfile getProfiles() {
        return profiles;
    }

    /**
     * Définit la valeur de la propriété profiles.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProfile }
     *     
     */
    public void setProfiles(ArrayOfProfile value) {
        this.profiles = value;
    }

    /**
     * Obtient la valeur de la propriété limit.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Définit la valeur de la propriété limit.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLimit(Integer value) {
        this.limit = value;
    }

    /**
     * Obtient la valeur de la propriété startDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Définit la valeur de la propriété startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

}
