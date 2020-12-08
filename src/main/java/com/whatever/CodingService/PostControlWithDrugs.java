
package com.whatever.CodingService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="patient" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prescriptionLines" type="{urn:Vidal}ArrayOfString"/>
 *         &lt;element name="engine" type="{urn:Vidal}SearchEngine"/>
 *         &lt;element name="drugCursor" type="{urn:Vidal}PmsiCursors"/>
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
    "text",
    "patient",
    "prescriptionLines",
    "engine",
    "drugCursor"
})
@XmlRootElement(name = "postControlWithDrugs")
public class PostControlWithDrugs {

    @XmlElement(required = true, nillable = true)
    protected String text;
    @XmlElement(required = true, nillable = true)
    protected String patient;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString prescriptionLines;
    @XmlElement(required = true, nillable = true)
    protected SearchEngine engine;
    @XmlElement(required = true, nillable = true)
    protected PmsiCursors drugCursor;

    /**
     * Obtient la valeur de la propriété text.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Définit la valeur de la propriété text.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Obtient la valeur de la propriété patient.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatient() {
        return patient;
    }

    /**
     * Définit la valeur de la propriété patient.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatient(String value) {
        this.patient = value;
    }

    /**
     * Obtient la valeur de la propriété prescriptionLines.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getPrescriptionLines() {
        return prescriptionLines;
    }

    /**
     * Définit la valeur de la propriété prescriptionLines.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setPrescriptionLines(ArrayOfString value) {
        this.prescriptionLines = value;
    }

    /**
     * Obtient la valeur de la propriété engine.
     * 
     * @return
     *     possible object is
     *     {@link SearchEngine }
     *     
     */
    public SearchEngine getEngine() {
        return engine;
    }

    /**
     * Définit la valeur de la propriété engine.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEngine }
     *     
     */
    public void setEngine(SearchEngine value) {
        this.engine = value;
    }

    /**
     * Obtient la valeur de la propriété drugCursor.
     * 
     * @return
     *     possible object is
     *     {@link PmsiCursors }
     *     
     */
    public PmsiCursors getDrugCursor() {
        return drugCursor;
    }

    /**
     * Définit la valeur de la propriété drugCursor.
     * 
     * @param value
     *     allowed object is
     *     {@link PmsiCursors }
     *     
     */
    public void setDrugCursor(PmsiCursors value) {
        this.drugCursor = value;
    }

}
