package lesson_81_mvc.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import lesson_81_mvc.controller.CounterListener;
import lesson_81_mvc.model.CounterModel;

public class CounterView extends JFrame {
	private CounterModel counterModel;
	private JButton jButton_up;
	private JButton jButton_down;
	private JButton jButton_reset;
	private JLabel jLabel_value;
	final private Font mainJLabelFont = new Font("Serif", Font.BOLD, 50);

	public CounterView() {
		this.counterModel = new CounterModel();
		this.init();
		this.setVisible(true);
	}

	public void init() {
		this.setTitle("Counter");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ActionListener actionListenr = new CounterListener(this);

		this.jButton_up = new JButton("UP");
		// Thêm listener ta định nghĩa vào cho đối tượng view
		this.jButton_up.addActionListener(actionListenr);

		this.jButton_down = new JButton("DOWN");
		this.jButton_down.addActionListener(actionListenr);

		this.jButton_reset = new JButton("RESET");
		this.jButton_reset.addActionListener(actionListenr);

		this.jLabel_value = new JLabel(this.counterModel.getValue() + "", JLabel.CENTER);
		this.jLabel_value.setFont(mainJLabelFont);


		JPanel mainJPanel = new JPanel();
		mainJPanel.setLayout(new BorderLayout());
		mainJPanel.add(jButton_up, BorderLayout.WEST);
		mainJPanel.add(jLabel_value, BorderLayout.CENTER);
		mainJPanel.add(jButton_down, BorderLayout.EAST);
		mainJPanel.add(jButton_reset, BorderLayout.SOUTH);

		this.setLayout(new BorderLayout());
		this.add(mainJPanel, BorderLayout.CENTER);
	}

	public void increase() {
		this.counterModel.increase();
		this.jLabel_value.setText(this.counterModel.getValue() + "");
	}

	public void decrease() {
		this.counterModel.decrease();
		this.jLabel_value.setText(this.counterModel.getValue() + "");
	}

	public void reset() {
		this.counterModel.reset();
		this.jLabel_value.setText(this.counterModel.getValue() + "");
	}
}
