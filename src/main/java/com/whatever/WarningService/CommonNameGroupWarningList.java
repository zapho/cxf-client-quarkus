
package com.whatever.WarningService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CommonNameGroupWarningList complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CommonNameGroupWarningList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="homogeneous" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="warningCommentCouples" type="{urn:Vidal}ArrayOfWarningCommentCouple"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonNameGroupWarningList", propOrder = {
    "homogeneous",
    "warningCommentCouples"
})
public class CommonNameGroupWarningList {

    protected boolean homogeneous;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfWarningCommentCouple warningCommentCouples;

    /**
     * Obtient la valeur de la propriété homogeneous.
     * 
     */
    public boolean isHomogeneous() {
        return homogeneous;
    }

    /**
     * Définit la valeur de la propriété homogeneous.
     * 
     */
    public void setHomogeneous(boolean value) {
        this.homogeneous = value;
    }

    /**
     * Obtient la valeur de la propriété warningCommentCouples.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWarningCommentCouple }
     *     
     */
    public ArrayOfWarningCommentCouple getWarningCommentCouples() {
        return warningCommentCouples;
    }

    /**
     * Définit la valeur de la propriété warningCommentCouples.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWarningCommentCouple }
     *     
     */
    public void setWarningCommentCouples(ArrayOfWarningCommentCouple value) {
        this.warningCommentCouples = value;
    }

}
