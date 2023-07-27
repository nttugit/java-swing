package lesson_95_radio_and_checkbox;

import java.awt.BorderLayout;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import lesson_94_icon_image.MainView;

public class MenuView extends JFrame {
	public MenuModel menuModel;
	public ArrayList<JCheckBox> subDishButtonGroup;
	public JLabel userChoiceLabel;
	public JComboBox jComboBox_mainToppings;
	public JList jList_subToppings;

	public MenuView() {
		this.menuModel = new MenuModel();
		init();
	}

	private void init() {
		this.setTitle("Taco Restaurant");
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());

		Font headerFont = new Font("Arial", Font.BOLD, 40);
		Font dishFont = new Font("Arial", Font.PLAIN, 25);
		Font orderInfoFont = new Font("Arial", Font.PLAIN, 15);
		// Listeners
		ActionListener menuController = new MenuController(this);
		
		
		JLabel headerLabel = new JLabel("Thực đơn nhà hàng Taco");
		headerLabel.setFont(headerFont);
		JPanel titlePanel = new JPanel();
		titlePanel.add(headerLabel);

		// Main dishes
		JPanel mainDishPanel = new JPanel();
		String mainToppings[] = new String[] {"Thịt bò", "Thịt heo", "Thị gà"}; 
		 jComboBox_mainToppings = new JComboBox<>(mainToppings);
		jComboBox_mainToppings.setFont(dishFont);
		mainDishPanel.add(jComboBox_mainToppings);
		
		
		// Sub dishes
		JPanel subDishPanel = new JPanel();
		String subToppings[] = new String[] {"Tomato", "Bell Pepper", "Popcorn","Pineapple","Guacamole","Lettuce"}; 
		jList_subToppings = new JList<>(subToppings);
		jList_subToppings.setFont(dishFont);
		subDishPanel.add(jList_subToppings);
		
		// Option panel (include sub & main dishes)
		JPanel optionPanel = new JPanel();
		optionPanel.setLayout(new BorderLayout());	

		optionPanel.add(mainDishPanel, BorderLayout.NORTH);
		optionPanel.add(subDishPanel, BorderLayout.CENTER);

		// Payment panel
		JPanel paymentPanel = new JPanel();
		paymentPanel.setLayout(new GridLayout(1, 2));
		userChoiceLabel = new JLabel("Tổng tiền: 0 đ");
		userChoiceLabel.setFont(orderInfoFont);

		JButton paymentButton = new JButton("Thanh toán");
		paymentButton.setFont(dishFont);
		paymentPanel.add(userChoiceLabel);
		paymentPanel.add(paymentButton);

		paymentButton.addActionListener(menuController);
		this.add(optionPanel, BorderLayout.CENTER);
		this.add(titlePanel, BorderLayout.NORTH);
		this.add(paymentPanel, BorderLayout.SOUTH);
		this.setVisible(true);
	}

	public void showTotalPrice() {
		// TODO Auto-generated method stub
		String orderInfo = "Order của quý khánh: \n" + this.menuModel.getOption()
		+ "\n Tổng tiền: " + this.menuModel.getTotal() ;
		this.userChoiceLabel.setText(orderInfo);
	}
}
