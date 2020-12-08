
package com.whatever.DrugPrescriptionAnalysisService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour codedReco complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="codedReco">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recommendation" type="{urn:Vidal}reco"/>
 *         &lt;element name="sources" type="{urn:Vidal}ArrayOfRelatedRecoSource"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "codedReco", propOrder = {
    "recommendation",
    "sources"
})
public class CodedReco {

    @XmlElement(required = true, nillable = true)
    protected Reco recommendation;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfRelatedRecoSource sources;

    /**
     * Obtient la valeur de la propriété recommendation.
     * 
     * @return
     *     possible object is
     *     {@link Reco }
     *     
     */
    public Reco getRecommendation() {
        return recommendation;
    }

    /**
     * Définit la valeur de la propriété recommendation.
     * 
     * @param value
     *     allowed object is
     *     {@link Reco }
     *     
     */
    public void setRecommendation(Reco value) {
        this.recommendation = value;
    }

    /**
     * Obtient la valeur de la propriété sources.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRelatedRecoSource }
     *     
     */
    public ArrayOfRelatedRecoSource getSources() {
        return sources;
    }

    /**
     * Définit la valeur de la propriété sources.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRelatedRecoSource }
     *     
     */
    public void setSources(ArrayOfRelatedRecoSource value) {
        this.sources = value;
    }

}
