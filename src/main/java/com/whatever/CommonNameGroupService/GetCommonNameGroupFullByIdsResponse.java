
package com.whatever.CommonNameGroupService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonNameGroupFullList" type="{urn:Vidal}ArrayOfCommonNameGroupFull"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "commonNameGroupFullList"
})
@XmlRootElement(name = "getCommonNameGroupFullByIdsResponse")
public class GetCommonNameGroupFullByIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroupFull commonNameGroupFullList;

    /**
     * Obtient la valeur de la propriété commonNameGroupFullList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroupFull }
     *     
     */
    public ArrayOfCommonNameGroupFull getCommonNameGroupFullList() {
        return commonNameGroupFullList;
    }

    /**
     * Définit la valeur de la propriété commonNameGroupFullList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroupFull }
     *     
     */
    public void setCommonNameGroupFullList(ArrayOfCommonNameGroupFull value) {
        this.commonNameGroupFullList = value;
    }

}
