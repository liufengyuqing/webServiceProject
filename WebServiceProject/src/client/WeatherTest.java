package client;

import java.rmi.RemoteException;

import weather.WeatherWSSoapProxy;

public class WeatherTest {
	public static void main(String[] args) throws RemoteException {
		WeatherWSSoapProxy weather = new WeatherWSSoapProxy();
		String[] str = weather.getWeather("±±¾©", "");
		for(int i = 0; i < str.length; i++){
			System.out.println(str[i]);
		}
		
		
	}

}
