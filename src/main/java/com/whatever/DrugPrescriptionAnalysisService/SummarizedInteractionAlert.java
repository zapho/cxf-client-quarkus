
package com.whatever.DrugPrescriptionAnalysisService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SummarizedInteractionAlert.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SummarizedInteractionAlert">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TAKE_INTO_ACCOUNT"/>
 *     &lt;enumeration value="PRECAUTION_USE"/>
 *     &lt;enumeration value="DISADVISES_ASSOCIATION"/>
 *     &lt;enumeration value="CONTRAINDICATIONS"/>
 *     &lt;enumeration value="NO_ALERT"/>
 *     &lt;enumeration value="UNKNOWN_ALERT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SummarizedInteractionAlert", namespace = "http://summarized_alert.merlin.vidal.com")
@XmlEnum
public enum SummarizedInteractionAlert {

    TAKE_INTO_ACCOUNT,
    PRECAUTION_USE,
    DISADVISES_ASSOCIATION,
    CONTRAINDICATIONS,
    NO_ALERT,
    UNKNOWN_ALERT;

    public String value() {
        return name();
    }

    public static SummarizedInteractionAlert fromValue(String v) {
        return valueOf(v);
    }

}
