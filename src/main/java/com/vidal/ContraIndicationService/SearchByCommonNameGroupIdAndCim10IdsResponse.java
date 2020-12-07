
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
 *         &lt;element name="contraIndicationCim10List" type="{urn:Vidal}CommonNameGroupContraIndicationCim10List"/>
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
    "contraIndicationCim10List"
})
@XmlRootElement(name = "searchByCommonNameGroupIdAndCim10IdsResponse")
public class SearchByCommonNameGroupIdAndCim10IdsResponse {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroupContraIndicationCim10List contraIndicationCim10List;

    /**
     * Obtient la valeur de la propriété contraIndicationCim10List.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroupContraIndicationCim10List }
     *     
     */
    public CommonNameGroupContraIndicationCim10List getContraIndicationCim10List() {
        return contraIndicationCim10List;
    }

    /**
     * Définit la valeur de la propriété contraIndicationCim10List.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroupContraIndicationCim10List }
     *     
     */
    public void setContraIndicationCim10List(CommonNameGroupContraIndicationCim10List value) {
        this.contraIndicationCim10List = value;
    }

}
