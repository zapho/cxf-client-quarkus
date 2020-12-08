
package com.whatever.GalenicFormService;

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
 *         &lt;element name="galenicFormList" type="{urn:Vidal}ArrayOfGalenicForm"/>
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
    "galenicFormList"
})
@XmlRootElement(name = "searchByIdsResponse")
public class SearchByIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfGalenicForm galenicFormList;

    /**
     * Obtient la valeur de la propriété galenicFormList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGalenicForm }
     *     
     */
    public ArrayOfGalenicForm getGalenicFormList() {
        return galenicFormList;
    }

    /**
     * Définit la valeur de la propriété galenicFormList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGalenicForm }
     *     
     */
    public void setGalenicFormList(ArrayOfGalenicForm value) {
        this.galenicFormList = value;
    }

}
