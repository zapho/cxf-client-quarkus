
package com.vidal.PosologyService;

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
 *         &lt;element name="activePrincipleDosesList" type="{http://posology.api.vidal.com}ArrayOfActivePrincipleDoses"/>
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
    "activePrincipleDosesList"
})
@XmlRootElement(name = "searchActivePrincipleDosesByProductIdResponse")
public class SearchActivePrincipleDosesByProductIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfActivePrincipleDoses activePrincipleDosesList;

    /**
     * Obtient la valeur de la propriété activePrincipleDosesList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfActivePrincipleDoses }
     *     
     */
    public ArrayOfActivePrincipleDoses getActivePrincipleDosesList() {
        return activePrincipleDosesList;
    }

    /**
     * Définit la valeur de la propriété activePrincipleDosesList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfActivePrincipleDoses }
     *     
     */
    public void setActivePrincipleDosesList(ArrayOfActivePrincipleDoses value) {
        this.activePrincipleDosesList = value;
    }

}
