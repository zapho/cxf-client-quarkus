
package com.vidal.PackService;

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
 *         &lt;element name="packId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="indicationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "packId",
    "indicationId"
})
@XmlRootElement(name = "searchRefundingRateByIndicationId")
public class SearchRefundingRateByIndicationId {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer packId;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer indicationId;

    /**
     * Obtient la valeur de la propriété packId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPackId() {
        return packId;
    }

    /**
     * Définit la valeur de la propriété packId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPackId(Integer value) {
        this.packId = value;
    }

    /**
     * Obtient la valeur de la propriété indicationId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndicationId() {
        return indicationId;
    }

    /**
     * Définit la valeur de la propriété indicationId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndicationId(Integer value) {
        this.indicationId = value;
    }

}
