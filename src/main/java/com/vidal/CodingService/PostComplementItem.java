
package com.vidal.CodingService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour postComplementItem complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="postComplementItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cim10s" type="{urn:Vidal}ArrayOfCim10"/>
 *         &lt;element name="drugs" type="{urn:Vidal}scoredWeightedDrugs"/>
 *         &lt;element name="globalScore" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="group" type="{urn:Vidal}postComplementItemGroup"/>
 *         &lt;element name="rank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="terms" type="{urn:Vidal}ArrayOfTerm"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "postComplementItem", propOrder = {
    "cim10S",
    "drugs",
    "globalScore",
    "group",
    "rank",
    "terms"
})
public class PostComplementItem {

    @XmlElement(name = "cim10s", required = true, nillable = true)
    protected ArrayOfCim10 cim10S;
    @XmlElement(required = true, nillable = true)
    protected ScoredWeightedDrugs drugs;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float globalScore;
    @XmlElement(required = true, nillable = true)
    protected PostComplementItemGroup group;
    protected int rank;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTerm terms;

    /**
     * Obtient la valeur de la propriété cim10S.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCim10 }
     *     
     */
    public ArrayOfCim10 getCim10S() {
        return cim10S;
    }

    /**
     * Définit la valeur de la propriété cim10S.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCim10 }
     *     
     */
    public void setCim10S(ArrayOfCim10 value) {
        this.cim10S = value;
    }

    /**
     * Obtient la valeur de la propriété drugs.
     * 
     * @return
     *     possible object is
     *     {@link ScoredWeightedDrugs }
     *     
     */
    public ScoredWeightedDrugs getDrugs() {
        return drugs;
    }

    /**
     * Définit la valeur de la propriété drugs.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoredWeightedDrugs }
     *     
     */
    public void setDrugs(ScoredWeightedDrugs value) {
        this.drugs = value;
    }

    /**
     * Obtient la valeur de la propriété globalScore.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getGlobalScore() {
        return globalScore;
    }

    /**
     * Définit la valeur de la propriété globalScore.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setGlobalScore(Float value) {
        this.globalScore = value;
    }

    /**
     * Obtient la valeur de la propriété group.
     * 
     * @return
     *     possible object is
     *     {@link PostComplementItemGroup }
     *     
     */
    public PostComplementItemGroup getGroup() {
        return group;
    }

    /**
     * Définit la valeur de la propriété group.
     * 
     * @param value
     *     allowed object is
     *     {@link PostComplementItemGroup }
     *     
     */
    public void setGroup(PostComplementItemGroup value) {
        this.group = value;
    }

    /**
     * Obtient la valeur de la propriété rank.
     * 
     */
    public int getRank() {
        return rank;
    }

    /**
     * Définit la valeur de la propriété rank.
     * 
     */
    public void setRank(int value) {
        this.rank = value;
    }

    /**
     * Obtient la valeur de la propriété terms.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTerm }
     *     
     */
    public ArrayOfTerm getTerms() {
        return terms;
    }

    /**
     * Définit la valeur de la propriété terms.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTerm }
     *     
     */
    public void setTerms(ArrayOfTerm value) {
        this.terms = value;
    }

}
