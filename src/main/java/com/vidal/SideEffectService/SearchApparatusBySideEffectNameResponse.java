
package com.vidal.SideEffectService;

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
 *         &lt;element name="apparatusList" type="{urn:Vidal}ArrayOfApparatus"/>
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
    "apparatusList"
})
@XmlRootElement(name = "searchApparatusBySideEffectNameResponse")
public class SearchApparatusBySideEffectNameResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfApparatus apparatusList;

    /**
     * Obtient la valeur de la propriété apparatusList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfApparatus }
     *     
     */
    public ArrayOfApparatus getApparatusList() {
        return apparatusList;
    }

    /**
     * Définit la valeur de la propriété apparatusList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfApparatus }
     *     
     */
    public void setApparatusList(ArrayOfApparatus value) {
        this.apparatusList = value;
    }

}
