package fr.afcepf.atod26.webservice.java.serveur;

import javax.xml.ws.Endpoint;

import org.apache.log4j.Logger;

import fr.afcepf.atod26.webservice.java.impl.MonServiceJavaImpl;

public class ServeurJava {

	private static Logger log = Logger.getLogger(ServeurJava.class);

	public static void main(String[] args) {
		log.info("Démarrage du serveur");

		String adresse = "http://localhost:23456/atod26/serviceJava";
		MonServiceJavaImpl service = new MonServiceJavaImpl();
		Endpoint.publish(adresse, service);
		try {
			Thread.sleep(5 * 60 * 1000);
		} catch (InterruptedException e) {
			log.fatal("Erreur");
		}
		log.info("Fin du service");
	}

}
