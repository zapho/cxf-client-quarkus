
package com.vidal.DrugPrescriptionAnalysisService;

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
 *         &lt;element name="recos" type="{urn:Vidal}ArrayOfCodedReco"/>
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
    "recos"
})
@XmlRootElement(name = "searchRecosByPrescriptionsResponse")
public class SearchRecosByPrescriptionsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCodedReco recos;

    /**
     * Obtient la valeur de la propriété recos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCodedReco }
     *     
     */
    public ArrayOfCodedReco getRecos() {
        return recos;
    }

    /**
     * Définit la valeur de la propriété recos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCodedReco }
     *     
     */
    public void setRecos(ArrayOfCodedReco value) {
        this.recos = value;
    }

}
