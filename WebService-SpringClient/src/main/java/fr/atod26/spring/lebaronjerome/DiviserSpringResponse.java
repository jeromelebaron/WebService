
package fr.atod26.spring.lebaronjerome;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for diviserSpringResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="diviserSpringResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultatDivisionSpring" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "diviserSpringResponse", propOrder = {
    "resultatDivisionSpring"
})
public class DiviserSpringResponse {

    protected double resultatDivisionSpring;

    /**
     * Gets the value of the resultatDivisionSpring property.
     * 
     */
    public double getResultatDivisionSpring() {
        return resultatDivisionSpring;
    }

    /**
     * Sets the value of the resultatDivisionSpring property.
     * 
     */
    public void setResultatDivisionSpring(double value) {
        this.resultatDivisionSpring = value;
    }

}
