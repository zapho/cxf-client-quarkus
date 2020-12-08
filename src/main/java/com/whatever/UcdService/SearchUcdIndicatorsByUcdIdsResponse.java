
package com.whatever.UcdService;

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
 *         &lt;element name="ucdIndicatorsList" type="{urn:Vidal}ArrayOfUcdIndicators"/>
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
    "ucdIndicatorsList"
})
@XmlRootElement(name = "searchUcdIndicatorsByUcdIdsResponse")
public class SearchUcdIndicatorsByUcdIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfUcdIndicators ucdIndicatorsList;

    /**
     * Obtient la valeur de la propriété ucdIndicatorsList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUcdIndicators }
     *     
     */
    public ArrayOfUcdIndicators getUcdIndicatorsList() {
        return ucdIndicatorsList;
    }

    /**
     * Définit la valeur de la propriété ucdIndicatorsList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUcdIndicators }
     *     
     */
    public void setUcdIndicatorsList(ArrayOfUcdIndicators value) {
        this.ucdIndicatorsList = value;
    }

}
