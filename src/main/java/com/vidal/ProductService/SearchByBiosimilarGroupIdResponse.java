
package com.vidal.ProductService;

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
 *         &lt;element name="pagedResultProductBiosimilarTypeCouple" type="{urn:Vidal}pagedResultProductBiosimilarTypeCouple"/>
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
    "pagedResultProductBiosimilarTypeCouple"
})
@XmlRootElement(name = "searchByBiosimilarGroupIdResponse")
public class SearchByBiosimilarGroupIdResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultProductBiosimilarTypeCouple pagedResultProductBiosimilarTypeCouple;

    /**
     * Obtient la valeur de la propriété pagedResultProductBiosimilarTypeCouple.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultProductBiosimilarTypeCouple }
     *     
     */
    public PagedResultProductBiosimilarTypeCouple getPagedResultProductBiosimilarTypeCouple() {
        return pagedResultProductBiosimilarTypeCouple;
    }

    /**
     * Définit la valeur de la propriété pagedResultProductBiosimilarTypeCouple.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultProductBiosimilarTypeCouple }
     *     
     */
    public void setPagedResultProductBiosimilarTypeCouple(PagedResultProductBiosimilarTypeCouple value) {
        this.pagedResultProductBiosimilarTypeCouple = value;
    }

}
