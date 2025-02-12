
package com.whatever.DrugPrescriptionAnalysisService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SeverityLevel.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SeverityLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INFO"/>
 *     &lt;enumeration value="LEVEL_1"/>
 *     &lt;enumeration value="LEVEL_2"/>
 *     &lt;enumeration value="LEVEL_3"/>
 *     &lt;enumeration value="LEVEL_4"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SeverityLevel")
@XmlEnum
public enum SeverityLevel {

    INFO,
    LEVEL_1,
    LEVEL_2,
    LEVEL_3,
    LEVEL_4,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static SeverityLevel fromValue(String v) {
        return valueOf(v);
    }

}
