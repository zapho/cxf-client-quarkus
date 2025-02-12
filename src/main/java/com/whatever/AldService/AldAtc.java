
package com.whatever.AldService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour aldAtc complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="aldAtc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ald" type="{urn:Vidal}ald"/>
 *         &lt;element name="atc" type="{urn:Vidal}atc"/>
 *         &lt;element name="hasOpinion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aldAtc", propOrder = {
    "ald",
    "atc",
    "hasOpinion"
})
public class AldAtc {

    @XmlElement(required = true, nillable = true)
    protected Ald ald;
    @XmlElement(required = true, nillable = true)
    protected Atc atc;
    @XmlElement(required = true, nillable = true)
    protected String hasOpinion;

    /**
     * Obtient la valeur de la propriété ald.
     * 
     * @return
     *     possible object is
     *     {@link Ald }
     *     
     */
    public Ald getAld() {
        return ald;
    }

    /**
     * Définit la valeur de la propriété ald.
     * 
     * @param value
     *     allowed object is
     *     {@link Ald }
     *     
     */
    public void setAld(Ald value) {
        this.ald = value;
    }

    /**
     * Obtient la valeur de la propriété atc.
     * 
     * @return
     *     possible object is
     *     {@link Atc }
     *     
     */
    public Atc getAtc() {
        return atc;
    }

    /**
     * Définit la valeur de la propriété atc.
     * 
     * @param value
     *     allowed object is
     *     {@link Atc }
     *     
     */
    public void setAtc(Atc value) {
        this.atc = value;
    }

    /**
     * Obtient la valeur de la propriété hasOpinion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasOpinion() {
        return hasOpinion;
    }

    /**
     * Définit la valeur de la propriété hasOpinion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasOpinion(String value) {
        this.hasOpinion = value;
    }

}
