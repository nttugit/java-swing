package lesson_84_calculator.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import lesson_84_calculator.view.MiniCalculatorview;

public class MiniCalculatorListener implements ActionListener {
	private MiniCalculatorview miniCalculatorview;

	public MiniCalculatorListener(MiniCalculatorview miniCalculatorview) {
		this.miniCalculatorview = miniCalculatorview;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String buttonStr = e.getActionCommand();
		switch (buttonStr) {
		case "+":
			this.miniCalculatorview.add();
			break;
		case "-":
			this.miniCalculatorview.substract();
			break;
		case "*":
			this.miniCalculatorview.multiply();
			break;
		case "/":
			this.miniCalculatorview.divide();
			break;
		case "^":
			this.miniCalculatorview.pow();
			break;
		case "%":
			this.miniCalculatorview.mod();
			break;
		}

	}

}
