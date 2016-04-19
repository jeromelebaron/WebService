package fr.afcepf.atod26.webservice.impl;

import org.apache.log4j.Logger;

import fr.afcepf.atod26.webservice.api.IMonService;

public class MonServiceimpl implements IMonService {

	private Logger log = Logger.getLogger(MonServiceimpl.class);
	
	@Override
	public int add(final int premier, final int deuxieme) {
		log.info("Methode ajout");
		return premier + deuxieme;
	}

	@Override
	public double puissance(final int premier, final int deuxieme) {
		log.info("Methode puissance");
		return premier * deuxieme;
	}

}
