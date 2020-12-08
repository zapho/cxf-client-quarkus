
package com.whatever.InteractionService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interaction" type="{urn:Vidal}Interaction"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "interaction"
})
@XmlRootElement(name = "searchByInteractionIdResponse")
public class SearchByInteractionIdResponse {

    @XmlElement(required = true, nillable = true)
    protected Interaction interaction;

    /**
     * Obtient la valeur de la propriété interaction.
     * 
     * @return
     *     possible object is
     *     {@link Interaction }
     *     
     */
    public Interaction getInteraction() {
        return interaction;
    }

    /**
     * Définit la valeur de la propriété interaction.
     * 
     * @param value
     *     allowed object is
     *     {@link Interaction }
     *     
     */
    public void setInteraction(Interaction value) {
        this.interaction = value;
    }

}
