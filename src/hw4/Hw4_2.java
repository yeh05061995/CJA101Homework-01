package hw4;

import java.util.Scanner;

public class Hw4_2 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入文字 :  ");
		
		String str = sc.nextLine();
		StringBuffer stringBuffer = new StringBuffer(str);
		
		System.out.println( stringBuffer.reverse());

		
	}

}
