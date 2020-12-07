
package com.vidal.DrugInteractionClassService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour drugInteractionClassSeverityCouple complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="drugInteractionClassSeverityCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="drugInteractionClass" type="{urn:Vidal}drugInteractionClass"/>
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
@XmlType(name = "drugInteractionClassSeverityCouple", propOrder = {
    "drugInteractionClass",
    "precautionComment",
    "riskComment",
    "severity"
})
public class DrugInteractionClassSeverityCouple {

    @XmlElement(required = true, nillable = true)
    protected DrugInteractionClass drugInteractionClass;
    @XmlElement(required = true, nillable = true)
    protected String precautionComment;
    @XmlElement(required = true, nillable = true)
    protected String riskComment;
    @XmlElement(required = true, nillable = true)
    protected InteractionSeverityType severity;

    /**
     * Obtient la valeur de la propriété drugInteractionClass.
     * 
     * @return
     *     possible object is
     *     {@link DrugInteractionClass }
     *     
     */
    public DrugInteractionClass getDrugInteractionClass() {
        return drugInteractionClass;
    }

    /**
     * Définit la valeur de la propriété drugInteractionClass.
     * 
     * @param value
     *     allowed object is
     *     {@link DrugInteractionClass }
     *     
     */
    public void setDrugInteractionClass(DrugInteractionClass value) {
        this.drugInteractionClass = value;
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
