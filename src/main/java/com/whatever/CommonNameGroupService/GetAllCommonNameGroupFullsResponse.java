
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
 *         &lt;element name="pagedResultCommonNameGroupFull" type="{urn:Vidal}pagedResultCommonNameGroupFull"/>
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
    "pagedResultCommonNameGroupFull"
})
@XmlRootElement(name = "getAllCommonNameGroupFullsResponse")
public class GetAllCommonNameGroupFullsResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultCommonNameGroupFull pagedResultCommonNameGroupFull;

    /**
     * Obtient la valeur de la propriété pagedResultCommonNameGroupFull.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultCommonNameGroupFull }
     *     
     */
    public PagedResultCommonNameGroupFull getPagedResultCommonNameGroupFull() {
        return pagedResultCommonNameGroupFull;
    }

    /**
     * Définit la valeur de la propriété pagedResultCommonNameGroupFull.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultCommonNameGroupFull }
     *     
     */
    public void setPagedResultCommonNameGroupFull(PagedResultCommonNameGroupFull value) {
        this.pagedResultCommonNameGroupFull = value;
    }

}
