
package com.vidal.PosologyService;

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
 *         &lt;element name="posologyAlertList" type="{urn:Vidal}CommonNameGroupPosologyAlertList"/>
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
    "posologyAlertList"
})
@XmlRootElement(name = "checkNumberOfDoseForCommonNameGroupIdIndicationIdsRouteIdsResponse")
public class CheckNumberOfDoseForCommonNameGroupIdIndicationIdsRouteIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroupPosologyAlertList posologyAlertList;

    /**
     * Obtient la valeur de la propriété posologyAlertList.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroupPosologyAlertList }
     *     
     */
    public CommonNameGroupPosologyAlertList getPosologyAlertList() {
        return posologyAlertList;
    }

    /**
     * Définit la valeur de la propriété posologyAlertList.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroupPosologyAlertList }
     *     
     */
    public void setPosologyAlertList(CommonNameGroupPosologyAlertList value) {
        this.posologyAlertList = value;
    }

}
