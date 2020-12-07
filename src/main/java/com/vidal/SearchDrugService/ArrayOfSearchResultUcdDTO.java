
package com.vidal.SearchDrugService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfSearchResultUcdDTO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSearchResultUcdDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchResultUcdDTO" type="{urn:Vidal}searchResultUcdDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSearchResultUcdDTO", propOrder = {
    "searchResultUcdDTO"
})
public class ArrayOfSearchResultUcdDTO {

    @XmlElement(nillable = true)
    protected List<SearchResultUcdDTO> searchResultUcdDTO;

    /**
     * Gets the value of the searchResultUcdDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchResultUcdDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchResultUcdDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchResultUcdDTO }
     * 
     * 
     */
    public List<SearchResultUcdDTO> getSearchResultUcdDTO() {
        if (searchResultUcdDTO == null) {
            searchResultUcdDTO = new ArrayList<SearchResultUcdDTO>();
        }
        return this.searchResultUcdDTO;
    }

}
