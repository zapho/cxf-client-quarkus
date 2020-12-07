
package com.vidal.UtilitiesService;

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
 *         &lt;element name="hmkIds" type="{urn:Vidal}ArrayOfString"/>
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
    "hmkIds"
})
@XmlRootElement(name = "getCompositeIdFromHMK")
public class GetCompositeIdFromHMK {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfString hmkIds;

    /**
     * Obtient la valeur de la propriété hmkIds.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getHmkIds() {
        return hmkIds;
    }

    /**
     * Définit la valeur de la propriété hmkIds.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setHmkIds(ArrayOfString value) {
        this.hmkIds = value;
    }

}
