
package com.whatever.DrugPrescriptionAnalysisService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SummarizedRedundantInteractionAlert.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SummarizedRedundantInteractionAlert">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HAS_ALERT"/>
 *     &lt;enumeration value="NO_ALERT"/>
 *     &lt;enumeration value="UNKNOWN_ALERT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SummarizedRedundantInteractionAlert", namespace = "http://summarized_alert.merlin.vidal.com")
@XmlEnum
public enum SummarizedRedundantInteractionAlert {

    HAS_ALERT,
    NO_ALERT,
    UNKNOWN_ALERT;

    public String value() {
        return name();
    }

    public static SummarizedRedundantInteractionAlert fromValue(String v) {
        return valueOf(v);
    }

}
