package fr.afcepf.atod26.webservice.projetweb.test;

import org.apache.log4j.Logger;

import fr.afcepf.atod26.lebaronjerome.IServiceWeb;
import fr.afcepf.atod26.lebaronjerome.ServiceWebCalcul;

public class TestAppelProjetWeb {

	private static Logger log = Logger.getLogger(TestAppelProjetWeb.class);

	public static void main(String[] args) {
		log.info("Debut du test");

		ServiceWebCalcul service = new ServiceWebCalcul();
		IServiceWeb proxy = service.getServiceWebImplPort();
		log.info("Résultat addition " + proxy.ajouter(10, 10));
		log.info("Résultat multiplication " + proxy.multiplier(20, 10));
		log.info("Fin du test");
	}

}
