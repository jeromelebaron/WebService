
package fr.atod26.spring.lebaronjerome;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.atod26.spring.lebaronjerome package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AjouterSpringResponse_QNAME = new QName("http://lebaronjerome.spring.atod26.fr", "ajouterSpringResponse");
    private final static QName _DiviserSpring_QNAME = new QName("http://lebaronjerome.spring.atod26.fr", "diviserSpring");
    private final static QName _DiviserSpringResponse_QNAME = new QName("http://lebaronjerome.spring.atod26.fr", "diviserSpringResponse");
    private final static QName _AjouterSpring_QNAME = new QName("http://lebaronjerome.spring.atod26.fr", "ajouterSpring");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.atod26.spring.lebaronjerome
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DiviserSpringResponse }
     * 
     */
    public DiviserSpringResponse createDiviserSpringResponse() {
        return new DiviserSpringResponse();
    }

    /**
     * Create an instance of {@link DiviserSpring }
     * 
     */
    public DiviserSpring createDiviserSpring() {
        return new DiviserSpring();
    }

    /**
     * Create an instance of {@link AjouterSpringResponse }
     * 
     */
    public AjouterSpringResponse createAjouterSpringResponse() {
        return new AjouterSpringResponse();
    }

    /**
     * Create an instance of {@link AjouterSpring }
     * 
     */
    public AjouterSpring createAjouterSpring() {
        return new AjouterSpring();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterSpringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lebaronjerome.spring.atod26.fr", name = "ajouterSpringResponse")
    public JAXBElement<AjouterSpringResponse> createAjouterSpringResponse(AjouterSpringResponse value) {
        return new JAXBElement<AjouterSpringResponse>(_AjouterSpringResponse_QNAME, AjouterSpringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiviserSpring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lebaronjerome.spring.atod26.fr", name = "diviserSpring")
    public JAXBElement<DiviserSpring> createDiviserSpring(DiviserSpring value) {
        return new JAXBElement<DiviserSpring>(_DiviserSpring_QNAME, DiviserSpring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiviserSpringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lebaronjerome.spring.atod26.fr", name = "diviserSpringResponse")
    public JAXBElement<DiviserSpringResponse> createDiviserSpringResponse(DiviserSpringResponse value) {
        return new JAXBElement<DiviserSpringResponse>(_DiviserSpringResponse_QNAME, DiviserSpringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterSpring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lebaronjerome.spring.atod26.fr", name = "ajouterSpring")
    public JAXBElement<AjouterSpring> createAjouterSpring(AjouterSpring value) {
        return new JAXBElement<AjouterSpring>(_AjouterSpring_QNAME, AjouterSpring.class, null, value);
    }

}
