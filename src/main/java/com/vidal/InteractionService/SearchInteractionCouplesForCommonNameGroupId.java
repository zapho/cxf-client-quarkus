
package com.vidal.InteractionService;

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
 *         &lt;element name="commonNameGroupId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="commonNameGroupIds" type="{urn:Vidal}ArrayOfInt"/>
 *         &lt;element name="severity" type="{urn:Vidal}InteractionSeverityType"/>
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
    "commonNameGroupId",
    "commonNameGroupIds",
    "severity"
})
@XmlRootElement(name = "searchInteractionCouplesForCommonNameGroupId")
public class SearchInteractionCouplesForCommonNameGroupId {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer commonNameGroupId;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt commonNameGroupIds;
    @XmlElement(required = true, nillable = true)
    protected InteractionSeverityType severity;

    /**
     * Obtient la valeur de la propriété commonNameGroupId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCommonNameGroupId() {
        return commonNameGroupId;
    }

    /**
     * Définit la valeur de la propriété commonNameGroupId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCommonNameGroupId(Integer value) {
        this.commonNameGroupId = value;
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
     * Obtient la valeur de la propriété severity.
     * 
     * @return
     *     possible object is
     *     {@link InteractionSeverityType }
     *     
     */
    public InteractionSeverityType getSeverity() {
        return severity;
    }

    /**
     * Définit la valeur de la propriété severity.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractionSeverityType }
     *     
     */
    public void setSeverity(InteractionSeverityType value) {
        this.severity = value;
    }

}
