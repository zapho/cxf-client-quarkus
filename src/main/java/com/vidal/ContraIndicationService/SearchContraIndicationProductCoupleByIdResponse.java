
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
 *         &lt;element name="contraIndicationProductCoupleList" type="{urn:Vidal}ArrayOfContraIndicationProductCouple"/>
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
    "contraIndicationProductCoupleList"
})
@XmlRootElement(name = "searchContraIndicationProductCoupleByIdResponse")
public class SearchContraIndicationProductCoupleByIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfContraIndicationProductCouple contraIndicationProductCoupleList;

    /**
     * Obtient la valeur de la propriété contraIndicationProductCoupleList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContraIndicationProductCouple }
     *     
     */
    public ArrayOfContraIndicationProductCouple getContraIndicationProductCoupleList() {
        return contraIndicationProductCoupleList;
    }

    /**
     * Définit la valeur de la propriété contraIndicationProductCoupleList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContraIndicationProductCouple }
     *     
     */
    public void setContraIndicationProductCoupleList(ArrayOfContraIndicationProductCouple value) {
        this.contraIndicationProductCoupleList = value;
    }

}
