package fr.afcepf.atod26.webservice.spring.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://lebaronjerome.spring.atod26.fr")
public interface IServiceSpring {

	@WebMethod(operationName = "ajouterSpring")
	int addition(@WebParam(name = "premierParam") final int premier,
			@WebParam(name = "deuxiemeParam") final int deuxieme);

	@WebMethod(operationName = "diviserSpring")
	int division(@WebParam(name = "premierParam") final int premier,
			@WebParam(name = "deuxiemeParam") final int deuxieme);

}
