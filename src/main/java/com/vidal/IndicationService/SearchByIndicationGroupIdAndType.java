
package com.vidal.IndicationService;

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
 *         &lt;element name="indicationGroupId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="types" type="{urn:Vidal}ArrayOfIndicationType"/>
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
    "indicationGroupId",
    "types"
})
@XmlRootElement(name = "searchByIndicationGroupIdAndType")
public class SearchByIndicationGroupIdAndType {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer indicationGroupId;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfIndicationType types;

    /**
     * Obtient la valeur de la propriété indicationGroupId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndicationGroupId() {
        return indicationGroupId;
    }

    /**
     * Définit la valeur de la propriété indicationGroupId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndicationGroupId(Integer value) {
        this.indicationGroupId = value;
    }

    /**
     * Obtient la valeur de la propriété types.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIndicationType }
     *     
     */
    public ArrayOfIndicationType getTypes() {
        return types;
    }

    /**
     * Définit la valeur de la propriété types.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIndicationType }
     *     
     */
    public void setTypes(ArrayOfIndicationType value) {
        this.types = value;
    }

}
