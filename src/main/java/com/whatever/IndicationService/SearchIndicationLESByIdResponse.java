
package com.whatever.IndicationService;

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
 *         &lt;element name="indicationLES" type="{urn:Vidal}indicationLes"/>
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
    "indicationLES"
})
@XmlRootElement(name = "searchIndicationLESByIdResponse")
public class SearchIndicationLESByIdResponse {

    @XmlElement(required = true, nillable = true)
    protected IndicationLes indicationLES;

    /**
     * Obtient la valeur de la propriété indicationLES.
     * 
     * @return
     *     possible object is
     *     {@link IndicationLes }
     *     
     */
    public IndicationLes getIndicationLES() {
        return indicationLES;
    }

    /**
     * Définit la valeur de la propriété indicationLES.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicationLes }
     *     
     */
    public void setIndicationLES(IndicationLes value) {
        this.indicationLES = value;
    }

}
