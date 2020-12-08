
package com.whatever.ProductService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour GenericType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="GenericType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GENERIC"/>
 *     &lt;enumeration value="REFERENT"/>
 *     &lt;enumeration value="NULL"/>
 *     &lt;enumeration value="SUBSTITUTABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GenericType")
@XmlEnum
public enum GenericType {

    GENERIC,
    REFERENT,
    NULL,
    SUBSTITUTABLE;

    public String value() {
        return name();
    }

    public static GenericType fromValue(String v) {
        return valueOf(v);
    }

}
