
package fr.atod26.spring.lebaronjerome;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IServiceSpring", targetNamespace = "http://lebaronjerome.spring.atod26.fr")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IServiceSpring {


    /**
     * 
     * @param deuxiemeParam
     * @param premierParam
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ajouterSpring", targetNamespace = "http://lebaronjerome.spring.atod26.fr", className = "fr.atod26.spring.lebaronjerome.AjouterSpring")
    @ResponseWrapper(localName = "ajouterSpringResponse", targetNamespace = "http://lebaronjerome.spring.atod26.fr", className = "fr.atod26.spring.lebaronjerome.AjouterSpringResponse")
    public int ajouterSpring(
        @WebParam(name = "premierParam", targetNamespace = "")
        int premierParam,
        @WebParam(name = "deuxiemeParam", targetNamespace = "")
        int deuxiemeParam);

    /**
     * 
     * @param deuxiemeParam
     * @param premierParam
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "diviserSpring", targetNamespace = "http://lebaronjerome.spring.atod26.fr", className = "fr.atod26.spring.lebaronjerome.DiviserSpring")
    @ResponseWrapper(localName = "diviserSpringResponse", targetNamespace = "http://lebaronjerome.spring.atod26.fr", className = "fr.atod26.spring.lebaronjerome.DiviserSpringResponse")
    public double diviserSpring(
        @WebParam(name = "premierParam", targetNamespace = "")
        int premierParam,
        @WebParam(name = "deuxiemeParam", targetNamespace = "")
        int deuxiemeParam);

}