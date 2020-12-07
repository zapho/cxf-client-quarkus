
package com.vidal.DatabaseInfoService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour LicencingStatus.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LicencingStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LICENCE_OK"/>
 *     &lt;enumeration value="LICENCE_NOT_FOUND"/>
 *     &lt;enumeration value="LICENCE_EXPIRED"/>
 *     &lt;enumeration value="LICENCE_MALFORMED"/>
 *     &lt;enumeration value="GRACE_OK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LicencingStatus")
@XmlEnum
public enum LicencingStatus {

    LICENCE_OK,
    LICENCE_NOT_FOUND,
    LICENCE_EXPIRED,
    LICENCE_MALFORMED,
    GRACE_OK;

    public String value() {
        return name();
    }

    public static LicencingStatus fromValue(String v) {
        return valueOf(v);
    }

}
