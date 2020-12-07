
package com.vidal.SearchDrugService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfSearchResultProductDTO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSearchResultProductDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchResultProductDTO" type="{urn:Vidal}searchResultProductDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSearchResultProductDTO", propOrder = {
    "searchResultProductDTO"
})
public class ArrayOfSearchResultProductDTO {

    @XmlElement(nillable = true)
    protected List<SearchResultProductDTO> searchResultProductDTO;

    /**
     * Gets the value of the searchResultProductDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchResultProductDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchResultProductDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchResultProductDTO }
     * 
     * 
     */
    public List<SearchResultProductDTO> getSearchResultProductDTO() {
        if (searchResultProductDTO == null) {
            searchResultProductDTO = new ArrayList<SearchResultProductDTO>();
        }
        return this.searchResultProductDTO;
    }

}
