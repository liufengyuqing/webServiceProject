/**
 * EnglishChineseSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package translate;

public interface EnglishChineseSoap extends java.rmi.Remote {

    /**
     * <br /><h3>中英文双向翻�? DataSet</h3><p>输入参数：wordKey = 单词�? 返回数据：DataSet。（包括全部数据三个DataTable�?</p><br
     * />
     */
    public translate.TranslatorResponseTranslatorResult translator(java.lang.String wordKey) throws java.rmi.RemoteException;

    /**
     * <br /><h3>中英文双向翻译（基本）String()</h3><p>输入参数：wordKey = 单词�? 返回数据：一维字符串数组
     * String[]�?</p><br />
     */
    public java.lang.String[] translatorString(java.lang.String wordKey) throws java.rmi.RemoteException;

    /**
     * <br /><h3>中英文双向翻译（相关词条）String()</h3><p>输入参数：wordKey = 单词�? 返回数据：一维字符串数组
     * String[]�?</p><br />
     */
    public java.lang.String[] translatorReferString(java.lang.String wordKey) throws java.rmi.RemoteException;

    /**
     * <br /><h3>中英文双向翻译（例句）String()</h3><p>输入参数：wordKey = 单词�? 返回数据：一维字符串数组
     * String[]�?</p><br />
     */
    public java.lang.String[] translatorSentenceString(java.lang.String wordKey) throws java.rmi.RemoteException;

    /**
     * <br /><h3>获得候�?�词</h3><p>输入参数：wordKey = 单词�? 返回数据：一维字符串数组 String[]�?</p><br
     * />
     */
    public java.lang.String[] suggestWord(java.lang.String wordKey) throws java.rmi.RemoteException;

    /**
     * <br /><h3>获得朗读MP3字节�?</h3><p>输入参数：Mp3 = Mp3名称�? 返回数据：字节数�? Byte[]�?</p><br
     * />
     */
    public byte[] getMp3(java.lang.String mp3) throws java.rmi.RemoteException;
}
