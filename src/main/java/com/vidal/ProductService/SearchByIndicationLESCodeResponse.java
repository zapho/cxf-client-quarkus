
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
 *         &lt;element name="pagedResultProductByIndicationLESCode" type="{urn:Vidal}pagedResultProduct"/>
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
    "pagedResultProductByIndicationLESCode"
})
@XmlRootElement(name = "searchByIndicationLESCodeResponse")
public class SearchByIndicationLESCodeResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultProduct pagedResultProductByIndicationLESCode;

    /**
     * Obtient la valeur de la propriété pagedResultProductByIndicationLESCode.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultProduct }
     *     
     */
    public PagedResultProduct getPagedResultProductByIndicationLESCode() {
        return pagedResultProductByIndicationLESCode;
    }

    /**
     * Définit la valeur de la propriété pagedResultProductByIndicationLESCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultProduct }
     *     
     */
    public void setPagedResultProductByIndicationLESCode(PagedResultProduct value) {
        this.pagedResultProductByIndicationLESCode = value;
    }

}
