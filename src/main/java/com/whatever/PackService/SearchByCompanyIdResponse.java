
package com.whatever.PackService;

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
 *         &lt;element name="packList" type="{urn:Vidal}ArrayOfPack"/>
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
    "packList"
})
@XmlRootElement(name = "searchByCompanyIdResponse")
public class SearchByCompanyIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfPack packList;

    /**
     * Obtient la valeur de la propriété packList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPack }
     *     
     */
    public ArrayOfPack getPackList() {
        return packList;
    }

    /**
     * Définit la valeur de la propriété packList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPack }
     *     
     */
    public void setPackList(ArrayOfPack value) {
        this.packList = value;
    }

}
