
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
 *         &lt;element name="commonNameGroupPrecautionEppList" type="{urn:Vidal}CommonNameGroupPrecautionEppList"/>
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
    "commonNameGroupPrecautionEppList"
})
@XmlRootElement(name = "searchByCommonNameGroupIdsAndEppResponse")
public class SearchByCommonNameGroupIdsAndEppResponse {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroupPrecautionEppList commonNameGroupPrecautionEppList;

    /**
     * Obtient la valeur de la propriété commonNameGroupPrecautionEppList.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroupPrecautionEppList }
     *     
     */
    public CommonNameGroupPrecautionEppList getCommonNameGroupPrecautionEppList() {
        return commonNameGroupPrecautionEppList;
    }

    /**
     * Définit la valeur de la propriété commonNameGroupPrecautionEppList.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroupPrecautionEppList }
     *     
     */
    public void setCommonNameGroupPrecautionEppList(CommonNameGroupPrecautionEppList value) {
        this.commonNameGroupPrecautionEppList = value;
    }

}
