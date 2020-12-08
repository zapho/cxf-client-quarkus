
package com.whatever.CodingService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour postControlItem complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="postControlItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cim10" type="{urn:Vidal}cim10"/>
 *         &lt;element name="drugsJustification" type="{urn:Vidal}ArrayOfScoredIndicationGroup"/>
 *         &lt;element name="drugsJustificationFlag" type="{urn:Vidal}JustificationFlag"/>
 *         &lt;element name="textJustification" type="{urn:Vidal}ArrayOfTerm"/>
 *         &lt;element name="textJustificationFlag" type="{urn:Vidal}JustificationFlag"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "postControlItem", propOrder = {
    "cim10",
    "drugsJustification",
    "drugsJustificationFlag",
    "textJustification",
    "textJustificationFlag"
})
public class PostControlItem {

    @XmlElement(required = true, nillable = true)
    protected Cim10 cim10;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfScoredIndicationGroup drugsJustification;
    @XmlElement(required = true, nillable = true)
    protected JustificationFlag drugsJustificationFlag;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTerm textJustification;
    @XmlElement(required = true, nillable = true)
    protected JustificationFlag textJustificationFlag;

    /**
     * Obtient la valeur de la propriété cim10.
     * 
     * @return
     *     possible object is
     *     {@link Cim10 }
     *     
     */
    public Cim10 getCim10() {
        return cim10;
    }

    /**
     * Définit la valeur de la propriété cim10.
     * 
     * @param value
     *     allowed object is
     *     {@link Cim10 }
     *     
     */
    public void setCim10(Cim10 value) {
        this.cim10 = value;
    }

    /**
     * Obtient la valeur de la propriété drugsJustification.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfScoredIndicationGroup }
     *     
     */
    public ArrayOfScoredIndicationGroup getDrugsJustification() {
        return drugsJustification;
    }

    /**
     * Définit la valeur de la propriété drugsJustification.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfScoredIndicationGroup }
     *     
     */
    public void setDrugsJustification(ArrayOfScoredIndicationGroup value) {
        this.drugsJustification = value;
    }

    /**
     * Obtient la valeur de la propriété drugsJustificationFlag.
     * 
     * @return
     *     possible object is
     *     {@link JustificationFlag }
     *     
     */
    public JustificationFlag getDrugsJustificationFlag() {
        return drugsJustificationFlag;
    }

    /**
     * Définit la valeur de la propriété drugsJustificationFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JustificationFlag }
     *     
     */
    public void setDrugsJustificationFlag(JustificationFlag value) {
        this.drugsJustificationFlag = value;
    }

    /**
     * Obtient la valeur de la propriété textJustification.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTerm }
     *     
     */
    public ArrayOfTerm getTextJustification() {
        return textJustification;
    }

    /**
     * Définit la valeur de la propriété textJustification.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTerm }
     *     
     */
    public void setTextJustification(ArrayOfTerm value) {
        this.textJustification = value;
    }

    /**
     * Obtient la valeur de la propriété textJustificationFlag.
     * 
     * @return
     *     possible object is
     *     {@link JustificationFlag }
     *     
     */
    public JustificationFlag getTextJustificationFlag() {
        return textJustificationFlag;
    }

    /**
     * Définit la valeur de la propriété textJustificationFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JustificationFlag }
     *     
     */
    public void setTextJustificationFlag(JustificationFlag value) {
        this.textJustificationFlag = value;
    }

}
