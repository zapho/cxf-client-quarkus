
package com.vidal.IndicationService;

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
 *         &lt;element name="pagedResultIndication" type="{urn:Vidal}pagedResultIndication"/>
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
    "pagedResultIndication"
})
@XmlRootElement(name = "getAllIndicationsResponse")
public class GetAllIndicationsResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultIndication pagedResultIndication;

    /**
     * Obtient la valeur de la propriété pagedResultIndication.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultIndication }
     *     
     */
    public PagedResultIndication getPagedResultIndication() {
        return pagedResultIndication;
    }

    /**
     * Définit la valeur de la propriété pagedResultIndication.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultIndication }
     *     
     */
    public void setPagedResultIndication(PagedResultIndication value) {
        this.pagedResultIndication = value;
    }

}
