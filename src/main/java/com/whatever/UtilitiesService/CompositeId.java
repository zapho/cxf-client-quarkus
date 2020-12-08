
package com.whatever.UtilitiesService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CompositeId complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CompositeId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="compositeType" type="{urn:Vidal}CompositeType"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeId", propOrder = {
    "compositeType",
    "id"
})
public class CompositeId {

    @XmlElement(required = true, nillable = true)
    protected CompositeType compositeType;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;

    /**
     * Obtient la valeur de la propriété compositeType.
     * 
     * @return
     *     possible object is
     *     {@link CompositeType }
     *     
     */
    public CompositeType getCompositeType() {
        return compositeType;
    }

    /**
     * Définit la valeur de la propriété compositeType.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositeType }
     *     
     */
    public void setCompositeType(CompositeType value) {
        this.compositeType = value;
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

}
