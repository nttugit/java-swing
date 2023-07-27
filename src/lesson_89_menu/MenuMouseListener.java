package lesson_89_menu;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MenuMouseListener implements MouseListener {
	private MyMenuView myMenuView;

	public MenuMouseListener(MyMenuView myMenuView) {
		this.myMenuView = myMenuView;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
//		System.out.println("click");

	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.isPopupTrigger()) {
			System.out.println("Mouse pressed");
			this.myMenuView.showRightMousePopup(e.getComponent(), e.getX(), e.getY());
		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (e.isPopupTrigger()) {
			System.out.println("Mouse released");
			this.myMenuView.showRightMousePopup(e.getComponent(), e.getX(), e.getY());
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}


}
