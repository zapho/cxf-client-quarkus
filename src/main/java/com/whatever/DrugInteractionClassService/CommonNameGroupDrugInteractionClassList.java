
package com.whatever.DrugInteractionClassService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CommonNameGroupDrugInteractionClassList complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CommonNameGroupDrugInteractionClassList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="drugInteractionClassList" type="{urn:Vidal}ArrayOfDrugInteractionClass"/>
 *         &lt;element name="homogeneous" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonNameGroupDrugInteractionClassList", propOrder = {
    "drugInteractionClassList",
    "homogeneous"
})
public class CommonNameGroupDrugInteractionClassList {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfDrugInteractionClass drugInteractionClassList;
    protected boolean homogeneous;

    /**
     * Obtient la valeur de la propriété drugInteractionClassList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDrugInteractionClass }
     *     
     */
    public ArrayOfDrugInteractionClass getDrugInteractionClassList() {
        return drugInteractionClassList;
    }

    /**
     * Définit la valeur de la propriété drugInteractionClassList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDrugInteractionClass }
     *     
     */
    public void setDrugInteractionClassList(ArrayOfDrugInteractionClass value) {
        this.drugInteractionClassList = value;
    }

    /**
     * Obtient la valeur de la propriété homogeneous.
     * 
     */
    public boolean isHomogeneous() {
        return homogeneous;
    }

    /**
     * Définit la valeur de la propriété homogeneous.
     * 
     */
    public void setHomogeneous(boolean value) {
        this.homogeneous = value;
    }

}
