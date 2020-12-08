
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
 *         &lt;element name="facetName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="facetValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "facetName",
    "facetValue"
})
@XmlRootElement(name = "facetToJson")
public class FacetToJson {

    @XmlElement(required = true, nillable = true)
    protected String facetName;
    @XmlElement(required = true, nillable = true)
    protected String facetValue;

    /**
     * Obtient la valeur de la propriété facetName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacetName() {
        return facetName;
    }

    /**
     * Définit la valeur de la propriété facetName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacetName(String value) {
        this.facetName = value;
    }

    /**
     * Obtient la valeur de la propriété facetValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacetValue() {
        return facetValue;
    }

    /**
     * Définit la valeur de la propriété facetValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacetValue(String value) {
        this.facetValue = value;
    }

}
