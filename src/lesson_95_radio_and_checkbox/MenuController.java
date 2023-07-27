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
		String mainToppings = (String) this.menuView.jComboBox_mainToppings.getSelectedItem();
		String subToppings = "";
		Object subToppingsObj[] = this.menuView.jList_subToppings.getSelectedValues();
		if (mainToppings == null || subToppingsObj.length == 0)
			return;

		for (Object o : subToppingsObj) {
			subToppings += (String) o + ", ";
		}
		subToppings = subToppings.substring(0 , subToppings.length() - 2);
		this.menuView.menuModel.setOption(mainToppings +", " + subToppings);
		this.menuView.menuModel.calculateTotalPrice();
		this.menuView.showTotalPrice();
	}
}
