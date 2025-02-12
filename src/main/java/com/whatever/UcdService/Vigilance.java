
package com.whatever.UcdService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Vigilance.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Vigilance">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VIGILANCE_0"/>
 *     &lt;enumeration value="VIGILANCE_1"/>
 *     &lt;enumeration value="VIGILANCE_2"/>
 *     &lt;enumeration value="VIGILANCE_3"/>
 *     &lt;enumeration value="VIGILANCE_5"/>
 *     &lt;enumeration value="UNSPECIFIED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Vigilance")
@XmlEnum
public enum Vigilance {

    VIGILANCE_0,
    VIGILANCE_1,
    VIGILANCE_2,
    VIGILANCE_3,
    VIGILANCE_5,
    UNSPECIFIED;

    public String value() {
        return name();
    }

    public static Vigilance fromValue(String v) {
        return valueOf(v);
    }

}
