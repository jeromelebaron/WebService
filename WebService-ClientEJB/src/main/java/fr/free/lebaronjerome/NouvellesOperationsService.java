
package fr.free.lebaronjerome;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "nouvellesOperationsService", targetNamespace = "http://lebaronjerome.free.fr", wsdlLocation = "http://localhost:18080/WebService-JaxWS-EJB/nouvellesOperationsService/MonServiceEJBImpl?wsdl")
public class NouvellesOperationsService
    extends Service
{

    private final static URL NOUVELLESOPERATIONSSERVICE_WSDL_LOCATION;
    private final static WebServiceException NOUVELLESOPERATIONSSERVICE_EXCEPTION;
    private final static QName NOUVELLESOPERATIONSSERVICE_QNAME = new QName("http://lebaronjerome.free.fr", "nouvellesOperationsService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:18080/WebService-JaxWS-EJB/nouvellesOperationsService/MonServiceEJBImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        NOUVELLESOPERATIONSSERVICE_WSDL_LOCATION = url;
        NOUVELLESOPERATIONSSERVICE_EXCEPTION = e;
    }

    public NouvellesOperationsService() {
        super(__getWsdlLocation(), NOUVELLESOPERATIONSSERVICE_QNAME);
    }

    public NouvellesOperationsService(WebServiceFeature... features) {
        super(__getWsdlLocation(), NOUVELLESOPERATIONSSERVICE_QNAME, features);
    }

    public NouvellesOperationsService(URL wsdlLocation) {
        super(wsdlLocation, NOUVELLESOPERATIONSSERVICE_QNAME);
    }

    public NouvellesOperationsService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, NOUVELLESOPERATIONSSERVICE_QNAME, features);
    }

    public NouvellesOperationsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NouvellesOperationsService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IMonServiceEJB
     */
    @WebEndpoint(name = "MonServiceEJBImplPort")
    public IMonServiceEJB getMonServiceEJBImplPort() {
        return super.getPort(new QName("http://lebaronjerome.free.fr", "MonServiceEJBImplPort"), IMonServiceEJB.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IMonServiceEJB
     */
    @WebEndpoint(name = "MonServiceEJBImplPort")
    public IMonServiceEJB getMonServiceEJBImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://lebaronjerome.free.fr", "MonServiceEJBImplPort"), IMonServiceEJB.class, features);
    }

    private static URL __getWsdlLocation() {
        if (NOUVELLESOPERATIONSSERVICE_EXCEPTION!= null) {
            throw NOUVELLESOPERATIONSSERVICE_EXCEPTION;
        }
        return NOUVELLESOPERATIONSSERVICE_WSDL_LOCATION;
    }

}
