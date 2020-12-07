
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
 *         &lt;element name="pagedResultFullUcd" type="{urn:Vidal}pagedResultUcdFull"/>
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
    "pagedResultFullUcd"
})
@XmlRootElement(name = "getAllUcdFullResponse")
public class GetAllUcdFullResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultUcdFull pagedResultFullUcd;

    /**
     * Obtient la valeur de la propriété pagedResultFullUcd.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultUcdFull }
     *     
     */
    public PagedResultUcdFull getPagedResultFullUcd() {
        return pagedResultFullUcd;
    }

    /**
     * Définit la valeur de la propriété pagedResultFullUcd.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultUcdFull }
     *     
     */
    public void setPagedResultFullUcd(PagedResultUcdFull value) {
        this.pagedResultFullUcd = value;
    }

}
