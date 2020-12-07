
package com.vidal.DrugInteractionClassService;

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
 *         &lt;element name="drugInteractionClassList" type="{urn:Vidal}ArrayOfDrugInteractionClassSeverityCouple"/>
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
    "drugInteractionClassList"
})
@XmlRootElement(name = "searchAllInteractingClassesWithDrugInteractionClassIdResponse")
public class SearchAllInteractingClassesWithDrugInteractionClassIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfDrugInteractionClassSeverityCouple drugInteractionClassList;

    /**
     * Obtient la valeur de la propriété drugInteractionClassList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDrugInteractionClassSeverityCouple }
     *     
     */
    public ArrayOfDrugInteractionClassSeverityCouple getDrugInteractionClassList() {
        return drugInteractionClassList;
    }

    /**
     * Définit la valeur de la propriété drugInteractionClassList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDrugInteractionClassSeverityCouple }
     *     
     */
    public void setDrugInteractionClassList(ArrayOfDrugInteractionClassSeverityCouple value) {
        this.drugInteractionClassList = value;
    }

}
