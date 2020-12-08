
package com.whatever.NewsService;

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
 *         &lt;element name="newsList" type="{urn:Vidal}ArrayOfNews"/>
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
    "newsList"
})
@XmlRootElement(name = "searchNewsResponse")
public class SearchNewsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfNews newsList;

    /**
     * Obtient la valeur de la propriété newsList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNews }
     *     
     */
    public ArrayOfNews getNewsList() {
        return newsList;
    }

    /**
     * Définit la valeur de la propriété newsList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNews }
     *     
     */
    public void setNewsList(ArrayOfNews value) {
        this.newsList = value;
    }

}
