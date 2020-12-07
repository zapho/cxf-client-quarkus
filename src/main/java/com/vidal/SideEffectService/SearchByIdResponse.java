
package com.vidal.SideEffectService;

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
@XmlType(name = "", propOrder = {
    "sideEffect"
})
@XmlRootElement(name = "searchByIdResponse")
public class SearchByIdResponse {

    @XmlElement(required = true, nillable = true)
    protected SideEffect sideEffect;

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
