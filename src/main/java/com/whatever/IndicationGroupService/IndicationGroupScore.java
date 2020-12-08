
package com.whatever.IndicationGroupService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour indicationGroupScore complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="indicationGroupScore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="groupingProducts" type="{urn:Vidal}ArrayOfProduct"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="indicationGroup" type="{urn:Vidal}indicationGroup"/>
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "indicationGroupScore", propOrder = {
    "groupingProducts",
    "id",
    "indicationGroup",
    "score"
})
public class IndicationGroupScore {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfProduct groupingProducts;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true, nillable = true)
    protected IndicationGroup indicationGroup;
    protected int score;

    /**
     * Obtient la valeur de la propriété groupingProducts.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProduct }
     *     
     */
    public ArrayOfProduct getGroupingProducts() {
        return groupingProducts;
    }

    /**
     * Définit la valeur de la propriété groupingProducts.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProduct }
     *     
     */
    public void setGroupingProducts(ArrayOfProduct value) {
        this.groupingProducts = value;
    }

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
     * Obtient la valeur de la propriété indicationGroup.
     * 
     * @return
     *     possible object is
     *     {@link IndicationGroup }
     *     
     */
    public IndicationGroup getIndicationGroup() {
        return indicationGroup;
    }

    /**
     * Définit la valeur de la propriété indicationGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicationGroup }
     *     
     */
    public void setIndicationGroup(IndicationGroup value) {
        this.indicationGroup = value;
    }

    /**
     * Obtient la valeur de la propriété score.
     * 
     */
    public int getScore() {
        return score;
    }

    /**
     * Définit la valeur de la propriété score.
     * 
     */
    public void setScore(int value) {
        this.score = value;
    }

}
