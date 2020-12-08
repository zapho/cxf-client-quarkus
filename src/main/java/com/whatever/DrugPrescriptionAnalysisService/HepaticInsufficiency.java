
package com.whatever.DrugPrescriptionAnalysisService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour HepaticInsufficiency.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="HepaticInsufficiency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="MODERATE"/>
 *     &lt;enumeration value="SEVERE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HepaticInsufficiency")
@XmlEnum
public enum HepaticInsufficiency {

    NONE,
    MODERATE,
    SEVERE;

    public String value() {
        return name();
    }

    public static HepaticInsufficiency fromValue(String v) {
        return valueOf(v);
    }

}
