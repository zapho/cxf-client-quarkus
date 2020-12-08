
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
 *         &lt;element name="searchDrugWithAggregate" type="{urn:Vidal}searchResultDrugs"/>
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
    "searchDrugWithAggregate"
})
@XmlRootElement(name = "searchDrugWithAggregateResponse")
public class SearchDrugWithAggregateResponse {

    @XmlElement(required = true, nillable = true)
    protected SearchResultDrugs searchDrugWithAggregate;

    /**
     * Obtient la valeur de la propriété searchDrugWithAggregate.
     * 
     * @return
     *     possible object is
     *     {@link SearchResultDrugs }
     *     
     */
    public SearchResultDrugs getSearchDrugWithAggregate() {
        return searchDrugWithAggregate;
    }

    /**
     * Définit la valeur de la propriété searchDrugWithAggregate.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResultDrugs }
     *     
     */
    public void setSearchDrugWithAggregate(SearchResultDrugs value) {
        this.searchDrugWithAggregate = value;
    }

}
