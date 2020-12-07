
package com.vidal.AdministrationRouteService;

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
 *         &lt;element name="routeList" type="{urn:Vidal}ArrayOfRoute"/>
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
    "routeList"
})
@XmlRootElement(name = "searchByNameResponse")
public class SearchByNameResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfRoute routeList;

    /**
     * Obtient la valeur de la propriété routeList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoute }
     *     
     */
    public ArrayOfRoute getRouteList() {
        return routeList;
    }

    /**
     * Définit la valeur de la propriété routeList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoute }
     *     
     */
    public void setRouteList(ArrayOfRoute value) {
        this.routeList = value;
    }

}
