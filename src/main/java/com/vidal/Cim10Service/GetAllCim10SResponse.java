
package com.vidal.Cim10Service;

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
 *         &lt;element name="pagedResultCim10" type="{urn:Vidal}pagedResultCim10"/>
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
    "pagedResultCim10"
})
@XmlRootElement(name = "getAllCim10sResponse")
public class GetAllCim10SResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultCim10 pagedResultCim10;

    /**
     * Obtient la valeur de la propriété pagedResultCim10.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultCim10 }
     *     
     */
    public PagedResultCim10 getPagedResultCim10() {
        return pagedResultCim10;
    }

    /**
     * Définit la valeur de la propriété pagedResultCim10.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultCim10 }
     *     
     */
    public void setPagedResultCim10(PagedResultCim10 value) {
        this.pagedResultCim10 = value;
    }

}
