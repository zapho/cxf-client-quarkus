
package com.vidal.PackService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour packFull complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="packFull">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="containers" type="{urn:Vidal}ArrayOfContainer"/>
 *         &lt;element name="indicationsAtu" type="{urn:Vidal}ArrayOfOtherIndication"/>
 *         &lt;element name="indicationsLes" type="{urn:Vidal}ArrayOfIndicationLes"/>
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
@XmlType(name = "packFull", propOrder = {
    "containers",
    "indicationsAtu",
    "indicationsLes",
    "pack"
})
public class PackFull {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfContainer containers;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfOtherIndication indicationsAtu;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfIndicationLes indicationsLes;
    @XmlElement(required = true, nillable = true)
    protected Pack pack;

    /**
     * Obtient la valeur de la propriété containers.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContainer }
     *     
     */
    public ArrayOfContainer getContainers() {
        return containers;
    }

    /**
     * Définit la valeur de la propriété containers.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContainer }
     *     
     */
    public void setContainers(ArrayOfContainer value) {
        this.containers = value;
    }

    /**
     * Obtient la valeur de la propriété indicationsAtu.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOtherIndication }
     *     
     */
    public ArrayOfOtherIndication getIndicationsAtu() {
        return indicationsAtu;
    }

    /**
     * Définit la valeur de la propriété indicationsAtu.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOtherIndication }
     *     
     */
    public void setIndicationsAtu(ArrayOfOtherIndication value) {
        this.indicationsAtu = value;
    }

    /**
     * Obtient la valeur de la propriété indicationsLes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIndicationLes }
     *     
     */
    public ArrayOfIndicationLes getIndicationsLes() {
        return indicationsLes;
    }

    /**
     * Définit la valeur de la propriété indicationsLes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIndicationLes }
     *     
     */
    public void setIndicationsLes(ArrayOfIndicationLes value) {
        this.indicationsLes = value;
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
