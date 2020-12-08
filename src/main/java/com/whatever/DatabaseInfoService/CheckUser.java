
package com.whatever.DatabaseInfoService;

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
 *         &lt;element name="codeUserLap" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codeLap" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lapVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codeRpps" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codeAdeli" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "codeUserLap",
    "codeLap",
    "lapVersion",
    "userType",
    "codeRpps",
    "codeAdeli"
})
@XmlRootElement(name = "checkUser")
public class CheckUser {

    @XmlElement(required = true, nillable = true)
    protected String codeUserLap;
    @XmlElement(required = true, nillable = true)
    protected String codeLap;
    @XmlElement(required = true, nillable = true)
    protected String lapVersion;
    @XmlElement(required = true, nillable = true)
    protected String userType;
    @XmlElement(required = true, nillable = true)
    protected String codeRpps;
    @XmlElement(required = true, nillable = true)
    protected String codeAdeli;

    /**
     * Obtient la valeur de la propriété codeUserLap.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeUserLap() {
        return codeUserLap;
    }

    /**
     * Définit la valeur de la propriété codeUserLap.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeUserLap(String value) {
        this.codeUserLap = value;
    }

    /**
     * Obtient la valeur de la propriété codeLap.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeLap() {
        return codeLap;
    }

    /**
     * Définit la valeur de la propriété codeLap.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeLap(String value) {
        this.codeLap = value;
    }

    /**
     * Obtient la valeur de la propriété lapVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLapVersion() {
        return lapVersion;
    }

    /**
     * Définit la valeur de la propriété lapVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLapVersion(String value) {
        this.lapVersion = value;
    }

    /**
     * Obtient la valeur de la propriété userType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Définit la valeur de la propriété userType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

    /**
     * Obtient la valeur de la propriété codeRpps.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeRpps() {
        return codeRpps;
    }

    /**
     * Définit la valeur de la propriété codeRpps.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeRpps(String value) {
        this.codeRpps = value;
    }

    /**
     * Obtient la valeur de la propriété codeAdeli.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeAdeli() {
        return codeAdeli;
    }

    /**
     * Définit la valeur de la propriété codeAdeli.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeAdeli(String value) {
        this.codeAdeli = value;
    }

}
