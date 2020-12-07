
package com.vidal.CispService;

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
 *         &lt;element name="cispList" type="{urn:Vidal}ArrayOfCisp"/>
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
    "cispList"
})
@XmlRootElement(name = "searchByCodeResponse")
public class SearchByCodeResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCisp cispList;

    /**
     * Obtient la valeur de la propriété cispList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCisp }
     *     
     */
    public ArrayOfCisp getCispList() {
        return cispList;
    }

    /**
     * Définit la valeur de la propriété cispList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCisp }
     *     
     */
    public void setCispList(ArrayOfCisp value) {
        this.cispList = value;
    }

}
