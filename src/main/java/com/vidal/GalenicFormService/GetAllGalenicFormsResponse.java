
package com.vidal.GalenicFormService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pagedResultGalenicForm" type="{urn:Vidal}pagedResultGalenicForm"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pagedResultGalenicForm"
})
@XmlRootElement(name = "getAllGalenicFormsResponse")
public class GetAllGalenicFormsResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultGalenicForm pagedResultGalenicForm;

    /**
     * Obtient la valeur de la propriété pagedResultGalenicForm.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultGalenicForm }
     *     
     */
    public PagedResultGalenicForm getPagedResultGalenicForm() {
        return pagedResultGalenicForm;
    }

    /**
     * Définit la valeur de la propriété pagedResultGalenicForm.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultGalenicForm }
     *     
     */
    public void setPagedResultGalenicForm(PagedResultGalenicForm value) {
        this.pagedResultGalenicForm = value;
    }

}
