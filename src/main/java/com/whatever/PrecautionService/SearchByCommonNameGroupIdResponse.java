
package com.whatever.PrecautionService;

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
 *         &lt;element name="precautionList" type="{urn:Vidal}CommonNameGroupPrecautionList"/>
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
    "precautionList"
})
@XmlRootElement(name = "searchByCommonNameGroupIdResponse")
public class SearchByCommonNameGroupIdResponse {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroupPrecautionList precautionList;

    /**
     * Obtient la valeur de la propriété precautionList.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroupPrecautionList }
     *     
     */
    public CommonNameGroupPrecautionList getPrecautionList() {
        return precautionList;
    }

    /**
     * Définit la valeur de la propriété precautionList.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroupPrecautionList }
     *     
     */
    public void setPrecautionList(CommonNameGroupPrecautionList value) {
        this.precautionList = value;
    }

}
