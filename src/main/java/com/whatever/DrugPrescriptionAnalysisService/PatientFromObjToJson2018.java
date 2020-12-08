
package com.whatever.DrugPrescriptionAnalysisService;

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
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="weeksOfAmenorrhea" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="breastFeedingStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "breastFeedingStartDate",
    "creatin",
    "hepaticInsufficiency",
    "allergyIdList",
    "moleculeIdList",
    "pathologyCim10IdList"
})
@XmlRootElement(name = "patientFromObjToJson2018")
public class PatientFromObjToJson2018 {

    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(required = true, nillable = true)
    protected Gender gender;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double weight;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double height;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer weeksOfAmenorrhea;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar breastFeedingStartDate;
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
     *     {@link Double }
     *     
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * Définit la valeur de la propriété weight.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeight(Double value) {
        this.weight = value;
    }

    /**
     * Obtient la valeur de la propriété height.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHeight() {
        return height;
    }

    /**
     * Définit la valeur de la propriété height.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHeight(Double value) {
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
     * Obtient la valeur de la propriété breastFeedingStartDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBreastFeedingStartDate() {
        return breastFeedingStartDate;
    }

    /**
     * Définit la valeur de la propriété breastFeedingStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBreastFeedingStartDate(XMLGregorianCalendar value) {
        this.breastFeedingStartDate = value;
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
