package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI01 {

	private JFrame frame;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JTextField tfResult;
	private JButton btnAdd;
	private JTextPane textPane;
	private JTextPane textPane_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI01 window = new GUI01();
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
	public GUI01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("더하기");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getTfNum1());
		frame.getContentPane().add(getTfNum2());
		frame.getContentPane().add(getTfResult());
		frame.getContentPane().add(getBtnAdd());
		frame.getContentPane().add(getTextPane());
		frame.getContentPane().add(getTextPane_1());
	}
	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			tfNum1.setBounds(46, 57, 60, 26);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setColumns(10);
			tfNum2.setBounds(138, 57, 60, 26);
		}
		return tfNum2;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setEditable(false);
			tfResult.setColumns(10);
			tfResult.setBounds(246, 57, 60, 26);
		}
		return tfResult;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("Add");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					
					//1st
//					String stNum1 = tfNum1.getText();
//					String stNum2 = tfNum2.getText();
//					
//					
//					int wkNum1 =  Integer.parseInt(stNum1);
//					int wkNum2 =  Integer.parseInt(stNum2);
//					int wkResult =  wkNum1 + wkNum2;
//					
//					
//					String stResult = Integer.toString(wkResult);
//					tfResult.setText(stResult);
//					
					
					
					//2nd
//					int wkNum1 = Integer.parseInt(tfNum1.getText());
//					int wkNum2 = Integer.parseInt(tfNum2.getText());
//					int wkResult = wkNum1 + wkNum2;
//					
//					tfResult.setText(Integer.toString(wkResult));
//					
					
					addSum();   //<-- 나중에 이거만쓰면 작동되게 메소드 만들어서 하는게 오류 안걸림.... 
					
					
					
					
					
				}
			});
			btnAdd.setBounds(327, 56, 83, 29);
		}
		return btnAdd;
	}
	private void addSum() {    // 이런 식으로 메소드 만들어서 쓰는게 좋다! 
		
		int wkNum1 = Integer.parseInt(tfNum1.getText());
		int wkNum2 = Integer.parseInt(tfNum2.getText());
		int wkResult = wkNum1 + wkNum2;
		
		tfResult.setText(Integer.toString(wkResult));
		JOptionPane.showMessageDialog(frame, Integer.toString(wkResult));
		
	}
	
	
	
	
	
	private JTextPane getTextPane() {
		if (textPane == null) {
			textPane = new JTextPane();
			textPane.setBackground(UIManager.getColor("Button.background"));
			textPane.setText("+");
			textPane.setBounds(118, 62, 22, 16);
		}
		return textPane;
	}
	private JTextPane getTextPane_1() {
		if (textPane_1 == null) {
			textPane_1 = new JTextPane();
			textPane_1.setText("=");
			textPane_1.setBackground(SystemColor.window);
			textPane_1.setBounds(212, 62, 22, 16);
		}
		return textPane_1;
	}
}
