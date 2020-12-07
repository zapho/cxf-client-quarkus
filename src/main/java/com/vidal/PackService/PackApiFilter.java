
package com.vidal.PackService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PackApiFilter.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PackApiFilter">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PackApiFilter")
@XmlEnum
public enum PackApiFilter {

    ALL;

    public String value() {
        return name();
    }

    public static PackApiFilter fromValue(String v) {
        return valueOf(v);
    }

}
