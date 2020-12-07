
package com.vidal.IndicationService;

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
 *         &lt;element name="indicationList" type="{urn:Vidal}ArrayOfIndication"/>
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
@XmlRootElement(name = "searchByNameResponse")
public class SearchByNameResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfIndication indicationList;

    /**
     * Obtient la valeur de la propriété indicationList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIndication }
     *     
     */
    public ArrayOfIndication getIndicationList() {
        return indicationList;
    }

    /**
     * Définit la valeur de la propriété indicationList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIndication }
     *     
     */
    public void setIndicationList(ArrayOfIndication value) {
        this.indicationList = value;
    }

}
