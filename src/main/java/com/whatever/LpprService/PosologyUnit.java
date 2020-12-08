
package com.whatever.LpprService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour posologyUnit complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="posologyUnit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coefRef" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="derivedBySize" type="{urn:Vidal}DerivedUnit"/>
 *         &lt;element name="derivedByWeight" type="{urn:Vidal}DerivedUnit"/>
 *         &lt;element name="gramaticalGender" type="{urn:Vidal}GrammaticalGender"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentGramaticalGender" type="{urn:Vidal}GrammaticalGender"/>
 *         &lt;element name="parentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="parentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentPluralName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentShortName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentSingularName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pluralName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="singularName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "posologyUnit", propOrder = {
    "coefRef",
    "derivedBySize",
    "derivedByWeight",
    "gramaticalGender",
    "id",
    "name",
    "parentGramaticalGender",
    "parentId",
    "parentName",
    "parentPluralName",
    "parentShortName",
    "parentSingularName",
    "pluralName",
    "shortName",
    "singularName"
})
public class PosologyUnit {

    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float coefRef;
    @XmlElement(required = true, nillable = true)
    protected DerivedUnit derivedBySize;
    @XmlElement(required = true, nillable = true)
    protected DerivedUnit derivedByWeight;
    @XmlElement(required = true, nillable = true)
    protected GrammaticalGender gramaticalGender;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected GrammaticalGender parentGramaticalGender;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer parentId;
    @XmlElement(required = true, nillable = true)
    protected String parentName;
    @XmlElement(required = true, nillable = true)
    protected String parentPluralName;
    @XmlElement(required = true, nillable = true)
    protected String parentShortName;
    @XmlElement(required = true, nillable = true)
    protected String parentSingularName;
    @XmlElement(required = true, nillable = true)
    protected String pluralName;
    @XmlElement(required = true, nillable = true)
    protected String shortName;
    @XmlElement(required = true, nillable = true)
    protected String singularName;

    /**
     * Obtient la valeur de la propriété coefRef.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCoefRef() {
        return coefRef;
    }

    /**
     * Définit la valeur de la propriété coefRef.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCoefRef(Float value) {
        this.coefRef = value;
    }

    /**
     * Obtient la valeur de la propriété derivedBySize.
     * 
     * @return
     *     possible object is
     *     {@link DerivedUnit }
     *     
     */
    public DerivedUnit getDerivedBySize() {
        return derivedBySize;
    }

    /**
     * Définit la valeur de la propriété derivedBySize.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivedUnit }
     *     
     */
    public void setDerivedBySize(DerivedUnit value) {
        this.derivedBySize = value;
    }

    /**
     * Obtient la valeur de la propriété derivedByWeight.
     * 
     * @return
     *     possible object is
     *     {@link DerivedUnit }
     *     
     */
    public DerivedUnit getDerivedByWeight() {
        return derivedByWeight;
    }

    /**
     * Définit la valeur de la propriété derivedByWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivedUnit }
     *     
     */
    public void setDerivedByWeight(DerivedUnit value) {
        this.derivedByWeight = value;
    }

    /**
     * Obtient la valeur de la propriété gramaticalGender.
     * 
     * @return
     *     possible object is
     *     {@link GrammaticalGender }
     *     
     */
    public GrammaticalGender getGramaticalGender() {
        return gramaticalGender;
    }

    /**
     * Définit la valeur de la propriété gramaticalGender.
     * 
     * @param value
     *     allowed object is
     *     {@link GrammaticalGender }
     *     
     */
    public void setGramaticalGender(GrammaticalGender value) {
        this.gramaticalGender = value;
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
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété parentGramaticalGender.
     * 
     * @return
     *     possible object is
     *     {@link GrammaticalGender }
     *     
     */
    public GrammaticalGender getParentGramaticalGender() {
        return parentGramaticalGender;
    }

    /**
     * Définit la valeur de la propriété parentGramaticalGender.
     * 
     * @param value
     *     allowed object is
     *     {@link GrammaticalGender }
     *     
     */
    public void setParentGramaticalGender(GrammaticalGender value) {
        this.parentGramaticalGender = value;
    }

    /**
     * Obtient la valeur de la propriété parentId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * Définit la valeur de la propriété parentId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParentId(Integer value) {
        this.parentId = value;
    }

    /**
     * Obtient la valeur de la propriété parentName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentName() {
        return parentName;
    }

    /**
     * Définit la valeur de la propriété parentName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentName(String value) {
        this.parentName = value;
    }

    /**
     * Obtient la valeur de la propriété parentPluralName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentPluralName() {
        return parentPluralName;
    }

    /**
     * Définit la valeur de la propriété parentPluralName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentPluralName(String value) {
        this.parentPluralName = value;
    }

    /**
     * Obtient la valeur de la propriété parentShortName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentShortName() {
        return parentShortName;
    }

    /**
     * Définit la valeur de la propriété parentShortName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentShortName(String value) {
        this.parentShortName = value;
    }

    /**
     * Obtient la valeur de la propriété parentSingularName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentSingularName() {
        return parentSingularName;
    }

    /**
     * Définit la valeur de la propriété parentSingularName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentSingularName(String value) {
        this.parentSingularName = value;
    }

    /**
     * Obtient la valeur de la propriété pluralName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPluralName() {
        return pluralName;
    }

    /**
     * Définit la valeur de la propriété pluralName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPluralName(String value) {
        this.pluralName = value;
    }

    /**
     * Obtient la valeur de la propriété shortName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Définit la valeur de la propriété shortName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Obtient la valeur de la propriété singularName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSingularName() {
        return singularName;
    }

    /**
     * Définit la valeur de la propriété singularName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSingularName(String value) {
        this.singularName = value;
    }

}
