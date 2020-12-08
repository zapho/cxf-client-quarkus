
package com.whatever.CommonNameGroupService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour galenicAgg complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="galenicAgg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="galenicForms" type="{urn:Vidal}ArrayOfGalenicForm"/>
 *         &lt;element name="routes" type="{urn:Vidal}ArrayOfRoute"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "galenicAgg", propOrder = {
    "galenicForms",
    "routes"
})
public class GalenicAgg {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfGalenicForm galenicForms;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfRoute routes;

    /**
     * Obtient la valeur de la propriété galenicForms.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGalenicForm }
     *     
     */
    public ArrayOfGalenicForm getGalenicForms() {
        return galenicForms;
    }

    /**
     * Définit la valeur de la propriété galenicForms.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGalenicForm }
     *     
     */
    public void setGalenicForms(ArrayOfGalenicForm value) {
        this.galenicForms = value;
    }

    /**
     * Obtient la valeur de la propriété routes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoute }
     *     
     */
    public ArrayOfRoute getRoutes() {
        return routes;
    }

    /**
     * Définit la valeur de la propriété routes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoute }
     *     
     */
    public void setRoutes(ArrayOfRoute value) {
        this.routes = value;
    }

}
