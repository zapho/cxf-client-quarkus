
package com.vidal.ProductService;

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
 *         &lt;element name="moleculeIds" type="{urn:Vidal}ArrayOfInt"/>
 *         &lt;element name="substanceTypes" type="{urn:Vidal}ArrayOfSubstanceType"/>
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
    "moleculeIds",
    "substanceTypes"
})
@XmlRootElement(name = "searchByMoleculeIds")
public class SearchByMoleculeIds {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt moleculeIds;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfSubstanceType substanceTypes;

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

    /**
     * Obtient la valeur de la propriété substanceTypes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubstanceType }
     *     
     */
    public ArrayOfSubstanceType getSubstanceTypes() {
        return substanceTypes;
    }

    /**
     * Définit la valeur de la propriété substanceTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubstanceType }
     *     
     */
    public void setSubstanceTypes(ArrayOfSubstanceType value) {
        this.substanceTypes = value;
    }

}
