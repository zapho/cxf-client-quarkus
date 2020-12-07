
package com.vidal.CodingService;

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
 *         &lt;element name="cim10Codes" type="{urn:Vidal}ArrayOfString"/>
 *         &lt;element name="drugCodes" type="{urn:Vidal}ArrayOfString"/>
 *         &lt;element name="engine" type="{urn:Vidal}SearchEngine"/>
 *         &lt;element name="drugCursor" type="{urn:Vidal}PmsiCursors"/>
 *         &lt;element name="indicationGroupCleanParams" type="{urn:Vidal}indicationGroupCleanParams"/>
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
    "cim10Codes",
    "drugCodes",
    "engine",
    "drugCursor",
    "indicationGroupCleanParams"
})
@XmlRootElement(name = "postComplementWithDrugCodes")
public class PostComplementWithDrugCodes {

    @XmlElement(required = true, nillable = true)
    protected String text;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString cim10Codes;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString drugCodes;
    @XmlElement(required = true, nillable = true)
    protected SearchEngine engine;
    @XmlElement(required = true, nillable = true)
    protected PmsiCursors drugCursor;
    @XmlElement(required = true, nillable = true)
    protected IndicationGroupCleanParams indicationGroupCleanParams;

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
     * Obtient la valeur de la propriété cim10Codes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getCim10Codes() {
        return cim10Codes;
    }

    /**
     * Définit la valeur de la propriété cim10Codes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setCim10Codes(ArrayOfString value) {
        this.cim10Codes = value;
    }

    /**
     * Obtient la valeur de la propriété drugCodes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getDrugCodes() {
        return drugCodes;
    }

    /**
     * Définit la valeur de la propriété drugCodes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setDrugCodes(ArrayOfString value) {
        this.drugCodes = value;
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

    /**
     * Obtient la valeur de la propriété indicationGroupCleanParams.
     * 
     * @return
     *     possible object is
     *     {@link IndicationGroupCleanParams }
     *     
     */
    public IndicationGroupCleanParams getIndicationGroupCleanParams() {
        return indicationGroupCleanParams;
    }

    /**
     * Définit la valeur de la propriété indicationGroupCleanParams.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicationGroupCleanParams }
     *     
     */
    public void setIndicationGroupCleanParams(IndicationGroupCleanParams value) {
        this.indicationGroupCleanParams = value;
    }

}
