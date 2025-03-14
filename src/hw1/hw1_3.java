package hw1;

public class hw1_3 {
	
	public static void main (String[]args) {
		
		//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		
		int  s = 256559;
		
		System.out.print("256559秒為 ： " + s/86400 + "天  ");
		System.out.print(s/3600%24+ "時  ");
		System.out.print(s/60%60 + "分  ");
		System.out.println(s%60 + "秒");
		
	}

}
