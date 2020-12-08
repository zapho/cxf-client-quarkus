
package com.whatever.LpprService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour lpprCompositions complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="lpprCompositions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lppr" type="{urn:Vidal}lppr"/>
 *         &lt;element name="nbLppr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lpprCompositions", propOrder = {
    "lppr",
    "nbLppr"
})
public class LpprCompositions {

    @XmlElement(required = true, nillable = true)
    protected Lppr lppr;
    protected int nbLppr;

    /**
     * Obtient la valeur de la propriété lppr.
     * 
     * @return
     *     possible object is
     *     {@link Lppr }
     *     
     */
    public Lppr getLppr() {
        return lppr;
    }

    /**
     * Définit la valeur de la propriété lppr.
     * 
     * @param value
     *     allowed object is
     *     {@link Lppr }
     *     
     */
    public void setLppr(Lppr value) {
        this.lppr = value;
    }

    /**
     * Obtient la valeur de la propriété nbLppr.
     * 
     */
    public int getNbLppr() {
        return nbLppr;
    }

    /**
     * Définit la valeur de la propriété nbLppr.
     * 
     */
    public void setNbLppr(int value) {
        this.nbLppr = value;
    }

}
