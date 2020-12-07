
package com.vidal.LpprService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PackageLpprListCoupleSimplified complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PackageLpprListCoupleSimplified">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lppCompositionsList" type="{urn:Vidal}ArrayOfLpprCompositions"/>
 *         &lt;element name="pack" type="{urn:Vidal}pack"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageLpprListCoupleSimplified", namespace = "http://lppr.api.vidal.com", propOrder = {
    "lppCompositionsList",
    "pack"
})
public class PackageLpprListCoupleSimplified {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfLpprCompositions lppCompositionsList;
    @XmlElement(required = true, nillable = true)
    protected Pack pack;

    /**
     * Obtient la valeur de la propriété lppCompositionsList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLpprCompositions }
     *     
     */
    public ArrayOfLpprCompositions getLppCompositionsList() {
        return lppCompositionsList;
    }

    /**
     * Définit la valeur de la propriété lppCompositionsList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLpprCompositions }
     *     
     */
    public void setLppCompositionsList(ArrayOfLpprCompositions value) {
        this.lppCompositionsList = value;
    }

    /**
     * Obtient la valeur de la propriété pack.
     * 
     * @return
     *     possible object is
     *     {@link Pack }
     *     
     */
    public Pack getPack() {
        return pack;
    }

    /**
     * Définit la valeur de la propriété pack.
     * 
     * @param value
     *     allowed object is
     *     {@link Pack }
     *     
     */
    public void setPack(Pack value) {
        this.pack = value;
    }

}
