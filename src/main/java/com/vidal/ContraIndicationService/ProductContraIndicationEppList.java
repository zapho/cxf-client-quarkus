
package com.vidal.ContraIndicationService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ProductContraIndicationEppList complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ProductContraIndicationEppList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contraIndicationEPPCoupleList" type="{urn:Vidal}ArrayOfContraIndicationEPPCouple"/>
 *         &lt;element name="messages" type="{http://utils.api.vidal.com}ArrayOfMessage"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductContraIndicationEppList", namespace = "http://contraindication.api.vidal.com", propOrder = {
    "contraIndicationEPPCoupleList",
    "messages"
})
public class ProductContraIndicationEppList {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfContraIndicationEPPCouple contraIndicationEPPCoupleList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfMessage messages;

    /**
     * Obtient la valeur de la propriété contraIndicationEPPCoupleList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContraIndicationEPPCouple }
     *     
     */
    public ArrayOfContraIndicationEPPCouple getContraIndicationEPPCoupleList() {
        return contraIndicationEPPCoupleList;
    }

    /**
     * Définit la valeur de la propriété contraIndicationEPPCoupleList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContraIndicationEPPCouple }
     *     
     */
    public void setContraIndicationEPPCoupleList(ArrayOfContraIndicationEPPCouple value) {
        this.contraIndicationEPPCoupleList = value;
    }

    /**
     * Obtient la valeur de la propriété messages.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMessage }
     *     
     */
    public ArrayOfMessage getMessages() {
        return messages;
    }

    /**
     * Définit la valeur de la propriété messages.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMessage }
     *     
     */
    public void setMessages(ArrayOfMessage value) {
        this.messages = value;
    }

}
