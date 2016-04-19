package fr.afcepf.atod26.webservice.ejb.impl;

import javax.ejb.Remote;
import javax.ejb.Singleton;
import javax.jws.WebService;

import org.apache.log4j.Logger;

import fr.afcepf.atod26.webservice.ejb.IMonServiceEJB;

@Remote(IMonServiceEJB.class)
@Singleton
@WebService(endpointInterface = "fr.afcepf.atod26.webservice.ejb.IMonServiceEJB", targetNamespace = "http://lebaronjerome.free.fr", serviceName = "nouvellesOperationsService")
public class MonServiceEJBImpl implements IMonServiceEJB {

	private Logger log = Logger.getLogger(MonServiceEJBImpl.class);

	@Override
	public int soustraction(final int premier, final int deuxieme) {
		log.info("EJB soustraction");
		return premier - deuxieme;
	}

	@Override
	public double division(final int premier, final int deuxieme) {
		log.info("EJB division");
		return premier / deuxieme;
	}

}
