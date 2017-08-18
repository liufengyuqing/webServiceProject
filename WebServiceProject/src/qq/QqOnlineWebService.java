/**
 * QqOnlineWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package qq;

public interface QqOnlineWebService extends javax.xml.rpc.Service {

/**
 * <a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a>
 * <strong>腾讯QQ在线状�?? WEB 服务</strong>�?<a href="http://www.webxml.com.cn/"
 * target="_blank">WebXml.com.cn</a> �?/或其各供应商不为本页面提供信息的错误、残缺�?�延迟或因依靠此信息�?采取的任何行动负责�??</br>此腾讯QQ在线状�?�Web
 * Services请不要用于任何商业目的，若有�?要请<a href="http://www.webxml.com.cn/zh_cn/contact_us.aspx"
 * target="_blank">联系我们</a>，欢迎技术交流�?? QQ�?8409035<br /><strong>使用本站 WEB
 * 服务请注明或链接本站：http://www.webxml.com.cn/ 感谢大家的支�?</strong>�?<br /><br />&nbsp;
 */
    public java.lang.String getqqOnlineWebServiceSoapAddress();

    public qq.QqOnlineWebServiceSoap getqqOnlineWebServiceSoap() throws javax.xml.rpc.ServiceException;

    public qq.QqOnlineWebServiceSoap getqqOnlineWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
