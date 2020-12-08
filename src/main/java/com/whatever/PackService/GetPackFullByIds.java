
package com.whatever.PackService;

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
 *         &lt;element name="packageIds" type="{urn:Vidal}ArrayOfInt"/>
 *         &lt;element name="aggregates" type="{urn:Vidal}ArrayOfAggregate"/>
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
    "packageIds",
    "aggregates"
})
@XmlRootElement(name = "getPackFullByIds")
public class GetPackFullByIds {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt packageIds;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfAggregate aggregates;

    /**
     * Obtient la valeur de la propriété packageIds.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getPackageIds() {
        return packageIds;
    }

    /**
     * Définit la valeur de la propriété packageIds.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setPackageIds(ArrayOfInt value) {
        this.packageIds = value;
    }

    /**
     * Obtient la valeur de la propriété aggregates.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAggregate }
     *     
     */
    public ArrayOfAggregate getAggregates() {
        return aggregates;
    }

    /**
     * Définit la valeur de la propriété aggregates.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAggregate }
     *     
     */
    public void setAggregates(ArrayOfAggregate value) {
        this.aggregates = value;
    }

}
