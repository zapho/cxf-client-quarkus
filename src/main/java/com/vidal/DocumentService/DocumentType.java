
package com.vidal.DocumentService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DocumentType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MONO"/>
 *     &lt;enumeration value="IRIS"/>
 *     &lt;enumeration value="SAUMON"/>
 *     &lt;enumeration value="VDF"/>
 *     &lt;enumeration value="MONO_SUPP"/>
 *     &lt;enumeration value="MONO_THERA"/>
 *     &lt;enumeration value="RCP"/>
 *     &lt;enumeration value="VMPFR"/>
 *     &lt;enumeration value="VMPCLASS"/>
 *     &lt;enumeration value="FIT"/>
 *     &lt;enumeration value="PGR"/>
 *     &lt;enumeration value="BUM"/>
 *     &lt;enumeration value="PTT"/>
 *     &lt;enumeration value="RCP_VIDAL"/>
 *     &lt;enumeration value="SNA"/>
 *     &lt;enumeration value="IDD"/>
 *     &lt;enumeration value="ALD"/>
 *     &lt;enumeration value="AVIS"/>
 *     &lt;enumeration value="RTU"/>
 *     &lt;enumeration value="PUT"/>
 *     &lt;enumeration value="RAPPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentType")
@XmlEnum
public enum DocumentType {

    MONO,
    IRIS,
    SAUMON,
    VDF,
    MONO_SUPP,
    MONO_THERA,
    RCP,
    VMPFR,
    VMPCLASS,
    FIT,
    PGR,
    BUM,
    PTT,
    RCP_VIDAL,
    SNA,
    IDD,
    ALD,
    AVIS,
    RTU,
    PUT,
    RAPPE;

    public String value() {
        return name();
    }

    public static DocumentType fromValue(String v) {
        return valueOf(v);
    }

}
