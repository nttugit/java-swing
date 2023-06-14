package lesson_87_mouse_event.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import lesson_87_mouse_event.controller.MouseEventAppListener;
import lesson_87_mouse_event.model.MouseEventAppModel;

public class MouseEventAppView extends JFrame {
	private MouseEventAppModel mouseEventAppModel;
	private JPanel jPanel_mouse;
	private JLabel jLabel_position;
	private JLabel jLabel_x;
	private JLabel jLabel_y;
	private JLabel jLabel_num_of_clicks_value;
	private JLabel jLabel_check_in_value;

	public MouseEventAppView() {
		this.mouseEventAppModel = new MouseEventAppModel();
		this.init();
	}

	private void init() {
		this.setTitle("Mouse Event App");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());

		MouseListener mouseEventAppListener = new MouseEventAppListener(this);
		MouseMotionListener mouseMotionListenr = new MouseEventAppListener(this);

		jPanel_mouse = new JPanel();
		jPanel_mouse.setBackground(Color.LIGHT_GRAY);
		jPanel_mouse.addMouseListener(mouseEventAppListener);
		jPanel_mouse.addMouseMotionListener(mouseMotionListenr);

		JPanel jPanel_info = new JPanel();
		jPanel_info.setLayout(new GridLayout(3, 3));

		jLabel_position = new JLabel("Position: ");
		jLabel_x = new JLabel("x = ");
		jLabel_y = new JLabel("y = ");

		JLabel jLabel_num_of_clicks = new JLabel("Number of clicks: ");
		jLabel_num_of_clicks_value = new JLabel("0");
		JLabel jLabel_empty_1 = new JLabel("");

		JLabel jLabel_check_in = new JLabel("Mouse is in component: ");
		jLabel_check_in_value = new JLabel("no");
		JLabel jLabel_empty_2 = new JLabel("");

		jPanel_info.add(jLabel_position);
		jPanel_info.add(jLabel_x);
		jPanel_info.add(jLabel_y);

		jPanel_info.add(jLabel_num_of_clicks);
		jPanel_info.add(jLabel_num_of_clicks_value);
		jPanel_info.add(jLabel_empty_1);

		jPanel_info.add(jLabel_check_in);
		jPanel_info.add(jLabel_check_in_value);
		jPanel_info.add(jLabel_empty_2);

		this.add(jPanel_mouse, BorderLayout.CENTER);
		this.add(jPanel_info, BorderLayout.SOUTH);

		this.setVisible(true);
	}

	public void click() {
		this.mouseEventAppModel.addClick();
		this.jLabel_num_of_clicks_value.setText(this.mouseEventAppModel.getMouseClickedCount() + "");
	}

	public void move(int x, int y) {
//		this.mouseEventAppModel.set
	}

	public void enter() {
		this.mouseEventAppModel.enter();
		this.jLabel_check_in_value.setText(this.mouseEventAppModel.getMouseCheckedIn());
	}

	public void exit() {
		this.mouseEventAppModel.exit();
		this.jLabel_check_in_value.setText(this.mouseEventAppModel.getMouseCheckedIn());
	}

	public void updateCordinates(int x, int y) {
		this.mouseEventAppModel.setX(x);
		this.mouseEventAppModel.setY(y);
		this.jLabel_x.setText("x = " + this.mouseEventAppModel.getX());
		this.jLabel_y.setText("y = " + this.mouseEventAppModel.getY());

	}
}
