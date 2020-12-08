
package com.whatever.DatabaseInfoService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ProductLineType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductLineType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FR"/>
 *     &lt;enumeration value="VXP"/>
 *     &lt;enumeration value="VCD"/>
 *     &lt;enumeration value="VDE"/>
 *     &lt;enumeration value="VDEJ"/>
 *     &lt;enumeration value="VXPJ"/>
 *     &lt;enumeration value="PORTUGAL"/>
 *     &lt;enumeration value="SPAIN"/>
 *     &lt;enumeration value="BELGIUM_F"/>
 *     &lt;enumeration value="BELGIUM_N"/>
 *     &lt;enumeration value="BULGARIA"/>
 *     &lt;enumeration value="BRASIL"/>
 *     &lt;enumeration value="ABU_DHABI"/>
 *     &lt;enumeration value="MEXICO"/>
 *     &lt;enumeration value="CHILI"/>
 *     &lt;enumeration value="UNITED_KINGDOM"/>
 *     &lt;enumeration value="INTERNATIONAL"/>
 *     &lt;enumeration value="HOPTIMAL"/>
 *     &lt;enumeration value="EVIDAL"/>
 *     &lt;enumeration value="ZAPI"/>
 *     &lt;enumeration value="REST"/>
 *     &lt;enumeration value="HOPTIMAL_ES"/>
 *     &lt;enumeration value="HOPTIMAL_CL"/>
 *     &lt;enumeration value="HOPTIMAL_MX"/>
 *     &lt;enumeration value="ZAPI_ES"/>
 *     &lt;enumeration value="ZAPI_CL"/>
 *     &lt;enumeration value="ZAPI_MX"/>
 *     &lt;enumeration value="HOPTIMAL_HP"/>
 *     &lt;enumeration value="ZAPI_HP"/>
 *     &lt;enumeration value="HOPTIMAL_AE"/>
 *     &lt;enumeration value="ZAPI_AE"/>
 *     &lt;enumeration value="HOPTIMAL_BEF"/>
 *     &lt;enumeration value="ZAPI_BEF"/>
 *     &lt;enumeration value="HOPTIMAL_BEN"/>
 *     &lt;enumeration value="ZAPI_BEN"/>
 *     &lt;enumeration value="HOPTIMAL_EN"/>
 *     &lt;enumeration value="ZAPI_EN"/>
 *     &lt;enumeration value="HOPTIMAL_SA"/>
 *     &lt;enumeration value="ZAPI_SA"/>
 *     &lt;enumeration value="SAUDI_ARABIA"/>
 *     &lt;enumeration value="HOPTIMAL_FP"/>
 *     &lt;enumeration value="ZAPI_FP"/>
 *     &lt;enumeration value="FRENCH_SPEAKING"/>
 *     &lt;enumeration value="HOPTIMAL_PP"/>
 *     &lt;enumeration value="ZAPI_PP"/>
 *     &lt;enumeration value="PORTUGUESE_SPEAKING"/>
 *     &lt;enumeration value="HOPTIMAL_GP"/>
 *     &lt;enumeration value="ZAPI_GP"/>
 *     &lt;enumeration value="GERMAN_SPEAKING"/>
 *     &lt;enumeration value="HOPTIMAL_DE"/>
 *     &lt;enumeration value="ZAPI_DE"/>
 *     &lt;enumeration value="GERMANY"/>
 *     &lt;enumeration value="SPANISH"/>
 *     &lt;enumeration value="ENGLISH"/>
 *     &lt;enumeration value="HOPTIMAL_PE"/>
 *     &lt;enumeration value="ZAPI_PE"/>
 *     &lt;enumeration value="PERU"/>
 *     &lt;enumeration value="HOPTIMAL_AR"/>
 *     &lt;enumeration value="ZAPI_AR"/>
 *     &lt;enumeration value="ARGENTINA"/>
 *     &lt;enumeration value="FRA"/>
 *     &lt;enumeration value="HOPTIMAL_UY"/>
 *     &lt;enumeration value="ZAPI_UY"/>
 *     &lt;enumeration value="URUGUAY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductLineType", namespace = "http://productline.utils.merlin.vidal.com")
@XmlEnum
public enum ProductLineType {

    FR,
    VXP,
    VCD,
    VDE,
    VDEJ,
    VXPJ,
    PORTUGAL,
    SPAIN,
    BELGIUM_F,
    BELGIUM_N,
    BULGARIA,
    BRASIL,
    ABU_DHABI,
    MEXICO,
    CHILI,
    UNITED_KINGDOM,
    INTERNATIONAL,
    HOPTIMAL,
    EVIDAL,
    ZAPI,
    REST,
    HOPTIMAL_ES,
    HOPTIMAL_CL,
    HOPTIMAL_MX,
    ZAPI_ES,
    ZAPI_CL,
    ZAPI_MX,
    HOPTIMAL_HP,
    ZAPI_HP,
    HOPTIMAL_AE,
    ZAPI_AE,
    HOPTIMAL_BEF,
    ZAPI_BEF,
    HOPTIMAL_BEN,
    ZAPI_BEN,
    HOPTIMAL_EN,
    ZAPI_EN,
    HOPTIMAL_SA,
    ZAPI_SA,
    SAUDI_ARABIA,
    HOPTIMAL_FP,
    ZAPI_FP,
    FRENCH_SPEAKING,
    HOPTIMAL_PP,
    ZAPI_PP,
    PORTUGUESE_SPEAKING,
    HOPTIMAL_GP,
    ZAPI_GP,
    GERMAN_SPEAKING,
    HOPTIMAL_DE,
    ZAPI_DE,
    GERMANY,
    SPANISH,
    ENGLISH,
    HOPTIMAL_PE,
    ZAPI_PE,
    PERU,
    HOPTIMAL_AR,
    ZAPI_AR,
    ARGENTINA,
    FRA,
    HOPTIMAL_UY,
    ZAPI_UY,
    URUGUAY;

    public String value() {
        return name();
    }

    public static ProductLineType fromValue(String v) {
        return valueOf(v);
    }

}
