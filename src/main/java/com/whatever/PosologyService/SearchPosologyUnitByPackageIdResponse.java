
package com.whatever.PosologyService;

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
 *         &lt;element name="posologyUnitList" type="{urn:Vidal}ArrayOfPosologyUnit"/>
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
    "posologyUnitList"
})
@XmlRootElement(name = "searchPosologyUnitByPackageIdResponse")
public class SearchPosologyUnitByPackageIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfPosologyUnit posologyUnitList;

    /**
     * Obtient la valeur de la propriété posologyUnitList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPosologyUnit }
     *     
     */
    public ArrayOfPosologyUnit getPosologyUnitList() {
        return posologyUnitList;
    }

    /**
     * Définit la valeur de la propriété posologyUnitList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPosologyUnit }
     *     
     */
    public void setPosologyUnitList(ArrayOfPosologyUnit value) {
        this.posologyUnitList = value;
    }

}
