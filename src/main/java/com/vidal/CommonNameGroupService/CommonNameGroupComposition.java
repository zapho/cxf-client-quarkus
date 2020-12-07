
package com.vidal.CommonNameGroupService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour commonNameGroupComposition complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="commonNameGroupComposition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonNameGroup" type="{urn:Vidal}commonNameGroup"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="molecule" type="{urn:Vidal}molecule"/>
 *         &lt;element name="perVolume" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="perVolumePosologyUnit" type="{urn:Vidal}posologyUnit"/>
 *         &lt;element name="perVolumeUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commonNameGroupComposition", propOrder = {
    "commonNameGroup",
    "id",
    "molecule",
    "perVolume",
    "perVolumePosologyUnit",
    "perVolumeUnit"
})
public class CommonNameGroupComposition {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroup commonNameGroup;
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

}
