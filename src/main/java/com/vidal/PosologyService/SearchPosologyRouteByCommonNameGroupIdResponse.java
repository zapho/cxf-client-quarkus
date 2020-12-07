
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
 *         &lt;element name="posologyRouteList" type="{urn:Vidal}CommonNameGroupPosologyRouteList"/>
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
    "posologyRouteList"
})
@XmlRootElement(name = "searchPosologyRouteByCommonNameGroupIdResponse")
public class SearchPosologyRouteByCommonNameGroupIdResponse {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroupPosologyRouteList posologyRouteList;

    /**
     * Obtient la valeur de la propriété posologyRouteList.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroupPosologyRouteList }
     *     
     */
    public CommonNameGroupPosologyRouteList getPosologyRouteList() {
        return posologyRouteList;
    }

    /**
     * Définit la valeur de la propriété posologyRouteList.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroupPosologyRouteList }
     *     
     */
    public void setPosologyRouteList(CommonNameGroupPosologyRouteList value) {
        this.posologyRouteList = value;
    }

}
