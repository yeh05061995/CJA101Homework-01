package hw3;

import java.util.Scanner;

public class Hw3_2 {
	
	

	 int x= (int)(Math.random()*10);
	
	public static void main(String[]args) {
		
		Hw3_2 a = new Hw3_2();     // 如果不是static 變數 要先實體化
//		System.out.print(a.x);
		
		Scanner sc = new Scanner(System.in);
		int y;
		
		
		System.out.print("開始猜數字吧!  : \n");
		
		
		while(true) {

			
			y = sc.nextInt();
			if(y==a.x) {
				System.out.print("猜對瞜! 答案就是"+ a.x);
				break;
			}
			else
				System.out.println("猜錯瞜!");		
		}
			
		
	}
}
