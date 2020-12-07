
package com.vidal.CodingService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour GroupResultFull complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GroupResultFull">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cim10s" type="{urn:Vidal}ArrayOfCim10"/>
 *         &lt;element name="cisps" type="{urn:Vidal}ArrayOfCisp"/>
 *         &lt;element name="group" type="{urn:Vidal}postComplementItemGroup"/>
 *         &lt;element name="indications" type="{urn:Vidal}ArrayOfIndication"/>
 *         &lt;element name="linkedIndicationGroups" type="{urn:Vidal}ArrayOfIndicationGroup"/>
 *         &lt;element name="recos" type="{urn:Vidal}ArrayOfReco"/>
 *         &lt;element name="sfmgs" type="{urn:Vidal}ArrayOfSfmg"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupResultFull", propOrder = {
    "cim10S",
    "cisps",
    "group",
    "indications",
    "linkedIndicationGroups",
    "recos",
    "sfmgs"
})
public class GroupResultFull {

    @XmlElement(name = "cim10s", required = true, nillable = true)
    protected ArrayOfCim10 cim10S;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfCisp cisps;
    @XmlElement(required = true, nillable = true)
    protected PostComplementItemGroup group;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfIndication indications;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfIndicationGroup linkedIndicationGroups;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfReco recos;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfSfmg sfmgs;

    /**
     * Obtient la valeur de la propriété cim10S.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCim10 }
     *     
     */
    public ArrayOfCim10 getCim10S() {
        return cim10S;
    }

    /**
     * Définit la valeur de la propriété cim10S.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCim10 }
     *     
     */
    public void setCim10S(ArrayOfCim10 value) {
        this.cim10S = value;
    }

    /**
     * Obtient la valeur de la propriété cisps.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCisp }
     *     
     */
    public ArrayOfCisp getCisps() {
        return cisps;
    }

    /**
     * Définit la valeur de la propriété cisps.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCisp }
     *     
     */
    public void setCisps(ArrayOfCisp value) {
        this.cisps = value;
    }

    /**
     * Obtient la valeur de la propriété group.
     * 
     * @return
     *     possible object is
     *     {@link PostComplementItemGroup }
     *     
     */
    public PostComplementItemGroup getGroup() {
        return group;
    }

    /**
     * Définit la valeur de la propriété group.
     * 
     * @param value
     *     allowed object is
     *     {@link PostComplementItemGroup }
     *     
     */
    public void setGroup(PostComplementItemGroup value) {
        this.group = value;
    }

    /**
     * Obtient la valeur de la propriété indications.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIndication }
     *     
     */
    public ArrayOfIndication getIndications() {
        return indications;
    }

    /**
     * Définit la valeur de la propriété indications.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIndication }
     *     
     */
    public void setIndications(ArrayOfIndication value) {
        this.indications = value;
    }

    /**
     * Obtient la valeur de la propriété linkedIndicationGroups.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIndicationGroup }
     *     
     */
    public ArrayOfIndicationGroup getLinkedIndicationGroups() {
        return linkedIndicationGroups;
    }

    /**
     * Définit la valeur de la propriété linkedIndicationGroups.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIndicationGroup }
     *     
     */
    public void setLinkedIndicationGroups(ArrayOfIndicationGroup value) {
        this.linkedIndicationGroups = value;
    }

    /**
     * Obtient la valeur de la propriété recos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReco }
     *     
     */
    public ArrayOfReco getRecos() {
        return recos;
    }

    /**
     * Définit la valeur de la propriété recos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReco }
     *     
     */
    public void setRecos(ArrayOfReco value) {
        this.recos = value;
    }

    /**
     * Obtient la valeur de la propriété sfmgs.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSfmg }
     *     
     */
    public ArrayOfSfmg getSfmgs() {
        return sfmgs;
    }

    /**
     * Définit la valeur de la propriété sfmgs.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSfmg }
     *     
     */
    public void setSfmgs(ArrayOfSfmg value) {
        this.sfmgs = value;
    }

}
