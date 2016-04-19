package fr.afcepf.atod26.webservice.java.impl;

import javax.jws.WebService;

import fr.afcepf.atod26.webservice.java.api.IMonServiceJava;

@WebService(endpointInterface = "fr.afcepf.atod26.webservice.java.api.IMonServiceJava", targetNamespace = "http://lebaronjerome.afcepf.fr")
public class MonServiceJavaImpl implements IMonServiceJava {

	@Override
	public String afficherBonjour() {
		return "Hello world !";
	}

}
