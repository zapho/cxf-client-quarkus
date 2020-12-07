
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
 *         &lt;element name="pagedResultOtherIndication" type="{urn:Vidal}pagedResultOtherIndication"/>
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
    "pagedResultOtherIndication"
})
@XmlRootElement(name = "searchOtherIndicationsByCodesResponse")
public class SearchOtherIndicationsByCodesResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultOtherIndication pagedResultOtherIndication;

    /**
     * Obtient la valeur de la propriété pagedResultOtherIndication.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultOtherIndication }
     *     
     */
    public PagedResultOtherIndication getPagedResultOtherIndication() {
        return pagedResultOtherIndication;
    }

    /**
     * Définit la valeur de la propriété pagedResultOtherIndication.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultOtherIndication }
     *     
     */
    public void setPagedResultOtherIndication(PagedResultOtherIndication value) {
        this.pagedResultOtherIndication = value;
    }

}
