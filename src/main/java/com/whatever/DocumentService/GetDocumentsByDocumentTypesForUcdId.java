
package com.whatever.DocumentService;

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
 *         &lt;element name="documentTypeList" type="{urn:Vidal}ArrayOfDocumentType"/>
 *         &lt;element name="UcdId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "documentTypeList",
    "ucdId"
})
@XmlRootElement(name = "getDocumentsByDocumentTypesForUcdId")
public class GetDocumentsByDocumentTypesForUcdId {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfDocumentType documentTypeList;
    @XmlElement(name = "UcdId", required = true, type = Integer.class, nillable = true)
    protected Integer ucdId;

    /**
     * Obtient la valeur de la propriété documentTypeList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocumentType }
     *     
     */
    public ArrayOfDocumentType getDocumentTypeList() {
        return documentTypeList;
    }

    /**
     * Définit la valeur de la propriété documentTypeList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocumentType }
     *     
     */
    public void setDocumentTypeList(ArrayOfDocumentType value) {
        this.documentTypeList = value;
    }

    /**
     * Obtient la valeur de la propriété ucdId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUcdId() {
        return ucdId;
    }

    /**
     * Définit la valeur de la propriété ucdId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUcdId(Integer value) {
        this.ucdId = value;
    }

}
