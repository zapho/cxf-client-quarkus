
package com.whatever.ContraIndicationService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CommonNameGroupContraIndicationEppList complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CommonNameGroupContraIndicationEppList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contraIndications" type="{urn:Vidal}ArrayOfContraIndicationTypeEppTuple"/>
 *         &lt;element name="homogeneous" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "CommonNameGroupContraIndicationEppList", propOrder = {
    "contraIndications",
    "homogeneous",
    "messages"
})
public class CommonNameGroupContraIndicationEppList {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfContraIndicationTypeEppTuple contraIndications;
    protected boolean homogeneous;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfMessage messages;

    /**
     * Obtient la valeur de la propriété contraIndications.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContraIndicationTypeEppTuple }
     *     
     */
    public ArrayOfContraIndicationTypeEppTuple getContraIndications() {
        return contraIndications;
    }

    /**
     * Définit la valeur de la propriété contraIndications.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContraIndicationTypeEppTuple }
     *     
     */
    public void setContraIndications(ArrayOfContraIndicationTypeEppTuple value) {
        this.contraIndications = value;
    }

    /**
     * Obtient la valeur de la propriété homogeneous.
     * 
     */
    public boolean isHomogeneous() {
        return homogeneous;
    }

    /**
     * Définit la valeur de la propriété homogeneous.
     * 
     */
    public void setHomogeneous(boolean value) {
        this.homogeneous = value;
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
