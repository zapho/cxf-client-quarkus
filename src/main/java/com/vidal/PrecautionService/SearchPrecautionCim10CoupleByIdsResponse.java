
package com.vidal.PrecautionService;

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
 *         &lt;element name="precautionCim10CoupleList" type="{urn:Vidal}ArrayOfPrecautionCim10Couple"/>
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
    "precautionCim10CoupleList"
})
@XmlRootElement(name = "searchPrecautionCim10CoupleByIdsResponse")
public class SearchPrecautionCim10CoupleByIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfPrecautionCim10Couple precautionCim10CoupleList;

    /**
     * Obtient la valeur de la propriété precautionCim10CoupleList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPrecautionCim10Couple }
     *     
     */
    public ArrayOfPrecautionCim10Couple getPrecautionCim10CoupleList() {
        return precautionCim10CoupleList;
    }

    /**
     * Définit la valeur de la propriété precautionCim10CoupleList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrecautionCim10Couple }
     *     
     */
    public void setPrecautionCim10CoupleList(ArrayOfPrecautionCim10Couple value) {
        this.precautionCim10CoupleList = value;
    }

}
