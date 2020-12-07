
package com.vidal.AllergyService;

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
 *         &lt;element name="productIds" type="{urn:Vidal}ArrayOfInt"/>
 *         &lt;element name="moleculeIds" type="{urn:Vidal}ArrayOfInt"/>
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
    "productIds",
    "moleculeIds"
})
@XmlRootElement(name = "getAlertsOnAllergiesMolecules")
public class GetAlertsOnAllergiesMolecules {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt productIds;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt moleculeIds;

    /**
     * Obtient la valeur de la propriété productIds.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getProductIds() {
        return productIds;
    }

    /**
     * Définit la valeur de la propriété productIds.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setProductIds(ArrayOfInt value) {
        this.productIds = value;
    }

    /**
     * Obtient la valeur de la propriété moleculeIds.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getMoleculeIds() {
        return moleculeIds;
    }

    /**
     * Définit la valeur de la propriété moleculeIds.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setMoleculeIds(ArrayOfInt value) {
        this.moleculeIds = value;
    }

}
