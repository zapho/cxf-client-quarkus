
package com.vidal.UcdService;

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
 *         &lt;element name="pagedResultUcdByIndicators" type="{urn:Vidal}pagedResultUcd"/>
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
    "pagedResultUcdByIndicators"
})
@XmlRootElement(name = "searchByIndicatorIdsResponse")
public class SearchByIndicatorIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultUcd pagedResultUcdByIndicators;

    /**
     * Obtient la valeur de la propriété pagedResultUcdByIndicators.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultUcd }
     *     
     */
    public PagedResultUcd getPagedResultUcdByIndicators() {
        return pagedResultUcdByIndicators;
    }

    /**
     * Définit la valeur de la propriété pagedResultUcdByIndicators.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultUcd }
     *     
     */
    public void setPagedResultUcdByIndicators(PagedResultUcd value) {
        this.pagedResultUcdByIndicators = value;
    }

}
