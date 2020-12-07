
package com.vidal.CommonNameGroupService;

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
 *         &lt;element name="commonNameGroupIndicatorsList" type="{urn:Vidal}ArrayOfCommonNameGroupIndicators"/>
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
    "commonNameGroupIndicatorsList"
})
@XmlRootElement(name = "searchCommonNameGroupIndicatorsByCommonNameGroupIdsResponse")
public class SearchCommonNameGroupIndicatorsByCommonNameGroupIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroupIndicators commonNameGroupIndicatorsList;

    /**
     * Obtient la valeur de la propriété commonNameGroupIndicatorsList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroupIndicators }
     *     
     */
    public ArrayOfCommonNameGroupIndicators getCommonNameGroupIndicatorsList() {
        return commonNameGroupIndicatorsList;
    }

    /**
     * Définit la valeur de la propriété commonNameGroupIndicatorsList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroupIndicators }
     *     
     */
    public void setCommonNameGroupIndicatorsList(ArrayOfCommonNameGroupIndicators value) {
        this.commonNameGroupIndicatorsList = value;
    }

}
