
package com.vidal.DrugPrescriptionAnalysisService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="gender" type="{urn:Vidal}Gender"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="weeksOfAmenorrhea" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="breastFeeding" type="{urn:Vidal}Breastfeeding"/>
 *         &lt;element name="creatin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hepaticInsufficiency" type="{urn:Vidal}HepaticInsufficiency"/>
 *         &lt;element name="allergyIdList" type="{urn:Vidal}ArrayOfInt"/>
 *         &lt;element name="moleculeIdList" type="{urn:Vidal}ArrayOfInt"/>
 *         &lt;element name="pathologyCim10IdList" type="{urn:Vidal}ArrayOfInt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dateOfBirth",
    "gender",
    "weight",
    "height",
    "weeksOfAmenorrhea",
    "breastFeeding",
    "creatin",
    "hepaticInsufficiency",
    "allergyIdList",
    "moleculeIdList",
    "pathologyCim10IdList"
})
@XmlRootElement(name = "patientFromObjToJson")
public class PatientFromObjToJson {

    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(required = true, nillable = true)
    protected Gender gender;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer weight;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer height;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer weeksOfAmenorrhea;
    @XmlElement(required = true, nillable = true)
    protected Breastfeeding breastFeeding;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer creatin;
    @XmlElement(required = true, nillable = true)
    protected HepaticInsufficiency hepaticInsufficiency;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt allergyIdList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt moleculeIdList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt pathologyCim10IdList;

    /**
     * Obtient la valeur de la propriété dateOfBirth.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Définit la valeur de la propriété dateOfBirth.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Obtient la valeur de la propriété gender.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Définit la valeur de la propriété gender.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

    /**
     * Obtient la valeur de la propriété weight.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * Définit la valeur de la propriété weight.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeight(Integer value) {
        this.weight = value;
    }

    /**
     * Obtient la valeur de la propriété height.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Définit la valeur de la propriété height.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeight(Integer value) {
        this.height = value;
    }

    /**
     * Obtient la valeur de la propriété weeksOfAmenorrhea.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeeksOfAmenorrhea() {
        return weeksOfAmenorrhea;
    }

    /**
     * Définit la valeur de la propriété weeksOfAmenorrhea.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeeksOfAmenorrhea(Integer value) {
        this.weeksOfAmenorrhea = value;
    }

    /**
     * Obtient la valeur de la propriété breastFeeding.
     * 
     * @return
     *     possible object is
     *     {@link Breastfeeding }
     *     
     */
    public Breastfeeding getBreastFeeding() {
        return breastFeeding;
    }

    /**
     * Définit la valeur de la propriété breastFeeding.
     * 
     * @param value
     *     allowed object is
     *     {@link Breastfeeding }
     *     
     */
    public void setBreastFeeding(Breastfeeding value) {
        this.breastFeeding = value;
    }

    /**
     * Obtient la valeur de la propriété creatin.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreatin() {
        return creatin;
    }

    /**
     * Définit la valeur de la propriété creatin.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreatin(Integer value) {
        this.creatin = value;
    }

    /**
     * Obtient la valeur de la propriété hepaticInsufficiency.
     * 
     * @return
     *     possible object is
     *     {@link HepaticInsufficiency }
     *     
     */
    public HepaticInsufficiency getHepaticInsufficiency() {
        return hepaticInsufficiency;
    }

    /**
     * Définit la valeur de la propriété hepaticInsufficiency.
     * 
     * @param value
     *     allowed object is
     *     {@link HepaticInsufficiency }
     *     
     */
    public void setHepaticInsufficiency(HepaticInsufficiency value) {
        this.hepaticInsufficiency = value;
    }

    /**
     * Obtient la valeur de la propriété allergyIdList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getAllergyIdList() {
        return allergyIdList;
    }

    /**
     * Définit la valeur de la propriété allergyIdList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setAllergyIdList(ArrayOfInt value) {
        this.allergyIdList = value;
    }

    /**
     * Obtient la valeur de la propriété moleculeIdList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getMoleculeIdList() {
        return moleculeIdList;
    }

    /**
     * Définit la valeur de la propriété moleculeIdList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setMoleculeIdList(ArrayOfInt value) {
        this.moleculeIdList = value;
    }

    /**
     * Obtient la valeur de la propriété pathologyCim10IdList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getPathologyCim10IdList() {
        return pathologyCim10IdList;
    }

    /**
     * Définit la valeur de la propriété pathologyCim10IdList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setPathologyCim10IdList(ArrayOfInt value) {
        this.pathologyCim10IdList = value;
    }

}
