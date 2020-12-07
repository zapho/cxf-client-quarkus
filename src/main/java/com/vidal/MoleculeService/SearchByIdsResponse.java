
package com.vidal.MoleculeService;

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
 *         &lt;element name="moleculeList" type="{urn:Vidal}ArrayOfMolecule"/>
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
    "moleculeList"
})
@XmlRootElement(name = "searchByIdsResponse")
public class SearchByIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfMolecule moleculeList;

    /**
     * Obtient la valeur de la propriété moleculeList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMolecule }
     *     
     */
    public ArrayOfMolecule getMoleculeList() {
        return moleculeList;
    }

    /**
     * Définit la valeur de la propriété moleculeList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMolecule }
     *     
     */
    public void setMoleculeList(ArrayOfMolecule value) {
        this.moleculeList = value;
    }

}
