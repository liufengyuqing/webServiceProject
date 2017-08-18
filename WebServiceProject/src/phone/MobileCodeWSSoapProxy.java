package phone;

public class MobileCodeWSSoapProxy implements phone.MobileCodeWSSoap {
  private String _endpoint = null;
  private phone.MobileCodeWSSoap mobileCodeWSSoap = null;
  
  public MobileCodeWSSoapProxy() {
    _initMobileCodeWSSoapProxy();
  }
  
  public MobileCodeWSSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initMobileCodeWSSoapProxy();
  }
  
  private void _initMobileCodeWSSoapProxy() {
    try {
      mobileCodeWSSoap = (new phone.MobileCodeWSLocator()).getMobileCodeWSSoap();
      if (mobileCodeWSSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)mobileCodeWSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)mobileCodeWSSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (mobileCodeWSSoap != null)
      ((javax.xml.rpc.Stub)mobileCodeWSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public phone.MobileCodeWSSoap getMobileCodeWSSoap() {
    if (mobileCodeWSSoap == null)
      _initMobileCodeWSSoapProxy();
    return mobileCodeWSSoap;
  }
  
  public java.lang.String getMobileCodeInfo(java.lang.String mobileCode, java.lang.String userID) throws java.rmi.RemoteException{
    if (mobileCodeWSSoap == null)
      _initMobileCodeWSSoapProxy();
    return mobileCodeWSSoap.getMobileCodeInfo(mobileCode, userID);
  }
  
  public java.lang.String[] getDatabaseInfo() throws java.rmi.RemoteException{
    if (mobileCodeWSSoap == null)
      _initMobileCodeWSSoapProxy();
    return mobileCodeWSSoap.getDatabaseInfo();
  }
  
  
}