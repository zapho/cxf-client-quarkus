
package com.whatever.AldService;

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
 *         &lt;element name="cngId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "cngId"
})
@XmlRootElement(name = "searchByCommonNameGroupId")
public class SearchByCommonNameGroupId {

    protected int cngId;

    /**
     * Obtient la valeur de la propriété cngId.
     * 
     */
    public int getCngId() {
        return cngId;
    }

    /**
     * Définit la valeur de la propriété cngId.
     * 
     */
    public void setCngId(int value) {
        this.cngId = value;
    }

}
