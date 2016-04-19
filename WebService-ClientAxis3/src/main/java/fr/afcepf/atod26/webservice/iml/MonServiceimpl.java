package fr.afcepf.atod26.webservice.iml;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://impl.webservice.atod26.afcepf.fr")
public interface MonServiceimpl {

	@WebMethod(operationName = "add")
	@WebResult(name = "addReturn", targetNamespace = "http://impl.webservice.atod26.afcepf.fr")
	int addition(@WebParam(name = "premier") final int first, @WebParam(name = "deuxieme") final int second);

	@WebMethod(operationName = "puissance")
	@WebResult(name = "puissanceReturn", targetNamespace = "http://impl.webservice.atod26.afcepf.fr")
	double power(@WebParam(name = "premier") final int first, @WebParam(name = "deuxieme") final int second);
}
