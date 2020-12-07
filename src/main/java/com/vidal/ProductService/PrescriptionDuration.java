
package com.vidal.ProductService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PrescriptionDuration.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PrescriptionDuration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FOURTEEN_DAYS"/>
 *     &lt;enumeration value="TWENTY_EIGHT_DAYS"/>
 *     &lt;enumeration value="SEVEN_DAYS"/>
 *     &lt;enumeration value="EIGHTY_FOUR_DAYS"/>
 *     &lt;enumeration value="TWENTY_EIGHT_SPLITTED_IN_SEVEN_DAYS"/>
 *     &lt;enumeration value="TWENTY_EIGHT_SPLITTED_IN_FOURTEEN_DAYS"/>
 *     &lt;enumeration value="FOURTEEN_SPLITTED_IN_SEVEN_DAYS"/>
 *     &lt;enumeration value="NOT_HOMOGENEOUS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrescriptionDuration")
@XmlEnum
public enum PrescriptionDuration {

    FOURTEEN_DAYS,
    TWENTY_EIGHT_DAYS,
    SEVEN_DAYS,
    EIGHTY_FOUR_DAYS,
    TWENTY_EIGHT_SPLITTED_IN_SEVEN_DAYS,
    TWENTY_EIGHT_SPLITTED_IN_FOURTEEN_DAYS,
    FOURTEEN_SPLITTED_IN_SEVEN_DAYS,
    NOT_HOMOGENEOUS;

    public String value() {
        return name();
    }

    public static PrescriptionDuration fromValue(String v) {
        return valueOf(v);
    }

}
