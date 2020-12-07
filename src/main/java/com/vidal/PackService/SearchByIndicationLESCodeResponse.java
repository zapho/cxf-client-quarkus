
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
 *         &lt;element name="pagedResultPackByIndicationLESCode" type="{urn:Vidal}pagedResultPack"/>
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
    "pagedResultPackByIndicationLESCode"
})
@XmlRootElement(name = "searchByIndicationLESCodeResponse")
public class SearchByIndicationLESCodeResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultPack pagedResultPackByIndicationLESCode;

    /**
     * Obtient la valeur de la propriété pagedResultPackByIndicationLESCode.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultPack }
     *     
     */
    public PagedResultPack getPagedResultPackByIndicationLESCode() {
        return pagedResultPackByIndicationLESCode;
    }

    /**
     * Définit la valeur de la propriété pagedResultPackByIndicationLESCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultPack }
     *     
     */
    public void setPagedResultPackByIndicationLESCode(PagedResultPack value) {
        this.pagedResultPackByIndicationLESCode = value;
    }

}
