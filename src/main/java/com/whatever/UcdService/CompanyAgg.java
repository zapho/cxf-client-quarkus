
package com.whatever.UcdService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour companyAgg complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="companyAgg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyTypes" type="{urn:Vidal}ArrayOfCompanyCompanyTypeCouple"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "companyAgg", propOrder = {
    "companyTypes"
})
public class CompanyAgg {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCompanyCompanyTypeCouple companyTypes;

    /**
     * Obtient la valeur de la propriété companyTypes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCompanyCompanyTypeCouple }
     *     
     */
    public ArrayOfCompanyCompanyTypeCouple getCompanyTypes() {
        return companyTypes;
    }

    /**
     * Définit la valeur de la propriété companyTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCompanyCompanyTypeCouple }
     *     
     */
    public void setCompanyTypes(ArrayOfCompanyCompanyTypeCouple value) {
        this.companyTypes = value;
    }

}
