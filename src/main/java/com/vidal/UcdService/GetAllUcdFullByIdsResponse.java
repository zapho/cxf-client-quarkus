
package com.vidal.UcdService;

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
 *         &lt;element name="ucdFullList" type="{urn:Vidal}ArrayOfUcdFull"/>
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
    "ucdFullList"
})
@XmlRootElement(name = "getAllUcdFullByIdsResponse")
public class GetAllUcdFullByIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfUcdFull ucdFullList;

    /**
     * Obtient la valeur de la propriété ucdFullList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUcdFull }
     *     
     */
    public ArrayOfUcdFull getUcdFullList() {
        return ucdFullList;
    }

    /**
     * Définit la valeur de la propriété ucdFullList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUcdFull }
     *     
     */
    public void setUcdFullList(ArrayOfUcdFull value) {
        this.ucdFullList = value;
    }

}
