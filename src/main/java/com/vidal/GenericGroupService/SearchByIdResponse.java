
package com.vidal.GenericGroupService;

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
 *         &lt;element name="genericGroup" type="{urn:Vidal}genericGroup"/>
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
    "genericGroup"
})
@XmlRootElement(name = "searchByIdResponse")
public class SearchByIdResponse {

    @XmlElement(required = true, nillable = true)
    protected GenericGroup genericGroup;

    /**
     * Obtient la valeur de la propriété genericGroup.
     * 
     * @return
     *     possible object is
     *     {@link GenericGroup }
     *     
     */
    public GenericGroup getGenericGroup() {
        return genericGroup;
    }

    /**
     * Définit la valeur de la propriété genericGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericGroup }
     *     
     */
    public void setGenericGroup(GenericGroup value) {
        this.genericGroup = value;
    }

}
