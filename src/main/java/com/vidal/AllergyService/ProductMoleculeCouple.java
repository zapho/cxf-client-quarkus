
package com.vidal.AllergyService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour productMoleculeCouple complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="productMoleculeCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allergy" type="{urn:Vidal}allergy"/>
 *         &lt;element name="allergyLinked" type="{urn:Vidal}allergy"/>
 *         &lt;element name="allergyPatient" type="{urn:Vidal}allergy"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="molecule" type="{urn:Vidal}molecule"/>
 *         &lt;element name="moleculePatient" type="{urn:Vidal}molecule"/>
 *         &lt;element name="product" type="{urn:Vidal}product"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productMoleculeCouple", propOrder = {
    "allergy",
    "allergyLinked",
    "allergyPatient",
    "id",
    "molecule",
    "moleculePatient",
    "product"
})
public class ProductMoleculeCouple {

    @XmlElement(required = true, nillable = true)
    protected Allergy allergy;
    @XmlElement(required = true, nillable = true)
    protected Allergy allergyLinked;
    @XmlElement(required = true, nillable = true)
    protected Allergy allergyPatient;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true, nillable = true)
    protected Molecule molecule;
    @XmlElement(required = true, nillable = true)
    protected Molecule moleculePatient;
    @XmlElement(required = true, nillable = true)
    protected Product product;

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
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
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
     * Obtient la valeur de la propriété moleculePatient.
     * 
     * @return
     *     possible object is
     *     {@link Molecule }
     *     
     */
    public Molecule getMoleculePatient() {
        return moleculePatient;
    }

    /**
     * Définit la valeur de la propriété moleculePatient.
     * 
     * @param value
     *     allowed object is
     *     {@link Molecule }
     *     
     */
    public void setMoleculePatient(Molecule value) {
        this.moleculePatient = value;
    }

    /**
     * Obtient la valeur de la propriété product.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Définit la valeur de la propriété product.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
    }

}
