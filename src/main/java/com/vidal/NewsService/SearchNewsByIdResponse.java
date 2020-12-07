
package com.vidal.NewsService;

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
 *         &lt;element name="news" type="{urn:Vidal}news"/>
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
    "news"
})
@XmlRootElement(name = "searchNewsByIdResponse")
public class SearchNewsByIdResponse {

    @XmlElement(required = true, nillable = true)
    protected News news;

    /**
     * Obtient la valeur de la propriété news.
     * 
     * @return
     *     possible object is
     *     {@link News }
     *     
     */
    public News getNews() {
        return news;
    }

    /**
     * Définit la valeur de la propriété news.
     * 
     * @param value
     *     allowed object is
     *     {@link News }
     *     
     */
    public void setNews(News value) {
        this.news = value;
    }

}
