package hw3;

import java.util.Scanner;

public class Hw3_3 {

	public static void main(String[] args) {

		System.out.println("阿文 .... 請輸入你討厭哪個數字");

		Scanner sc = new Scanner(System.in);
		String in = sc.next();

		String x;
		int count = 0;
		for (int i = 1; i <= 49; i++) {
			x = Integer.toString(i);      // 
//			x  = i +"";	// 把i裡面的int數字轉成String 的內容
			if (x.contains(in) == false) {   		//【contains】當且僅當此字串包含指定的 char 值序列時才傳回 true。
				System.out.print(x + " \t");		//【\t】 tab 的意思
				count++;
				if (count % 5 == 0)
					System.out.println();
			}
		}
		
		int []z=new int [count];
	}

}
