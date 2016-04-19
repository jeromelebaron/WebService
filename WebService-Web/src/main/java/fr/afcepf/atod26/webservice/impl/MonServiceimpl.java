package fr.afcepf.atod26.webservice.impl;

import org.apache.log4j.Logger;

import fr.afcepf.atod26.webservice.api.IMonService;

public class MonServiceimpl implements IMonService {


	@Override
	public int add(final int premier, final int deuxieme) {
		System.out.println("Methode ajout");
		return premier + deuxieme;
	}

	@Override
	public double puissance(final int premier, final int deuxieme) {
		System.out.println("Methode puissance");
		return premier * deuxieme;
	}

}
