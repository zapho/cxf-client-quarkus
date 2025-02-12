
package com.whatever.CompositionService;

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
 *         &lt;element name="commonNameGroupCompositionList" type="{urn:Vidal}ArrayOfCommonNameGroupComposition"/>
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
    "commonNameGroupCompositionList"
})
@XmlRootElement(name = "searchByCommonNameGroupIdsResponse")
public class SearchByCommonNameGroupIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroupComposition commonNameGroupCompositionList;

    /**
     * Obtient la valeur de la propriété commonNameGroupCompositionList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroupComposition }
     *     
     */
    public ArrayOfCommonNameGroupComposition getCommonNameGroupCompositionList() {
        return commonNameGroupCompositionList;
    }

    /**
     * Définit la valeur de la propriété commonNameGroupCompositionList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroupComposition }
     *     
     */
    public void setCommonNameGroupCompositionList(ArrayOfCommonNameGroupComposition value) {
        this.commonNameGroupCompositionList = value;
    }

}
