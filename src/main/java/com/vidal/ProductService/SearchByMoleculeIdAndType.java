
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
 *         &lt;element name="moleculeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="substanceType" type="{urn:Vidal}SubstanceType"/>
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
    "moleculeId",
    "substanceType"
})
@XmlRootElement(name = "searchByMoleculeIdAndType")
public class SearchByMoleculeIdAndType {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer moleculeId;
    @XmlElement(required = true, nillable = true)
    protected SubstanceType substanceType;

    /**
     * Obtient la valeur de la propriété moleculeId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMoleculeId() {
        return moleculeId;
    }

    /**
     * Définit la valeur de la propriété moleculeId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMoleculeId(Integer value) {
        this.moleculeId = value;
    }

    /**
     * Obtient la valeur de la propriété substanceType.
     * 
     * @return
     *     possible object is
     *     {@link SubstanceType }
     *     
     */
    public SubstanceType getSubstanceType() {
        return substanceType;
    }

    /**
     * Définit la valeur de la propriété substanceType.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstanceType }
     *     
     */
    public void setSubstanceType(SubstanceType value) {
        this.substanceType = value;
    }

}
