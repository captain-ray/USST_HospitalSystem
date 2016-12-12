package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin_2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton button;
	private JButton btnNewButton;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JButton button_1;
	private JButton button_2;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JButton button_3;
	private JButton button_4;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JButton button_5;
	private JButton button_6;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JButton button_7;
	private JButton button_8;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JButton button_9;
	private JButton button_10;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JButton button_11;
	private JButton button_12;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JButton button_13;
	private JButton button_14;
	private JButton button_15;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_2 window = new Admin_2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Admin_2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel label = new JLabel("\u8D26\u53F7");
		label.setBounds(38, 10, 54, 15);
		panel.add(label);
		
		JLabel label_1 = new JLabel("\u5BC6\u7801");
		label_1.setBounds(124, 10, 54, 15);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("\u59D3\u540D");
		label_2.setBounds(199, 10, 54, 15);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("\u5DE5\u53F7");
		label_3.setBounds(286, 10, 54, 15);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("\u79D1\u5BA4");
		label_4.setBounds(367, 10, 54, 15);
		panel.add(label_4);
		
		textField = new JTextField();
		textField.setBounds(26, 35, 66, 21);
		panel.add(textField);
		textField.setColumns(10); 
		
		textField_1 = new JTextField();
		textField_1.setBounds(103, 35, 66, 21);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(187, 35, 66, 21);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(270, 35, 70, 21);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(355, 35, 66, 21);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		button = new JButton("\u4FEE\u6539");
		button.setBounds(431, 34, 66, 23);
		panel.add(button);
		
		btnNewButton = new JButton("ɾ��");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(508, 34, 66, 23);
		panel.add(btnNewButton);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(26, 67, 66, 21);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(103, 67, 66, 21);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(187, 67, 66, 21);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(270, 67, 70, 21);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(355, 67, 66, 21);
		panel.add(textField_9);
		
		button_1 = new JButton("\u4FEE\u6539");
		button_1.setBounds(431, 66, 66, 23);
		panel.add(button_1);
		
		button_2 = new JButton("\u5220\u9664");
		button_2.setBounds(508, 66, 66, 23);
		panel.add(button_2);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(26, 99, 66, 21);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(103, 99, 66, 21);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(187, 99, 66, 21);
		panel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(270, 99, 70, 21);
		panel.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(355, 99, 66, 21);
		panel.add(textField_14);
		
		button_3 = new JButton("\u4FEE\u6539");
		button_3.setBounds(431, 98, 66, 23);
		panel.add(button_3);
		
		button_4 = new JButton("\u5220\u9664");
		button_4.setBounds(508, 98, 66, 23);
		panel.add(button_4);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(26, 131, 66, 21);
		panel.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(103, 131, 66, 21);
		panel.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(187, 131, 66, 21);
		panel.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(270, 131, 70, 21);
		panel.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(355, 131, 66, 21);
		panel.add(textField_19);
		
		button_5 = new JButton("\u4FEE\u6539");
		button_5.setBounds(431, 130, 66, 23);
		panel.add(button_5);
		
		button_6 = new JButton("\u5220\u9664");
		button_6.setBounds(508, 130, 66, 23);
		panel.add(button_6);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(26, 163, 66, 21);
		panel.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(103, 163, 66, 21);
		panel.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(187, 163, 66, 21);
		panel.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(270, 163, 70, 21);
		panel.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(355, 163, 66, 21);
		panel.add(textField_24);
		
		button_7 = new JButton("\u4FEE\u6539");
		button_7.setBounds(431, 162, 66, 23);
		panel.add(button_7);
		
		button_8 = new JButton("\u5220\u9664");
		button_8.setBounds(508, 162, 66, 23);
		panel.add(button_8);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(26, 195, 66, 21);
		panel.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(103, 195, 66, 21);
		panel.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(187, 195, 66, 21);
		panel.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(270, 195, 70, 21);
		panel.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(355, 195, 66, 21);
		panel.add(textField_29);
		
		button_9 = new JButton("\u4FEE\u6539");
		button_9.setBounds(431, 194, 66, 23);
		panel.add(button_9);
		
		button_10 = new JButton("\u5220\u9664");
		button_10.setBounds(508, 194, 66, 23);
		panel.add(button_10);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(26, 227, 66, 21);
		panel.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(103, 227, 66, 21);
		panel.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(187, 227, 66, 21);
		panel.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(270, 227, 70, 21);
		panel.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(355, 227, 66, 21);
		panel.add(textField_34);
		
		button_11 = new JButton("\u4FEE\u6539");
		button_11.setBounds(431, 226, 66, 23);
		panel.add(button_11);
		
		button_12 = new JButton("\u5220\u9664");
		button_12.setBounds(508, 226, 66, 23);
		panel.add(button_12);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(26, 259, 66, 21);
		panel.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(103, 259, 66, 21);
		panel.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(187, 259, 66, 21);
		panel.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(270, 259, 70, 21);
		panel.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(355, 259, 66, 21);
		panel.add(textField_39);
		
		button_13 = new JButton("\u4FEE\u6539");
		button_13.setBounds(431, 258, 66, 23);
		panel.add(button_13);
		
		button_14 = new JButton("\u5220\u9664");
		button_14.setBounds(508, 258, 66, 23);
		panel.add(button_14);
		
		button_15 = new JButton("\u6DFB\u52A0");
		button_15.setBounds(463, 347, 93, 23);
		panel.add(button_15);
	}
}
