
package com.whatever.IndicationService;

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
 *         &lt;element name="indicationList" type="{urn:Vidal}CommonNameGroupIndicationList"/>
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
    "indicationList"
})
@XmlRootElement(name = "searchByCommonNameGroupIdResponse")
public class SearchByCommonNameGroupIdResponse {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroupIndicationList indicationList;

    /**
     * Obtient la valeur de la propriété indicationList.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroupIndicationList }
     *     
     */
    public CommonNameGroupIndicationList getIndicationList() {
        return indicationList;
    }

    /**
     * Définit la valeur de la propriété indicationList.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroupIndicationList }
     *     
     */
    public void setIndicationList(CommonNameGroupIndicationList value) {
        this.indicationList = value;
    }

}
