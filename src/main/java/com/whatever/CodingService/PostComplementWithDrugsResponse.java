
package com.whatever.CodingService;

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
 *         &lt;element name="postComplementItemList" type="{urn:Vidal}ArrayOfPostComplementItem"/>
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
    "postComplementItemList"
})
@XmlRootElement(name = "postComplementWithDrugsResponse")
public class PostComplementWithDrugsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfPostComplementItem postComplementItemList;

    /**
     * Obtient la valeur de la propriété postComplementItemList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPostComplementItem }
     *     
     */
    public ArrayOfPostComplementItem getPostComplementItemList() {
        return postComplementItemList;
    }

    /**
     * Définit la valeur de la propriété postComplementItemList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPostComplementItem }
     *     
     */
    public void setPostComplementItemList(ArrayOfPostComplementItem value) {
        this.postComplementItemList = value;
    }

}
