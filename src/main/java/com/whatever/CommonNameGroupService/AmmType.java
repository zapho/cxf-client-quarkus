
package com.whatever.CommonNameGroupService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AmmType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AmmType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AMM_EURO"/>
 *     &lt;enumeration value="AMM_FRA"/>
 *     &lt;enumeration value="ATU_COHORTE"/>
 *     &lt;enumeration value="ATU_NOM"/>
 *     &lt;enumeration value="IMPORT"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="EXPORT"/>
 *     &lt;enumeration value="AIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AmmType", namespace = "http://constant.merlin.vidal.com")
@XmlEnum
public enum AmmType {

    AMM_EURO,
    AMM_FRA,
    ATU_COHORTE,
    ATU_NOM,
    IMPORT,
    OTHER,
    EXPORT,
    AIT;

    public String value() {
        return name();
    }

    public static AmmType fromValue(String v) {
        return valueOf(v);
    }

}
