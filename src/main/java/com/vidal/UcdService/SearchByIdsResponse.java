
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
 *         &lt;element name="ucdList" type="{urn:Vidal}ArrayOfUcd"/>
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
    "ucdList"
})
@XmlRootElement(name = "searchByIdsResponse")
public class SearchByIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfUcd ucdList;

    /**
     * Obtient la valeur de la propriété ucdList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUcd }
     *     
     */
    public ArrayOfUcd getUcdList() {
        return ucdList;
    }

    /**
     * Définit la valeur de la propriété ucdList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUcd }
     *     
     */
    public void setUcdList(ArrayOfUcd value) {
        this.ucdList = value;
    }

}
