
package fr.atod26.spring.lebaronjerome;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addPersonneResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addPersonneResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPersonne" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addPersonneResponse", propOrder = {
    "idPersonne"
})
public class AddPersonneResponse {

    protected int idPersonne;

    /**
     * Gets the value of the idPersonne property.
     * 
     */
    public int getIdPersonne() {
        return idPersonne;
    }

    /**
     * Sets the value of the idPersonne property.
     * 
     */
    public void setIdPersonne(int value) {
        this.idPersonne = value;
    }

}
