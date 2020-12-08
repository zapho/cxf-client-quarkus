
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
 *         &lt;element name="pagedResultUcd" type="{urn:Vidal}pagedResultUcd"/>
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
    "pagedResultUcd"
})
@XmlRootElement(name = "searchByNameWithPagedResultResponse")
public class SearchByNameWithPagedResultResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultUcd pagedResultUcd;

    /**
     * Obtient la valeur de la propriété pagedResultUcd.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultUcd }
     *     
     */
    public PagedResultUcd getPagedResultUcd() {
        return pagedResultUcd;
    }

    /**
     * Définit la valeur de la propriété pagedResultUcd.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultUcd }
     *     
     */
    public void setPagedResultUcd(PagedResultUcd value) {
        this.pagedResultUcd = value;
    }

}
