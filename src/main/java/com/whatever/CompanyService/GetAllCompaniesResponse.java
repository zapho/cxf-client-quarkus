
package com.whatever.CompanyService;

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
 *         &lt;element name="pagedResultCompany" type="{urn:Vidal}pagedResultCompany"/>
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
    "pagedResultCompany"
})
@XmlRootElement(name = "getAllCompaniesResponse")
public class GetAllCompaniesResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultCompany pagedResultCompany;

    /**
     * Obtient la valeur de la propriété pagedResultCompany.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultCompany }
     *     
     */
    public PagedResultCompany getPagedResultCompany() {
        return pagedResultCompany;
    }

    /**
     * Définit la valeur de la propriété pagedResultCompany.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultCompany }
     *     
     */
    public void setPagedResultCompany(PagedResultCompany value) {
        this.pagedResultCompany = value;
    }

}
