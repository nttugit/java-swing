package lesson_95_radio_and_checkbox;

import java.util.StringTokenizer;

public class MenuModel {
	private String option;
	private double total;

	public MenuModel() {
		this.option = "";
		this.total = 0;
	}
	
	public MenuModel(String option, double total) {
		this.option = option;
		this.total = total;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public void calculateTotalPrice() {
		// TODO Auto-generated method stub
		// Đồng giá 20000 món chính, món phụ 5000
		String options[] = this.option.split(", ");
		double lastPrice = 0;
		if(options[0] == null)
			return;
		
		lastPrice += 20000;
		if(options[1] != null) {
			for(int i = 1; i < options.length; i++) {
				lastPrice += 5000;
			}
		}
		
		this.total = lastPrice;
	}

}
