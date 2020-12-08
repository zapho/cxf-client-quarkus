
package com.whatever.SfmgService;

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
 *         &lt;element name="contraIndicationList" type="{urn:Vidal}ArrayOfContraIndication"/>
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
    "contraIndicationList"
})
@XmlRootElement(name = "getContraIndicationResponse")
public class GetContraIndicationResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfContraIndication contraIndicationList;

    /**
     * Obtient la valeur de la propriété contraIndicationList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContraIndication }
     *     
     */
    public ArrayOfContraIndication getContraIndicationList() {
        return contraIndicationList;
    }

    /**
     * Définit la valeur de la propriété contraIndicationList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContraIndication }
     *     
     */
    public void setContraIndicationList(ArrayOfContraIndication value) {
        this.contraIndicationList = value;
    }

}
