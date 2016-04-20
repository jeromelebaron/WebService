
package fr.atod26.spring.lebaronjerome;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recupererPersonneResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recupererPersonneResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unePersonne" type="{http://lebaronjerome.spring.atod26.fr}personne" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recupererPersonneResponse", propOrder = {
    "unePersonne"
})
public class RecupererPersonneResponse {

    protected Personne unePersonne;

    /**
     * Gets the value of the unePersonne property.
     * 
     * @return
     *     possible object is
     *     {@link Personne }
     *     
     */
    public Personne getUnePersonne() {
        return unePersonne;
    }

    /**
     * Sets the value of the unePersonne property.
     * 
     * @param value
     *     allowed object is
     *     {@link Personne }
     *     
     */
    public void setUnePersonne(Personne value) {
        this.unePersonne = value;
    }

}
