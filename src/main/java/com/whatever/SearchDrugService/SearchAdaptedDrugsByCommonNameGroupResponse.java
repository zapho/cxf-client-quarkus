
package com.whatever.SearchDrugService;

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
 *         &lt;element name="searchAdaptedDrugsByCommonNameGroup" type="{urn:Vidal}adaptedDrugResult"/>
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
    "searchAdaptedDrugsByCommonNameGroup"
})
@XmlRootElement(name = "searchAdaptedDrugsByCommonNameGroupResponse")
public class SearchAdaptedDrugsByCommonNameGroupResponse {

    @XmlElement(required = true, nillable = true)
    protected AdaptedDrugResult searchAdaptedDrugsByCommonNameGroup;

    /**
     * Obtient la valeur de la propriété searchAdaptedDrugsByCommonNameGroup.
     * 
     * @return
     *     possible object is
     *     {@link AdaptedDrugResult }
     *     
     */
    public AdaptedDrugResult getSearchAdaptedDrugsByCommonNameGroup() {
        return searchAdaptedDrugsByCommonNameGroup;
    }

    /**
     * Définit la valeur de la propriété searchAdaptedDrugsByCommonNameGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link AdaptedDrugResult }
     *     
     */
    public void setSearchAdaptedDrugsByCommonNameGroup(AdaptedDrugResult value) {
        this.searchAdaptedDrugsByCommonNameGroup = value;
    }

}
