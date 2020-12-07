
package com.vidal.CommonNameGroupService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Aggregate.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Aggregate">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COMPOSITION"/>
 *     &lt;enumeration value="UNIT"/>
 *     &lt;enumeration value="ATC_CLASSIFICATION"/>
 *     &lt;enumeration value="GALENIC"/>
 *     &lt;enumeration value="DRUG"/>
 *     &lt;enumeration value="INDICATION"/>
 *     &lt;enumeration value="INDICATORS"/>
 *     &lt;enumeration value="COMPANY"/>
 *     &lt;enumeration value="INDICATION_NO_AMM"/>
 *     &lt;enumeration value="RESTRICTED_PRESCRIPTION"/>
 *     &lt;enumeration value="CONTAINER"/>
 *     &lt;enumeration value="INDICATION_LES"/>
 *     &lt;enumeration value="INDICATION_ATU"/>
 *     &lt;enumeration value="RATIO_UNIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Aggregate")
@XmlEnum
public enum Aggregate {

    COMPOSITION,
    UNIT,
    ATC_CLASSIFICATION,
    GALENIC,
    DRUG,
    INDICATION,
    INDICATORS,
    COMPANY,
    INDICATION_NO_AMM,
    RESTRICTED_PRESCRIPTION,
    CONTAINER,
    INDICATION_LES,
    INDICATION_ATU,
    RATIO_UNIT;

    public String value() {
        return name();
    }

    public static Aggregate fromValue(String v) {
        return valueOf(v);
    }

}
