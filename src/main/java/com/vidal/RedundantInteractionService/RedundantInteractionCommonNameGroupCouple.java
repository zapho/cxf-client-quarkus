
package com.vidal.RedundantInteractionService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour redundantInteractionCommonNameGroupCouple complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="redundantInteractionCommonNameGroupCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonNameGroupA" type="{urn:Vidal}commonNameGroup"/>
 *         &lt;element name="commonNameGroupB" type="{urn:Vidal}commonNameGroup"/>
 *         &lt;element name="redundantMolecule" type="{urn:Vidal}molecule"/>
 *         &lt;element name="redundantMoleculeDrugA" type="{urn:Vidal}molecule"/>
 *         &lt;element name="redundantMoleculeDrugB" type="{urn:Vidal}molecule"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "redundantInteractionCommonNameGroupCouple", propOrder = {
    "commonNameGroupA",
    "commonNameGroupB",
    "redundantMolecule",
    "redundantMoleculeDrugA",
    "redundantMoleculeDrugB"
})
public class RedundantInteractionCommonNameGroupCouple {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroup commonNameGroupA;
    @XmlElement(required = true, nillable = true)
    protected CommonNameGroup commonNameGroupB;
    @XmlElement(required = true, nillable = true)
    protected Molecule redundantMolecule;
    @XmlElement(required = true, nillable = true)
    protected Molecule redundantMoleculeDrugA;
    @XmlElement(required = true, nillable = true)
    protected Molecule redundantMoleculeDrugB;

    /**
     * Obtient la valeur de la propriété commonNameGroupA.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroup }
     *     
     */
    public CommonNameGroup getCommonNameGroupA() {
        return commonNameGroupA;
    }

    /**
     * Définit la valeur de la propriété commonNameGroupA.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroup }
     *     
     */
    public void setCommonNameGroupA(CommonNameGroup value) {
        this.commonNameGroupA = value;
    }

    /**
     * Obtient la valeur de la propriété commonNameGroupB.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroup }
     *     
     */
    public CommonNameGroup getCommonNameGroupB() {
        return commonNameGroupB;
    }

    /**
     * Définit la valeur de la propriété commonNameGroupB.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroup }
     *     
     */
    public void setCommonNameGroupB(CommonNameGroup value) {
        this.commonNameGroupB = value;
    }

    /**
     * Obtient la valeur de la propriété redundantMolecule.
     * 
     * @return
     *     possible object is
     *     {@link Molecule }
     *     
     */
    public Molecule getRedundantMolecule() {
        return redundantMolecule;
    }

    /**
     * Définit la valeur de la propriété redundantMolecule.
     * 
     * @param value
     *     allowed object is
     *     {@link Molecule }
     *     
     */
    public void setRedundantMolecule(Molecule value) {
        this.redundantMolecule = value;
    }

    /**
     * Obtient la valeur de la propriété redundantMoleculeDrugA.
     * 
     * @return
     *     possible object is
     *     {@link Molecule }
     *     
     */
    public Molecule getRedundantMoleculeDrugA() {
        return redundantMoleculeDrugA;
    }

    /**
     * Définit la valeur de la propriété redundantMoleculeDrugA.
     * 
     * @param value
     *     allowed object is
     *     {@link Molecule }
     *     
     */
    public void setRedundantMoleculeDrugA(Molecule value) {
        this.redundantMoleculeDrugA = value;
    }

    /**
     * Obtient la valeur de la propriété redundantMoleculeDrugB.
     * 
     * @return
     *     possible object is
     *     {@link Molecule }
     *     
     */
    public Molecule getRedundantMoleculeDrugB() {
        return redundantMoleculeDrugB;
    }

    /**
     * Définit la valeur de la propriété redundantMoleculeDrugB.
     * 
     * @param value
     *     allowed object is
     *     {@link Molecule }
     *     
     */
    public void setRedundantMoleculeDrugB(Molecule value) {
        this.redundantMoleculeDrugB = value;
    }

}
