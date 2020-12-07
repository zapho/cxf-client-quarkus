
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
 *         &lt;element name="commonNameGroupContraIndicationEppList" type="{urn:Vidal}CommonNameGroupContraIndicationEppList"/>
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
    "commonNameGroupContraIndicationEppList"
})
@XmlRootElement(name = "searchByCommonNameGroupIdsAndEppResponse")
public class SearchByCommonNameGroupIdsAndEppResponse {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroupContraIndicationEppList commonNameGroupContraIndicationEppList;

    /**
     * Obtient la valeur de la propriété commonNameGroupContraIndicationEppList.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroupContraIndicationEppList }
     *     
     */
    public CommonNameGroupContraIndicationEppList getCommonNameGroupContraIndicationEppList() {
        return commonNameGroupContraIndicationEppList;
    }

    /**
     * Définit la valeur de la propriété commonNameGroupContraIndicationEppList.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroupContraIndicationEppList }
     *     
     */
    public void setCommonNameGroupContraIndicationEppList(CommonNameGroupContraIndicationEppList value) {
        this.commonNameGroupContraIndicationEppList = value;
    }

}
