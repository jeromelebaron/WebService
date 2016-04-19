
package fr.afcepf.atod26.webservice.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="puissanceReturn" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "puissanceReturn"
})
@XmlRootElement(name = "puissanceResponse")
public class PuissanceResponse {

    protected double puissanceReturn;

    /**
     * Gets the value of the puissanceReturn property.
     * 
     */
    public double getPuissanceReturn() {
        return puissanceReturn;
    }

    /**
     * Sets the value of the puissanceReturn property.
     * 
     */
    public void setPuissanceReturn(double value) {
        this.puissanceReturn = value;
    }

}
