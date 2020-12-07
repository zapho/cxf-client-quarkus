
package com.vidal.ProductService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SubstanceRole.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SubstanceRole">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE_PRINCIPLE_OR_EXCIPIENT"/>
 *     &lt;enumeration value="EXCIPIENT"/>
 *     &lt;enumeration value="ACTIVE_PRINCIPLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubstanceRole")
@XmlEnum
public enum SubstanceRole {

    ACTIVE_PRINCIPLE_OR_EXCIPIENT,
    EXCIPIENT,
    ACTIVE_PRINCIPLE;

    public String value() {
        return name();
    }

    public static SubstanceRole fromValue(String v) {
        return valueOf(v);
    }

}
