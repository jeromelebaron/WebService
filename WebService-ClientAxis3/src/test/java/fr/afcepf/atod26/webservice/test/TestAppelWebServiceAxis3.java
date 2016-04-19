package fr.afcepf.atod26.webservice.test;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.apache.log4j.Logger;

import fr.afcepf.atod26.webservice.iml.MonServiceimpl;

public class TestAppelWebServiceAxis3 {

	private static Logger log = Logger.getLogger(TestAppelWebServiceAxis3.class);

	public static void main(String[] args) {

		URL url;
		QName qName;
		Service service;

		try {
			url = new URL("http://localhost:8080/WebService-Web/services/MonServiceimpl?wsdl");
			qName = new QName("http://impl.webservice.atod26.afcepf.fr", "MonServiceimplService");
			service = Service.create(url, qName);
			MonServiceimpl proxy = service.getPort(MonServiceimpl.class);
			log.info(proxy.addition(10, 5));
			log.info(proxy.power(10, 5));
		} catch (MalformedURLException e) {
			log.fatal("Erreur avec l'url");
			log.fatal(e.getMessage());
		}

	}

}
