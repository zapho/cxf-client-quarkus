
package com.whatever.ProductService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SafetyAlertStatus.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SafetyAlertStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO"/>
 *     &lt;enumeration value="YES"/>
 *     &lt;enumeration value="UNAVAILABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SafetyAlertStatus")
@XmlEnum
public enum SafetyAlertStatus {

    NO,
    YES,
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static SafetyAlertStatus fromValue(String v) {
        return valueOf(v);
    }

}
