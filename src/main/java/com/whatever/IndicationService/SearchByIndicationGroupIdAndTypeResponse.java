
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
 *         &lt;element name="typedIndicationList" type="{urn:Vidal}ArrayOfTypedIndication"/>
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
    "typedIndicationList"
})
@XmlRootElement(name = "searchByIndicationGroupIdAndTypeResponse")
public class SearchByIndicationGroupIdAndTypeResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfTypedIndication typedIndicationList;

    /**
     * Obtient la valeur de la propriété typedIndicationList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTypedIndication }
     *     
     */
    public ArrayOfTypedIndication getTypedIndicationList() {
        return typedIndicationList;
    }

    /**
     * Définit la valeur de la propriété typedIndicationList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTypedIndication }
     *     
     */
    public void setTypedIndicationList(ArrayOfTypedIndication value) {
        this.typedIndicationList = value;
    }

}
