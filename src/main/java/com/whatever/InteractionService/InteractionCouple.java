
package com.whatever.InteractionService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour interactionCouple complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="interactionCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="drugInteractionClassA" type="{urn:Vidal}drugInteractionClass"/>
 *         &lt;element name="drugInteractionClassB" type="{urn:Vidal}drugInteractionClass"/>
 *         &lt;element name="interactionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="precautionComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productA" type="{urn:Vidal}product"/>
 *         &lt;element name="productB" type="{urn:Vidal}product"/>
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
@XmlType(name = "interactionCouple", propOrder = {
    "drugInteractionClassA",
    "drugInteractionClassB",
    "interactionId",
    "precautionComment",
    "productA",
    "productB",
    "riskComment",
    "severity"
})
public class InteractionCouple {

    @XmlElement(required = true, nillable = true)
    protected DrugInteractionClass drugInteractionClassA;
    @XmlElement(required = true, nillable = true)
    protected DrugInteractionClass drugInteractionClassB;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer interactionId;
    @XmlElement(required = true, nillable = true)
    protected String precautionComment;
    @XmlElement(required = true, nillable = true)
    protected Product productA;
    @XmlElement(required = true, nillable = true)
    protected Product productB;
    @XmlElement(required = true, nillable = true)
    protected String riskComment;
    @XmlElement(required = true, nillable = true)
    protected InteractionSeverityType severity;

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
     * Obtient la valeur de la propriété productA.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProductA() {
        return productA;
    }

    /**
     * Définit la valeur de la propriété productA.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProductA(Product value) {
        this.productA = value;
    }

    /**
     * Obtient la valeur de la propriété productB.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProductB() {
        return productB;
    }

    /**
     * Définit la valeur de la propriété productB.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProductB(Product value) {
        this.productB = value;
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
