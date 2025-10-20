package hw4;

import java.util.Scanner;

public class Hw4_4 {
	public static void main (String[]args) {
		
		int[][] RichGuy = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
		
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入你想要借多少? :  ");
		int money = sc.nextInt();
		
		System.out.println("有錢可借的員工編號為 : ");
		
		int count = 0;
		for (int i = 0; i < RichGuy[1].length; i++)
			if (RichGuy[1][i] >= money) {
				System.out.print(RichGuy[0][i] + "  ");
				count++;
			}
		
		System.out.println("  共 " + count + " 人!");
		
		
		
	}

}
