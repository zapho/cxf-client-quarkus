
package com.whatever.DrugPrescriptionAnalysisService;

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
 *         &lt;element name="commentsToJson" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "commentsToJson"
})
@XmlRootElement(name = "commentsToJsonResponse")
public class CommentsToJsonResponse {

    @XmlElement(required = true, nillable = true)
    protected String commentsToJson;

    /**
     * Obtient la valeur de la propriété commentsToJson.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentsToJson() {
        return commentsToJson;
    }

    /**
     * Définit la valeur de la propriété commentsToJson.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentsToJson(String value) {
        this.commentsToJson = value;
    }

}
