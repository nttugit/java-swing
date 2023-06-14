package lesson_88_draw;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JPanelDraw extends JPanel {
	public JPanelDraw() {
		this.setBackground(Color.WHITE);
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.drawLine(10, 10, 100, 100);

		g.setColor(Color.BLUE);
		g.drawRect(200, 200, 100, 100);
		g.setColor(Color.YELLOW);
		g.fillRect(225, 225, 50, 50);

		g.setColor(Color.GREEN);
		g.drawString("NGUYEN TUAN TU", 100, 100);
	}
}
