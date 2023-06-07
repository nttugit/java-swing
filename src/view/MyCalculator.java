package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class MyCalculator extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyCalculator() {
		this.setTitle("My Calculator");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		JTextField jTextField = new JTextField(50);
		JPanel jPanel_head = new JPanel();
		jPanel_head.setLayout(new BorderLayout());
		jPanel_head.add(jTextField, BorderLayout.CENTER);

		JButton jbtn_0 = new JButton("0");
		JButton jbtn_1 = new JButton("1");
		JButton jbtn_2 = new JButton("2");
		JButton jbtn_3 = new JButton("3");
		JButton jbtn_4 = new JButton("4");
		JButton jbtn_5 = new JButton("5");
		JButton jbtn_6 = new JButton("6");
		JButton jbtn_7 = new JButton("7");
		JButton jbtn_8 = new JButton("8");
		JButton jbtn_9 = new JButton("9");
		JButton jbtn_addition = new JButton("+");
		JButton jbtn_substraction = new JButton("-");
		JButton jbtn_multiplication = new JButton("x");
		JButton jbtn_division = new JButton("/");
		JButton jbtn_equal = new JButton("=");

		JPanel jPanel_buttons = new JPanel();
		jPanel_buttons.setLayout(new GridLayout(5, 3, 7, 7));
		jPanel_buttons.add(jbtn_0);
		jPanel_buttons.add(jbtn_1);
		jPanel_buttons.add(jbtn_2);
		jPanel_buttons.add(jbtn_3);
		jPanel_buttons.add(jbtn_4);
		jPanel_buttons.add(jbtn_5);
		jPanel_buttons.add(jbtn_6);
		jPanel_buttons.add(jbtn_7);
		jPanel_buttons.add(jbtn_8);
		jPanel_buttons.add(jbtn_9);
		jPanel_buttons.add(jbtn_addition);
		jPanel_buttons.add(jbtn_substraction);
		jPanel_buttons.add(jbtn_multiplication);
		jPanel_buttons.add(jbtn_division);
		jPanel_buttons.add(jbtn_equal);

		this.setLayout(new BorderLayout());
		this.add(jPanel_head, BorderLayout.NORTH);
		this.add(jPanel_buttons, BorderLayout.CENTER);

		this.setVisible(true);
	}

	public static void main(String[] args) {
		try {
//			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

			new MyCalculator();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
