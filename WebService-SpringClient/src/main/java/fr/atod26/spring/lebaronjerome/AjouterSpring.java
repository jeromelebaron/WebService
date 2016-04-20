
package fr.atod26.spring.lebaronjerome;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ajouterSpring complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ajouterSpring">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="premierParam" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="deuxiemeParam" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ajouterSpring", propOrder = {
    "premierParam",
    "deuxiemeParam"
})
public class AjouterSpring {

    protected int premierParam;
    protected int deuxiemeParam;

    /**
     * Gets the value of the premierParam property.
     * 
     */
    public int getPremierParam() {
        return premierParam;
    }

    /**
     * Sets the value of the premierParam property.
     * 
     */
    public void setPremierParam(int value) {
        this.premierParam = value;
    }

    /**
     * Gets the value of the deuxiemeParam property.
     * 
     */
    public int getDeuxiemeParam() {
        return deuxiemeParam;
    }

    /**
     * Sets the value of the deuxiemeParam property.
     * 
     */
    public void setDeuxiemeParam(int value) {
        this.deuxiemeParam = value;
    }

}
