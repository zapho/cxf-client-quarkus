
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
 *         &lt;element name="contraIndicationEppList" type="{urn:Vidal}CommonNameGroupContraIndicationEppList"/>
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
    "contraIndicationEppList"
})
@XmlRootElement(name = "searchByCommonNameGroupIdAndEppResponse")
public class SearchByCommonNameGroupIdAndEppResponse {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroupContraIndicationEppList contraIndicationEppList;

    /**
     * Obtient la valeur de la propriété contraIndicationEppList.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroupContraIndicationEppList }
     *     
     */
    public CommonNameGroupContraIndicationEppList getContraIndicationEppList() {
        return contraIndicationEppList;
    }

    /**
     * Définit la valeur de la propriété contraIndicationEppList.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroupContraIndicationEppList }
     *     
     */
    public void setContraIndicationEppList(CommonNameGroupContraIndicationEppList value) {
        this.contraIndicationEppList = value;
    }

}
