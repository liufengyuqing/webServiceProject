/**
 * QqOnlineWebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package qq;

public class QqOnlineWebServiceLocator extends org.apache.axis.client.Service implements qq.QqOnlineWebService {

/**
 * <a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a>
 * <strong>腾讯QQ在线状�?? WEB 服务</strong>�?<a href="http://www.webxml.com.cn/"
 * target="_blank">WebXml.com.cn</a> �?/或其各供应商不为本页面提供信息的错误、残缺�?�延迟或因依靠此信息�?采取的任何行动负责�??</br>此腾讯QQ在线状�?�Web
 * Services请不要用于任何商业目的，若有�?要请<a href="http://www.webxml.com.cn/zh_cn/contact_us.aspx"
 * target="_blank">联系我们</a>，欢迎技术交流�?? QQ�?8409035<br /><strong>使用本站 WEB
 * 服务请注明或链接本站：http://www.webxml.com.cn/ 感谢大家的支�?</strong>�?<br /><br />&nbsp;
 */

    public QqOnlineWebServiceLocator() {
    }


    public QqOnlineWebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public QqOnlineWebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for qqOnlineWebServiceSoap
    private java.lang.String qqOnlineWebServiceSoap_address = "http://ws.webxml.com.cn/webservices/qqOnlineWebService.asmx";

    public java.lang.String getqqOnlineWebServiceSoapAddress() {
        return qqOnlineWebServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String qqOnlineWebServiceSoapWSDDServiceName = "qqOnlineWebServiceSoap";

    public java.lang.String getqqOnlineWebServiceSoapWSDDServiceName() {
        return qqOnlineWebServiceSoapWSDDServiceName;
    }

    public void setqqOnlineWebServiceSoapWSDDServiceName(java.lang.String name) {
        qqOnlineWebServiceSoapWSDDServiceName = name;
    }

    public qq.QqOnlineWebServiceSoap getqqOnlineWebServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(qqOnlineWebServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getqqOnlineWebServiceSoap(endpoint);
    }

    public qq.QqOnlineWebServiceSoap getqqOnlineWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            qq.QqOnlineWebServiceSoapStub _stub = new qq.QqOnlineWebServiceSoapStub(portAddress, this);
            _stub.setPortName(getqqOnlineWebServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setqqOnlineWebServiceSoapEndpointAddress(java.lang.String address) {
        qqOnlineWebServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (qq.QqOnlineWebServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                qq.QqOnlineWebServiceSoapStub _stub = new qq.QqOnlineWebServiceSoapStub(new java.net.URL(qqOnlineWebServiceSoap_address), this);
                _stub.setPortName(getqqOnlineWebServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("qqOnlineWebServiceSoap".equals(inputPortName)) {
            return getqqOnlineWebServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://WebXml.com.cn/", "qqOnlineWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://WebXml.com.cn/", "qqOnlineWebServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("qqOnlineWebServiceSoap".equals(portName)) {
            setqqOnlineWebServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
