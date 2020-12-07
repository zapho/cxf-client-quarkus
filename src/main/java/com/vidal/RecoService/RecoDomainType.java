
package com.vidal.RecoService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RecoDomainType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RecoDomainType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MAIN"/>
 *     &lt;enumeration value="APPENDIX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecoDomainType")
@XmlEnum
public enum RecoDomainType {

    MAIN,
    APPENDIX;

    public String value() {
        return name();
    }

    public static RecoDomainType fromValue(String v) {
        return valueOf(v);
    }

}
