package xxx;

public class PolyAnimal {
	
	public static void main (String []args) {
		
		Animal[]a = new Animal[2];
		a[0]= new Animal (5,25.0f);
		a[1]= new Elephant (8,1200.0F,"大象");
		
		
		for(int i=0;i<a.length;i++) {
			a[i].speak();
			System.out.println("==============");
		}
		
	}

}
