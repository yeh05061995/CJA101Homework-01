package Coupling_good;

public class CustomerTest2 {
	
	public static void main(String[] args) {
		Computer2 c2 = new Computer2();
		Keyboard2 k2 = new Keyboard2();
		Mouse2 m2 = new Mouse2();
		
		c2.setUSB(k2);
		c2.workWithUSB();
		
		c2.setUSB(m2);
		c2.workWithUSB();
		
		Printer2 p2 = new Printer2();
		c2.setUSB(p2);
		c2.workWithUSB();
		
		
	}

}
