
package com.whatever.ProductRangeService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ActCode.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AAD"/>
 *     &lt;enumeration value="AAR"/>
 *     &lt;enumeration value="MAC"/>
 *     &lt;enumeration value="MAD"/>
 *     &lt;enumeration value="OPT"/>
 *     &lt;enumeration value="ORC"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="PAN"/>
 *     &lt;enumeration value="PEX"/>
 *     &lt;enumeration value="PH1"/>
 *     &lt;enumeration value="PH4"/>
 *     &lt;enumeration value="PH7"/>
 *     &lt;enumeration value="PHN"/>
 *     &lt;enumeration value="PII"/>
 *     &lt;enumeration value="VEH"/>
 *     &lt;enumeration value="PMR"/>
 *     &lt;enumeration value="ARO"/>
 *     &lt;enumeration value="GLU"/>
 *     &lt;enumeration value="PAU"/>
 *     &lt;enumeration value="PH2"/>
 *     &lt;enumeration value="PME"/>
 *     &lt;enumeration value="TNS"/>
 *     &lt;enumeration value="VER"/>
 *     &lt;enumeration value="LEN"/>
 *     &lt;enumeration value="LUN"/>
 *     &lt;enumeration value="POC"/>
 *     &lt;enumeration value="PG7"/>
 *     &lt;enumeration value="PDM"/>
 *     &lt;enumeration value="PMH"/>
 *     &lt;enumeration value="DVO"/>
 *     &lt;enumeration value="HC"/>
 *     &lt;enumeration value="HD1"/>
 *     &lt;enumeration value="HD2"/>
 *     &lt;enumeration value="HD4"/>
 *     &lt;enumeration value="HD7"/>
 *     &lt;enumeration value="HDA"/>
 *     &lt;enumeration value="HDC"/>
 *     &lt;enumeration value="HDD"/>
 *     &lt;enumeration value="HDH"/>
 *     &lt;enumeration value="HDI"/>
 *     &lt;enumeration value="HDN"/>
 *     &lt;enumeration value="HDO"/>
 *     &lt;enumeration value="HDR"/>
 *     &lt;enumeration value="HDS"/>
 *     &lt;enumeration value="HDT"/>
 *     &lt;enumeration value="HDU"/>
 *     &lt;enumeration value="HDX"/>
 *     &lt;enumeration value="HG1"/>
 *     &lt;enumeration value="HG2"/>
 *     &lt;enumeration value="HG4"/>
 *     &lt;enumeration value="HG7"/>
 *     &lt;enumeration value="PIO"/>
 *     &lt;enumeration value="ORP"/>
 *     &lt;enumeration value="HDE"/>
 *     &lt;enumeration value="COR"/>
 *     &lt;enumeration value="PAZ"/>
 *     &lt;enumeration value="SUI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActCode")
@XmlEnum
public enum ActCode {

    AAD("AAD"),
    AAR("AAR"),
    MAC("MAC"),
    MAD("MAD"),
    OPT("OPT"),
    ORC("ORC"),
    PA("PA"),
    PAN("PAN"),
    PEX("PEX"),
    @XmlEnumValue("PH1")
    PH_1("PH1"),
    @XmlEnumValue("PH4")
    PH_4("PH4"),
    @XmlEnumValue("PH7")
    PH_7("PH7"),
    PHN("PHN"),
    PII("PII"),
    VEH("VEH"),
    PMR("PMR"),
    ARO("ARO"),
    GLU("GLU"),
    PAU("PAU"),
    @XmlEnumValue("PH2")
    PH_2("PH2"),
    PME("PME"),
    TNS("TNS"),
    VER("VER"),
    LEN("LEN"),
    LUN("LUN"),
    POC("POC"),
    @XmlEnumValue("PG7")
    PG_7("PG7"),
    PDM("PDM"),
    PMH("PMH"),
    DVO("DVO"),
    HC("HC"),
    @XmlEnumValue("HD1")
    HD_1("HD1"),
    @XmlEnumValue("HD2")
    HD_2("HD2"),
    @XmlEnumValue("HD4")
    HD_4("HD4"),
    @XmlEnumValue("HD7")
    HD_7("HD7"),
    HDA("HDA"),
    HDC("HDC"),
    HDD("HDD"),
    HDH("HDH"),
    HDI("HDI"),
    HDN("HDN"),
    HDO("HDO"),
    HDR("HDR"),
    HDS("HDS"),
    HDT("HDT"),
    HDU("HDU"),
    HDX("HDX"),
    @XmlEnumValue("HG1")
    HG_1("HG1"),
    @XmlEnumValue("HG2")
    HG_2("HG2"),
    @XmlEnumValue("HG4")
    HG_4("HG4"),
    @XmlEnumValue("HG7")
    HG_7("HG7"),
    PIO("PIO"),
    ORP("ORP"),
    HDE("HDE"),
    COR("COR"),
    PAZ("PAZ"),
    SUI("SUI");
    private final String value;

    ActCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActCode fromValue(String v) {
        for (ActCode c: ActCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
