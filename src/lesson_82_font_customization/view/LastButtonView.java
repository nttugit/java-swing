package lesson_82_font_customization.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import lesson_82_font_customization.controller.LastButtonListener;
import lesson_82_font_customization.model.LastButtonModel;

public class LastButtonView extends JFrame {
	private LastButtonModel lastButtonModel;
	private JLabel jLabelFooter;

	public LastButtonView() {
		this.lastButtonModel = new LastButtonModel();
		this.init();
	}

	private void init() {
		this.setTitle("Last Button");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);

		ActionListener lastButtonListener = new LastButtonListener(this);

		JPanel jPanel_center = new JPanel();
		jPanel_center.setLayout(new GridLayout(2, 2));

		Font mainFont = new Font("Arial", Font.BOLD, 20);

		JButton jButton_1 = new JButton("1");
		jButton_1.setFont(mainFont);
		jButton_1.addActionListener(lastButtonListener);

		JButton jButton_2 = new JButton("2");
		jButton_2.setFont(mainFont);
		jButton_2.addActionListener(lastButtonListener);

		JButton jButton_3 = new JButton("3");
		jButton_3.setFont(mainFont);
		jButton_3.addActionListener(lastButtonListener);

		JButton jButton_4 = new JButton("4");
		jButton_4.setFont(mainFont);
		jButton_4.addActionListener(lastButtonListener);

		jPanel_center.add(jButton_1);
		jPanel_center.add(jButton_2);
		jPanel_center.add(jButton_3);
		jPanel_center.add(jButton_4);

		JPanel jPanel_footer = new JPanel();
		this.jLabelFooter = new JLabel("-----");
		this.jLabelFooter.setFont(mainFont);
		jPanel_footer.add(this.jLabelFooter);

		this.setLayout(new BorderLayout());
		this.add(jPanel_center, BorderLayout.CENTER);
		this.add(this.jLabelFooter, BorderLayout.SOUTH);

		this.setVisible(true);
	}

	public void updateContent(int value) {
		System.out.println("value: " + value);
		this.lastButtonModel.setValue(value);
		this.jLabelFooter.setText("Last button: " + (this.lastButtonModel.getValue() + ""));
	}

}
