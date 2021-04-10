package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class GUI_Ex {

	private JFrame frame;
	private JTextPane txt1;
	private JTextField tfNum1;
	private JButton btPlus;
	private JButton btSub;
	private JButton btMulti;
	private JButton btDiv;
	private JTextField tfNum2;
	private JTextPane txt1_1;
	private JTextField tfNum1Re;
	private JTextField tfNum2Re;
	private JTextField tfResult;
	private JTextPane actionNum;
	private JTextPane txt1_1_1_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Ex window = new GUI_Ex();
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
	public GUI_Ex() {
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
		frame.getContentPane().add(getTxt1());
		frame.getContentPane().add(getTfNum1());
		frame.getContentPane().add(getBtPlus());
		frame.getContentPane().add(getBtSub());
		frame.getContentPane().add(getBtMulti());
		frame.getContentPane().add(getBtDiv());
		frame.getContentPane().add(getTfNum2());
		frame.getContentPane().add(getTxt1_1());
		frame.getContentPane().add(getTfNum1Re());
		frame.getContentPane().add(getTfNum2Re());
		frame.getContentPane().add(getTfResult());
		frame.getContentPane().add(getActionNum());
		frame.getContentPane().add(getTxt1_1_1_1());
	}

	private JTextPane getTxt1() {
		if (txt1 == null) {
			txt1 = new JTextPane();
			txt1.setEditable(false);
			txt1.setBackground(UIManager.getColor("Button.background"));
			txt1.setText("1 : ");
			txt1.setBounds(21, 41, 24, 16);
		}
		return txt1;
	}
	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tfNum1Re.setText(tfNum1.getText());
					
				}
			});
			tfNum1.setBounds(46, 36, 64, 26);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JButton getBtPlus() {
		if (btPlus == null) {
			btPlus = new JButton("+");
			btPlus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionNum.setText("+");
					
					int wkNum1 = Integer.parseInt(tfNum1.getText());
					int wkNum2 = Integer.parseInt(tfNum2.getText());
					int wkResult = wkNum1 + wkNum2;
					
					tfResult.setText(Integer.toString(wkResult));
					
				}
			});
			btPlus.setBounds(137, 35, 45, 29);
		}
		return btPlus;
	}
	private JButton getBtSub() {
		if (btSub == null) {
			btSub = new JButton("-");
			btSub.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionNum.setText("-");
					
					int wkNum1 = Integer.parseInt(tfNum1.getText());
					int wkNum2 = Integer.parseInt(tfNum2.getText());
					int wkResult = wkNum1 - wkNum2;
					
					tfResult.setText(Integer.toString(wkResult));
						
					
					
					
				}
			});
			btSub.setBounds(180, 35, 45, 29);
		}
		return btSub;
	}
	private JButton getBtMulti() {
		if (btMulti == null) {
			btMulti = new JButton("X");
			btMulti.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					actionNum.setText("X");
					
					int wkNum1 = Integer.parseInt(tfNum1.getText());
					int wkNum2 = Integer.parseInt(tfNum2.getText());
					int wkResult = wkNum1 * wkNum2;
					
					tfResult.setText(Integer.toString(wkResult));
					
					
				}
			});
			btMulti.setBounds(224, 35, 45, 29);
		}
		return btMulti;
	}
	private JButton getBtDiv() {
		if (btDiv == null) {
			btDiv = new JButton("%");
			btDiv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					actionNum.setText("%");
					
					int wkNum1 = Integer.parseInt(tfNum1.getText());
					int wkNum2 = Integer.parseInt(tfNum2.getText());
					int wkResult = wkNum1 / wkNum2;
					
					tfResult.setText(Integer.toString(wkResult));
					
				}
			});
			btDiv.setBounds(268, 35, 45, 29);
		}
		return btDiv;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tfNum2Re.setText(tfNum2.getText());
					
					
					
				}
			});
			tfNum2.setColumns(10);
			tfNum2.setBounds(46, 70, 64, 26);
		}
		return tfNum2;
	}
	private JTextPane getTxt1_1() {
		if (txt1_1 == null) {
			txt1_1 = new JTextPane();
			txt1_1.setText("2 : ");
			txt1_1.setEditable(false);
			txt1_1.setBackground(SystemColor.window);
			txt1_1.setBounds(21, 75, 24, 16);
		}
		return txt1_1;
	}
	private JTextField getTfNum1Re() {
		if (tfNum1Re == null) {
			tfNum1Re = new JTextField();
			tfNum1Re.setColumns(10);
			tfNum1Re.setBounds(46, 159, 64, 26);
		}
		return tfNum1Re;
	}
	private JTextField getTfNum2Re() {
		if (tfNum2Re == null) {
			tfNum2Re = new JTextField();
			tfNum2Re.setColumns(10);
			tfNum2Re.setBounds(149, 159, 64, 26);
		}
		return tfNum2Re;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setEditable(false);
			tfResult.setColumns(10);
			tfResult.setBounds(249, 159, 64, 26);
		}
		return tfResult;
	}
	private JTextPane getActionNum() {
		if (actionNum == null) {
			actionNum = new JTextPane();
			actionNum.setEditable(false);
			actionNum.setBackground(SystemColor.window);
			actionNum.setBounds(122, 164, 24, 16);
		}
		return actionNum;
	}
	private JTextPane getTxt1_1_1_1() {
		if (txt1_1_1_1 == null) {
			txt1_1_1_1 = new JTextPane();
			txt1_1_1_1.setText("=");
			txt1_1_1_1.setEditable(false);
			txt1_1_1_1.setBackground(SystemColor.window);
			txt1_1_1_1.setBounds(224, 164, 24, 16);
		}
		return txt1_1_1_1;
	}
}
