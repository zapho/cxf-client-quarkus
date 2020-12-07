
package com.vidal.PrecautionService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CommonNameGroupPrecautionCim10List complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CommonNameGroupPrecautionCim10List">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="homogeneous" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="precautions" type="{urn:Vidal}ArrayOfPrecautionCim10Pair"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonNameGroupPrecautionCim10List", propOrder = {
    "homogeneous",
    "precautions"
})
public class CommonNameGroupPrecautionCim10List {

    protected boolean homogeneous;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPrecautionCim10Pair precautions;

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
     *     {@link ArrayOfPrecautionCim10Pair }
     *     
     */
    public ArrayOfPrecautionCim10Pair getPrecautions() {
        return precautions;
    }

    /**
     * Définit la valeur de la propriété precautions.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrecautionCim10Pair }
     *     
     */
    public void setPrecautions(ArrayOfPrecautionCim10Pair value) {
        this.precautions = value;
    }

}
