
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
 *         &lt;element name="packFullList" type="{urn:Vidal}ArrayOfPackFull"/>
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
    "packFullList"
})
@XmlRootElement(name = "getPackFullByIdsResponse")
public class GetPackFullByIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfPackFull packFullList;

    /**
     * Obtient la valeur de la propriété packFullList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPackFull }
     *     
     */
    public ArrayOfPackFull getPackFullList() {
        return packFullList;
    }

    /**
     * Définit la valeur de la propriété packFullList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPackFull }
     *     
     */
    public void setPackFullList(ArrayOfPackFull value) {
        this.packFullList = value;
    }

}
