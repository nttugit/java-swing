package lesson_89_menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;

public class MenuController implements ActionListener {
	private MyMenuView myMenuView;

	public MenuController(MyMenuView myMenuView) {
		this.myMenuView = myMenuView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		if (button.equals("Exit")) {
//			this.myMenuView.setTextJLabel("Ban da click JMenuItem EXIT");
			System.exit(0);
		} else if (button.equals("Toolbar")) {
			// Ép kiểu đối tượng thành button
			AbstractButton checkBox = (AbstractButton) e.getSource();
			if (checkBox.getModel().isSelected()) {
				this.myMenuView.enableToolbar();
//				this.myMenuView.refreshUI();
				this.myMenuView.repaint();

			} else {
				this.myMenuView.disableToolbar();
//				this.myMenuView.refreshUI();
				this.myMenuView.repaint();
			}
		} else {
			this.myMenuView.setTextJLabel("Ban da click: " + button);
		}
	}

}
