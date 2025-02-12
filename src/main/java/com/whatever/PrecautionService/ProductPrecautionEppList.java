
package com.whatever.PrecautionService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ProductPrecautionEppList complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ProductPrecautionEppList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messages" type="{http://utils.api.vidal.com}ArrayOfMessage"/>
 *         &lt;element name="precautionEppCouples" type="{urn:Vidal}ArrayOfPrecautionEPPCouple"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductPrecautionEppList", namespace = "http://contraindication.api.vidal.com", propOrder = {
    "messages",
    "precautionEppCouples"
})
public class ProductPrecautionEppList {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfMessage messages;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPrecautionEPPCouple precautionEppCouples;

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

    /**
     * Obtient la valeur de la propriété precautionEppCouples.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPrecautionEPPCouple }
     *     
     */
    public ArrayOfPrecautionEPPCouple getPrecautionEppCouples() {
        return precautionEppCouples;
    }

    /**
     * Définit la valeur de la propriété precautionEppCouples.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrecautionEPPCouple }
     *     
     */
    public void setPrecautionEppCouples(ArrayOfPrecautionEPPCouple value) {
        this.precautionEppCouples = value;
    }

}
