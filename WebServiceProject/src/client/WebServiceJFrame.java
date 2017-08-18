package client;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class WebServiceJFrame extends JFrame {

	/**
	 * �������
	 */
	private static final long serialVersionUID = 1L;
	 JPanel contentPane;
	 JTextField inputText;
	 JTextArea outputText;
	 JMenuBar menuBar;
	 JMenu menu;
	 JMenu menuAbout;
	 JMenu menuHelp;
	 JRadioButtonMenuItem qqItem;
	 JRadioButtonMenuItem phoneItem;
	 JRadioButtonMenuItem weatherItem;
	 JRadioButtonMenuItem transItem;
	 JMenuItem descritionItem;
	 JMenuItem useItem;
	 JButton button ;
	 JMenuItem exit;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { WebServiceJFrame frame = new
	 * WebServiceJFrame(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */

	/**
	 * Create the frame.
	 */
	public WebServiceJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 480);
		setTitle("Web�����ѯ");
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		menu = new JMenu("�˵�");
		menuBar.add(menu);

		qqItem = new JRadioButtonMenuItem("QQ״̬��ѯ");
		qqItem.setSelected(true);
		menu.add(qqItem);

		phoneItem = new JRadioButtonMenuItem("�ֻ���������ز�ѯ");
		menu.add(phoneItem);

		weatherItem = new JRadioButtonMenuItem("������ѯ");
		menu.add(weatherItem);

		transItem = new JRadioButtonMenuItem("��Ӣ����");
		menu.add(transItem);

		ButtonGroup bg = new ButtonGroup();
		bg.add(qqItem);
		bg.add(phoneItem);
		bg.add(weatherItem);
		bg.add(transItem);

		exit = new JMenuItem("�˳�");
		menu.add(exit);

		menuAbout = new JMenu("����");
		menuBar.add(menuAbout);

		descritionItem = new JMenuItem("���˵��");
		menuAbout.add(descritionItem);

		menuHelp = new JMenu("����");
		menuBar.add(menuHelp);

		useItem = new JMenuItem("ʹ��˵��");
		menuHelp.add(useItem);

		contentPane = new JPanel();// ҳ�滭��
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("\u8BF7\u8F93\u5165\uFF1A");
		label.setBounds(35, 21, 54, 15);
		contentPane.add(label);

		inputText = new JTextField();
		inputText.setBounds(86, 18, 341, 21);
		contentPane.add(inputText);
		inputText.setColumns(10);

		button = new JButton("\u67E5\u8BE2");
		button.setBounds(437, 17, 93, 23);
		contentPane.add(button);

		outputText = new JTextArea();
		outputText.setWrapStyleWord(true);
		outputText.setLineWrap(true);
		
		outputText.setBounds(35, 68, 495, 321);
		contentPane.add(outputText);
	}
}
