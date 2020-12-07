
package com.vidal.ProductRangeService;

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
 *         &lt;element name="pagedResultProductRange" type="{urn:Vidal}pagedResultProductRange"/>
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
    "pagedResultProductRange"
})
@XmlRootElement(name = "getAllProductRangesResponse")
public class GetAllProductRangesResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultProductRange pagedResultProductRange;

    /**
     * Obtient la valeur de la propriété pagedResultProductRange.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultProductRange }
     *     
     */
    public PagedResultProductRange getPagedResultProductRange() {
        return pagedResultProductRange;
    }

    /**
     * Définit la valeur de la propriété pagedResultProductRange.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultProductRange }
     *     
     */
    public void setPagedResultProductRange(PagedResultProductRange value) {
        this.pagedResultProductRange = value;
    }

}
