
package com.vidal.RedundantInteractionService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour redundantInteractionCouple complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="redundantInteractionCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productA" type="{urn:Vidal}product"/>
 *         &lt;element name="productB" type="{urn:Vidal}product"/>
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
@XmlType(name = "redundantInteractionCouple", propOrder = {
    "productA",
    "productB",
    "redundantMolecule",
    "redundantMoleculeDrugA",
    "redundantMoleculeDrugB"
})
public class RedundantInteractionCouple {

    @XmlElement(required = true, nillable = true)
    protected Product productA;
    @XmlElement(required = true, nillable = true)
    protected Product productB;
    @XmlElement(required = true, nillable = true)
    protected Molecule redundantMolecule;
    @XmlElement(required = true, nillable = true)
    protected Molecule redundantMoleculeDrugA;
    @XmlElement(required = true, nillable = true)
    protected Molecule redundantMoleculeDrugB;

    /**
     * Obtient la valeur de la propriété productA.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProductA() {
        return productA;
    }

    /**
     * Définit la valeur de la propriété productA.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProductA(Product value) {
        this.productA = value;
    }

    /**
     * Obtient la valeur de la propriété productB.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProductB() {
        return productB;
    }

    /**
     * Définit la valeur de la propriété productB.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProductB(Product value) {
        this.productB = value;
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
