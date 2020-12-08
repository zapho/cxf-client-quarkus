
package com.whatever.PrecautionService;

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
 *         &lt;element name="precautionCim10List" type="{urn:Vidal}CommonNameGroupPrecautionCim10List"/>
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
    "precautionCim10List"
})
@XmlRootElement(name = "searchByCommonNameGroupIdAndCim10IdsWithChildrenResponse")
public class SearchByCommonNameGroupIdAndCim10IdsWithChildrenResponse {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroupPrecautionCim10List precautionCim10List;

    /**
     * Obtient la valeur de la propriété precautionCim10List.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroupPrecautionCim10List }
     *     
     */
    public CommonNameGroupPrecautionCim10List getPrecautionCim10List() {
        return precautionCim10List;
    }

    /**
     * Définit la valeur de la propriété precautionCim10List.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroupPrecautionCim10List }
     *     
     */
    public void setPrecautionCim10List(CommonNameGroupPrecautionCim10List value) {
        this.precautionCim10List = value;
    }

}
