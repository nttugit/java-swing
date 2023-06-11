package lesson_82_font_customization.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import lesson_82_font_customization.view.LastButtonView;

// Điều khiển sự thay đổi của giao diện -> goi ham cua view -> view goi ham cua model
public class LastButtonListener implements ActionListener {
	private LastButtonView lastButtonView;

	public LastButtonListener(LastButtonView lastButtonView) {
		this.lastButtonView = lastButtonView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		int value = Integer.parseInt(src);
		this.lastButtonView.updateContent(value);
//		switch (src) {
//		case "1":
//		case "2":
//		case "3":
//		case "4":
//		}
		System.out.println(src);
	}

}
