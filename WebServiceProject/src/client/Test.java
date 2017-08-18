package client;

import qq.QqOnlineWebServiceSoapProxy;

public class Test {
	 public static void main(String[] args) throws Exception{
		 QqOnlineWebServiceSoapProxy ww = new QqOnlineWebServiceSoapProxy();
		 String str = ww.qqCheckOnline("480225087");
		 System.out.println(str);
		 
	 }  

}
