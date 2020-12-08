
package com.whatever.PackService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ReimbursementScheduleFilter.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ReimbursementScheduleFilter">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="ONLY_FUTURE_EVENTS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReimbursementScheduleFilter")
@XmlEnum
public enum ReimbursementScheduleFilter {

    NONE,
    ONLY_FUTURE_EVENTS;

    public String value() {
        return name();
    }

    public static ReimbursementScheduleFilter fromValue(String v) {
        return valueOf(v);
    }

}
