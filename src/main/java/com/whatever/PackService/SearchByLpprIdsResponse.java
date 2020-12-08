
package com.whatever.PackService;

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
 *         &lt;element name="PagedResultPackLpprCouple" type="{urn:Vidal}pagedResultPackLpprCouple"/>
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
    "pagedResultPackLpprCouple"
})
@XmlRootElement(name = "searchByLpprIdsResponse")
public class SearchByLpprIdsResponse {

    @XmlElement(name = "PagedResultPackLpprCouple", required = true, nillable = true)
    protected PagedResultPackLpprCouple pagedResultPackLpprCouple;

    /**
     * Obtient la valeur de la propriété pagedResultPackLpprCouple.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultPackLpprCouple }
     *     
     */
    public PagedResultPackLpprCouple getPagedResultPackLpprCouple() {
        return pagedResultPackLpprCouple;
    }

    /**
     * Définit la valeur de la propriété pagedResultPackLpprCouple.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultPackLpprCouple }
     *     
     */
    public void setPagedResultPackLpprCouple(PagedResultPackLpprCouple value) {
        this.pagedResultPackLpprCouple = value;
    }

}
