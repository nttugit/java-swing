package lesson_95_radio_and_checkbox;

import java.awt.BorderLayout;
import java.awt.CheckboxGroup;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import lesson_94_icon_image.MainView;

public class MenuView extends JFrame {
	public MenuModel menuModel;
	public JCheckBox checkbox_tomato;
	public JCheckBox checkbox_bellpepper;
	public JCheckBox checkbox_popcorn;
	public JCheckBox checkbox_pineapple;
	public JCheckBox checkbox_lettuce;
	public JCheckBox checkbox_guacamole;
	public JRadioButton radioButton_beef;
	public JRadioButton radioButton_chicken;
	public JRadioButton radioButton_pork;
	public ButtonGroup mainDishButtonGroup;
	public ArrayList<JCheckBox> subDishButtonGroup;
	public JLabel userChoiceLabel;

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
		mainDishPanel.setLayout(new GridLayout(2, 3));

		mainDishButtonGroup = new ButtonGroup();
		radioButton_beef = new JRadioButton("Thịt bò");
		radioButton_beef.setFont(dishFont);
		radioButton_chicken = new JRadioButton("Thịt gà");
		radioButton_chicken.setFont(dishFont);
		radioButton_pork = new JRadioButton("Thịt heo");
		radioButton_pork.setFont(dishFont);

		ImageIcon imageicon_beef = new ImageIcon(
				Toolkit.getDefaultToolkit().createImage(MenuView.class.getResource("./img/beef.jpeg")));
		ImageIcon imageicon_chicken = new ImageIcon(
				Toolkit.getDefaultToolkit().createImage(MenuView.class.getResource("./img/chicken.jpg")));
		ImageIcon imageicon_pork = new ImageIcon(
				Toolkit.getDefaultToolkit().createImage(MenuView.class.getResource("./img/pork.jpg")));

		ImageIcon imageicon_tomato = new ImageIcon(
				Toolkit.getDefaultToolkit().createImage(MenuView.class.getResource("./img/tomato.jpg")));
		ImageIcon imageicon_bellpepper = new ImageIcon(
				Toolkit.getDefaultToolkit().createImage(MenuView.class.getResource("./img/bellpepper.jpg")));
		ImageIcon imageicon_corn = new ImageIcon(
				Toolkit.getDefaultToolkit().createImage(MenuView.class.getResource("./img/corn.jpg")));
		ImageIcon imageicon_pineapple = new ImageIcon(
				Toolkit.getDefaultToolkit().createImage(MenuView.class.getResource("./img/pineapple.jpg")));
		ImageIcon imageicon_lettuce = new ImageIcon(
				Toolkit.getDefaultToolkit().createImage(MenuView.class.getResource("./img/lettuce.jpg")));
		ImageIcon imageicon_guacamole = new ImageIcon(
				Toolkit.getDefaultToolkit().createImage(MenuView.class.getResource("./img/guacamole.jpg")));

		// Main dish images
		JLabel beefLabel = new JLabel();
		beefLabel.setIcon(imageicon_beef);
		JLabel chickenLabel = new JLabel();
		chickenLabel.setIcon(imageicon_chicken);
		JLabel porkLabel = new JLabel();
		porkLabel.setIcon(imageicon_pork);

		// Sub food images
		JLabel tomatoLabel = new JLabel();
		tomatoLabel.setIcon(imageicon_tomato);
		JLabel bellPepperLabel = new JLabel();
		bellPepperLabel.setIcon(imageicon_bellpepper);
		JLabel cornLabel = new JLabel();
		cornLabel.setIcon(imageicon_corn);
		JLabel pineappleLabel = new JLabel();
		pineappleLabel.setIcon(imageicon_pineapple);
		JLabel lettuceLabel = new JLabel();
		lettuceLabel.setIcon(imageicon_lettuce);
		JLabel gaucamoleLabel = new JLabel();
		gaucamoleLabel.setIcon(imageicon_guacamole);

		mainDishButtonGroup.add(radioButton_beef);
		mainDishButtonGroup.add(radioButton_chicken);
		mainDishButtonGroup.add(radioButton_pork);

		mainDishPanel.add(beefLabel);
		mainDishPanel.add(chickenLabel);
		mainDishPanel.add(porkLabel);
		mainDishPanel.add(radioButton_beef);
		mainDishPanel.add(radioButton_chicken);
		mainDishPanel.add(radioButton_pork);

		// Sub dishes
		JPanel subDishPanel = new JPanel();
		subDishPanel.setLayout(new GridLayout(4, 3));
		subDishButtonGroup = new ArrayList<JCheckBox>();
		
		checkbox_tomato = new JCheckBox("Tomato");
		checkbox_tomato.setFont(dishFont);
		checkbox_bellpepper = new JCheckBox("Bell Pepper");
		checkbox_bellpepper.setFont(dishFont);
		checkbox_popcorn = new JCheckBox("Popcorn");
		checkbox_popcorn.setFont(dishFont);
		checkbox_pineapple = new JCheckBox("Pineapple");
		checkbox_pineapple.setFont(dishFont);
		checkbox_lettuce = new JCheckBox("Lettuce");
		checkbox_lettuce.setFont(dishFont);
		checkbox_guacamole = new JCheckBox("Guacamole");
		checkbox_guacamole.setFont(dishFont);

		subDishPanel.add(tomatoLabel);
		subDishPanel.add(bellPepperLabel);
		subDishPanel.add(cornLabel);
		subDishPanel.add(checkbox_tomato);
		subDishPanel.add(checkbox_bellpepper);
		subDishPanel.add(checkbox_popcorn);

		subDishPanel.add(pineappleLabel);
		subDishPanel.add(lettuceLabel);
		subDishPanel.add(gaucamoleLabel);
		subDishPanel.add(checkbox_pineapple);
		subDishPanel.add(checkbox_lettuce);
		subDishPanel.add(checkbox_guacamole);

		subDishButtonGroup.add(checkbox_tomato);
		subDishButtonGroup.add(checkbox_bellpepper);
		subDishButtonGroup.add(checkbox_popcorn);
		subDishButtonGroup.add(checkbox_pineapple);
		subDishButtonGroup.add(checkbox_lettuce);
		subDishButtonGroup.add(checkbox_guacamole);

		// Option panel (include sub & main dishes)
		JPanel optionPanel = new JPanel();
		optionPanel.setLayout(new GridLayout(2, 1));
		optionPanel.add(mainDishPanel);
		optionPanel.add(subDishPanel);

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
