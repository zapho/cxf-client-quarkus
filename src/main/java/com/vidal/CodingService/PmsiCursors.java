
package com.vidal.CodingService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PmsiCursors.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PmsiCursors">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEFAULT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PmsiCursors")
@XmlEnum
public enum PmsiCursors {

    DEFAULT;

    public String value() {
        return name();
    }

    public static PmsiCursors fromValue(String v) {
        return valueOf(v);
    }

}
