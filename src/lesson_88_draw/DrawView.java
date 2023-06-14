package lesson_88_draw;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawView extends JFrame {
	public DrawView() {
		this.init();
	}

	private void init() {
		this.setTitle("My Paint");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());

		JPanel jPanelDraw = new JPanelDraw();

		this.add(jPanelDraw, BorderLayout.CENTER);

		this.setVisible(true);
	}
}
