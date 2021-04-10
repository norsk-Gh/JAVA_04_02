package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI00 {

	private JFrame frmButtonTest;
	private JButton btnNewButton;
	private JLabel lblTest;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI00 window = new GUI00();
					window.frmButtonTest.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI00() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmButtonTest = new JFrame();
		frmButtonTest.setTitle("Button Test");
		frmButtonTest.setBounds(100, 100, 450, 300);
		frmButtonTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmButtonTest.getContentPane().setLayout(null);
		frmButtonTest.getContentPane().add(getBtnNewButton());
		frmButtonTest.getContentPane().add(getLblTest());
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("OK");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {  // 의미가.. 클릭했을떄 뭐할래?
					JOptionPane.showMessageDialog(null, "OK 버튼을 눌렀습니다.");
					lblTest.setText("Button을 click 했습니다.");
					
				}
			});
			btnNewButton.setBackground(Color.RED);
			btnNewButton.setBounds(159, 139, 117, 29);
		}
		return btnNewButton;
	}
	private JLabel getLblTest() {
		if (lblTest == null) {
			lblTest = new JLabel("Java Swing Button Test");
			lblTest.setBounds(26, 22, 155, 16);
		}
		return lblTest;
	}
}
