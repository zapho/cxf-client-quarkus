
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
 *         &lt;element name="precautionEppList" type="{urn:Vidal}CommonNameGroupPrecautionEppList"/>
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
    "precautionEppList"
})
@XmlRootElement(name = "searchByCommonNameGroupIdAndEppResponse")
public class SearchByCommonNameGroupIdAndEppResponse {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroupPrecautionEppList precautionEppList;

    /**
     * Obtient la valeur de la propriété precautionEppList.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroupPrecautionEppList }
     *     
     */
    public CommonNameGroupPrecautionEppList getPrecautionEppList() {
        return precautionEppList;
    }

    /**
     * Définit la valeur de la propriété precautionEppList.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroupPrecautionEppList }
     *     
     */
    public void setPrecautionEppList(CommonNameGroupPrecautionEppList value) {
        this.precautionEppList = value;
    }

}
