
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
 *         &lt;element name="pagedResultUcdByOtherIndicationCode" type="{urn:Vidal}pagedResultUcd"/>
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
    "pagedResultUcdByOtherIndicationCode"
})
@XmlRootElement(name = "searchByOtherIndicationCodeResponse")
public class SearchByOtherIndicationCodeResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultUcd pagedResultUcdByOtherIndicationCode;

    /**
     * Obtient la valeur de la propriété pagedResultUcdByOtherIndicationCode.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultUcd }
     *     
     */
    public PagedResultUcd getPagedResultUcdByOtherIndicationCode() {
        return pagedResultUcdByOtherIndicationCode;
    }

    /**
     * Définit la valeur de la propriété pagedResultUcdByOtherIndicationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultUcd }
     *     
     */
    public void setPagedResultUcdByOtherIndicationCode(PagedResultUcd value) {
        this.pagedResultUcdByOtherIndicationCode = value;
    }

}
