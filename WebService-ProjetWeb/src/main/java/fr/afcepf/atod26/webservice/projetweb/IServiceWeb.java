package fr.afcepf.atod26.webservice.projetweb;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(targetNamespace = "http://lebaronjerome.atod26.afcepf.fr")
@SOAPBinding(style = Style.DOCUMENT)
public interface IServiceWeb {

	@WebMethod(operationName = "ajouter")
	@WebResult(name = "resultatAddition")
	int addition(@WebParam(name = "paramPremier") final int premier,
			@WebParam(name = "paramDeuxieme") final int deuxieme);

	@WebMethod(operationName = "multiplier")
	@WebResult(name = "resultatMultiplication")
	int multiplication(@WebParam(name = "paramPremier") final int premier,
			@WebParam(name = "paramDeuxieme") final int deuxieme);

}
