package lesson_87_mouse_event.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import lesson_87_mouse_event.view.MouseEventAppView;

public class MouseEventAppListener implements MouseListener, MouseMotionListener {
	private MouseEventAppView mouseEventAppView;

	public MouseEventAppListener(MouseEventAppView mouseEventAppView) {
		this.mouseEventAppView = mouseEventAppView;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		this.mouseEventAppView.click();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		this.mouseEventAppView.enter();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		this.mouseEventAppView.exit();

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		this.mouseEventAppView.updateCordinates(e.getX(), e.getY());
	}

//	@Override
//	public void mouseMoved(MouseEvent e) {
//		// TODO Auto-generated method stub
//
//	}

}
