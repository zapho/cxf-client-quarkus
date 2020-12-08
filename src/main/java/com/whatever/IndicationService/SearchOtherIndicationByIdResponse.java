
package com.whatever.IndicationService;

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
 *         &lt;element name="otherIndication" type="{urn:Vidal}otherIndication"/>
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
    "otherIndication"
})
@XmlRootElement(name = "searchOtherIndicationByIdResponse")
public class SearchOtherIndicationByIdResponse {

    @XmlElement(required = true, nillable = true)
    protected OtherIndication otherIndication;

    /**
     * Obtient la valeur de la propriété otherIndication.
     * 
     * @return
     *     possible object is
     *     {@link OtherIndication }
     *     
     */
    public OtherIndication getOtherIndication() {
        return otherIndication;
    }

    /**
     * Définit la valeur de la propriété otherIndication.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherIndication }
     *     
     */
    public void setOtherIndication(OtherIndication value) {
        this.otherIndication = value;
    }

}
