
package com.whatever.AllergyService;

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
 *         &lt;element name="productMoleculeCoupleList" type="{urn:Vidal}ArrayOfProductMoleculeCouple"/>
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
    "productMoleculeCoupleList"
})
@XmlRootElement(name = "getAlertsOnAllergiesMoleculesResponse")
public class GetAlertsOnAllergiesMoleculesResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfProductMoleculeCouple productMoleculeCoupleList;

    /**
     * Obtient la valeur de la propriété productMoleculeCoupleList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductMoleculeCouple }
     *     
     */
    public ArrayOfProductMoleculeCouple getProductMoleculeCoupleList() {
        return productMoleculeCoupleList;
    }

    /**
     * Définit la valeur de la propriété productMoleculeCoupleList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductMoleculeCouple }
     *     
     */
    public void setProductMoleculeCoupleList(ArrayOfProductMoleculeCouple value) {
        this.productMoleculeCoupleList = value;
    }

}
