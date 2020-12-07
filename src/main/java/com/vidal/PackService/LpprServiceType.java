
package com.vidal.PackService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour LpprServiceType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LpprServiceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BUYING"/>
 *     &lt;enumeration value="RENTING"/>
 *     &lt;enumeration value="MAINTENANCE"/>
 *     &lt;enumeration value="REPAIR"/>
 *     &lt;enumeration value="DELIVERY"/>
 *     &lt;enumeration value="SERVICE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LpprServiceType")
@XmlEnum
public enum LpprServiceType {

    BUYING,
    RENTING,
    MAINTENANCE,
    REPAIR,
    DELIVERY,
    SERVICE;

    public String value() {
        return name();
    }

    public static LpprServiceType fromValue(String v) {
        return valueOf(v);
    }

}
