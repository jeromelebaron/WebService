
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
 *         &lt;element name="premier" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="deuxieme" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "premier",
    "deuxieme"
})
@XmlRootElement(name = "puissance")
public class Puissance {

    protected int premier;
    protected int deuxieme;

    /**
     * Gets the value of the premier property.
     * 
     */
    public int getPremier() {
        return premier;
    }

    /**
     * Sets the value of the premier property.
     * 
     */
    public void setPremier(int value) {
        this.premier = value;
    }

    /**
     * Gets the value of the deuxieme property.
     * 
     */
    public int getDeuxieme() {
        return deuxieme;
    }

    /**
     * Sets the value of the deuxieme property.
     * 
     */
    public void setDeuxieme(int value) {
        this.deuxieme = value;
    }

}
