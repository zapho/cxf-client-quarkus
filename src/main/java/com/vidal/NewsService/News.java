
package com.vidal.NewsService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour news complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="news">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="categories" type="{urn:Vidal}ArrayOfNewCategory"/>
 *         &lt;element name="content" type="{urn:Vidal}newsContent"/>
 *         &lt;element name="defaultLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="links" type="{urn:Vidal}ArrayOfNewsLink"/>
 *         &lt;element name="publishedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="summary" type="{urn:Vidal}newsContent"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="updatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "news", propOrder = {
    "authorName",
    "categories",
    "content",
    "defaultLink",
    "id",
    "links",
    "publishedDate",
    "summary",
    "title",
    "updatedDate"
})
public class News {

    @XmlElement(required = true, nillable = true)
    protected String authorName;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfNewCategory categories;
    @XmlElement(required = true, nillable = true)
    protected NewsContent content;
    @XmlElement(required = true, nillable = true)
    protected String defaultLink;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfNewsLink links;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishedDate;
    @XmlElement(required = true, nillable = true)
    protected NewsContent summary;
    @XmlElement(required = true, nillable = true)
    protected String title;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedDate;

    /**
     * Obtient la valeur de la propriété authorName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * Définit la valeur de la propriété authorName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorName(String value) {
        this.authorName = value;
    }

    /**
     * Obtient la valeur de la propriété categories.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNewCategory }
     *     
     */
    public ArrayOfNewCategory getCategories() {
        return categories;
    }

    /**
     * Définit la valeur de la propriété categories.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNewCategory }
     *     
     */
    public void setCategories(ArrayOfNewCategory value) {
        this.categories = value;
    }

    /**
     * Obtient la valeur de la propriété content.
     * 
     * @return
     *     possible object is
     *     {@link NewsContent }
     *     
     */
    public NewsContent getContent() {
        return content;
    }

    /**
     * Définit la valeur de la propriété content.
     * 
     * @param value
     *     allowed object is
     *     {@link NewsContent }
     *     
     */
    public void setContent(NewsContent value) {
        this.content = value;
    }

    /**
     * Obtient la valeur de la propriété defaultLink.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultLink() {
        return defaultLink;
    }

    /**
     * Définit la valeur de la propriété defaultLink.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultLink(String value) {
        this.defaultLink = value;
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
     * Obtient la valeur de la propriété links.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNewsLink }
     *     
     */
    public ArrayOfNewsLink getLinks() {
        return links;
    }

    /**
     * Définit la valeur de la propriété links.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNewsLink }
     *     
     */
    public void setLinks(ArrayOfNewsLink value) {
        this.links = value;
    }

    /**
     * Obtient la valeur de la propriété publishedDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublishedDate() {
        return publishedDate;
    }

    /**
     * Définit la valeur de la propriété publishedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublishedDate(XMLGregorianCalendar value) {
        this.publishedDate = value;
    }

    /**
     * Obtient la valeur de la propriété summary.
     * 
     * @return
     *     possible object is
     *     {@link NewsContent }
     *     
     */
    public NewsContent getSummary() {
        return summary;
    }

    /**
     * Définit la valeur de la propriété summary.
     * 
     * @param value
     *     allowed object is
     *     {@link NewsContent }
     *     
     */
    public void setSummary(NewsContent value) {
        this.summary = value;
    }

    /**
     * Obtient la valeur de la propriété title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Définit la valeur de la propriété title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtient la valeur de la propriété updatedDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Définit la valeur de la propriété updatedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedDate(XMLGregorianCalendar value) {
        this.updatedDate = value;
    }

}
