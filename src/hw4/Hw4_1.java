package hw4;

public class Hw4_1 {
	
	public static void main(String [ ]args) {
		int []a1= {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum=0;
		
		for(int i=0; i <a1.length; i++) {
			
			sum+=a1[i];
		}
		
		int avg = sum/a1.length;
		
		System.out.println("所有元素的平均值是 : "+avg);	
		System.out.println("大於平均值的數字有 : ");
		
		for(int i=0 ; i < a1.length ; i++) {
			if(a1[i]>avg) {
			
			System.out.print(a1[i]+ "   ");	
				
			}
			
			
			
		}
		
	}

}
