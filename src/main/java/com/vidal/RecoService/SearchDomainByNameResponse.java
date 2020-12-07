
package com.vidal.RecoService;

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
 *         &lt;element name="recoDomainList" type="{urn:Vidal}ArrayOfRecoDomain"/>
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
    "recoDomainList"
})
@XmlRootElement(name = "searchDomainByNameResponse")
public class SearchDomainByNameResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfRecoDomain recoDomainList;

    /**
     * Obtient la valeur de la propriété recoDomainList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecoDomain }
     *     
     */
    public ArrayOfRecoDomain getRecoDomainList() {
        return recoDomainList;
    }

    /**
     * Définit la valeur de la propriété recoDomainList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecoDomain }
     *     
     */
    public void setRecoDomainList(ArrayOfRecoDomain value) {
        this.recoDomainList = value;
    }

}
