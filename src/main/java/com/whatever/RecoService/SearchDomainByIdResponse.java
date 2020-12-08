
package com.whatever.RecoService;

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
 *         &lt;element name="recoDomain" type="{urn:Vidal}recoDomain"/>
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
    "recoDomain"
})
@XmlRootElement(name = "searchDomainByIdResponse")
public class SearchDomainByIdResponse {

    @XmlElement(required = true, nillable = true)
    protected RecoDomain recoDomain;

    /**
     * Obtient la valeur de la propriété recoDomain.
     * 
     * @return
     *     possible object is
     *     {@link RecoDomain }
     *     
     */
    public RecoDomain getRecoDomain() {
        return recoDomain;
    }

    /**
     * Définit la valeur de la propriété recoDomain.
     * 
     * @param value
     *     allowed object is
     *     {@link RecoDomain }
     *     
     */
    public void setRecoDomain(RecoDomain value) {
        this.recoDomain = value;
    }

}
