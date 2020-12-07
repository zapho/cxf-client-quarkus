
package com.vidal.PosologyService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DerivedUnit.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DerivedUnit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="DERIVED"/>
 *     &lt;enumeration value="UNDERIVED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DerivedUnit")
@XmlEnum
public enum DerivedUnit {

    UNKNOWN,
    DERIVED,
    UNDERIVED;

    public String value() {
        return name();
    }

    public static DerivedUnit fromValue(String v) {
        return valueOf(v);
    }

}
