
package com.vidal.CommonNameGroupService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="commonNameGroupId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "commonNameGroupId"
})
@XmlRootElement(name = "getUnits")
public class GetUnits {

    protected int commonNameGroupId;

    /**
     * Obtient la valeur de la propriété commonNameGroupId.
     * 
     */
    public int getCommonNameGroupId() {
        return commonNameGroupId;
    }

    /**
     * Définit la valeur de la propriété commonNameGroupId.
     * 
     */
    public void setCommonNameGroupId(int value) {
        this.commonNameGroupId = value;
    }

}
