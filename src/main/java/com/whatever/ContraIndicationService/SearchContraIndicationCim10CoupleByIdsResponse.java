
package com.whatever.ContraIndicationService;

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
 *         &lt;element name="contraIndicationCim10CoupleList" type="{urn:Vidal}ArrayOfContraIndicationCim10Couple"/>
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
    "contraIndicationCim10CoupleList"
})
@XmlRootElement(name = "searchContraIndicationCim10CoupleByIdsResponse")
public class SearchContraIndicationCim10CoupleByIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfContraIndicationCim10Couple contraIndicationCim10CoupleList;

    /**
     * Obtient la valeur de la propriété contraIndicationCim10CoupleList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContraIndicationCim10Couple }
     *     
     */
    public ArrayOfContraIndicationCim10Couple getContraIndicationCim10CoupleList() {
        return contraIndicationCim10CoupleList;
    }

    /**
     * Définit la valeur de la propriété contraIndicationCim10CoupleList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContraIndicationCim10Couple }
     *     
     */
    public void setContraIndicationCim10CoupleList(ArrayOfContraIndicationCim10Couple value) {
        this.contraIndicationCim10CoupleList = value;
    }

}
