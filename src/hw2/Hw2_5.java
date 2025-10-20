package hw2;

public class Hw2_5 {
	
//	阿文很熱衷大樂透(1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//	輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
	
	public static void main(String[]args) {
		
		int count=0;
		
		for(int i=1;  i<=39; i++) {
			
			if(i%10  !=4) {
				System.out.println(i );
				count++;
			}			
		}
		
		System.out.println("總共有 " + count + " 個數字");
		
	}

}
