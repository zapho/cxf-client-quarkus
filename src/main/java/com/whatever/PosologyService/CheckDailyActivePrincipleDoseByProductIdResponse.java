
package com.whatever.PosologyService;

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
 *         &lt;element name="posologyAlerts" type="{urn:Vidal}PosologyAlerts"/>
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
    "posologyAlerts"
})
@XmlRootElement(name = "checkDailyActivePrincipleDoseByProductIdResponse")
public class CheckDailyActivePrincipleDoseByProductIdResponse {

    @XmlElement(required = true, nillable = true)
    protected PosologyAlerts posologyAlerts;

    /**
     * Obtient la valeur de la propriété posologyAlerts.
     * 
     * @return
     *     possible object is
     *     {@link PosologyAlerts }
     *     
     */
    public PosologyAlerts getPosologyAlerts() {
        return posologyAlerts;
    }

    /**
     * Définit la valeur de la propriété posologyAlerts.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyAlerts }
     *     
     */
    public void setPosologyAlerts(PosologyAlerts value) {
        this.posologyAlerts = value;
    }

}
