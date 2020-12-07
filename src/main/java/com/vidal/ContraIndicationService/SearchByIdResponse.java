
package com.vidal.ContraIndicationService;

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
 *         &lt;element name="contraIndication" type="{urn:Vidal}contraIndication"/>
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
    "contraIndication"
})
@XmlRootElement(name = "searchByIdResponse")
public class SearchByIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ContraIndication contraIndication;

    /**
     * Obtient la valeur de la propriété contraIndication.
     * 
     * @return
     *     possible object is
     *     {@link ContraIndication }
     *     
     */
    public ContraIndication getContraIndication() {
        return contraIndication;
    }

    /**
     * Définit la valeur de la propriété contraIndication.
     * 
     * @param value
     *     allowed object is
     *     {@link ContraIndication }
     *     
     */
    public void setContraIndication(ContraIndication value) {
        this.contraIndication = value;
    }

}
