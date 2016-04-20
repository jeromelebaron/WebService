package fr.afcepf.atod26.webservice.spring.test;

import org.apache.log4j.Logger;

import fr.atod26.spring.lebaronjerome.IServiceSpring;
import fr.atod26.spring.lebaronjerome.Personne;
import fr.atod26.spring.lebaronjerome.PersonneExcecption_Exception;
import fr.atod26.spring.lebaronjerome.ServiceSpringCXF;

public class TestSpringService {

	private static Logger log = Logger.getLogger(TestSpringService.class);

	public static void main(String[] args) {

		log.info("Debut du test");

		ServiceSpringCXF service = new ServiceSpringCXF();
		IServiceSpring prox = service.getServiceSpringImplPort();
		log.info("Résultat addition Spring : " + prox.ajouterSpring(10, 10));
		log.info("Résultat division Spring : " + prox.diviserSpring(50, 5));
		Personne personneException = new Personne();
		personneException.setId(1);
		try {
			prox.addPersonne(personneException);
		} catch (PersonneExcecption_Exception e) {
			log.info("Exception levée");
			log.error(e);
		}
		Personne nouvellePersonne = prox.recupererPersonne();
		log.info("Nom de la personne récupérée : " + nouvellePersonne.getNom());
		log.info("Fin du test");
	}

}
