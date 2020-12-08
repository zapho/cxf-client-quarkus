
package com.whatever.DrugPrescriptionAnalysisService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AlertType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AlertType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRECAUTION"/>
 *     &lt;enumeration value="CONTRA_INDICATION"/>
 *     &lt;enumeration value="ALLERGY"/>
 *     &lt;enumeration value="POSOLOGY"/>
 *     &lt;enumeration value="PHYSICO_CHEMICAL_INTERACTION"/>
 *     &lt;enumeration value="WARNING"/>
 *     &lt;enumeration value="SIDE_EFFECT"/>
 *     &lt;enumeration value="SURVEILLANCE"/>
 *     &lt;enumeration value="REDUNDANT_ACTIVE_INGREDIENT"/>
 *     &lt;enumeration value="DRUG_INTERACTION"/>
 *     &lt;enumeration value="INDICATOR"/>
 *     &lt;enumeration value="UNSECURIZED"/>
 *     &lt;enumeration value="SAME_DRUG"/>
 *     &lt;enumeration value="FOOD_INTERACTION"/>
 *     &lt;enumeration value="DISPENSING_RISK"/>
 *     &lt;enumeration value="PATIENT"/>
 *     &lt;enumeration value="PRESCRIPTION_CONTEXT"/>
 *     &lt;enumeration value="FOCUS"/>
 *     &lt;enumeration value="HAS"/>
 *     &lt;enumeration value="EXONERATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlertType")
@XmlEnum
public enum AlertType {

    PRECAUTION,
    CONTRA_INDICATION,
    ALLERGY,
    POSOLOGY,
    PHYSICO_CHEMICAL_INTERACTION,
    WARNING,
    SIDE_EFFECT,
    SURVEILLANCE,
    REDUNDANT_ACTIVE_INGREDIENT,
    DRUG_INTERACTION,
    INDICATOR,
    UNSECURIZED,
    SAME_DRUG,
    FOOD_INTERACTION,
    DISPENSING_RISK,
    PATIENT,
    PRESCRIPTION_CONTEXT,
    FOCUS,
    HAS,
    EXONERATION;

    public String value() {
        return name();
    }

    public static AlertType fromValue(String v) {
        return valueOf(v);
    }

}
