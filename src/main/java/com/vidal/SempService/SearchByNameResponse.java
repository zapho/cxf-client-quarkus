
package com.vidal.SempService;

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
 *         &lt;element name="sempList" type="{urn:Vidal}ArrayOfSemp"/>
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
    "sempList"
})
@XmlRootElement(name = "searchByNameResponse")
public class SearchByNameResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfSemp sempList;

    /**
     * Obtient la valeur de la propriété sempList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSemp }
     *     
     */
    public ArrayOfSemp getSempList() {
        return sempList;
    }

    /**
     * Définit la valeur de la propriété sempList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSemp }
     *     
     */
    public void setSempList(ArrayOfSemp value) {
        this.sempList = value;
    }

}
