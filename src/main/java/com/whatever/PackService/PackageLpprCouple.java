
package com.whatever.PackService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PackageLpprCouple complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PackageLpprCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lppr" type="{urn:Vidal}lppr"/>
 *         &lt;element name="nbLppr" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "PackageLpprCouple", namespace = "http://lppr.api.vidal.com", propOrder = {
    "id",
    "lppr",
    "nbLppr",
    "pack"
})
public class PackageLpprCouple {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true, nillable = true)
    protected Lppr lppr;
    protected int nbLppr;
    @XmlElement(required = true, nillable = true)
    protected Pack pack;

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

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
