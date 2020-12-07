
package com.vidal.UtilitiesService;

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
 *         &lt;element name="compositeIdMap" type="{urn:Vidal}string2CompositeIdMap"/>
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
    "compositeIdMap"
})
@XmlRootElement(name = "getCompositeIdFromHMKResponse")
public class GetCompositeIdFromHMKResponse {

    @XmlElement(required = true, nillable = true)
    protected String2CompositeIdMap compositeIdMap;

    /**
     * Obtient la valeur de la propriété compositeIdMap.
     * 
     * @return
     *     possible object is
     *     {@link String2CompositeIdMap }
     *     
     */
    public String2CompositeIdMap getCompositeIdMap() {
        return compositeIdMap;
    }

    /**
     * Définit la valeur de la propriété compositeIdMap.
     * 
     * @param value
     *     allowed object is
     *     {@link String2CompositeIdMap }
     *     
     */
    public void setCompositeIdMap(String2CompositeIdMap value) {
        this.compositeIdMap = value;
    }

}
