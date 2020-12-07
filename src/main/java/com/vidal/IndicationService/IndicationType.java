
package com.vidal.IndicationService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour IndicationType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="IndicationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AMM"/>
 *     &lt;enumeration value="PTT"/>
 *     &lt;enumeration value="SNA"/>
 *     &lt;enumeration value="LES"/>
 *     &lt;enumeration value="ATU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IndicationType")
@XmlEnum
public enum IndicationType {

    AMM,
    PTT,
    SNA,
    LES,
    ATU;

    public String value() {
        return name();
    }

    public static IndicationType fromValue(String v) {
        return valueOf(v);
    }

}
