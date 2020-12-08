
package com.whatever.AdministrationRouteService;

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
 *         &lt;element name="pagedResultRoute" type="{urn:Vidal}pagedResultRoute"/>
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
    "pagedResultRoute"
})
@XmlRootElement(name = "getAllRoutesResponse")
public class GetAllRoutesResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultRoute pagedResultRoute;

    /**
     * Obtient la valeur de la propriété pagedResultRoute.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultRoute }
     *     
     */
    public PagedResultRoute getPagedResultRoute() {
        return pagedResultRoute;
    }

    /**
     * Définit la valeur de la propriété pagedResultRoute.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultRoute }
     *     
     */
    public void setPagedResultRoute(PagedResultRoute value) {
        this.pagedResultRoute = value;
    }

}
