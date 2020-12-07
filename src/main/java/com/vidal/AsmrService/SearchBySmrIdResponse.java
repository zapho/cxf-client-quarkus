
package com.vidal.AsmrService;

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
 *         &lt;element name="asmrList" type="{urn:Vidal}ArrayOfAsmr"/>
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
    "asmrList"
})
@XmlRootElement(name = "searchBySmrIdResponse")
public class SearchBySmrIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfAsmr asmrList;

    /**
     * Obtient la valeur de la propriété asmrList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAsmr }
     *     
     */
    public ArrayOfAsmr getAsmrList() {
        return asmrList;
    }

    /**
     * Définit la valeur de la propriété asmrList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAsmr }
     *     
     */
    public void setAsmrList(ArrayOfAsmr value) {
        this.asmrList = value;
    }

}
