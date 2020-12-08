
package com.whatever.UcdService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour GrammaticalGender.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="GrammaticalGender">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MASCULIN"/>
 *     &lt;enumeration value="FEMININE"/>
 *     &lt;enumeration value="NEUTER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GrammaticalGender")
@XmlEnum
public enum GrammaticalGender {

    MASCULIN,
    FEMININE,
    NEUTER;

    public String value() {
        return name();
    }

    public static GrammaticalGender fromValue(String v) {
        return valueOf(v);
    }

}
