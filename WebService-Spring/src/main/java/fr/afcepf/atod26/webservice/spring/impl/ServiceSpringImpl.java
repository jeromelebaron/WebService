package fr.afcepf.atod26.webservice.spring.impl;

import javax.jws.WebService;

import org.apache.log4j.Logger;

import fr.afcepf.atod26.webservice.spring.api.IServiceSpring;

@WebService(targetNamespace = "http://lebaronjerome.spring.atod26.fr", endpointInterface = "fr.afcepf.atod26.webservice.spring.api.IServiceSpring", serviceName = "serviceSpringCXF")
public class ServiceSpringImpl implements IServiceSpring {

	private Logger log = Logger.getLogger(ServiceSpringImpl.class);

	@Override
	public int addition(final int premier, final int deuxieme) {
		log.info("Addition Spring");
		return premier + deuxieme;
	}

	@Override
	public double division(final int premier, final int deuxieme) {
		log.info("Division Spring");
		return premier / deuxieme;
	}

}
