package lesson_84_calculator.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import lesson_84_calculator.controller.MiniCalculatorListener;
import lesson_84_calculator.model.MiniCalculatorModel;

public class MiniCalculatorview extends JFrame {
	private MiniCalculatorModel miniCalculatorModel;
	private JTextField jTextField_firstValue;
	private JTextField jTextField_secondValue;
	private JTextField jTextField_answer;

	public MiniCalculatorview() {
		miniCalculatorModel = new MiniCalculatorModel();
		this.init();
	}

	private void init() {
		this.setTitle("Mini Calculator");
		this.setSize(800, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout(10, 10));

		JPanel jPanelIO = new JPanel();
		JPanel jPanelButtons = new JPanel();
		jPanelIO.setLayout(new GridLayout(3, 2, 10, 10));
		jPanelButtons.setLayout(new GridLayout(2, 3, 10, 10));

		Font mainFont = new Font("Arial", Font.BOLD, 30);

		JLabel jLabel_firstValue = new JLabel("First value");
		jLabel_firstValue.setFont(mainFont);
		JLabel jLabel_secondValue = new JLabel("Second value");
		jLabel_secondValue.setFont(mainFont);
		JLabel jLabel_answer = new JLabel("Answer");
		jLabel_answer.setFont(mainFont);

		jTextField_firstValue = new JTextField(50);
		jTextField_firstValue.setFont(mainFont);
		jTextField_secondValue = new JTextField(50);
		jTextField_secondValue.setFont(mainFont);
		jTextField_answer = new JTextField(50);
		jTextField_answer.setFont(mainFont);
		jTextField_answer.setEditable(false);

		jPanelIO.add(jLabel_firstValue);
		jPanelIO.add(jTextField_firstValue);
		jPanelIO.add(jLabel_secondValue);
		jPanelIO.add(jTextField_secondValue);
		jPanelIO.add(jLabel_answer);
		jPanelIO.add(jTextField_answer);

		// Action listener
		ActionListener miniCalculatorListener = new MiniCalculatorListener(this);
		JButton jButton_add = new JButton("+");
		jButton_add.setFont(mainFont);
		jButton_add.addActionListener(miniCalculatorListener);
		JButton jButton_substract = new JButton("-");
		jButton_substract.setFont(mainFont);
		jButton_substract.addActionListener(miniCalculatorListener);
		JButton jButton_mutiply = new JButton("*");
		jButton_mutiply.setFont(mainFont);
		jButton_mutiply.addActionListener(miniCalculatorListener);
		JButton jButton_divide = new JButton("/");
		jButton_divide.setFont(mainFont);
		jButton_divide.addActionListener(miniCalculatorListener);
		JButton jButton_mod = new JButton("%");
		jButton_mod.setFont(mainFont);
		jButton_mod.addActionListener(miniCalculatorListener);
		JButton jButton_pow = new JButton("^");
		jButton_pow.setFont(mainFont);
		jButton_pow.addActionListener(miniCalculatorListener);
//		JButton jButton_equal = new JButton("=");
//		jButton_equal.setFont(mainFont);
//		jButton_equal.addActionListener(miniCalculatorListener);

		jPanelButtons.add(jButton_add);
		jPanelButtons.add(jButton_substract);
		jPanelButtons.add(jButton_mutiply);
		jPanelButtons.add(jButton_divide);
		jPanelButtons.add(jButton_mod);
		jPanelButtons.add(jButton_pow);
//		jPanelButtons.add(jButton_equal);

		this.add(jPanelIO, BorderLayout.CENTER);
		this.add(jPanelButtons, BorderLayout.SOUTH);
//		this.add(jButton_equal, BorderLayout.SOUTH);

		this.setVisible(true);
	}

//	public boolean isNumberic(String strNum) {
//		if (strNum == null)
//			return false;
//		try {
//			double num = Double.parseDouble(strNum);
//		} catch (NumberFormatException e) {
//			return false;
//		}
//		return true;
//	}
//
//
//	public boolean isTwoValidNumbers() {
//		return this.isNumberic(this.jTextField_firstValue.getText())
//				&& this.isNumberic(this.jTextField_secondValue.getText());
//	}

	public void updateAnswer(String value) {
		this.jTextField_answer.setText(value);
	}
	
	public void add() {
		try {
			Double firstValue = Double.valueOf(this.jTextField_firstValue.getText());
			Double secondValue = Double.valueOf(this.jTextField_secondValue.getText());

			this.miniCalculatorModel.setFirstValue(firstValue);
			this.miniCalculatorModel.setSecondValue(secondValue);
			this.miniCalculatorModel.add();

			this.updateAnswer(this.miniCalculatorModel.getAnswer() + "");
		} catch (Exception e) {
//			e.printStackTrace();
//			this.miniCalculatorModel.setAnswer(null);
			this.updateAnswer("");
		}
	}

	public void substract() {
		try {
			Double firstValue = Double.valueOf(this.jTextField_firstValue.getText());
			Double secondValue = Double.valueOf(this.jTextField_secondValue.getText());
			this.miniCalculatorModel.setFirstValue(firstValue);
			this.miniCalculatorModel.setSecondValue(secondValue);
			this.miniCalculatorModel.substract();

			this.updateAnswer(this.miniCalculatorModel.getAnswer() + "");
		} catch (Exception e) {
			this.updateAnswer("");
		}
	}

	public void multiply() {
		try {
			Double firstValue = Double.valueOf(this.jTextField_firstValue.getText());
			Double secondValue = Double.valueOf(this.jTextField_secondValue.getText());

			this.miniCalculatorModel.setFirstValue(firstValue);
			this.miniCalculatorModel.setSecondValue(secondValue);
			this.miniCalculatorModel.multiply();

			this.updateAnswer(this.miniCalculatorModel.getAnswer() + "");
		} catch (Exception e) {
			this.updateAnswer("");
		}
	}

	public void divide() {
		try {
			Double firstValue = Double.valueOf(this.jTextField_firstValue.getText());
			Double secondValue = Double.valueOf(this.jTextField_secondValue.getText());

			this.miniCalculatorModel.setFirstValue(firstValue);
			this.miniCalculatorModel.setSecondValue(secondValue);
			this.miniCalculatorModel.divide();

			this.updateAnswer(this.miniCalculatorModel.getAnswer() + "");
		} catch (Exception e) {
			this.updateAnswer("");
		}
	}

	public void pow() {
		try {
			Double firstValue = Double.valueOf(this.jTextField_firstValue.getText());
			Double secondValue = Double.valueOf(this.jTextField_secondValue.getText());

			this.miniCalculatorModel.setFirstValue(firstValue);
			this.miniCalculatorModel.setSecondValue(secondValue);
			this.miniCalculatorModel.pow();

			this.updateAnswer(this.miniCalculatorModel.getAnswer() + "");
		} catch (Exception e) {
			this.updateAnswer("");
		}
	}

	public void mod() {
		try {
			Double firstValue = Double.valueOf(this.jTextField_firstValue.getText());
			Double secondValue = Double.valueOf(this.jTextField_secondValue.getText());

			this.miniCalculatorModel.setFirstValue(firstValue);
			this.miniCalculatorModel.setSecondValue(secondValue);
			this.miniCalculatorModel.mod();

			this.updateAnswer(this.miniCalculatorModel.getAnswer() + "");
		} catch (Exception e) {
			this.updateAnswer("");
		}
	}
}
