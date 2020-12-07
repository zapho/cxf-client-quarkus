
package com.vidal.PackService;

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
 *         &lt;element name="searchPackCode" type="{urn:Vidal}SearchPackCode"/>
 *         &lt;element name="codes" type="{urn:Vidal}ArrayOfString"/>
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
    "searchPackCode",
    "codes"
})
@XmlRootElement(name = "searchByTypedCodes")
public class SearchByTypedCodes {

    @XmlElement(required = true, nillable = true)
    protected SearchPackCode searchPackCode;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString codes;

    /**
     * Obtient la valeur de la propriété searchPackCode.
     * 
     * @return
     *     possible object is
     *     {@link SearchPackCode }
     *     
     */
    public SearchPackCode getSearchPackCode() {
        return searchPackCode;
    }

    /**
     * Définit la valeur de la propriété searchPackCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchPackCode }
     *     
     */
    public void setSearchPackCode(SearchPackCode value) {
        this.searchPackCode = value;
    }

    /**
     * Obtient la valeur de la propriété codes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getCodes() {
        return codes;
    }

    /**
     * Définit la valeur de la propriété codes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setCodes(ArrayOfString value) {
        this.codes = value;
    }

}
