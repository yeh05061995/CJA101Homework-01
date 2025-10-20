package Coupling_bad;

public class Computer {
	private Keyboard keyboard;
	private Mouse mouse;
	private Printer printer;
	
	public void setKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}
	
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	
	
	public void workWithKeyboard() {
		keyboard.work();
	}
	
	public void workWithMouse() {
		mouse.work();
	}
	
	public void workWithPrinter() {
		printer.work();
	}
}
