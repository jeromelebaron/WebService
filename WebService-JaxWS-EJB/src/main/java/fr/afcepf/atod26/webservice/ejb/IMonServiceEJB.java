package fr.afcepf.atod26.webservice.ejb;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://lebaronjerome.free.fr")
public interface IMonServiceEJB {

	@WebMethod(operationName = "soustraire")
	@WebResult(name = "resultatSoustraction")
	int soustraction(@WebParam(name = "paramPremier") final int premier,
			@WebParam(name = "paramDeuxieme") final int deuxieme);

	@WebMethod(operationName = "diviser")
	@WebResult(name = "resultatDivision")
	double division(@WebParam(name = "paramPremier") final int premier,
			@WebParam(name = "paramDeuxieme") final int deuxieme);

}
