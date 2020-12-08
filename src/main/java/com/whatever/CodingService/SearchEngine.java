
package com.whatever.CodingService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SearchEngine.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchEngine">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VIDAL"/>
 *     &lt;enumeration value="FMTI"/>
 *     &lt;enumeration value="EXTERNAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchEngine")
@XmlEnum
public enum SearchEngine {

    VIDAL,
    FMTI,
    EXTERNAL;

    public String value() {
        return name();
    }

    public static SearchEngine fromValue(String v) {
        return valueOf(v);
    }

}
