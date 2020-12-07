
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
 *         &lt;element name="pagedResultPack" type="{urn:Vidal}pagedResultPack"/>
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
    "pagedResultPack"
})
@XmlRootElement(name = "getAllPackagesResponse")
public class GetAllPackagesResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultPack pagedResultPack;

    /**
     * Obtient la valeur de la propriété pagedResultPack.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultPack }
     *     
     */
    public PagedResultPack getPagedResultPack() {
        return pagedResultPack;
    }

    /**
     * Définit la valeur de la propriété pagedResultPack.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultPack }
     *     
     */
    public void setPagedResultPack(PagedResultPack value) {
        this.pagedResultPack = value;
    }

}
