
package com.vidal.PosologyService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CommonNameGroupPosologyAlertList complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CommonNameGroupPosologyAlertList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="homogeneous" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="posologyAlerts" type="{urn:Vidal}ArrayOfPosologyAlert"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonNameGroupPosologyAlertList", propOrder = {
    "homogeneous",
    "posologyAlerts"
})
public class CommonNameGroupPosologyAlertList {

    protected boolean homogeneous;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPosologyAlert posologyAlerts;

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
     * Obtient la valeur de la propriété posologyAlerts.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPosologyAlert }
     *     
     */
    public ArrayOfPosologyAlert getPosologyAlerts() {
        return posologyAlerts;
    }

    /**
     * Définit la valeur de la propriété posologyAlerts.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPosologyAlert }
     *     
     */
    public void setPosologyAlerts(ArrayOfPosologyAlert value) {
        this.posologyAlerts = value;
    }

}
