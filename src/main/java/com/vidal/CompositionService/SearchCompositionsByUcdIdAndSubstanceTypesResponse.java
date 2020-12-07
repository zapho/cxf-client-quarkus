
package com.vidal.CompositionService;

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
 *         &lt;element name="itemCompositionsCoupleList" type="{urn:Vidal}ArrayOfItemCompositionsCouple"/>
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
    "itemCompositionsCoupleList"
})
@XmlRootElement(name = "searchCompositionsByUcdIdAndSubstanceTypesResponse")
public class SearchCompositionsByUcdIdAndSubstanceTypesResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfItemCompositionsCouple itemCompositionsCoupleList;

    /**
     * Obtient la valeur de la propriété itemCompositionsCoupleList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemCompositionsCouple }
     *     
     */
    public ArrayOfItemCompositionsCouple getItemCompositionsCoupleList() {
        return itemCompositionsCoupleList;
    }

    /**
     * Définit la valeur de la propriété itemCompositionsCoupleList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemCompositionsCouple }
     *     
     */
    public void setItemCompositionsCoupleList(ArrayOfItemCompositionsCouple value) {
        this.itemCompositionsCoupleList = value;
    }

}
