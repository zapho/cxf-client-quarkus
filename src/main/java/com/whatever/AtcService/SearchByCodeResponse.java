
package com.whatever.AtcService;

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
 *         &lt;element name="atcList" type="{urn:Vidal}ArrayOfAtc"/>
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
    "atcList"
})
@XmlRootElement(name = "searchByCodeResponse")
public class SearchByCodeResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfAtc atcList;

    /**
     * Obtient la valeur de la propriété atcList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAtc }
     *     
     */
    public ArrayOfAtc getAtcList() {
        return atcList;
    }

    /**
     * Définit la valeur de la propriété atcList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAtc }
     *     
     */
    public void setAtcList(ArrayOfAtc value) {
        this.atcList = value;
    }

}
