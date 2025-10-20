package hw1;

public class Hw1_5 {	
	public static void main(String[]args) {	
		
		// 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
		// 金加利息共有多少錢(用複利計算，公式請自行google)
		
//		【複利公式】
//		FV=PV(1+i) n
//		 
//		FV (Future Value)：未來的價值，亦即指最後的金額
//		PV (Present Value)：現值，亦即指本金
//		i：利率或預期的回報率
//		n：期數
						
		double  FV = 0;
				
		double q = Math.pow(1.02,10);
							// Math.pow(x,y)  x的y次方
			FV=150*q;
				
		
		System.out.printf("本金加利息共有" +"%.2f ",FV );
		System.out.printf("萬元");


		
		
	
}

}
