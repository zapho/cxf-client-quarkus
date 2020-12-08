
package com.whatever.IndicationService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour commonNameGroupTypedIndication complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="commonNameGroupTypedIndication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonNameGroup" type="{urn:Vidal}commonNameGroup"/>
 *         &lt;element name="typedIndicationList" type="{urn:Vidal}ArrayOfTypedIndication"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commonNameGroupTypedIndication", propOrder = {
    "commonNameGroup",
    "typedIndicationList"
})
public class CommonNameGroupTypedIndication {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroup commonNameGroup;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTypedIndication typedIndicationList;

    /**
     * Obtient la valeur de la propriété commonNameGroup.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroup }
     *     
     */
    public CommonNameGroup getCommonNameGroup() {
        return commonNameGroup;
    }

    /**
     * Définit la valeur de la propriété commonNameGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroup }
     *     
     */
    public void setCommonNameGroup(CommonNameGroup value) {
        this.commonNameGroup = value;
    }

    /**
     * Obtient la valeur de la propriété typedIndicationList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTypedIndication }
     *     
     */
    public ArrayOfTypedIndication getTypedIndicationList() {
        return typedIndicationList;
    }

    /**
     * Définit la valeur de la propriété typedIndicationList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTypedIndication }
     *     
     */
    public void setTypedIndicationList(ArrayOfTypedIndication value) {
        this.typedIndicationList = value;
    }

}
