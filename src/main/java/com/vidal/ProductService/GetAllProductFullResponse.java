
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
 *         &lt;element name="pagedResultProductFull" type="{urn:Vidal}pagedResultProductFull"/>
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
    "pagedResultProductFull"
})
@XmlRootElement(name = "getAllProductFullResponse")
public class GetAllProductFullResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultProductFull pagedResultProductFull;

    /**
     * Obtient la valeur de la propriété pagedResultProductFull.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultProductFull }
     *     
     */
    public PagedResultProductFull getPagedResultProductFull() {
        return pagedResultProductFull;
    }

    /**
     * Définit la valeur de la propriété pagedResultProductFull.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultProductFull }
     *     
     */
    public void setPagedResultProductFull(PagedResultProductFull value) {
        this.pagedResultProductFull = value;
    }

}
