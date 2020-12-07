
package com.vidal.PackService;

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
 *         &lt;element name="packIndicatorsList" type="{urn:Vidal}ArrayOfPackIndicators"/>
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
    "packIndicatorsList"
})
@XmlRootElement(name = "searchPackIndicatorsByPackIdsResponse")
public class SearchPackIndicatorsByPackIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfPackIndicators packIndicatorsList;

    /**
     * Obtient la valeur de la propriété packIndicatorsList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPackIndicators }
     *     
     */
    public ArrayOfPackIndicators getPackIndicatorsList() {
        return packIndicatorsList;
    }

    /**
     * Définit la valeur de la propriété packIndicatorsList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPackIndicators }
     *     
     */
    public void setPackIndicatorsList(ArrayOfPackIndicators value) {
        this.packIndicatorsList = value;
    }

}
