package xxx;

public class TestBMI {
	
	public static void main(String[] args) {
		// step 1: 宣告變數暫存身高, 體重資料
		double height = 1.8, weight = 65;
		
		// step 2: 運算得到BMI值並列印顯示
		
		double bmi = weight / Math.pow(height, 2);
		System.out.println("BMI = " + bmi);
		System.out.printf("BMI = %.2f%n", bmi);
		
		// step 3: 根據BMI值顯示結果(過瘦, 正常或是過重)
		
		if (bmi < 18.5) {
			System.out.println("過瘦");
		} else if (bmi >= 24) {
			System.out.println("過重");
		} else {
			System.out.println("正常");
		}
		
		
		
		
//		if (bmi < 18.5) {
//			System.out.println("過瘦");
//		} else if (bmi < 24) {
//			System.out.println("正常");
//		} else {
//			System.out.println("過重");
//		}
	}

}
