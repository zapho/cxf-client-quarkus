
package com.whatever.ProductService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ProductBiosimilarType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductBiosimilarType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BIOSIMILAR"/>
 *     &lt;enumeration value="REFERENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductBiosimilarType")
@XmlEnum
public enum ProductBiosimilarType {

    BIOSIMILAR,
    REFERENT;

    public String value() {
        return name();
    }

    public static ProductBiosimilarType fromValue(String v) {
        return valueOf(v);
    }

}
