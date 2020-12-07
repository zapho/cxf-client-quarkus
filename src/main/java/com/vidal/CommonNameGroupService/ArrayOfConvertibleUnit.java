
package com.vidal.CommonNameGroupService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfConvertibleUnit complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfConvertibleUnit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="convertibleUnit" type="{urn:Vidal}convertibleUnit" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfConvertibleUnit", propOrder = {
    "convertibleUnit"
})
public class ArrayOfConvertibleUnit {

    @XmlElement(nillable = true)
    protected List<ConvertibleUnit> convertibleUnit;

    /**
     * Gets the value of the convertibleUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the convertibleUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConvertibleUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConvertibleUnit }
     * 
     * 
     */
    public List<ConvertibleUnit> getConvertibleUnit() {
        if (convertibleUnit == null) {
            convertibleUnit = new ArrayList<ConvertibleUnit>();
        }
        return this.convertibleUnit;
    }

}
