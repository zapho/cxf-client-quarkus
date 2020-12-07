
package com.vidal.ContraIndicationService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CommonNameGroupContraIndicationCim10List complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CommonNameGroupContraIndicationCim10List">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contraIndications" type="{urn:Vidal}ArrayOfContraIndicationTypeCim10Tuple"/>
 *         &lt;element name="homogeneous" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonNameGroupContraIndicationCim10List", propOrder = {
    "contraIndications",
    "homogeneous"
})
public class CommonNameGroupContraIndicationCim10List {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfContraIndicationTypeCim10Tuple contraIndications;
    protected boolean homogeneous;

    /**
     * Obtient la valeur de la propriété contraIndications.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContraIndicationTypeCim10Tuple }
     *     
     */
    public ArrayOfContraIndicationTypeCim10Tuple getContraIndications() {
        return contraIndications;
    }

    /**
     * Définit la valeur de la propriété contraIndications.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContraIndicationTypeCim10Tuple }
     *     
     */
    public void setContraIndications(ArrayOfContraIndicationTypeCim10Tuple value) {
        this.contraIndications = value;
    }

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

}
