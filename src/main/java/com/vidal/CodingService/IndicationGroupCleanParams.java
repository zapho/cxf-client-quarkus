
package com.vidal.CodingService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour indicationGroupCleanParams complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="indicationGroupCleanParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="drugCoefficient" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="removeAlreadyCoded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="textCoefficient" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "indicationGroupCleanParams", propOrder = {
    "drugCoefficient",
    "removeAlreadyCoded",
    "textCoefficient"
})
public class IndicationGroupCleanParams {

    protected float drugCoefficient;
    protected boolean removeAlreadyCoded;
    protected float textCoefficient;

    /**
     * Obtient la valeur de la propriété drugCoefficient.
     * 
     */
    public float getDrugCoefficient() {
        return drugCoefficient;
    }

    /**
     * Définit la valeur de la propriété drugCoefficient.
     * 
     */
    public void setDrugCoefficient(float value) {
        this.drugCoefficient = value;
    }

    /**
     * Obtient la valeur de la propriété removeAlreadyCoded.
     * 
     */
    public boolean isRemoveAlreadyCoded() {
        return removeAlreadyCoded;
    }

    /**
     * Définit la valeur de la propriété removeAlreadyCoded.
     * 
     */
    public void setRemoveAlreadyCoded(boolean value) {
        this.removeAlreadyCoded = value;
    }

    /**
     * Obtient la valeur de la propriété textCoefficient.
     * 
     */
    public float getTextCoefficient() {
        return textCoefficient;
    }

    /**
     * Définit la valeur de la propriété textCoefficient.
     * 
     */
    public void setTextCoefficient(float value) {
        this.textCoefficient = value;
    }

}
