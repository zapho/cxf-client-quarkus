
package com.whatever.SfmgService;

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
 *         &lt;element name="indicationGroupList" type="{urn:Vidal}ArrayOfIndicationGroup"/>
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
    "indicationGroupList"
})
@XmlRootElement(name = "getIndicationGroupResponse")
public class GetIndicationGroupResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfIndicationGroup indicationGroupList;

    /**
     * Obtient la valeur de la propriété indicationGroupList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIndicationGroup }
     *     
     */
    public ArrayOfIndicationGroup getIndicationGroupList() {
        return indicationGroupList;
    }

    /**
     * Définit la valeur de la propriété indicationGroupList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIndicationGroup }
     *     
     */
    public void setIndicationGroupList(ArrayOfIndicationGroup value) {
        this.indicationGroupList = value;
    }

}
