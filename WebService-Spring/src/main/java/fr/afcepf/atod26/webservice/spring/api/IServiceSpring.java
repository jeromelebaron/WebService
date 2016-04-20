package fr.afcepf.atod26.webservice.spring.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import fr.afcepf.atod26.webservice.spring.entity.Personne;
import fr.afcepf.atod26.webservice.spring.exception.PersonneExcecption;

@WebService(targetNamespace = "http://lebaronjerome.spring.atod26.fr")
public interface IServiceSpring {

	@WebMethod(operationName = "ajouterSpring")
	@WebResult(name = "resultatAdditionSpring")
	int addition(@WebParam(name = "premierParam") final int premier,
			@WebParam(name = "deuxiemeParam") final int deuxieme);

	@WebMethod(operationName = "diviserSpring")
	@WebResult(name = "resultatDivisionSpring")
	double division(@WebParam(name = "premierParam") final int premier,
			@WebParam(name = "deuxiemeParam") final int deuxieme);

	@WebMethod(operationName = "recupererPersonne")
	@WebResult(name = "unePersonne")
	Personne getPersonne();

	@WebMethod(operationName = "addPersonne")
	@WebResult(name = "idPersonne")
	int ajouterPersonne(@WebParam(name = "personne") Personne personne) throws PersonneExcecption;

}
