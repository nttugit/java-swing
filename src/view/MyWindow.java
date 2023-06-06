package view;

import javax.swing.JFrame;

public class MyWindow extends JFrame {
	public MyWindow() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void showWindow(String title) {
		this.setTitle(title);
		this.setVisible(true);
	}

	public void showWindow(String title, int width, int height) {
		this.setTitle(title);
		this.setSize(width, height);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		MyWindow m1 = new MyWindow();
		m1.showWindow("My window 1", 600, 400);

		MyWindow m2 = new MyWindow();
		m2.showWindow("My window 2", 600, 400);
	}
}
