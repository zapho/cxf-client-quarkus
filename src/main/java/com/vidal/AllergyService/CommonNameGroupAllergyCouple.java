
package com.vidal.AllergyService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour commonNameGroupAllergyCouple complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="commonNameGroupAllergyCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allergy" type="{urn:Vidal}allergy"/>
 *         &lt;element name="allergyLinked" type="{urn:Vidal}allergy"/>
 *         &lt;element name="allergyPatient" type="{urn:Vidal}allergy"/>
 *         &lt;element name="commonNameGroup" type="{urn:Vidal}commonNameGroup"/>
 *         &lt;element name="molecule" type="{urn:Vidal}molecule"/>
 *         &lt;element name="type" type="{urn:Vidal}SubstanceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commonNameGroupAllergyCouple", propOrder = {
    "allergy",
    "allergyLinked",
    "allergyPatient",
    "commonNameGroup",
    "molecule",
    "type"
})
public class CommonNameGroupAllergyCouple {

    @XmlElement(required = true, nillable = true)
    protected Allergy allergy;
    @XmlElement(required = true, nillable = true)
    protected Allergy allergyLinked;
    @XmlElement(required = true, nillable = true)
    protected Allergy allergyPatient;
    @XmlElement(required = true, nillable = true)
    protected CommonNameGroup commonNameGroup;
    @XmlElement(required = true, nillable = true)
    protected Molecule molecule;
    @XmlElement(required = true, nillable = true)
    protected SubstanceType type;

    /**
     * Obtient la valeur de la propriété allergy.
     * 
     * @return
     *     possible object is
     *     {@link Allergy }
     *     
     */
    public Allergy getAllergy() {
        return allergy;
    }

    /**
     * Définit la valeur de la propriété allergy.
     * 
     * @param value
     *     allowed object is
     *     {@link Allergy }
     *     
     */
    public void setAllergy(Allergy value) {
        this.allergy = value;
    }

    /**
     * Obtient la valeur de la propriété allergyLinked.
     * 
     * @return
     *     possible object is
     *     {@link Allergy }
     *     
     */
    public Allergy getAllergyLinked() {
        return allergyLinked;
    }

    /**
     * Définit la valeur de la propriété allergyLinked.
     * 
     * @param value
     *     allowed object is
     *     {@link Allergy }
     *     
     */
    public void setAllergyLinked(Allergy value) {
        this.allergyLinked = value;
    }

    /**
     * Obtient la valeur de la propriété allergyPatient.
     * 
     * @return
     *     possible object is
     *     {@link Allergy }
     *     
     */
    public Allergy getAllergyPatient() {
        return allergyPatient;
    }

    /**
     * Définit la valeur de la propriété allergyPatient.
     * 
     * @param value
     *     allowed object is
     *     {@link Allergy }
     *     
     */
    public void setAllergyPatient(Allergy value) {
        this.allergyPatient = value;
    }

    /**
     * Obtient la valeur de la propriété commonNameGroup.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroup }
     *     
     */
    public CommonNameGroup getCommonNameGroup() {
        return commonNameGroup;
    }

    /**
     * Définit la valeur de la propriété commonNameGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroup }
     *     
     */
    public void setCommonNameGroup(CommonNameGroup value) {
        this.commonNameGroup = value;
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

    /**
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link SubstanceType }
     *     
     */
    public SubstanceType getType() {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstanceType }
     *     
     */
    public void setType(SubstanceType value) {
        this.type = value;
    }

}
