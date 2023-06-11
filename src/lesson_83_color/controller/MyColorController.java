package lesson_83_color.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import lesson_83_color.view.MyColorView;

public class MyColorController implements ActionListener {
	private MyColorView myColorView;

	public MyColorController(MyColorView myColorView) {
		this.myColorView = myColorView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		switch (src) {
		case "Red text":
			this.myColorView.changeTextColor(Color.RED);
			break;
		case "Yellow text":
			this.myColorView.changeTextColor(Color.YELLOW);
			break;
		case "Green text":
			this.myColorView.changeTextColor(Color.GREEN);
			break;
		case "Red background":
			this.myColorView.changeBackgroundColor(Color.RED);
			break;
		case "Yellow background":
			this.myColorView.changeBackgroundColor(Color.YELLOW);
			break;
		case "Green background":
			this.myColorView.changeBackgroundColor(Color.GREEN);
			break;
		default:
			break;
		}


	}

}
