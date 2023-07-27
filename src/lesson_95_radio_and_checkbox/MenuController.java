package lesson_95_radio_and_checkbox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.JCheckBox;

public class MenuController implements ActionListener {
	private MenuView menuView;

	public MenuController(MenuView menuView) {
		super();
		this.menuView = menuView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String mainToppings = "";
		String subToppings = "";

		Enumeration<AbstractButton> mainToppingButtons = menuView.mainDishButtonGroup.getElements();
		while (mainToppingButtons.hasMoreElements()) {
			AbstractButton button = mainToppingButtons.nextElement();
			if (button.isSelected()) {
				mainToppings = button.getText();
			}
		}
		System.out.println(mainToppings);

		for (JCheckBox button : this.menuView.subDishButtonGroup) {
			if (button.isSelected()) {
				subToppings += button.getText() + ", ";
			}
		}

		subToppings = subToppings.substring(0, subToppings.length() - 2);
		System.out.println(subToppings);

		this.menuView.menuModel.setOption(mainToppings + ", " + subToppings);
		this.menuView.menuModel.calculateTotalPrice();
		this.menuView.showTotalPrice();
	}

}
