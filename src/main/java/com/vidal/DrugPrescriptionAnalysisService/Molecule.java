
package com.vidal.DrugPrescriptionAnalysisService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour molecule complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="molecule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allergyAlert" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="homeopathy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="role" type="{urn:Vidal}SubstanceRole"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "molecule", propOrder = {
    "allergyAlert",
    "homeopathy",
    "id",
    "name",
    "role"
})
public class Molecule {

    protected boolean allergyAlert;
    protected boolean homeopathy;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected SubstanceRole role;

    /**
     * Obtient la valeur de la propriété allergyAlert.
     * 
     */
    public boolean isAllergyAlert() {
        return allergyAlert;
    }

    /**
     * Définit la valeur de la propriété allergyAlert.
     * 
     */
    public void setAllergyAlert(boolean value) {
        this.allergyAlert = value;
    }

    /**
     * Obtient la valeur de la propriété homeopathy.
     * 
     */
    public boolean isHomeopathy() {
        return homeopathy;
    }

    /**
     * Définit la valeur de la propriété homeopathy.
     * 
     */
    public void setHomeopathy(boolean value) {
        this.homeopathy = value;
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
     * Obtient la valeur de la propriété role.
     * 
     * @return
     *     possible object is
     *     {@link SubstanceRole }
     *     
     */
    public SubstanceRole getRole() {
        return role;
    }

    /**
     * Définit la valeur de la propriété role.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstanceRole }
     *     
     */
    public void setRole(SubstanceRole value) {
        this.role = value;
    }

}
