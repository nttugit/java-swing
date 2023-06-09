package lesson_81_mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import lesson_81_mvc.view.CounterView;

public class CounterListener implements ActionListener {

	private CounterView counterView;

	public CounterListener(CounterView ctv) {
		this.counterView = ctv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String src = e.getActionCommand();
		if (src.equals("UP")) {
			this.counterView.increase();
		} else if (src.equals("DOWN")) {
			this.counterView.decrease();
		} else if (src.equals("RESET")) {
			this.counterView.reset();
		}
	}

}
