
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

    private final static QName _AddPersonneResponse_QNAME = new QName("http://lebaronjerome.spring.atod26.fr", "addPersonneResponse");
    private final static QName _RecupererPersonneResponse_QNAME = new QName("http://lebaronjerome.spring.atod26.fr", "recupererPersonneResponse");
    private final static QName _Personne_QNAME = new QName("http://lebaronjerome.spring.atod26.fr", "personne");
    private final static QName _AjouterSpringResponse_QNAME = new QName("http://lebaronjerome.spring.atod26.fr", "ajouterSpringResponse");
    private final static QName _PersonneExcecption_QNAME = new QName("http://lebaronjerome.spring.atod26.fr", "PersonneExcecption");
    private final static QName _DiviserSpring_QNAME = new QName("http://lebaronjerome.spring.atod26.fr", "diviserSpring");
    private final static QName _DiviserSpringResponse_QNAME = new QName("http://lebaronjerome.spring.atod26.fr", "diviserSpringResponse");
    private final static QName _AjouterSpring_QNAME = new QName("http://lebaronjerome.spring.atod26.fr", "ajouterSpring");
    private final static QName _RecupererPersonne_QNAME = new QName("http://lebaronjerome.spring.atod26.fr", "recupererPersonne");
    private final static QName _AddPersonne_QNAME = new QName("http://lebaronjerome.spring.atod26.fr", "addPersonne");

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
     * Create an instance of {@link PersonneExcecption }
     * 
     */
    public PersonneExcecption createPersonneExcecption() {
        return new PersonneExcecption();
    }

    /**
     * Create an instance of {@link AjouterSpringResponse }
     * 
     */
    public AjouterSpringResponse createAjouterSpringResponse() {
        return new AjouterSpringResponse();
    }

    /**
     * Create an instance of {@link RecupererPersonneResponse }
     * 
     */
    public RecupererPersonneResponse createRecupererPersonneResponse() {
        return new RecupererPersonneResponse();
    }

    /**
     * Create an instance of {@link Personne }
     * 
     */
    public Personne createPersonne() {
        return new Personne();
    }

    /**
     * Create an instance of {@link AddPersonneResponse }
     * 
     */
    public AddPersonneResponse createAddPersonneResponse() {
        return new AddPersonneResponse();
    }

    /**
     * Create an instance of {@link RecupererPersonne }
     * 
     */
    public RecupererPersonne createRecupererPersonne() {
        return new RecupererPersonne();
    }

    /**
     * Create an instance of {@link AddPersonne }
     * 
     */
    public AddPersonne createAddPersonne() {
        return new AddPersonne();
    }

    /**
     * Create an instance of {@link AjouterSpring }
     * 
     */
    public AjouterSpring createAjouterSpring() {
        return new AjouterSpring();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lebaronjerome.spring.atod26.fr", name = "addPersonneResponse")
    public JAXBElement<AddPersonneResponse> createAddPersonneResponse(AddPersonneResponse value) {
        return new JAXBElement<AddPersonneResponse>(_AddPersonneResponse_QNAME, AddPersonneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecupererPersonneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lebaronjerome.spring.atod26.fr", name = "recupererPersonneResponse")
    public JAXBElement<RecupererPersonneResponse> createRecupererPersonneResponse(RecupererPersonneResponse value) {
        return new JAXBElement<RecupererPersonneResponse>(_RecupererPersonneResponse_QNAME, RecupererPersonneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Personne }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lebaronjerome.spring.atod26.fr", name = "personne")
    public JAXBElement<Personne> createPersonne(Personne value) {
        return new JAXBElement<Personne>(_Personne_QNAME, Personne.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonneExcecption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lebaronjerome.spring.atod26.fr", name = "PersonneExcecption")
    public JAXBElement<PersonneExcecption> createPersonneExcecption(PersonneExcecption value) {
        return new JAXBElement<PersonneExcecption>(_PersonneExcecption_QNAME, PersonneExcecption.class, null, value);
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecupererPersonne }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lebaronjerome.spring.atod26.fr", name = "recupererPersonne")
    public JAXBElement<RecupererPersonne> createRecupererPersonne(RecupererPersonne value) {
        return new JAXBElement<RecupererPersonne>(_RecupererPersonne_QNAME, RecupererPersonne.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonne }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lebaronjerome.spring.atod26.fr", name = "addPersonne")
    public JAXBElement<AddPersonne> createAddPersonne(AddPersonne value) {
        return new JAXBElement<AddPersonne>(_AddPersonne_QNAME, AddPersonne.class, null, value);
    }

}
