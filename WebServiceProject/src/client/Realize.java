package client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import phone.MobileCodeWSSoapProxy;
import qq.QqOnlineWebServiceSoapProxy;
import translate.EnglishChineseSoapProxy;
import weather.WeatherWSSoapProxy;

public class Realize implements ActionListener, Runnable {
	WebServiceJFrame layout = new WebServiceJFrame();
	Thread thread;
	int mode;

	public Realize() {
		// TODO Auto-generated constructor stub
		thread = new Thread(this);
		thread.start();
		layout.setVisible(true);

		layout.exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource() == layout.exit) {
					System.exit(0);
				}

			}
		});

		layout.descritionItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String text0 = "             Maker: ��־ΰ\n";
				String text1 = "             Vision: 1.0\n";
				String text = text0 + text1;
				if (e.getSource() == layout.descritionItem) {
					showMessage(text);
				}

			}
		});

		layout.useItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String text0 = " 1�����ȵ���˵���ѡ����Ӧ�Ĳ�ѯ����\n";
				String text1 = " 2����ѡ���ѯQQ״̬������QQ���ˣ������ѯ\n";
				String text2 = " 3����ѡ���ѯ�ֻ��Ź����أ������ֻ��ţ������ѯ\n";
				String text3 = " 4����ѡ��������ѯ��������Ӧ�ĳ��У������ѯ\n";
				String text4 = " 5��ѡ����Ӣ���룬������Ӧ���ʣ����ģ������ѯ\n";
				String text = text0 + text1 + text2 + text3 + text4;
				if (e.getSource() == layout.useItem) {
					showMessage(text);
				}

			}
		});

		layout.qqItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource() == layout.qqItem) {
					mode = 1;
				}

			}
		});
		layout.phoneItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource() == layout.phoneItem) {
					mode = 2;
				}

			}
		});
		layout.weatherItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource() == layout.weatherItem) {
					mode = 3;
				}

			}
		});
		layout.transItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource() == layout.transItem) {
					mode = 4;
				}

			}
		});
		
		layout.button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()==layout.button){
					if(mode==1){
						qqSearch();
					}
					else if(mode == 2){
						phoneSearch();
					}else if (mode == 3){
						weatherSearch();
					}else if(mode == 4){
						transSearch();
					}
				}
				
			}
		});
		
		layout.inputText.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()==layout.inputText){
					String str = layout.inputText.getText();
					System.out.println(str);
					
				}
				
			}
		});

	}

	protected void transSearch() {
		// TODO Auto-generated method stub
		String str = layout.inputText.getText();
		EnglishChineseSoapProxy trans = new EnglishChineseSoapProxy();
		try {
			String[] strs = trans.translatorString(str);
			String string = "";
			for(int i = 0; i <strs.length; i++){
				 string+=strs[i].toString();
				System.out.println(strs[i]);
			}
			layout.outputText.setText(string);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	protected void weatherSearch() {
		// TODO Auto-generated method stub
		String str = layout.inputText.getText();
		String string = "";
		WeatherWSSoapProxy weather = new WeatherWSSoapProxy();
		try {
			String[] strs = weather.getWeather(str, "");
			for(int i = 0;i <strs.length;i++){
				 string+=strs[i]+"\n";
				System.out.println(strs[i]);
			}
			layout.outputText.setText(string);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	protected void phoneSearch() {
		// TODO Auto-generated method stub
		String str = layout.inputText.getText();
		String strs [];
		String string = "";
		MobileCodeWSSoapProxy phone = new MobileCodeWSSoapProxy();
		try {
			String str1 = phone.getMobileCodeInfo(str, "");
			if(str1.equals("û�д˺����¼")){
				layout.outputText.setText(str1);
			}else{
				strs = str1.split(" ");
			/*	for(int i = 0; i <strs.length;i++){
					System.out.println(strs[i]);
				}*/
				string = strs[0]+"\n"+"���У�"+strs[1]+"\n"+"�ײ����ͣ�"+strs[2]+"\n";
				layout.outputText.setText(string);
			}
			System.out.println(str1);
		} catch (RemoteException e) {
			e.printStackTrace();
		} 
	}
	
	protected void qqSearch() {
		// TODO Auto-generated method stub
		String str = layout.inputText.getText();
		QqOnlineWebServiceSoapProxy ww = new QqOnlineWebServiceSoapProxy();
		String str1 = null;
		try {
			str1 = ww.qqCheckOnline(str);
			if(str1.equals("Y")){
				layout.outputText.setText("���QQ������״̬��");
			}else if(str1.equals("N")){
				layout.outputText.setText("���QQ������״̬��");
			}else if(str1.equals("E")){
				layout.outputText.setText("������QQ��������");
			}else if(str1.equals("A")){
				layout.outputText.setText("��ҵ�û���֤ʧ�ܣ�");
			}else if(str1.equals("V")){
				layout.outputText.setText("����û�����������");
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		System.out.println(str1);

	}

	/*
	 * ��ʾ��Ϣ
	 */

	public void showMessage(String text) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, text);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
