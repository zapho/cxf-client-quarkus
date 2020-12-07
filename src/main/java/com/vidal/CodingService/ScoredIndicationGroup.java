
package com.vidal.CodingService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour scoredIndicationGroup complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="scoredIndicationGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="drugs" type="{urn:Vidal}ArrayOfWeightedDrug"/>
 *         &lt;element name="indicationGroup" type="{urn:Vidal}indicationGroup"/>
 *         &lt;element name="rawScore" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scoredIndicationGroup", propOrder = {
    "drugs",
    "indicationGroup",
    "rawScore",
    "score"
})
public class ScoredIndicationGroup {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfWeightedDrug drugs;
    @XmlElement(required = true, nillable = true)
    protected IndicationGroup indicationGroup;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float rawScore;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float score;

    /**
     * Obtient la valeur de la propriété drugs.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWeightedDrug }
     *     
     */
    public ArrayOfWeightedDrug getDrugs() {
        return drugs;
    }

    /**
     * Définit la valeur de la propriété drugs.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWeightedDrug }
     *     
     */
    public void setDrugs(ArrayOfWeightedDrug value) {
        this.drugs = value;
    }

    /**
     * Obtient la valeur de la propriété indicationGroup.
     * 
     * @return
     *     possible object is
     *     {@link IndicationGroup }
     *     
     */
    public IndicationGroup getIndicationGroup() {
        return indicationGroup;
    }

    /**
     * Définit la valeur de la propriété indicationGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicationGroup }
     *     
     */
    public void setIndicationGroup(IndicationGroup value) {
        this.indicationGroup = value;
    }

    /**
     * Obtient la valeur de la propriété rawScore.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRawScore() {
        return rawScore;
    }

    /**
     * Définit la valeur de la propriété rawScore.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRawScore(Float value) {
        this.rawScore = value;
    }

    /**
     * Obtient la valeur de la propriété score.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getScore() {
        return score;
    }

    /**
     * Définit la valeur de la propriété score.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setScore(Float value) {
        this.score = value;
    }

}
