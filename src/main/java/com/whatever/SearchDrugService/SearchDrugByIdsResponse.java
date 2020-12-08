
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
 *         &lt;element name="searchDrugByIds" type="{urn:Vidal}searchResultDrugs"/>
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
    "searchDrugByIds"
})
@XmlRootElement(name = "searchDrugByIdsResponse")
public class SearchDrugByIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected SearchResultDrugs searchDrugByIds;

    /**
     * Obtient la valeur de la propriété searchDrugByIds.
     * 
     * @return
     *     possible object is
     *     {@link SearchResultDrugs }
     *     
     */
    public SearchResultDrugs getSearchDrugByIds() {
        return searchDrugByIds;
    }

    /**
     * Définit la valeur de la propriété searchDrugByIds.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResultDrugs }
     *     
     */
    public void setSearchDrugByIds(SearchResultDrugs value) {
        this.searchDrugByIds = value;
    }

}
