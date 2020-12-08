
package com.whatever.PrecautionService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CommonNameGroupPrecautionList complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CommonNameGroupPrecautionList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="homogeneous" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="precautions" type="{urn:Vidal}ArrayOfPrecaution"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonNameGroupPrecautionList", propOrder = {
    "homogeneous",
    "precautions"
})
public class CommonNameGroupPrecautionList {

    protected boolean homogeneous;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPrecaution precautions;

    /**
     * Obtient la valeur de la propriété homogeneous.
     * 
     */
    public boolean isHomogeneous() {
        return homogeneous;
    }

    /**
     * Définit la valeur de la propriété homogeneous.
     * 
     */
    public void setHomogeneous(boolean value) {
        this.homogeneous = value;
    }

    /**
     * Obtient la valeur de la propriété precautions.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPrecaution }
     *     
     */
    public ArrayOfPrecaution getPrecautions() {
        return precautions;
    }

    /**
     * Définit la valeur de la propriété precautions.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrecaution }
     *     
     */
    public void setPrecautions(ArrayOfPrecaution value) {
        this.precautions = value;
    }

}
