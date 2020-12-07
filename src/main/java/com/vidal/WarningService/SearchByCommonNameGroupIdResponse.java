
package com.vidal.WarningService;

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
 *         &lt;element name="warningList" type="{urn:Vidal}CommonNameGroupWarningList"/>
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
    "warningList"
})
@XmlRootElement(name = "searchByCommonNameGroupIdResponse")
public class SearchByCommonNameGroupIdResponse {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroupWarningList warningList;

    /**
     * Obtient la valeur de la propriété warningList.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroupWarningList }
     *     
     */
    public CommonNameGroupWarningList getWarningList() {
        return warningList;
    }

    /**
     * Définit la valeur de la propriété warningList.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroupWarningList }
     *     
     */
    public void setWarningList(CommonNameGroupWarningList value) {
        this.warningList = value;
    }

}
