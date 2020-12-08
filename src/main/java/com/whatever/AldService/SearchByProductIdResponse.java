
package com.whatever.AldService;

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
 *         &lt;element name="aldList" type="{urn:Vidal}ArrayOfAld"/>
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
    "aldList"
})
@XmlRootElement(name = "searchByProductIdResponse")
public class SearchByProductIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfAld aldList;

    /**
     * Obtient la valeur de la propriété aldList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAld }
     *     
     */
    public ArrayOfAld getAldList() {
        return aldList;
    }

    /**
     * Définit la valeur de la propriété aldList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAld }
     *     
     */
    public void setAldList(ArrayOfAld value) {
        this.aldList = value;
    }

}
