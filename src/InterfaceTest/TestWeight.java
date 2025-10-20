package InterfaceTest;

public class TestWeight {
	
	public static void main(String[] args) {
		Weightable[] ws = new Weightable[3];
		
		ws[0] = new Powder();
		ws[1] = new Dog();
		ws[2] = new Plane();
		
		for (int i = 0; i < ws.length; i++)
			ws[i].printWeightTool();
	}
}
