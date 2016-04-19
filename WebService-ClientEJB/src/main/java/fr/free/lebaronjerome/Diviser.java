
package fr.free.lebaronjerome;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for diviser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="diviser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paramPremier" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="paramDeuxieme" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "diviser", propOrder = {
    "paramPremier",
    "paramDeuxieme"
})
public class Diviser {

    protected int paramPremier;
    protected int paramDeuxieme;

    /**
     * Gets the value of the paramPremier property.
     * 
     */
    public int getParamPremier() {
        return paramPremier;
    }

    /**
     * Sets the value of the paramPremier property.
     * 
     */
    public void setParamPremier(int value) {
        this.paramPremier = value;
    }

    /**
     * Gets the value of the paramDeuxieme property.
     * 
     */
    public int getParamDeuxieme() {
        return paramDeuxieme;
    }

    /**
     * Sets the value of the paramDeuxieme property.
     * 
     */
    public void setParamDeuxieme(int value) {
        this.paramDeuxieme = value;
    }

}
