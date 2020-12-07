
package com.vidal.InteractionService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Interaction complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Interaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="drugInteractionClass1" type="{urn:Vidal}drugInteractionClass"/>
 *         &lt;element name="drugInteractionClass2" type="{urn:Vidal}drugInteractionClass"/>
 *         &lt;element name="interactionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="precautionComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="riskComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "Interaction", propOrder = {
    "drugInteractionClass1",
    "drugInteractionClass2",
    "interactionId",
    "precautionComment",
    "riskComment",
    "severity"
})
public class Interaction {

    @XmlElement(required = true, nillable = true)
    protected DrugInteractionClass drugInteractionClass1;
    @XmlElement(required = true, nillable = true)
    protected DrugInteractionClass drugInteractionClass2;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer interactionId;
    @XmlElement(required = true, nillable = true)
    protected String precautionComment;
    @XmlElement(required = true, nillable = true)
    protected String riskComment;
    @XmlElement(required = true, nillable = true)
    protected InteractionSeverityType severity;

    /**
     * Obtient la valeur de la propriété drugInteractionClass1.
     * 
     * @return
     *     possible object is
     *     {@link DrugInteractionClass }
     *     
     */
    public DrugInteractionClass getDrugInteractionClass1() {
        return drugInteractionClass1;
    }

    /**
     * Définit la valeur de la propriété drugInteractionClass1.
     * 
     * @param value
     *     allowed object is
     *     {@link DrugInteractionClass }
     *     
     */
    public void setDrugInteractionClass1(DrugInteractionClass value) {
        this.drugInteractionClass1 = value;
    }

    /**
     * Obtient la valeur de la propriété drugInteractionClass2.
     * 
     * @return
     *     possible object is
     *     {@link DrugInteractionClass }
     *     
     */
    public DrugInteractionClass getDrugInteractionClass2() {
        return drugInteractionClass2;
    }

    /**
     * Définit la valeur de la propriété drugInteractionClass2.
     * 
     * @param value
     *     allowed object is
     *     {@link DrugInteractionClass }
     *     
     */
    public void setDrugInteractionClass2(DrugInteractionClass value) {
        this.drugInteractionClass2 = value;
    }

    /**
     * Obtient la valeur de la propriété interactionId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInteractionId() {
        return interactionId;
    }

    /**
     * Définit la valeur de la propriété interactionId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInteractionId(Integer value) {
        this.interactionId = value;
    }

    /**
     * Obtient la valeur de la propriété precautionComment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecautionComment() {
        return precautionComment;
    }

    /**
     * Définit la valeur de la propriété precautionComment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecautionComment(String value) {
        this.precautionComment = value;
    }

    /**
     * Obtient la valeur de la propriété riskComment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskComment() {
        return riskComment;
    }

    /**
     * Définit la valeur de la propriété riskComment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskComment(String value) {
        this.riskComment = value;
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
