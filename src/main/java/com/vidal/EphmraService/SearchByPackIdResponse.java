
package com.vidal.EphmraService;

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
 *         &lt;element name="ephmraList" type="{urn:Vidal}ArrayOfEphmra"/>
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
    "ephmraList"
})
@XmlRootElement(name = "searchByPackIdResponse")
public class SearchByPackIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfEphmra ephmraList;

    /**
     * Obtient la valeur de la propriété ephmraList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEphmra }
     *     
     */
    public ArrayOfEphmra getEphmraList() {
        return ephmraList;
    }

    /**
     * Définit la valeur de la propriété ephmraList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEphmra }
     *     
     */
    public void setEphmraList(ArrayOfEphmra value) {
        this.ephmraList = value;
    }

}
