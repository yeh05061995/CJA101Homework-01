package hw2;

public class Hw2_2 {
	
	// 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)

	public static void main(String []args) {
		
		int sum=1;
		
		for(int i=1; i <=10; i++ ) {
			sum*=i;
			
		}
		
		System.out.println("1～10的連乘積 = " + sum);
	}
}
