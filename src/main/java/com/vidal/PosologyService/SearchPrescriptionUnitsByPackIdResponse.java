
package com.vidal.PosologyService;

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
 *         &lt;element name="prescriptionUnitList" type="{urn:Vidal}ArrayOfPosologyUnit"/>
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
    "prescriptionUnitList"
})
@XmlRootElement(name = "searchPrescriptionUnitsByPackIdResponse")
public class SearchPrescriptionUnitsByPackIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfPosologyUnit prescriptionUnitList;

    /**
     * Obtient la valeur de la propriété prescriptionUnitList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPosologyUnit }
     *     
     */
    public ArrayOfPosologyUnit getPrescriptionUnitList() {
        return prescriptionUnitList;
    }

    /**
     * Définit la valeur de la propriété prescriptionUnitList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPosologyUnit }
     *     
     */
    public void setPrescriptionUnitList(ArrayOfPosologyUnit value) {
        this.prescriptionUnitList = value;
    }

}
