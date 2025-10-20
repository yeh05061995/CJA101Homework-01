package hw2;

public class Hw2_4 {
	
	// 請設計一隻Java程式，輸出結果為以下：
	// 1 4 9 16 25 36 49 64 81 100
	
	public static void main(String[]args ) {
		
		int i =3;
		int sum=1;
		
		while(sum<=100) {
					
			System.out.print(sum + "  " );
			
			sum+=i;
			i+=2;
			
		}
			

	}

}
