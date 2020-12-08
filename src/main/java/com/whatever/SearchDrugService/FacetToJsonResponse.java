
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
 *         &lt;element name="facetToJson" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "facetToJson"
})
@XmlRootElement(name = "facetToJsonResponse")
public class FacetToJsonResponse {

    @XmlElement(required = true, nillable = true)
    protected String facetToJson;

    /**
     * Obtient la valeur de la propriété facetToJson.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacetToJson() {
        return facetToJson;
    }

    /**
     * Définit la valeur de la propriété facetToJson.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacetToJson(String value) {
        this.facetToJson = value;
    }

}
