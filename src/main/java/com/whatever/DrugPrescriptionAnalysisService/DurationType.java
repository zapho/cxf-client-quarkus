
package com.whatever.DrugPrescriptionAnalysisService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DurationType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DurationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MINUTE"/>
 *     &lt;enumeration value="HOUR"/>
 *     &lt;enumeration value="DAY"/>
 *     &lt;enumeration value="WEEK"/>
 *     &lt;enumeration value="MONTH"/>
 *     &lt;enumeration value="YEAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DurationType")
@XmlEnum
public enum DurationType {

    MINUTE,
    HOUR,
    DAY,
    WEEK,
    MONTH,
    YEAR;

    public String value() {
        return name();
    }

    public static DurationType fromValue(String v) {
        return valueOf(v);
    }

}
