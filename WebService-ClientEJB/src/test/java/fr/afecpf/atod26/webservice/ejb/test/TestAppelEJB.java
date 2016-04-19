package fr.afecpf.atod26.webservice.ejb.test;

import org.apache.log4j.Logger;

import fr.free.lebaronjerome.IMonServiceEJB;
import fr.free.lebaronjerome.NouvellesOperationsService;

public class TestAppelEJB {

	private static Logger log = Logger.getLogger(TestAppelEJB.class);

	public static void main(String[] args) {

		log.info("Debut du test");

		NouvellesOperationsService service = new NouvellesOperationsService();
		IMonServiceEJB proxy = service.getMonServiceEJBImplPort();
		log.info(proxy.diviser(10, 10));
		log.info(proxy.soustraire(10, 5));
		log.info("Fin du test");

	}

}
