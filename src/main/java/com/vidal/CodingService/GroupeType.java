
package com.vidal.CodingService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour GroupeType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="GroupeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INDICATION_GROUP"/>
 *     &lt;enumeration value="PATHOLOGY_GROUP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GroupeType")
@XmlEnum
public enum GroupeType {

    INDICATION_GROUP,
    PATHOLOGY_GROUP;

    public String value() {
        return name();
    }

    public static GroupeType fromValue(String v) {
        return valueOf(v);
    }

}
