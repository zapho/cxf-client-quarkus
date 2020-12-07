
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
 *         &lt;element name="pagedResultUcdByIndicationLESCode" type="{urn:Vidal}pagedResultUcd"/>
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
    "pagedResultUcdByIndicationLESCode"
})
@XmlRootElement(name = "searchByIndicationLESCodeResponse")
public class SearchByIndicationLESCodeResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultUcd pagedResultUcdByIndicationLESCode;

    /**
     * Obtient la valeur de la propriété pagedResultUcdByIndicationLESCode.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultUcd }
     *     
     */
    public PagedResultUcd getPagedResultUcdByIndicationLESCode() {
        return pagedResultUcdByIndicationLESCode;
    }

    /**
     * Définit la valeur de la propriété pagedResultUcdByIndicationLESCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultUcd }
     *     
     */
    public void setPagedResultUcdByIndicationLESCode(PagedResultUcd value) {
        this.pagedResultUcdByIndicationLESCode = value;
    }

}
