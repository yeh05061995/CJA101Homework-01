package hw2;

public class Hw2_7 {
	
//	請設計一隻Java程式，輸出結果為以下：
//	A
//	BB
//	CCC
//	DDDD
//	EEEEE
//	FFFFFF
	
	public static void main(String[]args) {
		
		int number=65;  // unicode 字元列表
		
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print((char) number);
				}
			
			System.out.println();
			
			number++;
		}
		
	}

}
