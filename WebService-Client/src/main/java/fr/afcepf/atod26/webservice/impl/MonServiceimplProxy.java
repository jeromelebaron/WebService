package fr.afcepf.atod26.webservice.impl;

public class MonServiceimplProxy implements fr.afcepf.atod26.webservice.impl.MonServiceimpl {
  private String _endpoint = null;
  private fr.afcepf.atod26.webservice.impl.MonServiceimpl monServiceimpl = null;
  
  public MonServiceimplProxy() {
    _initMonServiceimplProxy();
  }
  
  public MonServiceimplProxy(String endpoint) {
    _endpoint = endpoint;
    _initMonServiceimplProxy();
  }
  
  private void _initMonServiceimplProxy() {
    try {
      monServiceimpl = (new fr.afcepf.atod26.webservice.impl.MonServiceimplServiceLocator()).getMonServiceimpl();
      if (monServiceimpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)monServiceimpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)monServiceimpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (monServiceimpl != null)
      ((javax.xml.rpc.Stub)monServiceimpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public fr.afcepf.atod26.webservice.impl.MonServiceimpl getMonServiceimpl() {
    if (monServiceimpl == null)
      _initMonServiceimplProxy();
    return monServiceimpl;
  }
  
  public int add(int premier, int deuxieme) throws java.rmi.RemoteException{
    if (monServiceimpl == null)
      _initMonServiceimplProxy();
    return monServiceimpl.add(premier, deuxieme);
  }
  
  public double puissance(int premier, int deuxieme) throws java.rmi.RemoteException{
    if (monServiceimpl == null)
      _initMonServiceimplProxy();
    return monServiceimpl.puissance(premier, deuxieme);
  }
  
  
}