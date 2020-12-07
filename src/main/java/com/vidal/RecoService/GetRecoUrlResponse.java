
package com.vidal.RecoService;

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
 *         &lt;element name="recoUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "recoUrl"
})
@XmlRootElement(name = "getRecoUrlResponse")
public class GetRecoUrlResponse {

    @XmlElement(required = true, nillable = true)
    protected String recoUrl;

    /**
     * Obtient la valeur de la propriété recoUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecoUrl() {
        return recoUrl;
    }

    /**
     * Définit la valeur de la propriété recoUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecoUrl(String value) {
        this.recoUrl = value;
    }

}
