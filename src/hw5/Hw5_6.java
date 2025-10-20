package hw5;

public class Hw5_6 {
	public static void main(String[]args) {
		
		String xx= genAuthCode(8);
		System.out.print("本次隨機產生驗證碼為 :  \n" + xx);
		
	}
	
// ====================================================================
	
	public static int  Random(int minNum, int maxNum){										//	 可以自己定義隨機數範圍
		return (int) (minNum + (Math.random()*((maxNum+1)-minNum))) ;								
	}
	
	// ====================================================================		
	public static int[] genRandomArray (int lone) {					// 出現隨機編碼陣列
		int r;
		int a;
		int[] Arrayx = new int[lone];


		
		while(true) {
			int n=0;
			int b=0;
			int s=0;			// 計次讓所有類型最少出現一次

			for(int i=0; i <Arrayx.length ; i++) {
				
				r= ((int)(Math.random()*3));				// 這裡決定跑數字還是英文 大/小 寫
				
				if(r==1){
					 a=Random (48,57);
					 Arrayx[i]=a;
					 n++;
				}
				else if (r==2) {
					 a=Random (65,90);
					 Arrayx[i]=a;
					 b++;
				}
				else {
					 a=Random (97,122);
					 Arrayx[i]=a;
					 s++;
				}
			}	
			
			if(n!=0 && b!=0 && s!=0) {
				break;
			}
		}
		
//		for(int i=0; i< Arrayx.length; i ++)
//			System.out.print(Arrayx[i] + " ");
//		
//		for(int x :Arrayx )
//			System.out.print(x + " ");
		return Arrayx;
	}
	// ====================================================================	
	
	public static String genAuthCode(int length) {			// 將編碼陣列轉換成文字
		
		int []a=genRandomArray (length);
		String b="";
		
		for(int i=0; i <a.length ; i++) {
			b+=(char)a[i];	
		}
		
		return b; 	
	}
	// ====================================================================		
}


// 0~9     48~57
// 大寫    65~90
//小寫    97~122


