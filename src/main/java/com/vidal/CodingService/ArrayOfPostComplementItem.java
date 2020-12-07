
package com.vidal.CodingService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfPostComplementItem complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPostComplementItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="postComplementItem" type="{urn:Vidal}postComplementItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPostComplementItem", propOrder = {
    "postComplementItem"
})
public class ArrayOfPostComplementItem {

    @XmlElement(nillable = true)
    protected List<PostComplementItem> postComplementItem;

    /**
     * Gets the value of the postComplementItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postComplementItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostComplementItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostComplementItem }
     * 
     * 
     */
    public List<PostComplementItem> getPostComplementItem() {
        if (postComplementItem == null) {
            postComplementItem = new ArrayList<PostComplementItem>();
        }
        return this.postComplementItem;
    }

}
