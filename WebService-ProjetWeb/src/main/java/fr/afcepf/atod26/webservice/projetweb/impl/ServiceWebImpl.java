package fr.afcepf.atod26.webservice.projetweb.impl;

import javax.jws.WebService;

import org.apache.log4j.Logger;

import fr.afcepf.atod26.webservice.projetweb.IServiceWeb;

@WebService(targetNamespace = "http://lebaronjerome.atod26.afcepf.fr", serviceName = "serviceWebCalcul", endpointInterface = "fr.afcepf.atod26.webservice.projetweb.IServiceWeb")
public class ServiceWebImpl implements IServiceWeb {

	private Logger log = Logger.getLogger(ServiceWebImpl.class);

	@Override
	public int addition(final int premier, final int deuxieme) {
		log.info("Projet web addition");
		return premier + deuxieme;
	}

	@Override
	public int multiplication(final int premier, final int deuxieme) {
		log.info("Projet web multiplication");
		return premier * deuxieme;
	}

}
