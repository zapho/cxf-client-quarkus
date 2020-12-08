
package com.whatever.NewsService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Profile.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Profile">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DOCTOR"/>
 *     &lt;enumeration value="PHARMACIST"/>
 *     &lt;enumeration value="ALL_AUDIENCE"/>
 *     &lt;enumeration value="HOSPITAL"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Profile")
@XmlEnum
public enum Profile {

    DOCTOR,
    PHARMACIST,
    ALL_AUDIENCE,
    HOSPITAL,
    OTHER;

    public String value() {
        return name();
    }

    public static Profile fromValue(String v) {
        return valueOf(v);
    }

}
