
package com.vidal.CompositionService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour composition complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="composition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="excipientType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="molecule" type="{urn:Vidal}molecule"/>
 *         &lt;element name="perVolume" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="perVolumePosologyUnit" type="{urn:Vidal}posologyUnit"/>
 *         &lt;element name="perVolumeUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ranking" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="substituentMolecule" type="{urn:Vidal}molecule"/>
 *         &lt;element name="substituentPerVolume" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="substituentPerVolumePosologyUnit" type="{urn:Vidal}posologyUnit"/>
 *         &lt;element name="substituentPerVolumeUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "composition", propOrder = {
    "excipientType",
    "id",
    "molecule",
    "perVolume",
    "perVolumePosologyUnit",
    "perVolumeUnit",
    "ranking",
    "substituentMolecule",
    "substituentPerVolume",
    "substituentPerVolumePosologyUnit",
    "substituentPerVolumeUnit",
    "type"
})
public class Composition {

    @XmlElement(required = true, nillable = true)
    protected String excipientType;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true, nillable = true)
    protected Molecule molecule;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float perVolume;
    @XmlElement(required = true, nillable = true)
    protected PosologyUnit perVolumePosologyUnit;
    @XmlElement(required = true, nillable = true)
    protected String perVolumeUnit;
    @XmlElement(required = true, nillable = true)
    protected String ranking;
    @XmlElement(required = true, nillable = true)
    protected Molecule substituentMolecule;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float substituentPerVolume;
    @XmlElement(required = true, nillable = true)
    protected PosologyUnit substituentPerVolumePosologyUnit;
    @XmlElement(required = true, nillable = true)
    protected String substituentPerVolumeUnit;
    @XmlElement(required = true, nillable = true)
    protected SubstanceType type;

    /**
     * Obtient la valeur de la propriété excipientType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcipientType() {
        return excipientType;
    }

    /**
     * Définit la valeur de la propriété excipientType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcipientType(String value) {
        this.excipientType = value;
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
     * Obtient la valeur de la propriété perVolume.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPerVolume() {
        return perVolume;
    }

    /**
     * Définit la valeur de la propriété perVolume.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPerVolume(Float value) {
        this.perVolume = value;
    }

    /**
     * Obtient la valeur de la propriété perVolumePosologyUnit.
     * 
     * @return
     *     possible object is
     *     {@link PosologyUnit }
     *     
     */
    public PosologyUnit getPerVolumePosologyUnit() {
        return perVolumePosologyUnit;
    }

    /**
     * Définit la valeur de la propriété perVolumePosologyUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyUnit }
     *     
     */
    public void setPerVolumePosologyUnit(PosologyUnit value) {
        this.perVolumePosologyUnit = value;
    }

    /**
     * Obtient la valeur de la propriété perVolumeUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerVolumeUnit() {
        return perVolumeUnit;
    }

    /**
     * Définit la valeur de la propriété perVolumeUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerVolumeUnit(String value) {
        this.perVolumeUnit = value;
    }

    /**
     * Obtient la valeur de la propriété ranking.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRanking() {
        return ranking;
    }

    /**
     * Définit la valeur de la propriété ranking.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRanking(String value) {
        this.ranking = value;
    }

    /**
     * Obtient la valeur de la propriété substituentMolecule.
     * 
     * @return
     *     possible object is
     *     {@link Molecule }
     *     
     */
    public Molecule getSubstituentMolecule() {
        return substituentMolecule;
    }

    /**
     * Définit la valeur de la propriété substituentMolecule.
     * 
     * @param value
     *     allowed object is
     *     {@link Molecule }
     *     
     */
    public void setSubstituentMolecule(Molecule value) {
        this.substituentMolecule = value;
    }

    /**
     * Obtient la valeur de la propriété substituentPerVolume.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSubstituentPerVolume() {
        return substituentPerVolume;
    }

    /**
     * Définit la valeur de la propriété substituentPerVolume.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSubstituentPerVolume(Float value) {
        this.substituentPerVolume = value;
    }

    /**
     * Obtient la valeur de la propriété substituentPerVolumePosologyUnit.
     * 
     * @return
     *     possible object is
     *     {@link PosologyUnit }
     *     
     */
    public PosologyUnit getSubstituentPerVolumePosologyUnit() {
        return substituentPerVolumePosologyUnit;
    }

    /**
     * Définit la valeur de la propriété substituentPerVolumePosologyUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyUnit }
     *     
     */
    public void setSubstituentPerVolumePosologyUnit(PosologyUnit value) {
        this.substituentPerVolumePosologyUnit = value;
    }

    /**
     * Obtient la valeur de la propriété substituentPerVolumeUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstituentPerVolumeUnit() {
        return substituentPerVolumeUnit;
    }

    /**
     * Définit la valeur de la propriété substituentPerVolumeUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstituentPerVolumeUnit(String value) {
        this.substituentPerVolumeUnit = value;
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
