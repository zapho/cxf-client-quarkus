
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
 *         &lt;element name="companyCompanyTypeCoupleList" type="{urn:Vidal}ArrayOfCompanyCompanyTypeCouple"/>
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
    "companyCompanyTypeCoupleList"
})
@XmlRootElement(name = "searchByPackIdResponse")
public class SearchByPackIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCompanyCompanyTypeCouple companyCompanyTypeCoupleList;

    /**
     * Obtient la valeur de la propriété companyCompanyTypeCoupleList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCompanyCompanyTypeCouple }
     *     
     */
    public ArrayOfCompanyCompanyTypeCouple getCompanyCompanyTypeCoupleList() {
        return companyCompanyTypeCoupleList;
    }

    /**
     * Définit la valeur de la propriété companyCompanyTypeCoupleList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCompanyCompanyTypeCouple }
     *     
     */
    public void setCompanyCompanyTypeCoupleList(ArrayOfCompanyCompanyTypeCouple value) {
        this.companyCompanyTypeCoupleList = value;
    }

}
