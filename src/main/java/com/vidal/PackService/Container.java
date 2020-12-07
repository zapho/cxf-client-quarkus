
package com.vidal.PackService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour container complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="container">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="containerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="containerQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="containerUnit" type="{urn:Vidal}posologyUnit"/>
 *         &lt;element name="contents" type="{urn:Vidal}ArrayOfItemContent"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "container", propOrder = {
    "containerId",
    "containerQuantity",
    "containerUnit",
    "contents"
})
public class Container {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long containerId;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer containerQuantity;
    @XmlElement(required = true, nillable = true)
    protected PosologyUnit containerUnit;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfItemContent contents;

    /**
     * Obtient la valeur de la propriété containerId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContainerId() {
        return containerId;
    }

    /**
     * Définit la valeur de la propriété containerId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContainerId(Long value) {
        this.containerId = value;
    }

    /**
     * Obtient la valeur de la propriété containerQuantity.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContainerQuantity() {
        return containerQuantity;
    }

    /**
     * Définit la valeur de la propriété containerQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContainerQuantity(Integer value) {
        this.containerQuantity = value;
    }

    /**
     * Obtient la valeur de la propriété containerUnit.
     * 
     * @return
     *     possible object is
     *     {@link PosologyUnit }
     *     
     */
    public PosologyUnit getContainerUnit() {
        return containerUnit;
    }

    /**
     * Définit la valeur de la propriété containerUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyUnit }
     *     
     */
    public void setContainerUnit(PosologyUnit value) {
        this.containerUnit = value;
    }

    /**
     * Obtient la valeur de la propriété contents.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemContent }
     *     
     */
    public ArrayOfItemContent getContents() {
        return contents;
    }

    /**
     * Définit la valeur de la propriété contents.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemContent }
     *     
     */
    public void setContents(ArrayOfItemContent value) {
        this.contents = value;
    }

}
