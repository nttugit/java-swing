package view.Layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyBorderLayout extends JFrame {
	public MyBorderLayout() {
		final int WIDTH = 200;
		final int HEIGHT = 50;
		this.setTitle("FlowLayout");
		this.setSize(600, 400);
		// null: can giua man hinhf
		this.setLocationRelativeTo(null);
		
		// Set Layout
		BorderLayout borderLayout = new BorderLayout();
		BorderLayout borderLayout_1 = new BorderLayout(25, 25);

		this.setLayout(borderLayout_1);
		JButton jButton_1 = new JButton("1");
		JButton jButton_2 = new JButton("2");
		JButton jButton_3 = new JButton("3");
		JButton jButton_4 = new JButton("4");
		JButton jButton_5 = new JButton("5");

		// add thanh phan
		this.add(jButton_1, BorderLayout.WEST);
		this.add(jButton_2, BorderLayout.NORTH);
		this.add(jButton_3, BorderLayout.EAST);
		this.add(jButton_4, BorderLayout.SOUTH);
		this.add(jButton_5, BorderLayout.CENTER);


		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new MyBorderLayout();
	}
}
