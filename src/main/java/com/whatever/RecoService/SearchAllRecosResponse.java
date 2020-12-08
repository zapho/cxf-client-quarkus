
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
 *         &lt;element name="recoList" type="{urn:Vidal}ArrayOfReco"/>
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
    "recoList"
})
@XmlRootElement(name = "searchAllRecosResponse")
public class SearchAllRecosResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfReco recoList;

    /**
     * Obtient la valeur de la propriété recoList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReco }
     *     
     */
    public ArrayOfReco getRecoList() {
        return recoList;
    }

    /**
     * Définit la valeur de la propriété recoList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReco }
     *     
     */
    public void setRecoList(ArrayOfReco value) {
        this.recoList = value;
    }

}
