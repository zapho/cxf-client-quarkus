
package com.whatever.VidalService;

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
 *         &lt;element name="vidalList" type="{urn:Vidal}ArrayOfVidal"/>
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
    "vidalList"
})
@XmlRootElement(name = "searchByProductIdResponse")
public class SearchByProductIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfVidal vidalList;

    /**
     * Obtient la valeur de la propriété vidalList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVidal }
     *     
     */
    public ArrayOfVidal getVidalList() {
        return vidalList;
    }

    /**
     * Définit la valeur de la propriété vidalList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVidal }
     *     
     */
    public void setVidalList(ArrayOfVidal value) {
        this.vidalList = value;
    }

}
