
package com.whatever.DrugPrescriptionAnalysisService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour summarizedAlert complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="summarizedAlert">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allergiesAlert" type="{http://summarized_alert.merlin.vidal.com}SummarizedAllergyAlert"/>
 *         &lt;element name="contraIndicationsAlert" type="{urn:Vidal}SummarizedContraIndicationAlert"/>
 *         &lt;element name="interactionsAlert" type="{http://summarized_alert.merlin.vidal.com}SummarizedInteractionAlert"/>
 *         &lt;element name="physicoChemicalAlert" type="{urn:Vidal}SummarizedPhysicoChemicalAlert"/>
 *         &lt;element name="posologyAlert" type="{http://summarized_alert.merlin.vidal.com}SummarizedPosologyAlert"/>
 *         &lt;element name="precautionsAlert" type="{http://summarized_alert.merlin.vidal.com}SummarizedPrecautionAlert"/>
 *         &lt;element name="redundantInteractionsAlert" type="{http://summarized_alert.merlin.vidal.com}SummarizedRedundantInteractionAlert"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "summarizedAlert", propOrder = {
    "allergiesAlert",
    "contraIndicationsAlert",
    "interactionsAlert",
    "physicoChemicalAlert",
    "posologyAlert",
    "precautionsAlert",
    "redundantInteractionsAlert"
})
public class SummarizedAlert {

    @XmlElement(required = true, nillable = true)
    protected SummarizedAllergyAlert allergiesAlert;
    @XmlElement(required = true, nillable = true)
    protected SummarizedContraIndicationAlert contraIndicationsAlert;
    @XmlElement(required = true, nillable = true)
    protected SummarizedInteractionAlert interactionsAlert;
    @XmlElement(required = true, nillable = true)
    protected SummarizedPhysicoChemicalAlert physicoChemicalAlert;
    @XmlElement(required = true, nillable = true)
    protected SummarizedPosologyAlert posologyAlert;
    @XmlElement(required = true, nillable = true)
    protected SummarizedPrecautionAlert precautionsAlert;
    @XmlElement(required = true, nillable = true)
    protected SummarizedRedundantInteractionAlert redundantInteractionsAlert;

    /**
     * Obtient la valeur de la propriété allergiesAlert.
     * 
     * @return
     *     possible object is
     *     {@link SummarizedAllergyAlert }
     *     
     */
    public SummarizedAllergyAlert getAllergiesAlert() {
        return allergiesAlert;
    }

    /**
     * Définit la valeur de la propriété allergiesAlert.
     * 
     * @param value
     *     allowed object is
     *     {@link SummarizedAllergyAlert }
     *     
     */
    public void setAllergiesAlert(SummarizedAllergyAlert value) {
        this.allergiesAlert = value;
    }

    /**
     * Obtient la valeur de la propriété contraIndicationsAlert.
     * 
     * @return
     *     possible object is
     *     {@link SummarizedContraIndicationAlert }
     *     
     */
    public SummarizedContraIndicationAlert getContraIndicationsAlert() {
        return contraIndicationsAlert;
    }

    /**
     * Définit la valeur de la propriété contraIndicationsAlert.
     * 
     * @param value
     *     allowed object is
     *     {@link SummarizedContraIndicationAlert }
     *     
     */
    public void setContraIndicationsAlert(SummarizedContraIndicationAlert value) {
        this.contraIndicationsAlert = value;
    }

    /**
     * Obtient la valeur de la propriété interactionsAlert.
     * 
     * @return
     *     possible object is
     *     {@link SummarizedInteractionAlert }
     *     
     */
    public SummarizedInteractionAlert getInteractionsAlert() {
        return interactionsAlert;
    }

    /**
     * Définit la valeur de la propriété interactionsAlert.
     * 
     * @param value
     *     allowed object is
     *     {@link SummarizedInteractionAlert }
     *     
     */
    public void setInteractionsAlert(SummarizedInteractionAlert value) {
        this.interactionsAlert = value;
    }

    /**
     * Obtient la valeur de la propriété physicoChemicalAlert.
     * 
     * @return
     *     possible object is
     *     {@link SummarizedPhysicoChemicalAlert }
     *     
     */
    public SummarizedPhysicoChemicalAlert getPhysicoChemicalAlert() {
        return physicoChemicalAlert;
    }

    /**
     * Définit la valeur de la propriété physicoChemicalAlert.
     * 
     * @param value
     *     allowed object is
     *     {@link SummarizedPhysicoChemicalAlert }
     *     
     */
    public void setPhysicoChemicalAlert(SummarizedPhysicoChemicalAlert value) {
        this.physicoChemicalAlert = value;
    }

    /**
     * Obtient la valeur de la propriété posologyAlert.
     * 
     * @return
     *     possible object is
     *     {@link SummarizedPosologyAlert }
     *     
     */
    public SummarizedPosologyAlert getPosologyAlert() {
        return posologyAlert;
    }

    /**
     * Définit la valeur de la propriété posologyAlert.
     * 
     * @param value
     *     allowed object is
     *     {@link SummarizedPosologyAlert }
     *     
     */
    public void setPosologyAlert(SummarizedPosologyAlert value) {
        this.posologyAlert = value;
    }

    /**
     * Obtient la valeur de la propriété precautionsAlert.
     * 
     * @return
     *     possible object is
     *     {@link SummarizedPrecautionAlert }
     *     
     */
    public SummarizedPrecautionAlert getPrecautionsAlert() {
        return precautionsAlert;
    }

    /**
     * Définit la valeur de la propriété precautionsAlert.
     * 
     * @param value
     *     allowed object is
     *     {@link SummarizedPrecautionAlert }
     *     
     */
    public void setPrecautionsAlert(SummarizedPrecautionAlert value) {
        this.precautionsAlert = value;
    }

    /**
     * Obtient la valeur de la propriété redundantInteractionsAlert.
     * 
     * @return
     *     possible object is
     *     {@link SummarizedRedundantInteractionAlert }
     *     
     */
    public SummarizedRedundantInteractionAlert getRedundantInteractionsAlert() {
        return redundantInteractionsAlert;
    }

    /**
     * Définit la valeur de la propriété redundantInteractionsAlert.
     * 
     * @param value
     *     allowed object is
     *     {@link SummarizedRedundantInteractionAlert }
     *     
     */
    public void setRedundantInteractionsAlert(SummarizedRedundantInteractionAlert value) {
        this.redundantInteractionsAlert = value;
    }

}
