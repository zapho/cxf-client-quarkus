
package com.whatever.PosologyService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour simplePosologyAlert complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="simplePosologyAlert">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indication" type="{urn:Vidal}indication"/>
 *         &lt;element name="posologyAlert" type="{http://utils.api.vidal.com}Message"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simplePosologyAlert", propOrder = {
    "indication",
    "posologyAlert"
})
public class SimplePosologyAlert {

    @XmlElement(required = true, nillable = true)
    protected Indication indication;
    @XmlElement(required = true, nillable = true)
    protected Message posologyAlert;

    /**
     * Obtient la valeur de la propriété indication.
     * 
     * @return
     *     possible object is
     *     {@link Indication }
     *     
     */
    public Indication getIndication() {
        return indication;
    }

    /**
     * Définit la valeur de la propriété indication.
     * 
     * @param value
     *     allowed object is
     *     {@link Indication }
     *     
     */
    public void setIndication(Indication value) {
        this.indication = value;
    }

    /**
     * Obtient la valeur de la propriété posologyAlert.
     * 
     * @return
     *     possible object is
     *     {@link Message }
     *     
     */
    public Message getPosologyAlert() {
        return posologyAlert;
    }

    /**
     * Définit la valeur de la propriété posologyAlert.
     * 
     * @param value
     *     allowed object is
     *     {@link Message }
     *     
     */
    public void setPosologyAlert(Message value) {
        this.posologyAlert = value;
    }

}
