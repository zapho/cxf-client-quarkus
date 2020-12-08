
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
 *         &lt;element name="postControlItemList" type="{urn:Vidal}ArrayOfPostControlItem"/>
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
    "postControlItemList"
})
@XmlRootElement(name = "postControlWithDrugsResponse")
public class PostControlWithDrugsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfPostControlItem postControlItemList;

    /**
     * Obtient la valeur de la propriété postControlItemList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPostControlItem }
     *     
     */
    public ArrayOfPostControlItem getPostControlItemList() {
        return postControlItemList;
    }

    /**
     * Définit la valeur de la propriété postControlItemList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPostControlItem }
     *     
     */
    public void setPostControlItemList(ArrayOfPostControlItem value) {
        this.postControlItemList = value;
    }

}
