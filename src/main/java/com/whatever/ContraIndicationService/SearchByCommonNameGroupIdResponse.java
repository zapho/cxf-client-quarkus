
package com.whatever.ContraIndicationService;

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
 *         &lt;element name="contraIndicationList" type="{urn:Vidal}CommonNameGroupContraIndicationList"/>
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
@XmlRootElement(name = "searchByCommonNameGroupIdResponse")
public class SearchByCommonNameGroupIdResponse {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroupContraIndicationList contraIndicationList;

    /**
     * Obtient la valeur de la propriété contraIndicationList.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroupContraIndicationList }
     *     
     */
    public CommonNameGroupContraIndicationList getContraIndicationList() {
        return contraIndicationList;
    }

    /**
     * Définit la valeur de la propriété contraIndicationList.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroupContraIndicationList }
     *     
     */
    public void setContraIndicationList(CommonNameGroupContraIndicationList value) {
        this.contraIndicationList = value;
    }

}
