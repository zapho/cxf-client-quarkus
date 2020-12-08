
package com.whatever.UcdService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour activeSubstanceInformation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="activeSubstanceInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="concentrationUnit" type="{urn:Vidal}posologyUnit"/>
 *         &lt;element name="concentrationValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="molecule" type="{urn:Vidal}molecule"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="quantityUnit" type="{urn:Vidal}posologyUnit"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "activeSubstanceInformation", propOrder = {
    "concentrationUnit",
    "concentrationValue",
    "molecule",
    "quantity",
    "quantityUnit"
})
public class ActiveSubstanceInformation {

    @XmlElement(required = true, nillable = true)
    protected PosologyUnit concentrationUnit;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float concentrationValue;
    @XmlElement(required = true, nillable = true)
    protected Molecule molecule;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float quantity;
    @XmlElement(required = true, nillable = true)
    protected PosologyUnit quantityUnit;

    /**
     * Obtient la valeur de la propriété concentrationUnit.
     * 
     * @return
     *     possible object is
     *     {@link PosologyUnit }
     *     
     */
    public PosologyUnit getConcentrationUnit() {
        return concentrationUnit;
    }

    /**
     * Définit la valeur de la propriété concentrationUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyUnit }
     *     
     */
    public void setConcentrationUnit(PosologyUnit value) {
        this.concentrationUnit = value;
    }

    /**
     * Obtient la valeur de la propriété concentrationValue.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getConcentrationValue() {
        return concentrationValue;
    }

    /**
     * Définit la valeur de la propriété concentrationValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setConcentrationValue(Float value) {
        this.concentrationValue = value;
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
     * Obtient la valeur de la propriété quantity.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getQuantity() {
        return quantity;
    }

    /**
     * Définit la valeur de la propriété quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setQuantity(Float value) {
        this.quantity = value;
    }

    /**
     * Obtient la valeur de la propriété quantityUnit.
     * 
     * @return
     *     possible object is
     *     {@link PosologyUnit }
     *     
     */
    public PosologyUnit getQuantityUnit() {
        return quantityUnit;
    }

    /**
     * Définit la valeur de la propriété quantityUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyUnit }
     *     
     */
    public void setQuantityUnit(PosologyUnit value) {
        this.quantityUnit = value;
    }

}
