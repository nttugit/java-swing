package lesson_89_menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuController implements ActionListener {
	private MyMenuView myMenuView;

	public MenuController(MyMenuView myMenuView) {
		this.myMenuView = myMenuView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		if (button.equals("Open")) {
			this.myMenuView.setTextJLabel("Ban da click JMenuItem OPEN");
		} else if (button.equals("Exit")) {
//			this.myMenuView.setTextJLabel("Ban da click JMenuItem EXIT");
			System.exit(0);
		} else if (button.equals("Welcome")) {
			this.myMenuView.setTextJLabel("Ban da click JMenuItem WELCOME");
		}
	}

}
