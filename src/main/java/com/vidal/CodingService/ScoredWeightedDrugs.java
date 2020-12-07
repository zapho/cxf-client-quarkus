
package com.vidal.CodingService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour scoredWeightedDrugs complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="scoredWeightedDrugs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="weightedDrugs" type="{urn:Vidal}ArrayOfWeightedDrug"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scoredWeightedDrugs", propOrder = {
    "score",
    "weightedDrugs"
})
public class ScoredWeightedDrugs {

    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float score;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfWeightedDrug weightedDrugs;

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

    /**
     * Obtient la valeur de la propriété weightedDrugs.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWeightedDrug }
     *     
     */
    public ArrayOfWeightedDrug getWeightedDrugs() {
        return weightedDrugs;
    }

    /**
     * Définit la valeur de la propriété weightedDrugs.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWeightedDrug }
     *     
     */
    public void setWeightedDrugs(ArrayOfWeightedDrug value) {
        this.weightedDrugs = value;
    }

}
