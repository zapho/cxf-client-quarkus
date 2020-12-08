
package com.whatever.DrugPrescriptionAnalysisService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour allergyUnknownMoleculeAnalysis complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="allergyUnknownMoleculeAnalysis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alert" type="{urn:Vidal}alert"/>
 *         &lt;element name="molecule" type="{urn:Vidal}molecule"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "allergyUnknownMoleculeAnalysis", propOrder = {
    "alert",
    "molecule"
})
public class AllergyUnknownMoleculeAnalysis {

    @XmlElement(required = true, nillable = true)
    protected Alert alert;
    @XmlElement(required = true, nillable = true)
    protected Molecule molecule;

    /**
     * Obtient la valeur de la propriété alert.
     * 
     * @return
     *     possible object is
     *     {@link Alert }
     *     
     */
    public Alert getAlert() {
        return alert;
    }

    /**
     * Définit la valeur de la propriété alert.
     * 
     * @param value
     *     allowed object is
     *     {@link Alert }
     *     
     */
    public void setAlert(Alert value) {
        this.alert = value;
    }

    /**
     * Obtient la valeur de la propriété molecule.
     * 
     * @return
     *     possible object is
     *     {@link Molecule }
     *     
     */
    public Molecule getMolecule() {
        return molecule;
    }

    /**
     * Définit la valeur de la propriété molecule.
     * 
     * @param value
     *     allowed object is
     *     {@link Molecule }
     *     
     */
    public void setMolecule(Molecule value) {
        this.molecule = value;
    }

}
