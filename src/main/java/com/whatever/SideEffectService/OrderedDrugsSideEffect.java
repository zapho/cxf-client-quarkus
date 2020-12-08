
package com.whatever.SideEffectService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour orderedDrugsSideEffect complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="orderedDrugsSideEffect">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="drugs" type="{urn:Vidal}ArrayOfDrugWithSideEffectFrequency"/>
 *         &lt;element name="sideEffect" type="{urn:Vidal}sideEffect"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderedDrugsSideEffect", propOrder = {
    "drugs",
    "sideEffect"
})
public class OrderedDrugsSideEffect {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfDrugWithSideEffectFrequency drugs;
    @XmlElement(required = true, nillable = true)
    protected SideEffect sideEffect;

    /**
     * Obtient la valeur de la propriété drugs.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDrugWithSideEffectFrequency }
     *     
     */
    public ArrayOfDrugWithSideEffectFrequency getDrugs() {
        return drugs;
    }

    /**
     * Définit la valeur de la propriété drugs.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDrugWithSideEffectFrequency }
     *     
     */
    public void setDrugs(ArrayOfDrugWithSideEffectFrequency value) {
        this.drugs = value;
    }

    /**
     * Obtient la valeur de la propriété sideEffect.
     * 
     * @return
     *     possible object is
     *     {@link SideEffect }
     *     
     */
    public SideEffect getSideEffect() {
        return sideEffect;
    }

    /**
     * Définit la valeur de la propriété sideEffect.
     * 
     * @param value
     *     allowed object is
     *     {@link SideEffect }
     *     
     */
    public void setSideEffect(SideEffect value) {
        this.sideEffect = value;
    }

}
