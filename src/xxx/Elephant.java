package xxx;

public class Elephant extends Animal {
	private String name;

	public Elephant(int age, float weight, String name) {
		super(age, weight);
		this.name = name;
	}
	
	// JDK 5 Annotation (標註) : 給Java相關工具或框架的資訊
	@Override
	public void speak() {
		super.speak();
		System.out.println("Name is = " + name);
	}
	
	// 不會報錯, 但改寫失敗了 (參數規格不一樣)
	// 而編譯器理解成overloading了
	// speak(int data)跟父類別的speak()
//	public void speak(int data) {
//		super.speak();
//		System.out.println("Name is = " + name);
//	}
	
}
