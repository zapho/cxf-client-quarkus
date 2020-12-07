
package com.vidal.DrugPrescriptionAnalysisService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour alert complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="alert">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acknowledgment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="detail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rawAlertDataList" type="{urn:Vidal}ArrayOfRawAlertData"/>
 *         &lt;element name="referenceList" type="{urn:Vidal}ArrayOfReference"/>
 *         &lt;element name="relatedElementList" type="{urn:Vidal}ArrayOfRelatedElement"/>
 *         &lt;element name="severity" type="{urn:Vidal}SeverityLevel"/>
 *         &lt;element name="subType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subTypeLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tagList" type="{urn:Vidal}ArrayOfTag"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="typeLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alert", propOrder = {
    "acknowledgment",
    "comment",
    "detail",
    "rawAlertDataList",
    "referenceList",
    "relatedElementList",
    "severity",
    "subType",
    "subTypeLabel",
    "tagList",
    "title",
    "type",
    "typeLabel"
})
public class Alert {

    protected boolean acknowledgment;
    @XmlElement(required = true, nillable = true)
    protected String comment;
    @XmlElement(required = true, nillable = true)
    protected String detail;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfRawAlertData rawAlertDataList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfReference referenceList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfRelatedElement relatedElementList;
    @XmlElement(required = true, nillable = true)
    protected SeverityLevel severity;
    @XmlElement(required = true, nillable = true)
    protected String subType;
    @XmlElement(required = true, nillable = true)
    protected String subTypeLabel;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTag tagList;
    @XmlElement(required = true, nillable = true)
    protected String title;
    @XmlElement(required = true, nillable = true)
    protected String type;
    @XmlElement(required = true, nillable = true)
    protected String typeLabel;

    /**
     * Obtient la valeur de la propriété acknowledgment.
     * 
     */
    public boolean isAcknowledgment() {
        return acknowledgment;
    }

    /**
     * Définit la valeur de la propriété acknowledgment.
     * 
     */
    public void setAcknowledgment(boolean value) {
        this.acknowledgment = value;
    }

    /**
     * Obtient la valeur de la propriété comment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Définit la valeur de la propriété comment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Obtient la valeur de la propriété detail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetail() {
        return detail;
    }

    /**
     * Définit la valeur de la propriété detail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetail(String value) {
        this.detail = value;
    }

    /**
     * Obtient la valeur de la propriété rawAlertDataList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRawAlertData }
     *     
     */
    public ArrayOfRawAlertData getRawAlertDataList() {
        return rawAlertDataList;
    }

    /**
     * Définit la valeur de la propriété rawAlertDataList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRawAlertData }
     *     
     */
    public void setRawAlertDataList(ArrayOfRawAlertData value) {
        this.rawAlertDataList = value;
    }

    /**
     * Obtient la valeur de la propriété referenceList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReference }
     *     
     */
    public ArrayOfReference getReferenceList() {
        return referenceList;
    }

    /**
     * Définit la valeur de la propriété referenceList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReference }
     *     
     */
    public void setReferenceList(ArrayOfReference value) {
        this.referenceList = value;
    }

    /**
     * Obtient la valeur de la propriété relatedElementList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRelatedElement }
     *     
     */
    public ArrayOfRelatedElement getRelatedElementList() {
        return relatedElementList;
    }

    /**
     * Définit la valeur de la propriété relatedElementList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRelatedElement }
     *     
     */
    public void setRelatedElementList(ArrayOfRelatedElement value) {
        this.relatedElementList = value;
    }

    /**
     * Obtient la valeur de la propriété severity.
     * 
     * @return
     *     possible object is
     *     {@link SeverityLevel }
     *     
     */
    public SeverityLevel getSeverity() {
        return severity;
    }

    /**
     * Définit la valeur de la propriété severity.
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityLevel }
     *     
     */
    public void setSeverity(SeverityLevel value) {
        this.severity = value;
    }

    /**
     * Obtient la valeur de la propriété subType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubType() {
        return subType;
    }

    /**
     * Définit la valeur de la propriété subType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubType(String value) {
        this.subType = value;
    }

    /**
     * Obtient la valeur de la propriété subTypeLabel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTypeLabel() {
        return subTypeLabel;
    }

    /**
     * Définit la valeur de la propriété subTypeLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTypeLabel(String value) {
        this.subTypeLabel = value;
    }

    /**
     * Obtient la valeur de la propriété tagList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTag }
     *     
     */
    public ArrayOfTag getTagList() {
        return tagList;
    }

    /**
     * Définit la valeur de la propriété tagList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTag }
     *     
     */
    public void setTagList(ArrayOfTag value) {
        this.tagList = value;
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
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtient la valeur de la propriété typeLabel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeLabel() {
        return typeLabel;
    }

    /**
     * Définit la valeur de la propriété typeLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeLabel(String value) {
        this.typeLabel = value;
    }

}
