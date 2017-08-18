/**
 * EnglishChinese.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package translate;

public interface EnglishChinese extends javax.xml.rpc.Service {

/**
 * <a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a>
 * <strong>中文&lt;-&gt;英文双向翻译WEB服务，永久免�?</strong>。提供词典翻译�?�音标（拼音）�?�解释�?�相关词条�?�例句�?�读音（英文Only）�?��?��?�词等功能�??</br>传�?�中文参数请使用UTF-8编码，使用本站WEB服务请注明或链接本站：http://www.webxml.com.cn/
 * 感谢大家的支持！<br /><br /><img alt="Ject.cn" title="www.Ject.cn" src="http://www.ject.cn/images/ject_logo_1616.gif"
 * style="vertical-align: middle;" /> <a href="http://www.ject.cn/" target="_blank">中英文双向翻译网�?
 * <img alt="Zip" title="Zip file" src="http://www.ject.cn/images/icon/zip.gif"
 * style="vertical-align: middle;" /> .Net实例下载</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img
 * alt="PDF" title="PDF file" src="http://www.ject.cn/images/icon/pdf.gif"
 * style="vertical-align: middle;" /> <a href="http://fy.webxml.com.cn/files/TranslatorWebServiceHelp.pdf"
 * target="_blank">接口�?发帮助文�?</a><br /><br />&nbsp;
 */
    public java.lang.String getEnglishChineseSoapAddress();

    public translate.EnglishChineseSoap getEnglishChineseSoap() throws javax.xml.rpc.ServiceException;

    public translate.EnglishChineseSoap getEnglishChineseSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
