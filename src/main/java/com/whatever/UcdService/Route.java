
package com.whatever.UcdService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour route complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="route">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="outOfSPC" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="parentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ranking" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "route", propOrder = {
    "id",
    "name",
    "outOfSPC",
    "parentId",
    "ranking"
})
public class Route {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true, nillable = true)
    protected String name;
    protected boolean outOfSPC;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer parentId;
    protected int ranking;

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
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété outOfSPC.
     * 
     */
    public boolean isOutOfSPC() {
        return outOfSPC;
    }

    /**
     * Définit la valeur de la propriété outOfSPC.
     * 
     */
    public void setOutOfSPC(boolean value) {
        this.outOfSPC = value;
    }

    /**
     * Obtient la valeur de la propriété parentId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * Définit la valeur de la propriété parentId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParentId(Integer value) {
        this.parentId = value;
    }

    /**
     * Obtient la valeur de la propriété ranking.
     * 
     */
    public int getRanking() {
        return ranking;
    }

    /**
     * Définit la valeur de la propriété ranking.
     * 
     */
    public void setRanking(int value) {
        this.ranking = value;
    }

}
