
package com.vidal.LpprService;

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
 *         &lt;element name="lpprList" type="{urn:Vidal}ArrayOfLppr"/>
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
    "lpprList"
})
@XmlRootElement(name = "getAllChildrenResponse")
public class GetAllChildrenResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfLppr lpprList;

    /**
     * Obtient la valeur de la propriété lpprList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLppr }
     *     
     */
    public ArrayOfLppr getLpprList() {
        return lpprList;
    }

    /**
     * Définit la valeur de la propriété lpprList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLppr }
     *     
     */
    public void setLpprList(ArrayOfLppr value) {
        this.lpprList = value;
    }

}
