
package com.vidal.SaumonService;

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
 *         &lt;element name="saumonList" type="{urn:Vidal}ArrayOfSaumon"/>
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
    "saumonList"
})
@XmlRootElement(name = "searchByProductIdResponse")
public class SearchByProductIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfSaumon saumonList;

    /**
     * Obtient la valeur de la propriété saumonList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSaumon }
     *     
     */
    public ArrayOfSaumon getSaumonList() {
        return saumonList;
    }

    /**
     * Définit la valeur de la propriété saumonList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSaumon }
     *     
     */
    public void setSaumonList(ArrayOfSaumon value) {
        this.saumonList = value;
    }

}
