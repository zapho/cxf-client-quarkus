
package com.vidal.InteractionService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour interactionCoupleCommonNameGroup complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="interactionCoupleCommonNameGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonNameGroupA" type="{urn:Vidal}commonNameGroup"/>
 *         &lt;element name="commonNameGroupB" type="{urn:Vidal}commonNameGroup"/>
 *         &lt;element name="drugInteractionClassA" type="{urn:Vidal}drugInteractionClass"/>
 *         &lt;element name="drugInteractionClassB" type="{urn:Vidal}drugInteractionClass"/>
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
@XmlType(name = "interactionCoupleCommonNameGroup", propOrder = {
    "commonNameGroupA",
    "commonNameGroupB",
    "drugInteractionClassA",
    "drugInteractionClassB",
    "precautionComment",
    "riskComment",
    "severity"
})
public class InteractionCoupleCommonNameGroup {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroup commonNameGroupA;
    @XmlElement(required = true, nillable = true)
    protected CommonNameGroup commonNameGroupB;
    @XmlElement(required = true, nillable = true)
    protected DrugInteractionClass drugInteractionClassA;
    @XmlElement(required = true, nillable = true)
    protected DrugInteractionClass drugInteractionClassB;
    @XmlElement(required = true, nillable = true)
    protected String precautionComment;
    @XmlElement(required = true, nillable = true)
    protected String riskComment;
    @XmlElement(required = true, nillable = true)
    protected InteractionSeverityType severity;

    /**
     * Obtient la valeur de la propriété commonNameGroupA.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroup }
     *     
     */
    public CommonNameGroup getCommonNameGroupA() {
        return commonNameGroupA;
    }

    /**
     * Définit la valeur de la propriété commonNameGroupA.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroup }
     *     
     */
    public void setCommonNameGroupA(CommonNameGroup value) {
        this.commonNameGroupA = value;
    }

    /**
     * Obtient la valeur de la propriété commonNameGroupB.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroup }
     *     
     */
    public CommonNameGroup getCommonNameGroupB() {
        return commonNameGroupB;
    }

    /**
     * Définit la valeur de la propriété commonNameGroupB.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroup }
     *     
     */
    public void setCommonNameGroupB(CommonNameGroup value) {
        this.commonNameGroupB = value;
    }

    /**
     * Obtient la valeur de la propriété drugInteractionClassA.
     * 
     * @return
     *     possible object is
     *     {@link DrugInteractionClass }
     *     
     */
    public DrugInteractionClass getDrugInteractionClassA() {
        return drugInteractionClassA;
    }

    /**
     * Définit la valeur de la propriété drugInteractionClassA.
     * 
     * @param value
     *     allowed object is
     *     {@link DrugInteractionClass }
     *     
     */
    public void setDrugInteractionClassA(DrugInteractionClass value) {
        this.drugInteractionClassA = value;
    }

    /**
     * Obtient la valeur de la propriété drugInteractionClassB.
     * 
     * @return
     *     possible object is
     *     {@link DrugInteractionClass }
     *     
     */
    public DrugInteractionClass getDrugInteractionClassB() {
        return drugInteractionClassB;
    }

    /**
     * Définit la valeur de la propriété drugInteractionClassB.
     * 
     * @param value
     *     allowed object is
     *     {@link DrugInteractionClass }
     *     
     */
    public void setDrugInteractionClassB(DrugInteractionClass value) {
        this.drugInteractionClassB = value;
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
