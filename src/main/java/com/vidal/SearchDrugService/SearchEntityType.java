
package com.vidal.SearchDrugService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SearchEntityType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchEntityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRODUCT"/>
 *     &lt;enumeration value="ATCCLASS"/>
 *     &lt;enumeration value="INDICATION"/>
 *     &lt;enumeration value="INDICATIONGROUP"/>
 *     &lt;enumeration value="MOLECULE"/>
 *     &lt;enumeration value="COMMONNAMEGROUP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchEntityType")
@XmlEnum
public enum SearchEntityType {

    PRODUCT,
    ATCCLASS,
    INDICATION,
    INDICATIONGROUP,
    MOLECULE,
    COMMONNAMEGROUP;

    public String value() {
        return name();
    }

    public static SearchEntityType fromValue(String v) {
        return valueOf(v);
    }

}
