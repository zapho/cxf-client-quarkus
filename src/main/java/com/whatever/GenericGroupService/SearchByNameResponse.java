
package com.whatever.GenericGroupService;

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
 *         &lt;element name="genericGroupList" type="{urn:Vidal}ArrayOfGenericGroup"/>
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
    "genericGroupList"
})
@XmlRootElement(name = "searchByNameResponse")
public class SearchByNameResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfGenericGroup genericGroupList;

    /**
     * Obtient la valeur de la propriété genericGroupList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGenericGroup }
     *     
     */
    public ArrayOfGenericGroup getGenericGroupList() {
        return genericGroupList;
    }

    /**
     * Définit la valeur de la propriété genericGroupList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGenericGroup }
     *     
     */
    public void setGenericGroupList(ArrayOfGenericGroup value) {
        this.genericGroupList = value;
    }

}
