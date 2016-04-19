package fr.afcepf.atod26.webservice.java.api;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://lebaronjerome.afcepf.fr")
public interface IMonServiceJava {

	@WebMethod(operationName = "afficherBonjour")
	@WebResult(name = "bonjour")
	String afficherBonjour();
}
