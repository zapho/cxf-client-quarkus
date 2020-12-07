
package com.vidal.CodingService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour term complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="term">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="highlights" type="{urn:Vidal}ArrayOfString"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="negative" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "term", propOrder = {
    "code",
    "highlights",
    "label",
    "negative",
    "score"
})
public class Term {

    @XmlElement(required = true, nillable = true)
    protected String code;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString highlights;
    @XmlElement(required = true, nillable = true)
    protected String label;
    protected boolean negative;
    protected float score;

    /**
     * Obtient la valeur de la propriété code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Définit la valeur de la propriété code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Obtient la valeur de la propriété highlights.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getHighlights() {
        return highlights;
    }

    /**
     * Définit la valeur de la propriété highlights.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setHighlights(ArrayOfString value) {
        this.highlights = value;
    }

    /**
     * Obtient la valeur de la propriété label.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Définit la valeur de la propriété label.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Obtient la valeur de la propriété negative.
     * 
     */
    public boolean isNegative() {
        return negative;
    }

    /**
     * Définit la valeur de la propriété negative.
     * 
     */
    public void setNegative(boolean value) {
        this.negative = value;
    }

    /**
     * Obtient la valeur de la propriété score.
     * 
     */
    public float getScore() {
        return score;
    }

    /**
     * Définit la valeur de la propriété score.
     * 
     */
    public void setScore(float value) {
        this.score = value;
    }

}
