
package fr.atod26.spring.lebaronjerome;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ajouterSpringResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ajouterSpringResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultatAdditionSpring" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ajouterSpringResponse", propOrder = {
    "resultatAdditionSpring"
})
public class AjouterSpringResponse {

    protected int resultatAdditionSpring;

    /**
     * Gets the value of the resultatAdditionSpring property.
     * 
     */
    public int getResultatAdditionSpring() {
        return resultatAdditionSpring;
    }

    /**
     * Sets the value of the resultatAdditionSpring property.
     * 
     */
    public void setResultatAdditionSpring(int value) {
        this.resultatAdditionSpring = value;
    }

}
