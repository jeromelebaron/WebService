package fr.afcepf.atod26.webservice.test;

import java.rmi.RemoteException;

import org.apache.log4j.Logger;

import fr.afcepf.atod26.webservice.impl.MonServiceimplProxy;

public class TestAppelWebService {

	private static Logger log = Logger.getLogger(TestAppelWebService.class);
	
	public static void main(String[] args) {
		log.info("Test du WebService Axis");
		
		MonServiceimplProxy proxy = new MonServiceimplProxy();
		try {
			int resultatAddition = proxy.add(10, 10);
			log.info("Résultat de la méthode ajout : " + resultatAddition);
			double resultatPuissance = proxy.puissance(10, 10);
			log.info("Résultat de la méthode ajout : " + resultatPuissance);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		log.info("Fin du test");
	}

}
