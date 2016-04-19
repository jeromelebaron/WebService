
package fr.free.lebaronjerome;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.free.lebaronjerome package. 
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

    private final static QName _DiviserResponse_QNAME = new QName("http://lebaronjerome.free.fr", "diviserResponse");
    private final static QName _SoustraireResponse_QNAME = new QName("http://lebaronjerome.free.fr", "soustraireResponse");
    private final static QName _Diviser_QNAME = new QName("http://lebaronjerome.free.fr", "diviser");
    private final static QName _Soustraire_QNAME = new QName("http://lebaronjerome.free.fr", "soustraire");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.free.lebaronjerome
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DiviserResponse }
     * 
     */
    public DiviserResponse createDiviserResponse() {
        return new DiviserResponse();
    }

    /**
     * Create an instance of {@link SoustraireResponse }
     * 
     */
    public SoustraireResponse createSoustraireResponse() {
        return new SoustraireResponse();
    }

    /**
     * Create an instance of {@link Soustraire }
     * 
     */
    public Soustraire createSoustraire() {
        return new Soustraire();
    }

    /**
     * Create an instance of {@link Diviser }
     * 
     */
    public Diviser createDiviser() {
        return new Diviser();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiviserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lebaronjerome.free.fr", name = "diviserResponse")
    public JAXBElement<DiviserResponse> createDiviserResponse(DiviserResponse value) {
        return new JAXBElement<DiviserResponse>(_DiviserResponse_QNAME, DiviserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoustraireResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lebaronjerome.free.fr", name = "soustraireResponse")
    public JAXBElement<SoustraireResponse> createSoustraireResponse(SoustraireResponse value) {
        return new JAXBElement<SoustraireResponse>(_SoustraireResponse_QNAME, SoustraireResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Diviser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lebaronjerome.free.fr", name = "diviser")
    public JAXBElement<Diviser> createDiviser(Diviser value) {
        return new JAXBElement<Diviser>(_Diviser_QNAME, Diviser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Soustraire }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lebaronjerome.free.fr", name = "soustraire")
    public JAXBElement<Soustraire> createSoustraire(Soustraire value) {
        return new JAXBElement<Soustraire>(_Soustraire_QNAME, Soustraire.class, null, value);
    }

}
