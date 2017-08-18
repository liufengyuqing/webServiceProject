package translate;

public class EnglishChineseSoapProxy implements translate.EnglishChineseSoap {
  private String _endpoint = null;
  private translate.EnglishChineseSoap englishChineseSoap = null;
  
  public EnglishChineseSoapProxy() {
    _initEnglishChineseSoapProxy();
  }
  
  public EnglishChineseSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initEnglishChineseSoapProxy();
  }
  
  private void _initEnglishChineseSoapProxy() {
    try {
      englishChineseSoap = (new translate.EnglishChineseLocator()).getEnglishChineseSoap();
      if (englishChineseSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)englishChineseSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)englishChineseSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (englishChineseSoap != null)
      ((javax.xml.rpc.Stub)englishChineseSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public translate.EnglishChineseSoap getEnglishChineseSoap() {
    if (englishChineseSoap == null)
      _initEnglishChineseSoapProxy();
    return englishChineseSoap;
  }
  
  public translate.TranslatorResponseTranslatorResult translator(java.lang.String wordKey) throws java.rmi.RemoteException{
    if (englishChineseSoap == null)
      _initEnglishChineseSoapProxy();
    return englishChineseSoap.translator(wordKey);
  }
  
  public java.lang.String[] translatorString(java.lang.String wordKey) throws java.rmi.RemoteException{
    if (englishChineseSoap == null)
      _initEnglishChineseSoapProxy();
    return englishChineseSoap.translatorString(wordKey);
  }
  
  public java.lang.String[] translatorReferString(java.lang.String wordKey) throws java.rmi.RemoteException{
    if (englishChineseSoap == null)
      _initEnglishChineseSoapProxy();
    return englishChineseSoap.translatorReferString(wordKey);
  }
  
  public java.lang.String[] translatorSentenceString(java.lang.String wordKey) throws java.rmi.RemoteException{
    if (englishChineseSoap == null)
      _initEnglishChineseSoapProxy();
    return englishChineseSoap.translatorSentenceString(wordKey);
  }
  
  public java.lang.String[] suggestWord(java.lang.String wordKey) throws java.rmi.RemoteException{
    if (englishChineseSoap == null)
      _initEnglishChineseSoapProxy();
    return englishChineseSoap.suggestWord(wordKey);
  }
  
  public byte[] getMp3(java.lang.String mp3) throws java.rmi.RemoteException{
    if (englishChineseSoap == null)
      _initEnglishChineseSoapProxy();
    return englishChineseSoap.getMp3(mp3);
  }
  
  
}