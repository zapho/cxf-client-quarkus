
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
 *         &lt;element name="sideEffectList" type="{urn:Vidal}ArrayOfProductSideEffect"/>
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
    "sideEffectList"
})
@XmlRootElement(name = "searchByProductIdResponse")
public class SearchByProductIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfProductSideEffect sideEffectList;

    /**
     * Obtient la valeur de la propriété sideEffectList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductSideEffect }
     *     
     */
    public ArrayOfProductSideEffect getSideEffectList() {
        return sideEffectList;
    }

    /**
     * Définit la valeur de la propriété sideEffectList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductSideEffect }
     *     
     */
    public void setSideEffectList(ArrayOfProductSideEffect value) {
        this.sideEffectList = value;
    }

}
