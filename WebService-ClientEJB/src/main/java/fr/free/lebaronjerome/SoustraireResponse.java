
package fr.free.lebaronjerome;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for soustraireResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="soustraireResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultatSoustraction" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "soustraireResponse", propOrder = {
    "resultatSoustraction"
})
public class SoustraireResponse {

    protected int resultatSoustraction;

    /**
     * Gets the value of the resultatSoustraction property.
     * 
     */
    public int getResultatSoustraction() {
        return resultatSoustraction;
    }

    /**
     * Sets the value of the resultatSoustraction property.
     * 
     */
    public void setResultatSoustraction(int value) {
        this.resultatSoustraction = value;
    }

}
