
package com.vidal.CommonNameGroupService;

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
 *         &lt;element name="pagedResultCommonNameGroupByAld" type="{urn:Vidal}pagedResultCommonNameGroup"/>
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
    "pagedResultCommonNameGroupByAld"
})
@XmlRootElement(name = "searchByAldIdResponse")
public class SearchByAldIdResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultCommonNameGroup pagedResultCommonNameGroupByAld;

    /**
     * Obtient la valeur de la propriété pagedResultCommonNameGroupByAld.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultCommonNameGroup }
     *     
     */
    public PagedResultCommonNameGroup getPagedResultCommonNameGroupByAld() {
        return pagedResultCommonNameGroupByAld;
    }

    /**
     * Définit la valeur de la propriété pagedResultCommonNameGroupByAld.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultCommonNameGroup }
     *     
     */
    public void setPagedResultCommonNameGroupByAld(PagedResultCommonNameGroup value) {
        this.pagedResultCommonNameGroupByAld = value;
    }

}
