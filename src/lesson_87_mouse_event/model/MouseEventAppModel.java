package lesson_87_mouse_event.model;

public class MouseEventAppModel {
	private int x, y; // coordinates
	private int mouseClickedCount;
	private String mouseCheckedIn; // yes, no

	public MouseEventAppModel() {
		this.x = 0;
		this.y = 0;
		this.mouseClickedCount = 0;
		this.mouseCheckedIn = "no";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getMouseClickedCount() {
		return mouseClickedCount;
	}

	public void setMouseClickedCount(int mouseClickedCount) {
		this.mouseClickedCount = mouseClickedCount;
	}

	public String getMouseCheckedIn() {
		return mouseCheckedIn;
	}

	public void setMouseCheckedIn(String mouseCheckedIn) {
		this.mouseCheckedIn = mouseCheckedIn;
	}

	public void addClick() {
		this.mouseClickedCount++;
	}

	public void enter() {
		this.mouseCheckedIn = "yes";
	}

	public void exit() {
		this.mouseCheckedIn = "no";
	}

}
