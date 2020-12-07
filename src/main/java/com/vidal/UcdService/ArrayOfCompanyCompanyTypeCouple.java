
package com.vidal.UcdService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfCompanyCompanyTypeCouple complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCompanyCompanyTypeCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyCompanyTypeCouple" type="{urn:Vidal}companyCompanyTypeCouple" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCompanyCompanyTypeCouple", propOrder = {
    "companyCompanyTypeCouple"
})
public class ArrayOfCompanyCompanyTypeCouple {

    @XmlElement(nillable = true)
    protected List<CompanyCompanyTypeCouple> companyCompanyTypeCouple;

    /**
     * Gets the value of the companyCompanyTypeCouple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companyCompanyTypeCouple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanyCompanyTypeCouple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyCompanyTypeCouple }
     * 
     * 
     */
    public List<CompanyCompanyTypeCouple> getCompanyCompanyTypeCouple() {
        if (companyCompanyTypeCouple == null) {
            companyCompanyTypeCouple = new ArrayList<CompanyCompanyTypeCouple>();
        }
        return this.companyCompanyTypeCouple;
    }

}
