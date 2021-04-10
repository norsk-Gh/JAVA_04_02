package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class GUI_Ex_01 {

	private JFrame frmGuiexercise;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JLabel lbl_inform;
	private JButton btnClear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Ex_01 window = new GUI_Ex_01();
					window.frmGuiexercise.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_Ex_01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGuiexercise = new JFrame();
		frmGuiexercise.setTitle("GUI_Exercise_01");
		frmGuiexercise.setBounds(100, 100, 450, 300);
		frmGuiexercise.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGuiexercise.getContentPane().setLayout(null);
		frmGuiexercise.getContentPane().add(getBtn1());
		frmGuiexercise.getContentPane().add(getBtn2());
		frmGuiexercise.getContentPane().add(getBtn3());
		frmGuiexercise.getContentPane().add(getLbl_inform());
		frmGuiexercise.getContentPane().add(getBtnClear());
	}

	private JButton getBtn1() {
		if (btn1 == null) {
			btn1 = new JButton("1번");
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					JOptionPane.showMessageDialog(null, "1번을 눌렀습니다!");
					lbl_inform.setText("1번을 눌렀습니다!");
					
				}
			});
			btn1.setBounds(37, 218, 117, 29);
		}
		return btn1;
	}
	private JButton getBtn2() {
		if (btn2 == null) {
			btn2 = new JButton("2번");
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					JOptionPane.showMessageDialog(null, "2번을 눌렀습니다!");
					lbl_inform.setText("2번을 눌렀습니다!");
					
					
				}
			});
			btn2.setBounds(166, 218, 117, 29);
		}
		return btn2;
	}
	private JButton getBtn3() {
		if (btn3 == null) {
			btn3 = new JButton("3번");
			btn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					JOptionPane.showMessageDialog(null, "3번을 눌렀습니다!");
					lbl_inform.setText("3번을 눌렀습니다!");
					
					
				}
			});
			btn3.setBounds(287, 218, 117, 29);
		}
		return btn3;
	}
	private JLabel getLbl_inform() {
		if (lbl_inform == null) {
			lbl_inform = new JLabel("숫자를 클릭해주세요");
			lbl_inform.setBounds(37, 48, 127, 16);
		}
		return lbl_inform;
	}
	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton("Clear");
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					lbl_inform.setText("숫자를 클릭해주세요");
					
				}
			});
			btnClear.setBounds(166, 148, 117, 29);
		}
		return btnClear;
	}
}
