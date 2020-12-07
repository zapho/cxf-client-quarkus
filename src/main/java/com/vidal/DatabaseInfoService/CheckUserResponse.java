
package com.vidal.DatabaseInfoService;

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
 *         &lt;element name="checkUser" type="{urn:Vidal}VIDALAuthStatus"/>
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
    "checkUser"
})
@XmlRootElement(name = "checkUserResponse")
public class CheckUserResponse {

    @XmlElement(required = true, nillable = true)
    protected VIDALAuthStatus checkUser;

    /**
     * Obtient la valeur de la propriété checkUser.
     * 
     * @return
     *     possible object is
     *     {@link VIDALAuthStatus }
     *     
     */
    public VIDALAuthStatus getCheckUser() {
        return checkUser;
    }

    /**
     * Définit la valeur de la propriété checkUser.
     * 
     * @param value
     *     allowed object is
     *     {@link VIDALAuthStatus }
     *     
     */
    public void setCheckUser(VIDALAuthStatus value) {
        this.checkUser = value;
    }

}
