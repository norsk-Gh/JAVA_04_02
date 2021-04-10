package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class GUI_Pr {

	private JFrame frame;
	private JLabel lbl_Main;
	private JTextField tf_Num1;
	private JTextField tf_Num2;
	private JTextField tf_Result;
	private JLabel lbl_Plus;
	private JLabel lbl_Equal;
	private JButton bt_Add;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Pr window = new GUI_Pr();
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
	public GUI_Pr() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLbl_Main());
		frame.getContentPane().add(getTf_Num1());
		frame.getContentPane().add(getTf_Num2());
		frame.getContentPane().add(getTf_Result());
		frame.getContentPane().add(getLbl_Plus());
		frame.getContentPane().add(getLbl_Equal());
		frame.getContentPane().add(getBt_Add());
	}
	private JLabel getLbl_Main() {
		if (lbl_Main == null) {
			lbl_Main = new JLabel("Mini Calc");
			lbl_Main.setBounds(27, 45, 61, 16);
		}
		return lbl_Main;
	}
	private JTextField getTf_Num1() {
		if (tf_Num1 == null) {
			tf_Num1 = new JTextField();
			tf_Num1.setHorizontalAlignment(SwingConstants.TRAILING);
			tf_Num1.setBounds(27, 107, 87, 26);
			tf_Num1.setColumns(10);
		}
		return tf_Num1;
	}
	private JTextField getTf_Num2() {
		if (tf_Num2 == null) {
			tf_Num2 = new JTextField();
			tf_Num2.setHorizontalAlignment(SwingConstants.TRAILING);
			tf_Num2.setColumns(10);
			tf_Num2.setBounds(151, 107, 87, 26);
		}
		return tf_Num2;
	}
	private JTextField getTf_Result() {
		if (tf_Result == null) {
			tf_Result = new JTextField();
			tf_Result.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			tf_Result.setEditable(false);
			tf_Result.setHorizontalAlignment(SwingConstants.TRAILING);
			tf_Result.setColumns(10);
			tf_Result.setBounds(291, 107, 87, 26);
		}
		return tf_Result;
	}
	private JLabel getLbl_Plus() {
		if (lbl_Plus == null) {
			lbl_Plus = new JLabel("+");
			lbl_Plus.setBounds(127, 112, 61, 16);
		}
		return lbl_Plus;
	}
	private JLabel getLbl_Equal() {
		if (lbl_Equal == null) {
			lbl_Equal = new JLabel("=");
			lbl_Equal.setBounds(257, 112, 61, 16);
		}
		return lbl_Equal;
	}
	private JButton getBt_Add() {
		if (bt_Add == null) {
			bt_Add = new JButton("Add");
			bt_Add.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					try {
						int insertNum1 = Integer.parseInt(tf_Num1.getText());
						int insertNum2 = Integer.parseInt(tf_Num2.getText());
						int sum = insertNum1 + insertNum2;
						
						tf_Result.setText(Integer.toString(sum));
					}catch(Exception exception) {
						JOptionPane.showMessageDialog(null, "잘못입력하셨습니다");
					}
					
				}
			});
			bt_Add.setBounds(151, 160, 117, 29);
		}
		return bt_Add;
	}
}
