
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
 *         &lt;element name="contraIndicationEppCoupleList" type="{urn:Vidal}ArrayOfContraIndicationEPPCouple"/>
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
    "contraIndicationEppCoupleList"
})
@XmlRootElement(name = "searchContraIndicationEPPCoupleByIdsResponse")
public class SearchContraIndicationEPPCoupleByIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfContraIndicationEPPCouple contraIndicationEppCoupleList;

    /**
     * Obtient la valeur de la propriété contraIndicationEppCoupleList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContraIndicationEPPCouple }
     *     
     */
    public ArrayOfContraIndicationEPPCouple getContraIndicationEppCoupleList() {
        return contraIndicationEppCoupleList;
    }

    /**
     * Définit la valeur de la propriété contraIndicationEppCoupleList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContraIndicationEPPCouple }
     *     
     */
    public void setContraIndicationEppCoupleList(ArrayOfContraIndicationEPPCouple value) {
        this.contraIndicationEppCoupleList = value;
    }

}
