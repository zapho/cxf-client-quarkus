
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
 *         &lt;element name="pagedResultMolecule" type="{urn:Vidal}pagedResultMolecule"/>
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
    "pagedResultMolecule"
})
@XmlRootElement(name = "getAllMoleculesResponse")
public class GetAllMoleculesResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultMolecule pagedResultMolecule;

    /**
     * Obtient la valeur de la propriété pagedResultMolecule.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultMolecule }
     *     
     */
    public PagedResultMolecule getPagedResultMolecule() {
        return pagedResultMolecule;
    }

    /**
     * Définit la valeur de la propriété pagedResultMolecule.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultMolecule }
     *     
     */
    public void setPagedResultMolecule(PagedResultMolecule value) {
        this.pagedResultMolecule = value;
    }

}
