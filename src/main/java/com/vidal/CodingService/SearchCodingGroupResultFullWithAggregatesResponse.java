
package com.vidal.CodingService;

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
 *         &lt;element name="pagedResultGroupResultFull" type="{urn:Vidal}pagedResultGroupResultFull"/>
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
    "pagedResultGroupResultFull"
})
@XmlRootElement(name = "searchCodingGroupResultFullWithAggregatesResponse")
public class SearchCodingGroupResultFullWithAggregatesResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultGroupResultFull pagedResultGroupResultFull;

    /**
     * Obtient la valeur de la propriété pagedResultGroupResultFull.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultGroupResultFull }
     *     
     */
    public PagedResultGroupResultFull getPagedResultGroupResultFull() {
        return pagedResultGroupResultFull;
    }

    /**
     * Définit la valeur de la propriété pagedResultGroupResultFull.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultGroupResultFull }
     *     
     */
    public void setPagedResultGroupResultFull(PagedResultGroupResultFull value) {
        this.pagedResultGroupResultFull = value;
    }

}
