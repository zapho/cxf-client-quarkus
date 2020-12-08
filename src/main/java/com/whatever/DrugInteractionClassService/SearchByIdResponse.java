
package com.whatever.DrugInteractionClassService;

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
 *         &lt;element name="drugInteractionClass" type="{urn:Vidal}drugInteractionClass"/>
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
    "drugInteractionClass"
})
@XmlRootElement(name = "searchByIdResponse")
public class SearchByIdResponse {

    @XmlElement(required = true, nillable = true)
    protected DrugInteractionClass drugInteractionClass;

    /**
     * Obtient la valeur de la propriété drugInteractionClass.
     * 
     * @return
     *     possible object is
     *     {@link DrugInteractionClass }
     *     
     */
    public DrugInteractionClass getDrugInteractionClass() {
        return drugInteractionClass;
    }

    /**
     * Définit la valeur de la propriété drugInteractionClass.
     * 
     * @param value
     *     allowed object is
     *     {@link DrugInteractionClass }
     *     
     */
    public void setDrugInteractionClass(DrugInteractionClass value) {
        this.drugInteractionClass = value;
    }

}
