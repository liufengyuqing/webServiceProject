package client;

import java.rmi.RemoteException;

import translate.EnglishChineseSoapProxy;

public class TranslateTest {
	public static void main(String[] args) throws RemoteException {
		EnglishChineseSoapProxy trans = new EnglishChineseSoapProxy();
		String[] str = trans.translatorString("hello");
		for(int i = 0; i < str.length;i++){
			System.out.println(str[i]);
		}
	}

}
