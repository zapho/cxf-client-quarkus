
package com.whatever.LpprService;

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
 *         &lt;element name="packageLpprList" type="{http://lppr.api.vidal.com}ArrayOfPackageLpprListCoupleSimplified"/>
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
    "packageLpprList"
})
@XmlRootElement(name = "decompositionPackByPackIdsResponse")
public class DecompositionPackByPackIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfPackageLpprListCoupleSimplified packageLpprList;

    /**
     * Obtient la valeur de la propriété packageLpprList.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPackageLpprListCoupleSimplified }
     *     
     */
    public ArrayOfPackageLpprListCoupleSimplified getPackageLpprList() {
        return packageLpprList;
    }

    /**
     * Définit la valeur de la propriété packageLpprList.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPackageLpprListCoupleSimplified }
     *     
     */
    public void setPackageLpprList(ArrayOfPackageLpprListCoupleSimplified value) {
        this.packageLpprList = value;
    }

}
