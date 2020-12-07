
package com.vidal.ProductService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ProductApiFilter.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductApiFilter">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductApiFilter")
@XmlEnum
public enum ProductApiFilter {

    ALL;

    public String value() {
        return name();
    }

    public static ProductApiFilter fromValue(String v) {
        return valueOf(v);
    }

}
