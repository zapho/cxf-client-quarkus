
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
 *         &lt;element name="sfmgList" type="{urn:Vidal}ArrayOfSfmg"/>
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
    "sfmgList"
})
@XmlRootElement(name = "searchByIndicationGroupIdResponse")
public class SearchByIndicationGroupIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfSfmg sfmgList;

    /**
     * Obtient la valeur de la propriété sfmgList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSfmg }
     *     
     */
    public ArrayOfSfmg getSfmgList() {
        return sfmgList;
    }

    /**
     * Définit la valeur de la propriété sfmgList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSfmg }
     *     
     */
    public void setSfmgList(ArrayOfSfmg value) {
        this.sfmgList = value;
    }

}
