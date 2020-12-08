
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
 *         &lt;element name="CeMarkingLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "ceMarkingLabel"
})
@XmlRootElement(name = "getCEMarkingLabelResponse")
public class GetCEMarkingLabelResponse {

    @XmlElement(name = "CeMarkingLabel", required = true, nillable = true)
    protected String ceMarkingLabel;

    /**
     * Obtient la valeur de la propriété ceMarkingLabel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCeMarkingLabel() {
        return ceMarkingLabel;
    }

    /**
     * Définit la valeur de la propriété ceMarkingLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCeMarkingLabel(String value) {
        this.ceMarkingLabel = value;
    }

}
