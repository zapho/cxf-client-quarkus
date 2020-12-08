
package com.whatever.PrecautionService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CommonNameGroupPrecautionEppList complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CommonNameGroupPrecautionEppList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="homogeneous" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="messages" type="{http://utils.api.vidal.com}ArrayOfMessage"/>
 *         &lt;element name="precautions" type="{urn:Vidal}ArrayOfPrecautionEppPair"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonNameGroupPrecautionEppList", propOrder = {
    "homogeneous",
    "messages",
    "precautions"
})
public class CommonNameGroupPrecautionEppList {

    protected boolean homogeneous;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfMessage messages;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPrecautionEppPair precautions;

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

    /**
     * Obtient la valeur de la propriété precautions.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPrecautionEppPair }
     *     
     */
    public ArrayOfPrecautionEppPair getPrecautions() {
        return precautions;
    }

    /**
     * Définit la valeur de la propriété precautions.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrecautionEppPair }
     *     
     */
    public void setPrecautions(ArrayOfPrecautionEppPair value) {
        this.precautions = value;
    }

}
