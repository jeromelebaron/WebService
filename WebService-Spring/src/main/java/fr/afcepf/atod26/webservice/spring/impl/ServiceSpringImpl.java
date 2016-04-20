package fr.afcepf.atod26.webservice.spring.impl;

import javax.jws.WebService;

import org.apache.log4j.Logger;

import fr.afcepf.atod26.webservice.spring.api.IServiceSpring;
import fr.afcepf.atod26.webservice.spring.entity.Personne;
import fr.afcepf.atod26.webservice.spring.exception.PersonneExcecption;

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

	@Override
	public Personne getPersonne() {
		log.info("Voici une personne");
		return new Personne(2, "Pyche", "Ounet");
	}

	@Override
	public int ajouterPersonne(Personne personne) throws PersonneExcecption {
		log.info("Ajout d'une personne");
		if (personne.getId() == 1) {
			throw new PersonneExcecption();
		}
		return 3;
	}

}
