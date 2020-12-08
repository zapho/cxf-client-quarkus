
package com.whatever.CodingService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour GroupResultAggregate.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="GroupResultAggregate">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CIM10"/>
 *     &lt;enumeration value="SFMG"/>
 *     &lt;enumeration value="CISP"/>
 *     &lt;enumeration value="LINKED_INDICATION_GROUP"/>
 *     &lt;enumeration value="INDICATION"/>
 *     &lt;enumeration value="RECO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GroupResultAggregate")
@XmlEnum
public enum GroupResultAggregate {

    @XmlEnumValue("CIM10")
    CIM_10("CIM10"),
    SFMG("SFMG"),
    CISP("CISP"),
    LINKED_INDICATION_GROUP("LINKED_INDICATION_GROUP"),
    INDICATION("INDICATION"),
    RECO("RECO");
    private final String value;

    GroupResultAggregate(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GroupResultAggregate fromValue(String v) {
        for (GroupResultAggregate c: GroupResultAggregate.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
