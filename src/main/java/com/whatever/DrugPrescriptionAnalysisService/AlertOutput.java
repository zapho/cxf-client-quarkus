
package com.whatever.DrugPrescriptionAnalysisService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AlertOutput.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AlertOutput">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUMMARIZED"/>
 *     &lt;enumeration value="ALERTS"/>
 *     &lt;enumeration value="HTML"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlertOutput")
@XmlEnum
public enum AlertOutput {

    SUMMARIZED,
    ALERTS,
    HTML;

    public String value() {
        return name();
    }

    public static AlertOutput fromValue(String v) {
        return valueOf(v);
    }

}
