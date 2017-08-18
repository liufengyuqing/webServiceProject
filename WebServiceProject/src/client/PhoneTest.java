package client;

import java.rmi.RemoteException;

import phone.MobileCodeWSSoapProxy;

public class PhoneTest {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
	MobileCodeWSSoapProxy phone = new MobileCodeWSSoapProxy();
	String str = phone.getMobileCodeInfo("13590623304", ""); 
	String str1 = phone.getMobileCodeInfo("18392533494", ""); 
	System.out.println(str);
	System.out.println(str1);

	}

}
