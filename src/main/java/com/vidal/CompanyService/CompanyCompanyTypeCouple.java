
package com.vidal.CompanyService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour companyCompanyTypeCouple complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="companyCompanyTypeCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="company" type="{urn:Vidal}company"/>
 *         &lt;element name="companyType" type="{urn:Vidal}CompanyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "companyCompanyTypeCouple", propOrder = {
    "company",
    "companyType"
})
public class CompanyCompanyTypeCouple {

    @XmlElement(required = true, nillable = true)
    protected Company company;
    @XmlElement(required = true, nillable = true)
    protected CompanyType companyType;

    /**
     * Obtient la valeur de la propriété company.
     * 
     * @return
     *     possible object is
     *     {@link Company }
     *     
     */
    public Company getCompany() {
        return company;
    }

    /**
     * Définit la valeur de la propriété company.
     * 
     * @param value
     *     allowed object is
     *     {@link Company }
     *     
     */
    public void setCompany(Company value) {
        this.company = value;
    }

    /**
     * Obtient la valeur de la propriété companyType.
     * 
     * @return
     *     possible object is
     *     {@link CompanyType }
     *     
     */
    public CompanyType getCompanyType() {
        return companyType;
    }

    /**
     * Définit la valeur de la propriété companyType.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyType }
     *     
     */
    public void setCompanyType(CompanyType value) {
        this.companyType = value;
    }

}
