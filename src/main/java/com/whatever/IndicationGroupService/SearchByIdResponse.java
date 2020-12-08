
package com.whatever.IndicationGroupService;

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
 *         &lt;element name="indicationGroup" type="{urn:Vidal}indicationGroup"/>
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
    "indicationGroup"
})
@XmlRootElement(name = "searchByIdResponse")
public class SearchByIdResponse {

    @XmlElement(required = true, nillable = true)
    protected IndicationGroup indicationGroup;

    /**
     * Obtient la valeur de la propriété indicationGroup.
     * 
     * @return
     *     possible object is
     *     {@link IndicationGroup }
     *     
     */
    public IndicationGroup getIndicationGroup() {
        return indicationGroup;
    }

    /**
     * Définit la valeur de la propriété indicationGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicationGroup }
     *     
     */
    public void setIndicationGroup(IndicationGroup value) {
        this.indicationGroup = value;
    }

}
