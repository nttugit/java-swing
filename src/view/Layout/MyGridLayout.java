package view.Layout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyGridLayout extends JFrame {
	public MyGridLayout() {
		final int WIDTH = 200;
		final int HEIGHT = 50;
		this.setTitle("FlowLayout");
		this.setSize(600, 400);
		// null: can giua man hinhf
		this.setLocationRelativeTo(null);
		
		// Set Layout
		GridLayout gridLayout = new GridLayout();
		GridLayout gridLayout_1 = new GridLayout(3, 6);
		GridLayout gridLayout_2 = new GridLayout(4, 4, 50, 50);

		this.setLayout(gridLayout);

		for (int i = 1; i <= 11; i++) {
			JButton jButton = new JButton(i + "");
			this.add(jButton);
		}

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new MyGridLayout();
	}
}
