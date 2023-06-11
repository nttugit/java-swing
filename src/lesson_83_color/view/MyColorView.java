package lesson_83_color.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import lesson_83_color.controller.MyColorController;
import lesson_83_color.model.MyColorModel;

public class MyColorView extends JFrame {
	private MyColorModel myColorModel;
	private JLabel jLabel;

	public MyColorView() {
		this.myColorModel = new MyColorModel();
		this.init();
	}

	private void init() {
		this.setTitle("My Colo");
		this.setSize(1200, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		ActionListener myColorListener = new MyColorController(this);

		Font font_text = new Font("Arial", Font.BOLD, 80);
		jLabel = new JLabel("TEXT ...");
		jLabel.setFont(font_text);

		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridLayout(2, 3));

		Font font = new Font("Arial", Font.BOLD, 40);

		JButton jButton_text_red = new JButton("Red text");
		jButton_text_red.setFont(font);
		jButton_text_red.setForeground(Color.RED);
		jButton_text_red.addActionListener(myColorListener);

		JButton jButton_text_yellow = new JButton("Yellow text");
		jButton_text_yellow.setFont(font);
		jButton_text_yellow.setForeground(Color.YELLOW);
		jButton_text_yellow.addActionListener(myColorListener);


		JButton jButton_text_green = new JButton("Green text");
		jButton_text_green.setFont(font);
		jButton_text_green.setForeground(Color.GREEN);
		jButton_text_green.addActionListener(myColorListener);


		JButton jButton_background_red = new JButton("Red background");
		jButton_background_red.setFont(font);
		jButton_background_red.setBackground(Color.RED);
		jButton_background_red.addActionListener(myColorListener);

		JButton jButton_background_yellow = new JButton("Yellow background");
		jButton_background_yellow.setFont(font);
		jButton_background_yellow.setBackground(Color.YELLOW);
		jButton_background_yellow.addActionListener(myColorListener);


		JButton jButton_background_green = new JButton("Green background");
		jButton_background_green.setFont(font);
		jButton_background_green.setBackground(Color.GREEN);
		jButton_background_green.addActionListener(myColorListener);

		this.setLayout(new BorderLayout());

		jPanel.add(jLabel);
		jPanel.add(jButton_text_red);
		jPanel.add(jButton_text_yellow);
		jPanel.add(jButton_text_green);
		jPanel.add(jButton_background_red);
		jPanel.add(jButton_background_yellow);
		jPanel.add(jButton_background_green);

		this.add(jLabel, BorderLayout.NORTH);
		this.add(jPanel, BorderLayout.CENTER);
		
		this.setVisible(true);

	}

	public void changeTextColor(Color textColor) {
		this.jLabel.setForeground(textColor);
	}

	public void changeBackgroundColor(Color backgroundColor) {
		this.jLabel.setBackground(backgroundColor);
		this.jLabel.setOpaque(true);
	}

}
