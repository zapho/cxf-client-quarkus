
package com.vidal.CommonNameGroupService;

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
 *         &lt;element name="galenicForm" type="{urn:Vidal}GalenicForm"/>
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
    "galenicForm"
})
@XmlRootElement(name = "getGalenicFormResponse")
public class GetGalenicFormResponse {

    @XmlElement(required = true, nillable = true)
    protected GalenicForm galenicForm;

    /**
     * Obtient la valeur de la propriété galenicForm.
     * 
     * @return
     *     possible object is
     *     {@link GalenicForm }
     *     
     */
    public GalenicForm getGalenicForm() {
        return galenicForm;
    }

    /**
     * Définit la valeur de la propriété galenicForm.
     * 
     * @param value
     *     allowed object is
     *     {@link GalenicForm }
     *     
     */
    public void setGalenicForm(GalenicForm value) {
        this.galenicForm = value;
    }

}
