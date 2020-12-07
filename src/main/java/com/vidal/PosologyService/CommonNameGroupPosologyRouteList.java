
package com.vidal.PosologyService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CommonNameGroupPosologyRouteList complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CommonNameGroupPosologyRouteList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="homogeneous" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="posologyRoutes" type="{urn:Vidal}ArrayOfRoute"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonNameGroupPosologyRouteList", propOrder = {
    "homogeneous",
    "posologyRoutes"
})
public class CommonNameGroupPosologyRouteList {

    protected boolean homogeneous;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfRoute posologyRoutes;

    /**
     * Obtient la valeur de la propriété homogeneous.
     * 
     */
    public boolean isHomogeneous() {
        return homogeneous;
    }

    /**
     * Définit la valeur de la propriété homogeneous.
     * 
     */
    public void setHomogeneous(boolean value) {
        this.homogeneous = value;
    }

    /**
     * Obtient la valeur de la propriété posologyRoutes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoute }
     *     
     */
    public ArrayOfRoute getPosologyRoutes() {
        return posologyRoutes;
    }

    /**
     * Définit la valeur de la propriété posologyRoutes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoute }
     *     
     */
    public void setPosologyRoutes(ArrayOfRoute value) {
        this.posologyRoutes = value;
    }

}
