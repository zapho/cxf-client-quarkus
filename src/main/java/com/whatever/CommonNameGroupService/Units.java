
package com.whatever.CommonNameGroupService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour units complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="units">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="posologyUnits" type="{urn:Vidal}ArrayOfPosologyUnit"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "units", propOrder = {
    "posologyUnits"
})
public class Units {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfPosologyUnit posologyUnits;

    /**
     * Obtient la valeur de la propriété posologyUnits.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPosologyUnit }
     *     
     */
    public ArrayOfPosologyUnit getPosologyUnits() {
        return posologyUnits;
    }

    /**
     * Définit la valeur de la propriété posologyUnits.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPosologyUnit }
     *     
     */
    public void setPosologyUnits(ArrayOfPosologyUnit value) {
        this.posologyUnits = value;
    }

}
