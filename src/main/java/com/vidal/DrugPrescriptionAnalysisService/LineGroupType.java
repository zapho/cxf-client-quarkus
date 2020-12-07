
package com.vidal.DrugPrescriptionAnalysisService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour LineGroupType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LineGroupType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INFUSION"/>
 *     &lt;enumeration value="SAME_ORDER"/>
 *     &lt;enumeration value="PREVIOUS_ORDER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LineGroupType")
@XmlEnum
public enum LineGroupType {

    INFUSION,
    SAME_ORDER,
    PREVIOUS_ORDER;

    public String value() {
        return name();
    }

    public static LineGroupType fromValue(String v) {
        return valueOf(v);
    }

}
