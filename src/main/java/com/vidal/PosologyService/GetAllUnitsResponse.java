
package com.vidal.PosologyService;

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
 *         &lt;element name="pagedResultUnit" type="{urn:Vidal}pagedResultUnit"/>
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
    "pagedResultUnit"
})
@XmlRootElement(name = "getAllUnitsResponse")
public class GetAllUnitsResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultUnit pagedResultUnit;

    /**
     * Obtient la valeur de la propriété pagedResultUnit.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultUnit }
     *     
     */
    public PagedResultUnit getPagedResultUnit() {
        return pagedResultUnit;
    }

    /**
     * Définit la valeur de la propriété pagedResultUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultUnit }
     *     
     */
    public void setPagedResultUnit(PagedResultUnit value) {
        this.pagedResultUnit = value;
    }

}
