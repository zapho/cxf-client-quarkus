
package com.whatever.SideEffectService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfCommonNameGroupSideEffect complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCommonNameGroupSideEffect">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonNameGroupSideEffect" type="{urn:Vidal}commonNameGroupSideEffect" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCommonNameGroupSideEffect", propOrder = {
    "commonNameGroupSideEffect"
})
public class ArrayOfCommonNameGroupSideEffect {

    @XmlElement(nillable = true)
    protected List<CommonNameGroupSideEffect> commonNameGroupSideEffect;

    /**
     * Gets the value of the commonNameGroupSideEffect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commonNameGroupSideEffect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommonNameGroupSideEffect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommonNameGroupSideEffect }
     * 
     * 
     */
    public List<CommonNameGroupSideEffect> getCommonNameGroupSideEffect() {
        if (commonNameGroupSideEffect == null) {
            commonNameGroupSideEffect = new ArrayList<CommonNameGroupSideEffect>();
        }
        return this.commonNameGroupSideEffect;
    }

}
