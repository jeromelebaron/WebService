package fr.afcepf.atod26.webservice.test;

import org.apache.log4j.Logger;

import fr.afcepf.atod26.webservice.impl.MonServiceimpl;
import fr.afcepf.atod26.webservice.impl.MonServiceimplService;

public class TestAppelWebServiceAxis2 {

	private static Logger log = Logger.getLogger(TestAppelWebServiceAxis2.class);
	
	public static void main(String[] args) {
		log.info("Test du WebService Axis2");
		
		MonServiceimplService service = new MonServiceimplService();
		MonServiceimpl proxy = service.getMonServiceimpl();
		
		int resultatAddition = proxy.add(10, 10);
		log.info("Résultat de la méthode ajout : " + resultatAddition);
		double resultatPuissance = proxy.puissance(10, 10);
		log.info("Résultat de la méthode ajout : " + resultatPuissance);
		log.info("Fin du test");
	}

}
