


package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Hw3_1 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
	
		
		int[]xxx = new int [3];
		
		for(int i=0; i<=2; i++) {
			System.out.print("請輸入第"+ (i+1)+ "個邊長：");
			xxx[i]= sc.nextInt();
		}
		
		Arrays.sort(xxx);

		
		
		if(xxx[0]+xxx[1] > xxx[2]) {
		
			if (xxx[0]==xxx[1] && xxx[1]==xxx[2]) {
			System.out.println("正三角型");
			}
		
			else if (xxx[0]==xxx[1] && xxx[1]!=xxx[2]) {
			System.out.println("等腰三角形");
			}
		
			else if (xxx[0]==xxx[1] && xxx[1]!=xxx[2]) {
			System.out.println("其他三角形");
			}
			
			else 
				System.out.print("不是三角形");
		}
		else 
		System.out.print("不是三角形");
			
		
		
		

			
//		for ( int one : xxx) 
//			System.out.print(one);


        
        
        

	}

	
	
}
