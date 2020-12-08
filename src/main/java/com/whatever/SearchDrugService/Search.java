
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
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="searchEntityTypes" type="{urn:Vidal}ArrayOfSearchEntityType"/>
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
    "name",
    "searchEntityTypes"
})
@XmlRootElement(name = "search")
public class Search {

    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfSearchEntityType searchEntityTypes;

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété searchEntityTypes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchEntityType }
     *     
     */
    public ArrayOfSearchEntityType getSearchEntityTypes() {
        return searchEntityTypes;
    }

    /**
     * Définit la valeur de la propriété searchEntityTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchEntityType }
     *     
     */
    public void setSearchEntityTypes(ArrayOfSearchEntityType value) {
        this.searchEntityTypes = value;
    }

}
