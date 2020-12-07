
package com.vidal.AtcService;

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
 *         &lt;element name="pagedResultAtc" type="{urn:Vidal}pagedResultAtc"/>
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
    "pagedResultAtc"
})
@XmlRootElement(name = "getAllAtcsResponse")
public class GetAllAtcsResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultAtc pagedResultAtc;

    /**
     * Obtient la valeur de la propriété pagedResultAtc.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultAtc }
     *     
     */
    public PagedResultAtc getPagedResultAtc() {
        return pagedResultAtc;
    }

    /**
     * Définit la valeur de la propriété pagedResultAtc.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultAtc }
     *     
     */
    public void setPagedResultAtc(PagedResultAtc value) {
        this.pagedResultAtc = value;
    }

}
