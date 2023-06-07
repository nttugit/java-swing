package view.Layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFlowLayout extends JFrame {
	public MyFlowLayout() {
		final int WIDTH = 200;
		final int HEIGHT = 50;
		this.setTitle("FlowLayout");
		this.setSize(600, 400);
		// null: can giua man hinhf
		this.setLocationRelativeTo(null);
		
		// Set Layout
		FlowLayout flowLayout = new FlowLayout();
		FlowLayout flowLayout_1 = new FlowLayout(FlowLayout.LEADING);
		FlowLayout flowLayout_2 = new FlowLayout(FlowLayout.CENTER, 50, 50);

		this.setLayout(flowLayout_2);

		JButton jButton_1 = new JButton("1");
		JButton jButton_2 = new JButton("2");
		JButton jButton_3 = new JButton("3");
//		jButton_1.setSize(WIDTH, HEIGHT);
//		jButton_2.setSize(WIDTH, HEIGHT);
//		jButton_3.setSize(WIDTH, HEIGHT);

		// add thanh phan
		this.add(jButton_1);
		this.add(jButton_2);
		this.add(jButton_3);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new MyFlowLayout();
	}
}
