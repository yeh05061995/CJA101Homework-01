package xxx;

public class Animal {
	private int age;
	private float weight;
	
	// 把無參數的建構子宣告回來
	public Animal() {
		// 1. 方便給子類別的對應
		// 2. 無參數建構子也是 Java Bean 的規範之一
		// 3. 留著給日後搭配的框架使用 (框架工具利用此建構子幫我們產生實體)
	}
	
	public Animal(int age, float weight) {
		this.age = age;
		this.weight = weight;
	}
	
	public void speak() {
		System.out.println("Age is = " + age);
		System.out.println("Weight is = " + weight);
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public int getAge() {
		return age;
	}
	
	public float getWeight() {
		return weight;
	}
}
