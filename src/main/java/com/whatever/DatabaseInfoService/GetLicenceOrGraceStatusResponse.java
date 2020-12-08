
package com.whatever.DatabaseInfoService;

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
 *         &lt;element name="licenceOrGraceStatus" type="{urn:Vidal}LicencingStatus"/>
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
    "licenceOrGraceStatus"
})
@XmlRootElement(name = "getLicenceOrGraceStatusResponse")
public class GetLicenceOrGraceStatusResponse {

    @XmlElement(required = true, nillable = true)
    protected LicencingStatus licenceOrGraceStatus;

    /**
     * Obtient la valeur de la propriété licenceOrGraceStatus.
     * 
     * @return
     *     possible object is
     *     {@link LicencingStatus }
     *     
     */
    public LicencingStatus getLicenceOrGraceStatus() {
        return licenceOrGraceStatus;
    }

    /**
     * Définit la valeur de la propriété licenceOrGraceStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link LicencingStatus }
     *     
     */
    public void setLicenceOrGraceStatus(LicencingStatus value) {
        this.licenceOrGraceStatus = value;
    }

}
