
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
 *         &lt;element name="commonNameGroupList" type="{urn:Vidal}ArrayOfCommonNameGroup"/>
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
    "commonNameGroupList"
})
@XmlRootElement(name = "searchByActivePrincipleIdsResponse")
public class SearchByActivePrincipleIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroup commonNameGroupList;

    /**
     * Obtient la valeur de la propriété commonNameGroupList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroup }
     *     
     */
    public ArrayOfCommonNameGroup getCommonNameGroupList() {
        return commonNameGroupList;
    }

    /**
     * Définit la valeur de la propriété commonNameGroupList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroup }
     *     
     */
    public void setCommonNameGroupList(ArrayOfCommonNameGroup value) {
        this.commonNameGroupList = value;
    }

}
