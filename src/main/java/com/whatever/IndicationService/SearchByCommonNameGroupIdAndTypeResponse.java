
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
 *         &lt;element name="commonNameGroupTypedIndication" type="{urn:Vidal}commonNameGroupTypedIndication"/>
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
    "commonNameGroupTypedIndication"
})
@XmlRootElement(name = "searchByCommonNameGroupIdAndTypeResponse")
public class SearchByCommonNameGroupIdAndTypeResponse {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroupTypedIndication commonNameGroupTypedIndication;

    /**
     * Obtient la valeur de la propriété commonNameGroupTypedIndication.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroupTypedIndication }
     *     
     */
    public CommonNameGroupTypedIndication getCommonNameGroupTypedIndication() {
        return commonNameGroupTypedIndication;
    }

    /**
     * Définit la valeur de la propriété commonNameGroupTypedIndication.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroupTypedIndication }
     *     
     */
    public void setCommonNameGroupTypedIndication(CommonNameGroupTypedIndication value) {
        this.commonNameGroupTypedIndication = value;
    }

}
