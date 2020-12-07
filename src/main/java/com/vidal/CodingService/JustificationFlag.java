
package com.vidal.CodingService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour JustificationFlag.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="JustificationFlag">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GREEN"/>
 *     &lt;enumeration value="ORANGE"/>
 *     &lt;enumeration value="RED"/>
 *     &lt;enumeration value="GREY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "JustificationFlag")
@XmlEnum
public enum JustificationFlag {

    GREEN,
    ORANGE,
    RED,
    GREY;

    public String value() {
        return name();
    }

    public static JustificationFlag fromValue(String v) {
        return valueOf(v);
    }

}
