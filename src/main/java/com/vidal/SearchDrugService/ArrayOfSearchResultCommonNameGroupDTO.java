
package com.vidal.SearchDrugService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfSearchResultCommonNameGroupDTO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSearchResultCommonNameGroupDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchResultCommonNameGroupDTO" type="{urn:Vidal}searchResultCommonNameGroupDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSearchResultCommonNameGroupDTO", propOrder = {
    "searchResultCommonNameGroupDTO"
})
public class ArrayOfSearchResultCommonNameGroupDTO {

    @XmlElement(nillable = true)
    protected List<SearchResultCommonNameGroupDTO> searchResultCommonNameGroupDTO;

    /**
     * Gets the value of the searchResultCommonNameGroupDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchResultCommonNameGroupDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchResultCommonNameGroupDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchResultCommonNameGroupDTO }
     * 
     * 
     */
    public List<SearchResultCommonNameGroupDTO> getSearchResultCommonNameGroupDTO() {
        if (searchResultCommonNameGroupDTO == null) {
            searchResultCommonNameGroupDTO = new ArrayList<SearchResultCommonNameGroupDTO>();
        }
        return this.searchResultCommonNameGroupDTO;
    }

}
