
package com.whatever.PrecautionService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Epp.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Epp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AGE"/>
 *     &lt;enumeration value="WEIGHT"/>
 *     &lt;enumeration value="PREGNANT"/>
 *     &lt;enumeration value="BREAST_FEEDING"/>
 *     &lt;enumeration value="CREATIN_CLEARANCE"/>
 *     &lt;enumeration value="GENDER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Epp")
@XmlEnum
public enum Epp {

    AGE,
    WEIGHT,
    PREGNANT,
    BREAST_FEEDING,
    CREATIN_CLEARANCE,
    GENDER;

    public String value() {
        return name();
    }

    public static Epp fromValue(String v) {
        return valueOf(v);
    }

}
