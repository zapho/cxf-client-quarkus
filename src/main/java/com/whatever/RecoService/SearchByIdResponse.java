
package com.whatever.RecoService;

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
 *         &lt;element name="reco" type="{urn:Vidal}reco"/>
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
    "reco"
})
@XmlRootElement(name = "searchByIdResponse")
public class SearchByIdResponse {

    @XmlElement(required = true, nillable = true)
    protected Reco reco;

    /**
     * Obtient la valeur de la propriété reco.
     * 
     * @return
     *     possible object is
     *     {@link Reco }
     *     
     */
    public Reco getReco() {
        return reco;
    }

    /**
     * Définit la valeur de la propriété reco.
     * 
     * @param value
     *     allowed object is
     *     {@link Reco }
     *     
     */
    public void setReco(Reco value) {
        this.reco = value;
    }

}
