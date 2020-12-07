
package com.vidal.PackConservationService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour UnitType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNDEFINED"/>
 *     &lt;enumeration value="YEARS"/>
 *     &lt;enumeration value="MONTHS"/>
 *     &lt;enumeration value="WEEKS"/>
 *     &lt;enumeration value="DAYS"/>
 *     &lt;enumeration value="HOURS"/>
 *     &lt;enumeration value="MINUTES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnitType")
@XmlEnum
public enum UnitType {

    UNDEFINED,
    YEARS,
    MONTHS,
    WEEKS,
    DAYS,
    HOURS,
    MINUTES;

    public String value() {
        return name();
    }

    public static UnitType fromValue(String v) {
        return valueOf(v);
    }

}
