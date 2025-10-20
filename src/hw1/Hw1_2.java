package hw1;

public class Hw1_2 {
	
	public static void main (String[]args) {
		
		// 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		
		int d = 200/12;
		
		System.out.print("200顆蛋共是" + d + "打和");
		
		
		int a=200%12;
		
		System.out.println(a + "顆");
		
	}

}
