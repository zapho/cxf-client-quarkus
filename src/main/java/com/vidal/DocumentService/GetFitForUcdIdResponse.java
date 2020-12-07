
package com.vidal.DocumentService;

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
 *         &lt;element name="documentList" type="{urn:Vidal}ArrayOfDocument"/>
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
    "documentList"
})
@XmlRootElement(name = "getFitForUcdIdResponse")
public class GetFitForUcdIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfDocument documentList;

    /**
     * Obtient la valeur de la propriété documentList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocument }
     *     
     */
    public ArrayOfDocument getDocumentList() {
        return documentList;
    }

    /**
     * Définit la valeur de la propriété documentList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocument }
     *     
     */
    public void setDocumentList(ArrayOfDocument value) {
        this.documentList = value;
    }

}
