
package com.whatever.Cim10Service;

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
 *         &lt;element name="cim10List" type="{urn:Vidal}ArrayOfCim10"/>
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
    "cim10List"
})
@XmlRootElement(name = "getCim10sByGIPMSIFilteredResponse")
public class GetCim10SByGIPMSIFilteredResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCim10 cim10List;

    /**
     * Obtient la valeur de la propriété cim10List.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCim10 }
     *     
     */
    public ArrayOfCim10 getCim10List() {
        return cim10List;
    }

    /**
     * Définit la valeur de la propriété cim10List.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCim10 }
     *     
     */
    public void setCim10List(ArrayOfCim10 value) {
        this.cim10List = value;
    }

}
