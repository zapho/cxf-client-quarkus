
package com.vidal.PackConservationService;

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
 *         &lt;element name="packConservationList" type="{urn:Vidal}ArrayOfPackageConservation"/>
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
    "packConservationList"
})
@XmlRootElement(name = "searchByPackIdResponse")
public class SearchByPackIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfPackageConservation packConservationList;

    /**
     * Obtient la valeur de la propriété packConservationList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPackageConservation }
     *     
     */
    public ArrayOfPackageConservation getPackConservationList() {
        return packConservationList;
    }

    /**
     * Définit la valeur de la propriété packConservationList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPackageConservation }
     *     
     */
    public void setPackConservationList(ArrayOfPackageConservation value) {
        this.packConservationList = value;
    }

}
