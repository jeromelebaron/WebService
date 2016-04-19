
package fr.free.lebaronjerome;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for diviserResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="diviserResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultatDivision" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "diviserResponse", propOrder = {
    "resultatDivision"
})
public class DiviserResponse {

    protected double resultatDivision;

    /**
     * Gets the value of the resultatDivision property.
     * 
     */
    public double getResultatDivision() {
        return resultatDivision;
    }

    /**
     * Sets the value of the resultatDivision property.
     * 
     */
    public void setResultatDivision(double value) {
        this.resultatDivision = value;
    }

}
