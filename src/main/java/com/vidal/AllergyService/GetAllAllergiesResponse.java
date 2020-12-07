
package com.vidal.AllergyService;

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
 *         &lt;element name="pagedResultAllergy" type="{urn:Vidal}pagedResultAllergy"/>
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
    "pagedResultAllergy"
})
@XmlRootElement(name = "getAllAllergiesResponse")
public class GetAllAllergiesResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultAllergy pagedResultAllergy;

    /**
     * Obtient la valeur de la propriété pagedResultAllergy.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultAllergy }
     *     
     */
    public PagedResultAllergy getPagedResultAllergy() {
        return pagedResultAllergy;
    }

    /**
     * Définit la valeur de la propriété pagedResultAllergy.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultAllergy }
     *     
     */
    public void setPagedResultAllergy(PagedResultAllergy value) {
        this.pagedResultAllergy = value;
    }

}
