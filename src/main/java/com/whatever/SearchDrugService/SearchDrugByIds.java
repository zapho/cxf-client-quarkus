
package com.whatever.SearchDrugService;

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
 *         &lt;element name="ids" type="{urn:Vidal}ArrayOfInt"/>
 *         &lt;element name="drugType" type="{urn:Vidal}DrugType"/>
 *         &lt;element name="aggregates" type="{urn:Vidal}ArrayOfDrugType"/>
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
    "ids",
    "drugType",
    "aggregates"
})
@XmlRootElement(name = "searchDrugByIds")
public class SearchDrugByIds {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt ids;
    @XmlElement(required = true, nillable = true)
    protected DrugType drugType;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfDrugType aggregates;

    /**
     * Obtient la valeur de la propriété ids.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getIds() {
        return ids;
    }

    /**
     * Définit la valeur de la propriété ids.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setIds(ArrayOfInt value) {
        this.ids = value;
    }

    /**
     * Obtient la valeur de la propriété drugType.
     * 
     * @return
     *     possible object is
     *     {@link DrugType }
     *     
     */
    public DrugType getDrugType() {
        return drugType;
    }

    /**
     * Définit la valeur de la propriété drugType.
     * 
     * @param value
     *     allowed object is
     *     {@link DrugType }
     *     
     */
    public void setDrugType(DrugType value) {
        this.drugType = value;
    }

    /**
     * Obtient la valeur de la propriété aggregates.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDrugType }
     *     
     */
    public ArrayOfDrugType getAggregates() {
        return aggregates;
    }

    /**
     * Définit la valeur de la propriété aggregates.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDrugType }
     *     
     */
    public void setAggregates(ArrayOfDrugType value) {
        this.aggregates = value;
    }

}
