
package com.whatever.PhysicoChemicalInteractionService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour physicoChemicalInteractionCommentCouple complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="physicoChemicalInteractionCommentCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="physicoChemicalInteraction" type="{urn:Vidal}physicoChemicalInteraction"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "physicoChemicalInteractionCommentCouple", propOrder = {
    "comment",
    "physicoChemicalInteraction"
})
public class PhysicoChemicalInteractionCommentCouple {

    @XmlElement(required = true, nillable = true)
    protected String comment;
    @XmlElement(required = true, nillable = true)
    protected PhysicoChemicalInteraction physicoChemicalInteraction;

    /**
     * Obtient la valeur de la propriété comment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Définit la valeur de la propriété comment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Obtient la valeur de la propriété physicoChemicalInteraction.
     * 
     * @return
     *     possible object is
     *     {@link PhysicoChemicalInteraction }
     *     
     */
    public PhysicoChemicalInteraction getPhysicoChemicalInteraction() {
        return physicoChemicalInteraction;
    }

    /**
     * Définit la valeur de la propriété physicoChemicalInteraction.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicoChemicalInteraction }
     *     
     */
    public void setPhysicoChemicalInteraction(PhysicoChemicalInteraction value) {
        this.physicoChemicalInteraction = value;
    }

}
