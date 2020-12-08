
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
 *         &lt;element name="searchDrugs" type="{urn:Vidal}searchResultDrugs"/>
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
    "searchDrugs"
})
@XmlRootElement(name = "searchDrugsResponse")
public class SearchDrugsResponse {

    @XmlElement(required = true, nillable = true)
    protected SearchResultDrugs searchDrugs;

    /**
     * Obtient la valeur de la propriété searchDrugs.
     * 
     * @return
     *     possible object is
     *     {@link SearchResultDrugs }
     *     
     */
    public SearchResultDrugs getSearchDrugs() {
        return searchDrugs;
    }

    /**
     * Définit la valeur de la propriété searchDrugs.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResultDrugs }
     *     
     */
    public void setSearchDrugs(SearchResultDrugs value) {
        this.searchDrugs = value;
    }

}
