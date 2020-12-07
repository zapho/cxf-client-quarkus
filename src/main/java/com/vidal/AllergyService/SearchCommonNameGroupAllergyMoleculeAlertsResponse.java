
package com.vidal.AllergyService;

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
 *         &lt;element name="commonNameGroupMoleculeCouples" type="{urn:Vidal}commonNameGroupMoleculeCouples"/>
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
    "commonNameGroupMoleculeCouples"
})
@XmlRootElement(name = "searchCommonNameGroupAllergyMoleculeAlertsResponse")
public class SearchCommonNameGroupAllergyMoleculeAlertsResponse {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroupMoleculeCouples commonNameGroupMoleculeCouples;

    /**
     * Obtient la valeur de la propriété commonNameGroupMoleculeCouples.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroupMoleculeCouples }
     *     
     */
    public CommonNameGroupMoleculeCouples getCommonNameGroupMoleculeCouples() {
        return commonNameGroupMoleculeCouples;
    }

    /**
     * Définit la valeur de la propriété commonNameGroupMoleculeCouples.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroupMoleculeCouples }
     *     
     */
    public void setCommonNameGroupMoleculeCouples(CommonNameGroupMoleculeCouples value) {
        this.commonNameGroupMoleculeCouples = value;
    }

}
