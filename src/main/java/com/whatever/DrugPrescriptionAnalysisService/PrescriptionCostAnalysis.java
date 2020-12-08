
package com.whatever.DrugPrescriptionAnalysisService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour prescriptionCostAnalysis complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="prescriptionCostAnalysis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evaluatedPrescriptionLineCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ignoredPrescriptionLineCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="minPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="prescriptionLineCostList" type="{urn:Vidal}ArrayOfPrescriptionLineCost"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prescriptionCostAnalysis", propOrder = {
    "evaluatedPrescriptionLineCount",
    "ignoredPrescriptionLineCount",
    "maxPrice",
    "minPrice",
    "prescriptionLineCostList"
})
public class PrescriptionCostAnalysis {

    protected int evaluatedPrescriptionLineCount;
    protected int ignoredPrescriptionLineCount;
    protected float maxPrice;
    protected float minPrice;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPrescriptionLineCost prescriptionLineCostList;

    /**
     * Obtient la valeur de la propriété evaluatedPrescriptionLineCount.
     * 
     */
    public int getEvaluatedPrescriptionLineCount() {
        return evaluatedPrescriptionLineCount;
    }

    /**
     * Définit la valeur de la propriété evaluatedPrescriptionLineCount.
     * 
     */
    public void setEvaluatedPrescriptionLineCount(int value) {
        this.evaluatedPrescriptionLineCount = value;
    }

    /**
     * Obtient la valeur de la propriété ignoredPrescriptionLineCount.
     * 
     */
    public int getIgnoredPrescriptionLineCount() {
        return ignoredPrescriptionLineCount;
    }

    /**
     * Définit la valeur de la propriété ignoredPrescriptionLineCount.
     * 
     */
    public void setIgnoredPrescriptionLineCount(int value) {
        this.ignoredPrescriptionLineCount = value;
    }

    /**
     * Obtient la valeur de la propriété maxPrice.
     * 
     */
    public float getMaxPrice() {
        return maxPrice;
    }

    /**
     * Définit la valeur de la propriété maxPrice.
     * 
     */
    public void setMaxPrice(float value) {
        this.maxPrice = value;
    }

    /**
     * Obtient la valeur de la propriété minPrice.
     * 
     */
    public float getMinPrice() {
        return minPrice;
    }

    /**
     * Définit la valeur de la propriété minPrice.
     * 
     */
    public void setMinPrice(float value) {
        this.minPrice = value;
    }

    /**
     * Obtient la valeur de la propriété prescriptionLineCostList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPrescriptionLineCost }
     *     
     */
    public ArrayOfPrescriptionLineCost getPrescriptionLineCostList() {
        return prescriptionLineCostList;
    }

    /**
     * Définit la valeur de la propriété prescriptionLineCostList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrescriptionLineCost }
     *     
     */
    public void setPrescriptionLineCostList(ArrayOfPrescriptionLineCost value) {
        this.prescriptionLineCostList = value;
    }

}
